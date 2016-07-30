package org.dddml.wms.domain;

import java.util.Map;
import java.util.List;
import org.dddml.support.criterion.Criterion;
import java.util.Date;

public interface WarehouseStateRepository
{
    WarehouseState get(String id);

    Iterable<WarehouseState> getAll(Integer firstResult, Integer maxResults);
    
    void save(WarehouseState state);
    
    Iterable<WarehouseState> get(Iterable<Map.Entry<String, Object>> filter, List<String> orders, Integer firstResult, Integer maxResults);

    Iterable<WarehouseState> get(Criterion filter, List<String> orders, Integer firstResult, Integer maxResults);

    WarehouseState getFirst(Iterable<Map.Entry<String, Object>> filter, List<String> orders);

    WarehouseState getFirst(Map.Entry<String, Object> keyValue, List<String> orders);

    Iterable<WarehouseState> getByProperty(String propertyName, Object propertyValue, List<String> orders, Integer firstResult, Integer maxResults);

    long getCount(Iterable<Map.Entry<String, Object>> filter);

    long getCount(Criterion filter);

}

