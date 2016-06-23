using Dddml.Support.NHibernate;
using Microsoft.Owin;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Dddml.Wms.HttpServices
{
    public class NHibernateMultiTenancyMiddleware : OwinMiddleware
    {
        public NHibernateMultiTenancyMiddleware(OwinMiddleware next)
            : base(next)
        {
        }

        public override async Task Invoke(IOwinContext context)
        {
            var request = context.Request;
            var host = request.Uri.Host;

            // TODO 直接使用主机的一部分作为 Tenant Id，生产系统可能也不会这么简单。
            ContextualKeyRoutingConnectionProvider.CurrentRoutingKey = host.Split('.')[0];

            //await Next.Invoke(context);
            Next.Invoke(context);
        }
    }
}
