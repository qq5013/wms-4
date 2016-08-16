package org.dddml.wms.domain;

import java.util.Map;
import java.util.List;
import org.dddml.support.criterion.Criterion;
import java.util.Date;

public interface MonthPlanMvoStateRepository
{
    MonthPlanMvoState get(MonthPlanId id);

    Iterable<MonthPlanMvoState> getAll(Integer firstResult, Integer maxResults);
    
    void save(MonthPlanMvoState state);
    
    Iterable<MonthPlanMvoState> get(Iterable<Map.Entry<String, Object>> filter, List<String> orders, Integer firstResult, Integer maxResults);

    Iterable<MonthPlanMvoState> get(Criterion filter, List<String> orders, Integer firstResult, Integer maxResults);

    MonthPlanMvoState getFirst(Iterable<Map.Entry<String, Object>> filter, List<String> orders);

    MonthPlanMvoState getFirst(Map.Entry<String, Object> keyValue, List<String> orders);

    Iterable<MonthPlanMvoState> getByProperty(String propertyName, Object propertyValue, List<String> orders, Integer firstResult, Integer maxResults);

    long getCount(Iterable<Map.Entry<String, Object>> filter);

    long getCount(Criterion filter);

}

