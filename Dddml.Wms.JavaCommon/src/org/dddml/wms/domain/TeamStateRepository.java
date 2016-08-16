package org.dddml.wms.domain;

import java.util.Map;
import java.util.List;
import org.dddml.support.criterion.Criterion;
import java.util.Date;

public interface TeamStateRepository
{
    TeamState get(String id);

    Iterable<TeamState> getAll(Integer firstResult, Integer maxResults);
    
    void save(TeamState state);
    
    Iterable<TeamState> get(Iterable<Map.Entry<String, Object>> filter, List<String> orders, Integer firstResult, Integer maxResults);

    Iterable<TeamState> get(Criterion filter, List<String> orders, Integer firstResult, Integer maxResults);

    TeamState getFirst(Iterable<Map.Entry<String, Object>> filter, List<String> orders);

    TeamState getFirst(Map.Entry<String, Object> keyValue, List<String> orders);

    Iterable<TeamState> getByProperty(String propertyName, Object propertyValue, List<String> orders, Integer firstResult, Integer maxResults);

    long getCount(Iterable<Map.Entry<String, Object>> filter);

    long getCount(Criterion filter);

}

