using System;


namespace Dddml.Wms.Specialization
{
    public abstract class ApplicationContext : IApplicationContext
    {
        [ThreadStatic]
        private static ApplicationContext _current;


        public static ApplicationContext Current
        {
            get
            {
                return _current;
            }
            set
            {
                _current = value;
            }
        }


        public abstract object this[string name]
        {
            get;
        }

    }
}

