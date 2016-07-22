package org.dddml.wms.domain;

import java.util.Map;
import java.util.List;
import java.util.Date;

public interface UserRoleMvoStateRepository
{
    UserRoleMvoState get(UserRoleId id);

    Iterable<UserRoleMvoState> getAll(Integer firstResult, Integer maxResults);
    
    void save(UserRoleMvoState state);
    
    Iterable<UserRoleMvoState> get(Iterable<Map.Entry<String, Object>> filter, List<String> orders, Integer firstResult, Integer maxResults);

    //Iterable<UserRoleMvoState> get(Criterion filter, List<String> orders, Integer firstResult, Integer maxResults);

    UserRoleMvoState getFirst(Iterable<Map.Entry<String, Object>> filter, List<String> orders);

    UserRoleMvoState getFirst(Map.Entry<String, Object> keyValue, List<String> orders);

    Iterable<UserRoleMvoState> getByProperty(String propertyName, Object propertyValue, List<String> orders, Integer firstResult, Integer maxResults);

    long getCount(Iterable<Map.Entry<String, Object>> filter);

    //long getCount(Criterion filter);

}

