using System.Net.Http;
using System.Web;
using System.Threading;
using System.Threading.Tasks;
using Dddml.Support.NHibernate;

namespace Dddml.Wms.HttpServices
{
    public class NHibernateMultiTenancyMessageHandler : DelegatingHandler
    {
        protected override Task<HttpResponseMessage> SendAsync(HttpRequestMessage request, CancellationToken cancellationToken)
        {
            var virtualPathRoot = request.GetRequestContext().VirtualPathRoot;
            ContextualKeyRoutingConnectionProvider.CurrentRoutingKey = MultiTenancyUtils.GetConnectionRoutingKey(request.RequestUri, virtualPathRoot);
            
            return base.SendAsync(request, cancellationToken);
        }
    }

}