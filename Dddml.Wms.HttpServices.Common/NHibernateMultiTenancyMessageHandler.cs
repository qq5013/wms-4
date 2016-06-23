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
            // 需要从“请求”映射到 Tenant Id，然后使用 Tennat Id 作为 RoutingKey。
            var virtualPathRoot = request.GetRequestContext().VirtualPathRoot;
            var host = request.RequestUri.Host;
            var port = request.RequestUri.Port;

            // TODO 直接使用主机的一部分作为 Tenant Id，生产系统可能也不会这么简单。
            ContextualKeyRoutingConnectionProvider.CurrentRoutingKey = host.Split('.')[0];
            
            return base.SendAsync(request, cancellationToken);
        }
    }

}