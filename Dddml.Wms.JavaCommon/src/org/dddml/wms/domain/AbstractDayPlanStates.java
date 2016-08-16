package org.dddml.wms.domain;

import java.util.*;
import java.util.Date;
import org.dddml.wms.specialization.ApplicationContext;

public abstract class AbstractDayPlanStates implements DayPlanStates
{
    protected DayPlanStateDao getDayPlanStateDao()
    {
        return (DayPlanStateDao)ApplicationContext.current.get("DayPlanStateDao");
    }

    private MonthPlanState monthPlanState;

    private Map<DayPlanId, DayPlanState> loadedDayPlanStates = new HashMap<DayPlanId, DayPlanState>();

    private List<DayPlanState> removedDayPlanStates = new ArrayList<DayPlanState>();

    protected Iterable<DayPlanState> getLoadedDayPlanStates() {
        return this.loadedDayPlanStates.values();
    }

    private Iterable<DayPlanState> innerIterable;

    protected Iterable<DayPlanState> getInnerIterable()
    {
        if (innerIterable == null)
        {
            innerIterable = getDayPlanStateDao().findByPersonalNameAndYearAndMonth(monthPlanState.getMonthPlanId().getPersonalName(), monthPlanState.getMonthPlanId().getYear(), monthPlanState.getMonthPlanId().getMonth());
        }
        return innerIterable;
    }

    public AbstractDayPlanStates(MonthPlanState outerState)
    {
        this.monthPlanState = outerState;
    }

    @Override
    public Iterator<DayPlanState> iterator() {
        return getInnerIterable().iterator();
    }

    public DayPlanState get(Integer day)
    {
        DayPlanId globalId = new DayPlanId(monthPlanState.getMonthPlanId().getPersonalName(), monthPlanState.getMonthPlanId().getYear(), monthPlanState.getMonthPlanId().getMonth(), day);
        if (loadedDayPlanStates.containsKey(globalId)) {
            return loadedDayPlanStates.get(globalId);
        }
        DayPlanState state = getDayPlanStateDao().get(globalId);
        loadedDayPlanStates.put(globalId, state);
        return state;
    }

    public void remove(DayPlanState state)
    {
        this.removedDayPlanStates.add(state);
    }

    public void addToSave(DayPlanState state)
    {
        this.loadedDayPlanStates.put(state.getDayPlanId(), state);
    }

    //region Saveable Implements

    public void save ()
    {
        for (DayPlanState s : this.getLoadedDayPlanStates()) {
            getDayPlanStateDao().save(s);
        }
        for (DayPlanState s : this.removedDayPlanStates) {
            getDayPlanStateDao().delete(s);
        }
    }

    //endregion

}


