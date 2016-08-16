package org.dddml.wms.domain;

import java.util.*;
import java.util.Date;
import org.dddml.wms.specialization.*;
import org.dddml.wms.domain.*;

public abstract class AbstractMonthPlanMvoAggregate extends AbstractAggregate implements MonthPlanMvoAggregate
{
    private MonthPlanMvoState state;

    private List<Event> changes = new ArrayList<Event>();

    public AbstractMonthPlanMvoAggregate(MonthPlanMvoState state)
    {
        this.state = state;
    }

    public MonthPlanMvoState getState() {
        return this.state;
    }

    public List<Event> getChanges() {
        return this.changes;
    }

    public void create(MonthPlanMvoCommand.CreateMonthPlanMvo c)
    {
        if (c.getPersonVersion() == null) { c.setPersonVersion(MonthPlanMvoState.VERSION_NULL); }
        MonthPlanMvoStateEvent.MonthPlanMvoStateCreated e = map(c);
        apply(e);
    }

    public void mergePatch(MonthPlanMvoCommand.MergePatchMonthPlanMvo c)
    {
        MonthPlanMvoStateEvent.MonthPlanMvoStateMergePatched e = map(c);
        apply(e);
    }

    public void delete(MonthPlanMvoCommand.DeleteMonthPlanMvo c)
    {
        MonthPlanMvoStateEvent.MonthPlanMvoStateDeleted e = map(c);
        apply(e);
    }

    public void throwOnInvalidStateTransition(Command c)
    {
        if (this.state.getPersonVersion() == null)
        {
            if (isCommandCreate((MonthPlanMvoCommand)c))
            {
                return;
            }
            throw DomainError.named("premature", "Can't do anything to unexistent aggregate");
        }
        if (this.state.getDeleted())
        {
            throw DomainError.named("zombie", "Can't do anything to deleted aggregate.");
        }
        if (isCommandCreate((MonthPlanMvoCommand)c))
            throw DomainError.named("rebirth", "Can't create aggregate that already exists");
    }

    protected void apply(Event e)
    {
        onApplying(e);
        state.mutate(e);
        changes.add(e);
    }

    protected MonthPlanMvoStateEvent.MonthPlanMvoStateCreated map(MonthPlanMvoCommand.CreateMonthPlanMvo c)
    {
        MonthPlanMvoStateEventId stateEventId = new MonthPlanMvoStateEventId(c.getMonthPlanId(), c.getPersonVersion());
        MonthPlanMvoStateEvent.MonthPlanMvoStateCreated e = newMonthPlanMvoStateCreated(stateEventId);
        e.setDescription(c.getDescription());
        e.setVersion(c.getVersion());
        e.setActive(c.getActive());
        e.setYearPlanDescription(c.getYearPlanDescription());
        e.setYearPlanVersion(c.getYearPlanVersion());
        e.setYearPlanCreatedBy(c.getYearPlanCreatedBy());
        e.setYearPlanCreatedAt(c.getYearPlanCreatedAt());
        e.setYearPlanUpdatedBy(c.getYearPlanUpdatedBy());
        e.setYearPlanUpdatedAt(c.getYearPlanUpdatedAt());
        e.setYearPlanActive(c.getYearPlanActive());
        e.setYearPlanDeleted(c.getYearPlanDeleted());
        e.setPersonBirthDate(c.getPersonBirthDate());
        e.setPersonLoves(c.getPersonLoves());
        e.setPersonCreatedBy(c.getPersonCreatedBy());
        e.setPersonCreatedAt(c.getPersonCreatedAt());
        e.setPersonUpdatedBy(c.getPersonUpdatedBy());
        e.setPersonUpdatedAt(c.getPersonUpdatedAt());
        e.setPersonActive(c.getPersonActive());
        e.setPersonDeleted(c.getPersonDeleted());
        ((AbstractMonthPlanMvoStateEvent)e).setCommandId(c.getCommandId());
        e.setCreatedBy(c.getRequesterId());
        e.setCreatedAt(new Date());
        Long personVersion = c.getPersonVersion();
        return e;
    }

    protected MonthPlanMvoStateEvent.MonthPlanMvoStateMergePatched map(MonthPlanMvoCommand.MergePatchMonthPlanMvo c)
    {
        MonthPlanMvoStateEventId stateEventId = new MonthPlanMvoStateEventId(c.getMonthPlanId(), c.getPersonVersion());
        MonthPlanMvoStateEvent.MonthPlanMvoStateMergePatched e = newMonthPlanMvoStateMergePatched(stateEventId);
        e.setDescription(c.getDescription());
        e.setVersion(c.getVersion());
        e.setActive(c.getActive());
        e.setYearPlanDescription(c.getYearPlanDescription());
        e.setYearPlanVersion(c.getYearPlanVersion());
        e.setYearPlanCreatedBy(c.getYearPlanCreatedBy());
        e.setYearPlanCreatedAt(c.getYearPlanCreatedAt());
        e.setYearPlanUpdatedBy(c.getYearPlanUpdatedBy());
        e.setYearPlanUpdatedAt(c.getYearPlanUpdatedAt());
        e.setYearPlanActive(c.getYearPlanActive());
        e.setYearPlanDeleted(c.getYearPlanDeleted());
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
        e.setIsPropertyYearPlanDescriptionRemoved(c.getIsPropertyYearPlanDescriptionRemoved());
        e.setIsPropertyYearPlanVersionRemoved(c.getIsPropertyYearPlanVersionRemoved());
        e.setIsPropertyYearPlanCreatedByRemoved(c.getIsPropertyYearPlanCreatedByRemoved());
        e.setIsPropertyYearPlanCreatedAtRemoved(c.getIsPropertyYearPlanCreatedAtRemoved());
        e.setIsPropertyYearPlanUpdatedByRemoved(c.getIsPropertyYearPlanUpdatedByRemoved());
        e.setIsPropertyYearPlanUpdatedAtRemoved(c.getIsPropertyYearPlanUpdatedAtRemoved());
        e.setIsPropertyYearPlanActiveRemoved(c.getIsPropertyYearPlanActiveRemoved());
        e.setIsPropertyYearPlanDeletedRemoved(c.getIsPropertyYearPlanDeletedRemoved());
        e.setIsPropertyPersonBirthDateRemoved(c.getIsPropertyPersonBirthDateRemoved());
        e.setIsPropertyPersonLovesRemoved(c.getIsPropertyPersonLovesRemoved());
        e.setIsPropertyPersonCreatedByRemoved(c.getIsPropertyPersonCreatedByRemoved());
        e.setIsPropertyPersonCreatedAtRemoved(c.getIsPropertyPersonCreatedAtRemoved());
        e.setIsPropertyPersonUpdatedByRemoved(c.getIsPropertyPersonUpdatedByRemoved());
        e.setIsPropertyPersonUpdatedAtRemoved(c.getIsPropertyPersonUpdatedAtRemoved());
        e.setIsPropertyPersonActiveRemoved(c.getIsPropertyPersonActiveRemoved());
        e.setIsPropertyPersonDeletedRemoved(c.getIsPropertyPersonDeletedRemoved());
        ((AbstractMonthPlanMvoStateEvent)e).setCommandId(c.getCommandId());
        e.setCreatedBy(c.getRequesterId());
        e.setCreatedAt(new Date());
        Long personVersion = c.getPersonVersion();
        return e;
    }

    protected MonthPlanMvoStateEvent.MonthPlanMvoStateDeleted map(MonthPlanMvoCommand.DeleteMonthPlanMvo c)
    {
        MonthPlanMvoStateEventId stateEventId = new MonthPlanMvoStateEventId(c.getMonthPlanId(), c.getPersonVersion());
        MonthPlanMvoStateEvent.MonthPlanMvoStateDeleted e = newMonthPlanMvoStateDeleted(stateEventId);
        ((AbstractMonthPlanMvoStateEvent)e).setCommandId(c.getCommandId());
        e.setCreatedBy(c.getRequesterId());
        e.setCreatedAt(new Date());
        return e;
    }


    private static boolean isCommandCreate(MonthPlanMvoCommand c)
    {
        return ((c instanceof MonthPlanMvoCommand.CreateMonthPlanMvo) 
            && c.getPersonVersion().equals(MonthPlanMvoState.VERSION_NULL));
    }


    ////////////////////////

    protected MonthPlanMvoStateEvent.MonthPlanMvoStateCreated newMonthPlanMvoStateCreated(String commandId, String requesterId) {
        MonthPlanMvoStateEventId stateEventId = new MonthPlanMvoStateEventId(this.state.getMonthPlanId(), this.state.getPersonVersion());
        MonthPlanMvoStateEvent.MonthPlanMvoStateCreated e = newMonthPlanMvoStateCreated(stateEventId);
        ((AbstractMonthPlanMvoStateEvent)e).setCommandId(commandId);
        e.setCreatedBy(requesterId);
        e.setCreatedAt(new Date());
        return e;
    }

    protected MonthPlanMvoStateEvent.MonthPlanMvoStateMergePatched newMonthPlanMvoStateMergePatched(String commandId, String requesterId) {
        MonthPlanMvoStateEventId stateEventId = new MonthPlanMvoStateEventId(this.state.getMonthPlanId(), this.state.getPersonVersion());
        MonthPlanMvoStateEvent.MonthPlanMvoStateMergePatched e = newMonthPlanMvoStateMergePatched(stateEventId);
        ((AbstractMonthPlanMvoStateEvent)e).setCommandId(commandId);
        e.setCreatedBy(requesterId);
        e.setCreatedAt(new Date());
        return e;
    }

    protected MonthPlanMvoStateEvent.MonthPlanMvoStateDeleted newMonthPlanMvoStateDeleted(String commandId, String requesterId) {
        MonthPlanMvoStateEventId stateEventId = new MonthPlanMvoStateEventId(this.state.getMonthPlanId(), this.state.getPersonVersion());
        MonthPlanMvoStateEvent.MonthPlanMvoStateDeleted e = newMonthPlanMvoStateDeleted(stateEventId);
        ((AbstractMonthPlanMvoStateEvent)e).setCommandId(commandId);
        e.setCreatedBy(requesterId);
        e.setCreatedAt(new Date());
        return e;
    }

    protected MonthPlanMvoStateEvent.MonthPlanMvoStateCreated newMonthPlanMvoStateCreated(MonthPlanMvoStateEventId stateEventId) {
        return new AbstractMonthPlanMvoStateEvent.SimpleMonthPlanMvoStateCreated(stateEventId);
    }

    protected MonthPlanMvoStateEvent.MonthPlanMvoStateMergePatched newMonthPlanMvoStateMergePatched(MonthPlanMvoStateEventId stateEventId) {
        return new AbstractMonthPlanMvoStateEvent.SimpleMonthPlanMvoStateMergePatched(stateEventId);
    }

    protected MonthPlanMvoStateEvent.MonthPlanMvoStateDeleted newMonthPlanMvoStateDeleted(MonthPlanMvoStateEventId stateEventId)
    {
        return new AbstractMonthPlanMvoStateEvent.SimpleMonthPlanMvoStateDeleted(stateEventId);
    }


    public static class SimpleMonthPlanMvoAggregate extends AbstractMonthPlanMvoAggregate
    {
        public SimpleMonthPlanMvoAggregate(MonthPlanMvoState state) {
            super(state);
        }
    }

}

