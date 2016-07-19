package org.dddml.wms.domain;

import java.util.Map;
import java.util.List;
import java.util.Date;

public interface AttributeSetInstanceExtensionFieldMvoStateRepository
{
    AttributeSetInstanceExtensionFieldMvoState get(AttributeSetInstanceExtensionFieldId id);

    Iterable<AttributeSetInstanceExtensionFieldMvoState> getAll(Integer firstResult, Integer maxResults);
    
    void save(AttributeSetInstanceExtensionFieldMvoState state);
    
    Iterable<AttributeSetInstanceExtensionFieldMvoState> get(Iterable<Map.Entry<String, Object>> filter, List<String> orders, Integer firstResult, Integer maxResults);

    //Iterable<AttributeSetInstanceExtensionFieldMvoState> get(Criterion filter, List<String> orders, Integer firstResult, Integer maxResults);

    AttributeSetInstanceExtensionFieldMvoState getFirst(Iterable<Map.Entry<String, Object>> filter, List<String> orders);

    AttributeSetInstanceExtensionFieldMvoState getFirst(Map.Entry<String, Object> keyValue, List<String> orders);

    Iterable<AttributeSetInstanceExtensionFieldMvoState> getByProperty(String propertyName, Object propertyValue, List<String> orders, Integer firstResult, Integer maxResults);

    long getCount(Iterable<Map.Entry<String, Object>> filter);

    //long getCount(Criterion filter);

}

