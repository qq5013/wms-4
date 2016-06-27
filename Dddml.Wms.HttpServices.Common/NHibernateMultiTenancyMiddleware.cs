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
            ContextualKeyRoutingConnectionProvider.CurrentRoutingKey = MultiTenancyUtils.GetConnectionRoutingKey(request.Uri, null);

            await Next.Invoke(context);
        }
    }
}
