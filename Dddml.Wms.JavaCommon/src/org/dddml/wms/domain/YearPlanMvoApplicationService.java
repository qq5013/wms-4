package org.dddml.wms.domain;

import java.util.Map;
import java.util.List;
import org.dddml.support.criterion.Criterion;
import java.util.Date;
import org.dddml.wms.specialization.Event;
import org.dddml.wms.domain.Command;

public interface YearPlanMvoApplicationService
{
    void when(YearPlanMvoCommand.CreateYearPlanMvo c);

    void when(YearPlanMvoCommand.MergePatchYearPlanMvo c);

    void when(YearPlanMvoCommand.DeleteYearPlanMvo c);

    YearPlanMvoState get(YearPlanId id);

    Iterable<YearPlanMvoState> getAll(Integer firstResult, Integer maxResults);

    Iterable<YearPlanMvoState> get(Iterable<Map.Entry<String, Object>> filter, List<String> orders, Integer firstResult, Integer maxResults);

    Iterable<YearPlanMvoState> get(Criterion filter, List<String> orders, Integer firstResult, Integer maxResults);

    Iterable<YearPlanMvoState> getByProperty(String propertyName, Object propertyValue, List<String> orders, Integer firstResult, Integer maxResults);

    long getCount(Iterable<Map.Entry<String, Object>> filter);

    long getCount(Criterion filter);

    YearPlanMvoStateEvent getStateEvent(YearPlanId yearPlanId, long version);

}

