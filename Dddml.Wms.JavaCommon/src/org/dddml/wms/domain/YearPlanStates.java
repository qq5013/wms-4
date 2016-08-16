package org.dddml.wms.domain;

import java.util.Date;
import org.dddml.wms.specialization.Saveable;

public interface YearPlanStates extends Iterable<YearPlanState>, Saveable
{
    YearPlanState get(Integer year);
        
    void remove(YearPlanState state);

    void addToSave(YearPlanState state);

}


