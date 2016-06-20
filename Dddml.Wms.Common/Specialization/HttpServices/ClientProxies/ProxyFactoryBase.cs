using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace Dddml.Wms.Specialization.HttpServices.ClientProxies
{

    public abstract partial class ProxyFactoryBase
    {
        private ProxyTemplate _proxyTemplate;

        public ProxyTemplate ProxyTemplate
        {
            get
            {
                if (this._proxyTemplate == null)
                {
                    ProxyTemplate proxyTemplateInAppContext = ApplicationContext.Current["HttpClientProxyTemplate"] as ProxyTemplate;
                    if (proxyTemplateInAppContext == null)
                    {
                        throw new ArgumentNullException("_proxyTemplate");
                    }
                    else
                    {
                        this._proxyTemplate = proxyTemplateInAppContext;
                    }
                }
                return this._proxyTemplate;
            }
            set
            {
                this._proxyTemplate = value;
            }
        }

        public ProxyFactoryBase()
        {
        }

        public ProxyFactoryBase(string endpointUrl)
        {
            this._proxyTemplate = new ProxyTemplate(() => endpointUrl);
        }

    }

}
