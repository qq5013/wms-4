package org.dddml.wms.domain;

import java.util.Map;
import java.util.List;
import org.dddml.support.criterion.Criterion;
import java.util.Date;

public interface PermissionStateRepository
{
    PermissionState get(String id);

    Iterable<PermissionState> getAll(Integer firstResult, Integer maxResults);
    
    void save(PermissionState state);
    
    Iterable<PermissionState> get(Iterable<Map.Entry<String, Object>> filter, List<String> orders, Integer firstResult, Integer maxResults);

    Iterable<PermissionState> get(Criterion filter, List<String> orders, Integer firstResult, Integer maxResults);

    PermissionState getFirst(Iterable<Map.Entry<String, Object>> filter, List<String> orders);

    PermissionState getFirst(Map.Entry<String, Object> keyValue, List<String> orders);

    Iterable<PermissionState> getByProperty(String propertyName, Object propertyValue, List<String> orders, Integer firstResult, Integer maxResults);

    long getCount(Iterable<Map.Entry<String, Object>> filter);

    long getCount(Criterion filter);

}

