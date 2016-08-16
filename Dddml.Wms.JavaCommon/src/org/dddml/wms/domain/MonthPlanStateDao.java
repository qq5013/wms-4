package org.dddml.wms.domain;

import java.util.Date;

public interface MonthPlanStateDao
{
    MonthPlanState get(MonthPlanId id);

    void save(MonthPlanState state);

    Iterable<MonthPlanState> findByPersonalNameAndYear(PersonalName personalName, Integer year);

    void delete(MonthPlanState state);
}


