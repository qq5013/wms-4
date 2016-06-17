using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.Http.Filters;
using System.Web.Http.Controllers;
using System.Net.Http;

namespace Dddml.Wms.HttpServices.Filters
{
    public class SetRequesterIdAttribute : ActionFilterAttribute
    {
        public override void OnActionExecuting(HttpActionContext actionContext)
        {
            foreach (var argPair in actionContext.ActionArguments)
            {
                //todo
            }
            base.OnActionExecuting(actionContext);
        }
    }
}