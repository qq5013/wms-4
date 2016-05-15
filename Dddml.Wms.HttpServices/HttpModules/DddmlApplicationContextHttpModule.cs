using Dddml.Wms.Specialization;
using Dddml.Wms.Specialization.Spring;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;

namespace Dddml.Wms.HttpServices.HttpModules
{
    public class DddmlApplicationContextHttpModule : IHttpModule
    {


        public void Dispose()
        {
        }

        public void Init(HttpApplication context)
        {
            context.BeginRequest += context_BeginRequest;
        }

        void context_BeginRequest(object sender, EventArgs e)
        {
            ApplicationContext.Current = SpringApplicationContext.Instance;
        }

    }

}