using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Dddml.Wms.HttpServices
{
    public static class MultiTenancyUtils
    {
        public static string GetConnectionRoutingKey(System.Uri requestUri, string virtualPathRoot)
        {
            // 需要从“请求”映射到 Tenant Id，然后使用 Tennat Id 作为 RoutingKey。

            var host = requestUri.Host;
            var port = requestUri.Port;

            // TODO 直接使用主机的一部分作为 Tenant Id，生产系统可能也不会这么简单。
            return host.Split('.')[0];
        }

    }
}
