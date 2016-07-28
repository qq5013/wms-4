package org.dddml.wms.domain;

import java.util.*;
import java.math.BigDecimal;
import java.util.Date;
import org.dddml.wms.specialization.ApplicationContext;

public abstract class AbstractInOutLineStates implements InOutLineStates
{
    protected InOutLineStateDao getInOutLineStateDao()
    {
        return (InOutLineStateDao)ApplicationContext.current.get("InOutLineStateDao");
    }

    private InOutState inOutState;

    private Map<InOutLineId, InOutLineState> loadedInOutLineStates = new HashMap<InOutLineId, InOutLineState>();

    private List<InOutLineState> removedInOutLineStates = new ArrayList<InOutLineState>();

    protected Iterable<InOutLineState> getLoadedInOutLineStates() {
        return this.loadedInOutLineStates.values();
    }

    private Iterable<InOutLineState> innerIterable;

    protected Iterable<InOutLineState> getInnerIterable()
    {
        if (innerIterable == null)
        {
            innerIterable = getInOutLineStateDao().findByInOutDocumentNumber(inOutState.getDocumentNumber());
        }
        return innerIterable;
    }

    public AbstractInOutLineStates(InOutState outerState)
    {
        this.inOutState = outerState;
    }

    @Override
    public Iterator<InOutLineState> iterator() {
        return getInnerIterable().iterator();
    }

    public InOutLineState get(SkuId skuId)
    {
        InOutLineId globalId = new InOutLineId(inOutState.getDocumentNumber(), skuId);
        if (loadedInOutLineStates.containsKey(globalId)) {
            return loadedInOutLineStates.get(globalId);
        }
        InOutLineState state = getInOutLineStateDao().get(globalId);
        loadedInOutLineStates.put(globalId, state);
        return state;
    }

    public void remove(InOutLineState state)
    {
        this.removedInOutLineStates.add(state);
    }

    public void addToSave(InOutLineState state)
    {
        this.loadedInOutLineStates.put(state.getInOutLineId(), state);
    }

    //region Saveable Implements

    public void save ()
    {
        for (InOutLineState s : this.getLoadedInOutLineStates()) {
            getInOutLineStateDao().save(s);
        }
        for (InOutLineState s : this.removedInOutLineStates) {
            getInOutLineStateDao().delete(s);
        }
    }

    //endregion

}


