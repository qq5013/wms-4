package org.dddml.wms.domain;

import java.util.Map;
import java.util.List;
import org.dddml.support.criterion.Criterion;
import java.util.Date;

public interface RolePermissionStateRepository
{
    RolePermissionState get(RolePermissionId id);

    Iterable<RolePermissionState> getAll(Integer firstResult, Integer maxResults);
    
    void save(RolePermissionState state);
    
    Iterable<RolePermissionState> get(Iterable<Map.Entry<String, Object>> filter, List<String> orders, Integer firstResult, Integer maxResults);

    Iterable<RolePermissionState> get(Criterion filter, List<String> orders, Integer firstResult, Integer maxResults);

    RolePermissionState getFirst(Iterable<Map.Entry<String, Object>> filter, List<String> orders);

    RolePermissionState getFirst(Map.Entry<String, Object> keyValue, List<String> orders);

    Iterable<RolePermissionState> getByProperty(String propertyName, Object propertyValue, List<String> orders, Integer firstResult, Integer maxResults);

    long getCount(Iterable<Map.Entry<String, Object>> filter);

    long getCount(Criterion filter);

}

