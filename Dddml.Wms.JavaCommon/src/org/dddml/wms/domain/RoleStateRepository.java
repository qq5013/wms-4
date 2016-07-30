package org.dddml.wms.domain;

import java.util.Map;
import java.util.List;
import org.dddml.support.criterion.Criterion;
import java.util.Date;

public interface RoleStateRepository
{
    RoleState get(String id);

    Iterable<RoleState> getAll(Integer firstResult, Integer maxResults);
    
    void save(RoleState state);
    
    Iterable<RoleState> get(Iterable<Map.Entry<String, Object>> filter, List<String> orders, Integer firstResult, Integer maxResults);

    Iterable<RoleState> get(Criterion filter, List<String> orders, Integer firstResult, Integer maxResults);

    RoleState getFirst(Iterable<Map.Entry<String, Object>> filter, List<String> orders);

    RoleState getFirst(Map.Entry<String, Object> keyValue, List<String> orders);

    Iterable<RoleState> getByProperty(String propertyName, Object propertyValue, List<String> orders, Integer firstResult, Integer maxResults);

    long getCount(Iterable<Map.Entry<String, Object>> filter);

    long getCount(Criterion filter);

}

