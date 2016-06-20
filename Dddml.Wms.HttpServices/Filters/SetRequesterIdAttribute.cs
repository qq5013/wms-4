using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.Http.Filters;
using System.Web.Http.Controllers;
using System.Net.Http;
using Dddml.Wms.Specialization;
using System.Web.Http;

namespace Dddml.Wms.HttpServices.Filters
{
    public class SetRequesterIdAttribute : ActionFilterAttribute
    {
        public override void OnActionExecuting(HttpActionContext actionContext)
        {
            var updateArgs = new List<KeyValuePair<string, object>>();
            foreach (var argPair in actionContext.ActionArguments)
            {
                var argName = argPair.Key;
                var argValue = argPair.Value;
                if (argValue is ICommand)
                {
                    var cmd = (ICommand)argValue;
                    string userId = GetUserId(actionContext);
                    if (!String.IsNullOrWhiteSpace(userId))
                    {
                        cmd.RequesterId = userId;
                    }
                    else
                    {
                        //cmd.RequesterId = null;
                    }
                }
                else if (argName.Equals("requesterId", StringComparison.InvariantCultureIgnoreCase))
                {
                    string userId = GetUserId(actionContext);
                    if (!String.IsNullOrWhiteSpace(userId))
                    {
                        updateArgs.Add(new KeyValuePair<string, object>(argName, userId));
                    }
                    else
                    {
                        //
                    }
                }
            }
            foreach (var kv in updateArgs)
            {
                actionContext.ActionArguments[kv.Key] = kv.Value;
            }

            //foreach (var msPair in actionContext.ModelState)
            //{
            //    var msName = msPair.Key;
            //    var msValue = msPair.Value.Value;
            //}

            base.OnActionExecuting(actionContext);
        }

        private static string GetUserId(HttpActionContext actionContext)
        {
            string userId = null;
            if (actionContext.ControllerContext != null && actionContext.ControllerContext.Controller is ApiController)
            {
                var apiController = (ApiController)actionContext.ControllerContext.Controller;
                if (apiController.User != null && apiController.User.Identity != null && !String.IsNullOrWhiteSpace(apiController.User.Identity.Name))
                {
                    userId = apiController.User.Identity.Name;
                }
            }
            return userId;
        }

    }
}