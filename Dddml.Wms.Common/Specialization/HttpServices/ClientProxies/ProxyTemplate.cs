using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Dddml.Wms.Specialization.HttpServices.ClientProxies
{

    public partial class ProxyTemplate
    {
        public ProxyTemplate(Func<string> endpointUrlAccessor)
        {
            this.GetEndpointUrl = endpointUrlAccessor;
        }

        /// <summary>
        /// Accessor to get endpoint url.
        /// </summary>
        public Func<string> GetEndpointUrl { get; set; }

        /// <summary>
        /// Accessor to get AuthenticationHeader scheme and parameter pair.
        /// </summary>
        public Func<Tuple<string, string>> GetAuthenticationHeaderValue { get; set; }
    }

}
