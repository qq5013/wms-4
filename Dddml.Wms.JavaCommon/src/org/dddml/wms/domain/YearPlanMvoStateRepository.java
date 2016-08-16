package org.dddml.wms.domain;

import java.util.Map;
import java.util.List;
import org.dddml.support.criterion.Criterion;
import java.util.Date;

public interface YearPlanMvoStateRepository
{
    YearPlanMvoState get(YearPlanId id);

    Iterable<YearPlanMvoState> getAll(Integer firstResult, Integer maxResults);
    
    void save(YearPlanMvoState state);
    
    Iterable<YearPlanMvoState> get(Iterable<Map.Entry<String, Object>> filter, List<String> orders, Integer firstResult, Integer maxResults);

    Iterable<YearPlanMvoState> get(Criterion filter, List<String> orders, Integer firstResult, Integer maxResults);

    YearPlanMvoState getFirst(Iterable<Map.Entry<String, Object>> filter, List<String> orders);

    YearPlanMvoState getFirst(Map.Entry<String, Object> keyValue, List<String> orders);

    Iterable<YearPlanMvoState> getByProperty(String propertyName, Object propertyValue, List<String> orders, Integer firstResult, Integer maxResults);

    long getCount(Iterable<Map.Entry<String, Object>> filter);

    long getCount(Criterion filter);

}

