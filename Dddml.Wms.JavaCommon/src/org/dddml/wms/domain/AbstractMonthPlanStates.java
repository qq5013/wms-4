package org.dddml.wms.domain;

import java.util.*;
import java.util.Date;
import org.dddml.wms.specialization.ApplicationContext;

public abstract class AbstractMonthPlanStates implements MonthPlanStates
{
    protected MonthPlanStateDao getMonthPlanStateDao()
    {
        return (MonthPlanStateDao)ApplicationContext.current.get("MonthPlanStateDao");
    }

    private YearPlanState yearPlanState;

    private Map<MonthPlanId, MonthPlanState> loadedMonthPlanStates = new HashMap<MonthPlanId, MonthPlanState>();

    private List<MonthPlanState> removedMonthPlanStates = new ArrayList<MonthPlanState>();

    protected Iterable<MonthPlanState> getLoadedMonthPlanStates() {
        return this.loadedMonthPlanStates.values();
    }

    private Iterable<MonthPlanState> innerIterable;

    protected Iterable<MonthPlanState> getInnerIterable()
    {
        if (innerIterable == null)
        {
            innerIterable = getMonthPlanStateDao().findByPersonalNameAndYear(yearPlanState.getYearPlanId().getPersonalName(), yearPlanState.getYearPlanId().getYear());
        }
        return innerIterable;
    }

    public AbstractMonthPlanStates(YearPlanState outerState)
    {
        this.yearPlanState = outerState;
    }

    @Override
    public Iterator<MonthPlanState> iterator() {
        return getInnerIterable().iterator();
    }

    public MonthPlanState get(Integer month)
    {
        MonthPlanId globalId = new MonthPlanId(yearPlanState.getYearPlanId().getPersonalName(), yearPlanState.getYearPlanId().getYear(), month);
        if (loadedMonthPlanStates.containsKey(globalId)) {
            return loadedMonthPlanStates.get(globalId);
        }
        MonthPlanState state = getMonthPlanStateDao().get(globalId);
        loadedMonthPlanStates.put(globalId, state);
        return state;
    }

    public void remove(MonthPlanState state)
    {
        this.removedMonthPlanStates.add(state);
    }

    public void addToSave(MonthPlanState state)
    {
        this.loadedMonthPlanStates.put(state.getMonthPlanId(), state);
    }

    //region Saveable Implements

    public void save ()
    {
        for (MonthPlanState s : this.getLoadedMonthPlanStates()) {
            getMonthPlanStateDao().save(s);
        }
        for (MonthPlanState s : this.removedMonthPlanStates) {
            getMonthPlanStateDao().delete(s);
        }
    }

    //endregion

}


