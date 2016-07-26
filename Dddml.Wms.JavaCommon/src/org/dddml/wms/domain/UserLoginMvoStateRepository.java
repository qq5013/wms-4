package org.dddml.wms.domain;

import java.util.Map;
import java.util.List;
import java.util.Date;

public interface UserLoginMvoStateRepository
{
    UserLoginMvoState get(UserLoginId id);

    Iterable<UserLoginMvoState> getAll(Integer firstResult, Integer maxResults);
    
    void save(UserLoginMvoState state);
    
    Iterable<UserLoginMvoState> get(Iterable<Map.Entry<String, Object>> filter, List<String> orders, Integer firstResult, Integer maxResults);

    //Iterable<UserLoginMvoState> get(Criterion filter, List<String> orders, Integer firstResult, Integer maxResults);

    UserLoginMvoState getFirst(Iterable<Map.Entry<String, Object>> filter, List<String> orders);

    UserLoginMvoState getFirst(Map.Entry<String, Object> keyValue, List<String> orders);

    Iterable<UserLoginMvoState> getByProperty(String propertyName, Object propertyValue, List<String> orders, Integer firstResult, Integer maxResults);

    long getCount(Iterable<Map.Entry<String, Object>> filter);

    //long getCount(Criterion filter);

}

