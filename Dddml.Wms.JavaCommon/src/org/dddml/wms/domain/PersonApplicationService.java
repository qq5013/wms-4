package org.dddml.wms.domain;

import java.util.Map;
import java.util.List;
import org.dddml.support.criterion.Criterion;
import java.util.Date;
import org.dddml.wms.specialization.Event;
import org.dddml.wms.domain.Command;

public interface PersonApplicationService
{
    void when(PersonCommand.CreatePerson c);

    void when(PersonCommand.MergePatchPerson c);

    void when(PersonCommand.DeletePerson c);

    PersonState get(PersonalName id);

    Iterable<PersonState> getAll(Integer firstResult, Integer maxResults);

    Iterable<PersonState> get(Iterable<Map.Entry<String, Object>> filter, List<String> orders, Integer firstResult, Integer maxResults);

    Iterable<PersonState> get(Criterion filter, List<String> orders, Integer firstResult, Integer maxResults);

    Iterable<PersonState> getByProperty(String propertyName, Object propertyValue, List<String> orders, Integer firstResult, Integer maxResults);

    long getCount(Iterable<Map.Entry<String, Object>> filter);

    long getCount(Criterion filter);

    PersonStateEvent getStateEvent(PersonalName personalName, long version);

    YearPlanState getYearPlan(PersonalName personalName, Integer year);

    MonthPlanState getMonthPlan(PersonalName personalName, Integer year, Integer month);

    DayPlanState getDayPlan(PersonalName personalName, Integer year, Integer month, Integer day);

}

