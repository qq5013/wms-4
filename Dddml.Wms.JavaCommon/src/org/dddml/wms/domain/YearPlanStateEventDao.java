package org.dddml.wms.domain;

import java.util.Date;

public interface YearPlanStateEventDao
{
    void save(YearPlanStateEvent e);

    Iterable<YearPlanStateEvent> findByPersonStateEventId(PersonStateEventId personStateEventId);

}

