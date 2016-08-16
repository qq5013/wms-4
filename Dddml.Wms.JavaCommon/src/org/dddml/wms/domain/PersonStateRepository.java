package org.dddml.wms.domain;

import java.util.Map;
import java.util.List;
import org.dddml.support.criterion.Criterion;
import java.util.Date;

public interface PersonStateRepository
{
    PersonState get(PersonalName id);

    Iterable<PersonState> getAll(Integer firstResult, Integer maxResults);
    
    void save(PersonState state);
    
    Iterable<PersonState> get(Iterable<Map.Entry<String, Object>> filter, List<String> orders, Integer firstResult, Integer maxResults);

    Iterable<PersonState> get(Criterion filter, List<String> orders, Integer firstResult, Integer maxResults);

    PersonState getFirst(Iterable<Map.Entry<String, Object>> filter, List<String> orders);

    PersonState getFirst(Map.Entry<String, Object> keyValue, List<String> orders);

    Iterable<PersonState> getByProperty(String propertyName, Object propertyValue, List<String> orders, Integer firstResult, Integer maxResults);

    long getCount(Iterable<Map.Entry<String, Object>> filter);

    long getCount(Criterion filter);

    YearPlanState getYearPlan(PersonalName personalName, Integer year);

    MonthPlanState getMonthPlan(PersonalName personalName, Integer year, Integer month);

    DayPlanState getDayPlan(PersonalName personalName, Integer year, Integer month, Integer day);

}

