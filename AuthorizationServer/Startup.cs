using System;
using System.Collections.Generic;
using System.Linq;
using Microsoft.Owin;
using Owin;
using Dddml.Wms.HttpServices;

[assembly: OwinStartup(typeof(Dddml.Wms.AuthorizationServer.Startup))]

namespace Dddml.Wms.AuthorizationServer
{
    public partial class Startup
    {
        public void Configuration(IAppBuilder app)
        {
            app.Use(typeof(NHibernateMultiTenancyMiddleware), new object[] { });

            ConfigureAuth(app);
        }
    }
}
