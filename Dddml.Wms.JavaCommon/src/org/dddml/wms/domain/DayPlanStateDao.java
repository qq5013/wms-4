package org.dddml.wms.domain;

import java.util.Date;

public interface DayPlanStateDao
{
    DayPlanState get(DayPlanId id);

    void save(DayPlanState state);

    Iterable<DayPlanState> findByPersonalNameAndYearAndMonth(PersonalName personalName, Integer year, Integer month);

    void delete(DayPlanState state);
}


