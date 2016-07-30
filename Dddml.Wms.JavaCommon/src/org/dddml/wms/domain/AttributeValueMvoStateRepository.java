package org.dddml.wms.domain;

import java.util.Map;
import java.util.List;
import org.dddml.support.criterion.Criterion;
import java.util.Date;

public interface AttributeValueMvoStateRepository
{
    AttributeValueMvoState get(AttributeValueId id);

    Iterable<AttributeValueMvoState> getAll(Integer firstResult, Integer maxResults);
    
    void save(AttributeValueMvoState state);
    
    Iterable<AttributeValueMvoState> get(Iterable<Map.Entry<String, Object>> filter, List<String> orders, Integer firstResult, Integer maxResults);

    Iterable<AttributeValueMvoState> get(Criterion filter, List<String> orders, Integer firstResult, Integer maxResults);

    AttributeValueMvoState getFirst(Iterable<Map.Entry<String, Object>> filter, List<String> orders);

    AttributeValueMvoState getFirst(Map.Entry<String, Object> keyValue, List<String> orders);

    Iterable<AttributeValueMvoState> getByProperty(String propertyName, Object propertyValue, List<String> orders, Integer firstResult, Integer maxResults);

    long getCount(Iterable<Map.Entry<String, Object>> filter);

    long getCount(Criterion filter);

}

