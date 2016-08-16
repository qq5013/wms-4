package org.dddml.wms.domain;

import java.util.Map;
import java.util.List;
import org.dddml.support.criterion.Criterion;
import java.util.Date;

public interface DayPlanMvoStateRepository
{
    DayPlanMvoState get(DayPlanId id);

    Iterable<DayPlanMvoState> getAll(Integer firstResult, Integer maxResults);
    
    void save(DayPlanMvoState state);
    
    Iterable<DayPlanMvoState> get(Iterable<Map.Entry<String, Object>> filter, List<String> orders, Integer firstResult, Integer maxResults);

    Iterable<DayPlanMvoState> get(Criterion filter, List<String> orders, Integer firstResult, Integer maxResults);

    DayPlanMvoState getFirst(Iterable<Map.Entry<String, Object>> filter, List<String> orders);

    DayPlanMvoState getFirst(Map.Entry<String, Object> keyValue, List<String> orders);

    Iterable<DayPlanMvoState> getByProperty(String propertyName, Object propertyValue, List<String> orders, Integer firstResult, Integer maxResults);

    long getCount(Iterable<Map.Entry<String, Object>> filter);

    long getCount(Criterion filter);

}

