package org.dddml.wms.specialization.spring;


import org.dddml.wms.specialization.ApplicationContext;

/**
 * Created by Yang on 2016/7/28.
 */
public class SpringApplicationContext extends ApplicationContext {

    private org.springframework.context.ApplicationContext innerApplicationContext;

    public SpringApplicationContext(org.springframework.context.ApplicationContext innerApplicationContext){
        this.innerApplicationContext = innerApplicationContext;
    }

    @Override
    public Object get(String name) {
        int len = 1;
        if (name.startsWith("_"))
        {
            len = 2;
        }
        String camelName = name.substring(0, len).toLowerCase()  + name.substring(len);
        if (innerApplicationContext.containsBean(camelName))
        {
            Object obj = innerApplicationContext.getBean(camelName);
            return obj;
        }
        else
        {
            return innerApplicationContext.getBean(name);
        }
    }
}
