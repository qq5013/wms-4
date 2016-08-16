package org.dddml.wms.domain;

import java.util.Date;

public interface YearPlanStateDao
{
    YearPlanState get(YearPlanId id);

    void save(YearPlanState state);

    Iterable<YearPlanState> findByPersonalName(PersonalName personalName);

    void delete(YearPlanState state);
}


