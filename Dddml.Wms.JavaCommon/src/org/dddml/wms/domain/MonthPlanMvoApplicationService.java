package org.dddml.wms.domain;

import java.util.Map;
import java.util.List;
import org.dddml.support.criterion.Criterion;
import java.util.Date;
import org.dddml.wms.specialization.Event;
import org.dddml.wms.domain.Command;

public interface MonthPlanMvoApplicationService
{
    void when(MonthPlanMvoCommand.CreateMonthPlanMvo c);

    void when(MonthPlanMvoCommand.MergePatchMonthPlanMvo c);

    void when(MonthPlanMvoCommand.DeleteMonthPlanMvo c);

    MonthPlanMvoState get(MonthPlanId id);

    Iterable<MonthPlanMvoState> getAll(Integer firstResult, Integer maxResults);

    Iterable<MonthPlanMvoState> get(Iterable<Map.Entry<String, Object>> filter, List<String> orders, Integer firstResult, Integer maxResults);

    Iterable<MonthPlanMvoState> get(Criterion filter, List<String> orders, Integer firstResult, Integer maxResults);

    Iterable<MonthPlanMvoState> getByProperty(String propertyName, Object propertyValue, List<String> orders, Integer firstResult, Integer maxResults);

    long getCount(Iterable<Map.Entry<String, Object>> filter);

    long getCount(Criterion filter);

    MonthPlanMvoStateEvent getStateEvent(MonthPlanId monthPlanId, long version);

}

