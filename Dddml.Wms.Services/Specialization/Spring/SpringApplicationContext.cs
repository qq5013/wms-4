using System;
using Spring.Context;
using Spring.Context.Support;
using Dddml.Wms.Specialization;


namespace Dddml.Wms.Specialization.Spring
{
    public class SpringApplicationContext : ApplicationContext
    {

        private static SpringApplicationContext _instance = new SpringApplicationContext();

        private global::Spring.Context.IApplicationContext _innerApplicationContext;

        private SpringApplicationContext()
        {
            _innerApplicationContext = ContextRegistry.GetContext();
        }


        public static SpringApplicationContext Instance
        {
            get
            {
                return _instance;
            }
        }

        public override object this[string name]
        {
            get
            {
                int len = 1;
                if (name.StartsWith("_"))
                {
                    len = 2;
                }
                var camelName = name.Substring(0, len).ToLower() + name.Substring(len);
                if (_innerApplicationContext.ContainsObject(camelName))
                {
                    var obj = _innerApplicationContext[camelName];
                    return obj;
                }
                else
                {
                    return _innerApplicationContext[name];
                }
            }
        }

    }
}

