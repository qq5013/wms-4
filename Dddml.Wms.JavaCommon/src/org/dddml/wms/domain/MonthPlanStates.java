package org.dddml.wms.domain;

import java.util.Date;
import org.dddml.wms.specialization.Saveable;

public interface MonthPlanStates extends Iterable<MonthPlanState>, Saveable
{
    MonthPlanState get(Integer month);
        
    void remove(MonthPlanState state);

    void addToSave(MonthPlanState state);

}


