using System;


namespace Dddml.Wms.Specialization
{
    public abstract class ApplicationContext : IApplicationContext
    {

        private static volatile ApplicationContext _current;

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

        private ITypeConverter _typeConverter = new DefaultTypeConverter();

        public virtual ITypeConverter TypeConverter
        {
            get { return _typeConverter; }
            set { _typeConverter = value; }
        }

        public abstract object this[string name]
        {
            get;
        }

    }
}

