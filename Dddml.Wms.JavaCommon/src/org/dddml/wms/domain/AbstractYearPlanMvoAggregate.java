package org.dddml.wms.domain;

import java.util.*;
import java.util.Date;
import org.dddml.wms.specialization.*;
import org.dddml.wms.domain.*;

public abstract class AbstractYearPlanMvoAggregate extends AbstractAggregate implements YearPlanMvoAggregate
{
    private YearPlanMvoState state;

    private List<Event> changes = new ArrayList<Event>();

    public AbstractYearPlanMvoAggregate(YearPlanMvoState state)
    {
        this.state = state;
    }

    public YearPlanMvoState getState() {
        return this.state;
    }

    public List<Event> getChanges() {
        return this.changes;
    }

    public void create(YearPlanMvoCommand.CreateYearPlanMvo c)
    {
        if (c.getPersonVersion() == null) { c.setPersonVersion(YearPlanMvoState.VERSION_NULL); }
        YearPlanMvoStateEvent.YearPlanMvoStateCreated e = map(c);
        apply(e);
    }

    public void mergePatch(YearPlanMvoCommand.MergePatchYearPlanMvo c)
    {
        YearPlanMvoStateEvent.YearPlanMvoStateMergePatched e = map(c);
        apply(e);
    }

    public void delete(YearPlanMvoCommand.DeleteYearPlanMvo c)
    {
        YearPlanMvoStateEvent.YearPlanMvoStateDeleted e = map(c);
        apply(e);
    }

    public void throwOnInvalidStateTransition(Command c)
    {
        if (this.state.getPersonVersion() == null)
        {
            if (isCommandCreate((YearPlanMvoCommand)c))
            {
                return;
            }
            throw DomainError.named("premature", "Can't do anything to unexistent aggregate");
        }
        if (this.state.getDeleted())
        {
            throw DomainError.named("zombie", "Can't do anything to deleted aggregate.");
        }
        if (isCommandCreate((YearPlanMvoCommand)c))
            throw DomainError.named("rebirth", "Can't create aggregate that already exists");
    }

    protected void apply(Event e)
    {
        onApplying(e);
        state.mutate(e);
        changes.add(e);
    }

    protected YearPlanMvoStateEvent.YearPlanMvoStateCreated map(YearPlanMvoCommand.CreateYearPlanMvo c)
    {
        YearPlanMvoStateEventId stateEventId = new YearPlanMvoStateEventId(c.getYearPlanId(), c.getPersonVersion());
        YearPlanMvoStateEvent.YearPlanMvoStateCreated e = newYearPlanMvoStateCreated(stateEventId);
        e.setDescription(c.getDescription());
        e.setVersion(c.getVersion());
        e.setActive(c.getActive());
        e.setPersonBirthDate(c.getPersonBirthDate());
        e.setPersonLoves(c.getPersonLoves());
        e.setPersonCreatedBy(c.getPersonCreatedBy());
        e.setPersonCreatedAt(c.getPersonCreatedAt());
        e.setPersonUpdatedBy(c.getPersonUpdatedBy());
        e.setPersonUpdatedAt(c.getPersonUpdatedAt());
        e.setPersonActive(c.getPersonActive());
        e.setPersonDeleted(c.getPersonDeleted());
        ((AbstractYearPlanMvoStateEvent)e).setCommandId(c.getCommandId());
        e.setCreatedBy(c.getRequesterId());
        e.setCreatedAt(new Date());
        Long personVersion = c.getPersonVersion();
        return e;
    }

    protected YearPlanMvoStateEvent.YearPlanMvoStateMergePatched map(YearPlanMvoCommand.MergePatchYearPlanMvo c)
    {
        YearPlanMvoStateEventId stateEventId = new YearPlanMvoStateEventId(c.getYearPlanId(), c.getPersonVersion());
        YearPlanMvoStateEvent.YearPlanMvoStateMergePatched e = newYearPlanMvoStateMergePatched(stateEventId);
        e.setDescription(c.getDescription());
        e.setVersion(c.getVersion());
        e.setActive(c.getActive());
        e.setPersonBirthDate(c.getPersonBirthDate());
        e.setPersonLoves(c.getPersonLoves());
        e.setPersonCreatedBy(c.getPersonCreatedBy());
        e.setPersonCreatedAt(c.getPersonCreatedAt());
        e.setPersonUpdatedBy(c.getPersonUpdatedBy());
        e.setPersonUpdatedAt(c.getPersonUpdatedAt());
        e.setPersonActive(c.getPersonActive());
        e.setPersonDeleted(c.getPersonDeleted());
        e.setIsPropertyDescriptionRemoved(c.getIsPropertyDescriptionRemoved());
        e.setIsPropertyVersionRemoved(c.getIsPropertyVersionRemoved());
        e.setIsPropertyActiveRemoved(c.getIsPropertyActiveRemoved());
        e.setIsPropertyPersonBirthDateRemoved(c.getIsPropertyPersonBirthDateRemoved());
        e.setIsPropertyPersonLovesRemoved(c.getIsPropertyPersonLovesRemoved());
        e.setIsPropertyPersonCreatedByRemoved(c.getIsPropertyPersonCreatedByRemoved());
        e.setIsPropertyPersonCreatedAtRemoved(c.getIsPropertyPersonCreatedAtRemoved());
        e.setIsPropertyPersonUpdatedByRemoved(c.getIsPropertyPersonUpdatedByRemoved());
        e.setIsPropertyPersonUpdatedAtRemoved(c.getIsPropertyPersonUpdatedAtRemoved());
        e.setIsPropertyPersonActiveRemoved(c.getIsPropertyPersonActiveRemoved());
        e.setIsPropertyPersonDeletedRemoved(c.getIsPropertyPersonDeletedRemoved());
        ((AbstractYearPlanMvoStateEvent)e).setCommandId(c.getCommandId());
        e.setCreatedBy(c.getRequesterId());
        e.setCreatedAt(new Date());
        Long personVersion = c.getPersonVersion();
        return e;
    }

    protected YearPlanMvoStateEvent.YearPlanMvoStateDeleted map(YearPlanMvoCommand.DeleteYearPlanMvo c)
    {
        YearPlanMvoStateEventId stateEventId = new YearPlanMvoStateEventId(c.getYearPlanId(), c.getPersonVersion());
        YearPlanMvoStateEvent.YearPlanMvoStateDeleted e = newYearPlanMvoStateDeleted(stateEventId);
        ((AbstractYearPlanMvoStateEvent)e).setCommandId(c.getCommandId());
        e.setCreatedBy(c.getRequesterId());
        e.setCreatedAt(new Date());
        return e;
    }


    private static boolean isCommandCreate(YearPlanMvoCommand c)
    {
        return ((c instanceof YearPlanMvoCommand.CreateYearPlanMvo) 
            && c.getPersonVersion().equals(YearPlanMvoState.VERSION_NULL));
    }


    ////////////////////////

    protected YearPlanMvoStateEvent.YearPlanMvoStateCreated newYearPlanMvoStateCreated(String commandId, String requesterId) {
        YearPlanMvoStateEventId stateEventId = new YearPlanMvoStateEventId(this.state.getYearPlanId(), this.state.getPersonVersion());
        YearPlanMvoStateEvent.YearPlanMvoStateCreated e = newYearPlanMvoStateCreated(stateEventId);
        ((AbstractYearPlanMvoStateEvent)e).setCommandId(commandId);
        e.setCreatedBy(requesterId);
        e.setCreatedAt(new Date());
        return e;
    }

    protected YearPlanMvoStateEvent.YearPlanMvoStateMergePatched newYearPlanMvoStateMergePatched(String commandId, String requesterId) {
        YearPlanMvoStateEventId stateEventId = new YearPlanMvoStateEventId(this.state.getYearPlanId(), this.state.getPersonVersion());
        YearPlanMvoStateEvent.YearPlanMvoStateMergePatched e = newYearPlanMvoStateMergePatched(stateEventId);
        ((AbstractYearPlanMvoStateEvent)e).setCommandId(commandId);
        e.setCreatedBy(requesterId);
        e.setCreatedAt(new Date());
        return e;
    }

    protected YearPlanMvoStateEvent.YearPlanMvoStateDeleted newYearPlanMvoStateDeleted(String commandId, String requesterId) {
        YearPlanMvoStateEventId stateEventId = new YearPlanMvoStateEventId(this.state.getYearPlanId(), this.state.getPersonVersion());
        YearPlanMvoStateEvent.YearPlanMvoStateDeleted e = newYearPlanMvoStateDeleted(stateEventId);
        ((AbstractYearPlanMvoStateEvent)e).setCommandId(commandId);
        e.setCreatedBy(requesterId);
        e.setCreatedAt(new Date());
        return e;
    }

    protected YearPlanMvoStateEvent.YearPlanMvoStateCreated newYearPlanMvoStateCreated(YearPlanMvoStateEventId stateEventId) {
        return new AbstractYearPlanMvoStateEvent.SimpleYearPlanMvoStateCreated(stateEventId);
    }

    protected YearPlanMvoStateEvent.YearPlanMvoStateMergePatched newYearPlanMvoStateMergePatched(YearPlanMvoStateEventId stateEventId) {
        return new AbstractYearPlanMvoStateEvent.SimpleYearPlanMvoStateMergePatched(stateEventId);
    }

    protected YearPlanMvoStateEvent.YearPlanMvoStateDeleted newYearPlanMvoStateDeleted(YearPlanMvoStateEventId stateEventId)
    {
        return new AbstractYearPlanMvoStateEvent.SimpleYearPlanMvoStateDeleted(stateEventId);
    }


    public static class SimpleYearPlanMvoAggregate extends AbstractYearPlanMvoAggregate
    {
        public SimpleYearPlanMvoAggregate(YearPlanMvoState state) {
            super(state);
        }
    }

}

