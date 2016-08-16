package org.dddml.wms.domain;

import java.util.*;
import java.util.Date;
import org.dddml.wms.specialization.ApplicationContext;

public abstract class AbstractYearPlanStates implements YearPlanStates
{
    protected YearPlanStateDao getYearPlanStateDao()
    {
        return (YearPlanStateDao)ApplicationContext.current.get("YearPlanStateDao");
    }

    private PersonState personState;

    private Map<YearPlanId, YearPlanState> loadedYearPlanStates = new HashMap<YearPlanId, YearPlanState>();

    private List<YearPlanState> removedYearPlanStates = new ArrayList<YearPlanState>();

    protected Iterable<YearPlanState> getLoadedYearPlanStates() {
        return this.loadedYearPlanStates.values();
    }

    private Iterable<YearPlanState> innerIterable;

    protected Iterable<YearPlanState> getInnerIterable()
    {
        if (innerIterable == null)
        {
            innerIterable = getYearPlanStateDao().findByPersonalName(personState.getPersonalName());
        }
        return innerIterable;
    }

    public AbstractYearPlanStates(PersonState outerState)
    {
        this.personState = outerState;
    }

    @Override
    public Iterator<YearPlanState> iterator() {
        return getInnerIterable().iterator();
    }

    public YearPlanState get(Integer year)
    {
        YearPlanId globalId = new YearPlanId(personState.getPersonalName(), year);
        if (loadedYearPlanStates.containsKey(globalId)) {
            return loadedYearPlanStates.get(globalId);
        }
        YearPlanState state = getYearPlanStateDao().get(globalId);
        loadedYearPlanStates.put(globalId, state);
        return state;
    }

    public void remove(YearPlanState state)
    {
        this.removedYearPlanStates.add(state);
    }

    public void addToSave(YearPlanState state)
    {
        this.loadedYearPlanStates.put(state.getYearPlanId(), state);
    }

    //region Saveable Implements

    public void save ()
    {
        for (YearPlanState s : this.getLoadedYearPlanStates()) {
            getYearPlanStateDao().save(s);
        }
        for (YearPlanState s : this.removedYearPlanStates) {
            getYearPlanStateDao().delete(s);
        }
    }

    //endregion

}


