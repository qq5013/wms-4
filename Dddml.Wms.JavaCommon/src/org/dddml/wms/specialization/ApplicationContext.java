package org.dddml.wms.specialization;


/**
 * Created by Yang on 2016/7/20.
 */
public class ApplicationContext {

    public static volatile ApplicationContext current;

    public static void setCurrent(ApplicationContext context) {
        current = context;
    }

    //private ITypeConverter _typeConverter = new DefaultTypeConverter();

    public Object get(String name) {
        throw new UnsupportedOperationException();
    }

}
