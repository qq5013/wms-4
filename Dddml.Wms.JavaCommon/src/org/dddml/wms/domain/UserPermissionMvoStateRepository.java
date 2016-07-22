package org.dddml.wms.domain;

import java.util.Map;
import java.util.List;
import java.util.Date;

public interface UserPermissionMvoStateRepository
{
    UserPermissionMvoState get(UserPermissionId id);

    Iterable<UserPermissionMvoState> getAll(Integer firstResult, Integer maxResults);
    
    void save(UserPermissionMvoState state);
    
    Iterable<UserPermissionMvoState> get(Iterable<Map.Entry<String, Object>> filter, List<String> orders, Integer firstResult, Integer maxResults);

    //Iterable<UserPermissionMvoState> get(Criterion filter, List<String> orders, Integer firstResult, Integer maxResults);

    UserPermissionMvoState getFirst(Iterable<Map.Entry<String, Object>> filter, List<String> orders);

    UserPermissionMvoState getFirst(Map.Entry<String, Object> keyValue, List<String> orders);

    Iterable<UserPermissionMvoState> getByProperty(String propertyName, Object propertyValue, List<String> orders, Integer firstResult, Integer maxResults);

    long getCount(Iterable<Map.Entry<String, Object>> filter);

    //long getCount(Criterion filter);

}

