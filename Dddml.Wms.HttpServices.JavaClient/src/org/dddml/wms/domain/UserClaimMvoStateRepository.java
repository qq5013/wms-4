package org.dddml.wms.domain;

import java.util.Map;
import java.util.List;
import java.util.Date;

public interface UserClaimMvoStateRepository
{
    UserClaimMvoState get(UserClaimId id);

    Iterable<UserClaimMvoState> getAll(Integer firstResult, Integer maxResults);
    
    void save(UserClaimMvoState state);
    
    Iterable<UserClaimMvoState> get(Iterable<Map.Entry<String, Object>> filter, List<String> orders, Integer firstResult, Integer maxResults);

    //Iterable<UserClaimMvoState> get(Criterion filter, List<String> orders, Integer firstResult, Integer maxResults);

    UserClaimMvoState getFirst(Iterable<Map.Entry<String, Object>> filter, List<String> orders);

    UserClaimMvoState getFirst(Map.Entry<String, Object> keyValue, List<String> orders);

    Iterable<UserClaimMvoState> getByProperty(String propertyName, Object propertyValue, List<String> orders, Integer firstResult, Integer maxResults);

    long getCount(Iterable<Map.Entry<String, Object>> filter);

    //long getCount(Criterion filter);

}

