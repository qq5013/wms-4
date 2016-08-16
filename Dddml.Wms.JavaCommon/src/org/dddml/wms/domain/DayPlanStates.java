package org.dddml.wms.domain;

import java.util.Date;
import org.dddml.wms.specialization.Saveable;

public interface DayPlanStates extends Iterable<DayPlanState>, Saveable
{
    DayPlanState get(Integer day);
        
    void remove(DayPlanState state);

    void addToSave(DayPlanState state);

}


