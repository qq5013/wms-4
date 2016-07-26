package org.dddml.wms.domain;

import java.util.Map;
import java.util.List;
import java.util.Date;

public interface LocatorStateRepository
{
    LocatorState get(String id);

    Iterable<LocatorState> getAll(Integer firstResult, Integer maxResults);
    
    void save(LocatorState state);
    
    Iterable<LocatorState> get(Iterable<Map.Entry<String, Object>> filter, List<String> orders, Integer firstResult, Integer maxResults);

    //Iterable<LocatorState> get(Criterion filter, List<String> orders, Integer firstResult, Integer maxResults);

    LocatorState getFirst(Iterable<Map.Entry<String, Object>> filter, List<String> orders);

    LocatorState getFirst(Map.Entry<String, Object> keyValue, List<String> orders);

    Iterable<LocatorState> getByProperty(String propertyName, Object propertyValue, List<String> orders, Integer firstResult, Integer maxResults);

    long getCount(Iterable<Map.Entry<String, Object>> filter);

    //long getCount(Criterion filter);

}

