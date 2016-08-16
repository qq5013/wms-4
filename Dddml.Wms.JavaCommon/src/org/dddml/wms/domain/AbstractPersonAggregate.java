package org.dddml.wms.domain;

import java.util.*;
import java.util.Date;
import org.dddml.wms.specialization.*;
import org.dddml.wms.domain.*;

public abstract class AbstractPersonAggregate extends AbstractAggregate implements PersonAggregate
{
    private PersonState state;

    private List<Event> changes = new ArrayList<Event>();

    public AbstractPersonAggregate(PersonState state)
    {
        this.state = state;
    }

    public PersonState getState() {
        return this.state;
    }

    public List<Event> getChanges() {
        return this.changes;
    }

    public void create(PersonCommand.CreatePerson c)
    {
        if (c.getVersion() == null) { c.setVersion(PersonState.VERSION_NULL); }
        PersonStateEvent.PersonStateCreated e = map(c);
        apply(e);
    }

    public void mergePatch(PersonCommand.MergePatchPerson c)
    {
        PersonStateEvent.PersonStateMergePatched e = map(c);
        apply(e);
    }

    public void delete(PersonCommand.DeletePerson c)
    {
        PersonStateEvent.PersonStateDeleted e = map(c);
        apply(e);
    }

    public void throwOnInvalidStateTransition(Command c)
    {
        if (this.state.getVersion() == null)
        {
            if (isCommandCreate((PersonCommand)c))
            {
                return;
            }
            throw DomainError.named("premature", "Can't do anything to unexistent aggregate");
        }
        if (this.state.getDeleted())
        {
            throw DomainError.named("zombie", "Can't do anything to deleted aggregate.");
        }
        if (isCommandCreate((PersonCommand)c))
            throw DomainError.named("rebirth", "Can't create aggregate that already exists");
    }

    protected void apply(Event e)
    {
        onApplying(e);
        state.mutate(e);
        changes.add(e);
    }

    protected PersonStateEvent.PersonStateCreated map(PersonCommand.CreatePerson c)
    {
        PersonStateEventId stateEventId = new PersonStateEventId(c.getPersonalName(), c.getVersion());
        PersonStateEvent.PersonStateCreated e = newPersonStateCreated(stateEventId);
        e.setBirthDate(c.getBirthDate());
        e.setLoves(c.getLoves());
        e.setActive(c.getActive());
        ((AbstractPersonStateEvent)e).setCommandId(c.getCommandId());
        e.setCreatedBy(c.getRequesterId());
        e.setCreatedAt(new Date());
        Long version = c.getVersion();
        for (YearPlanCommand.CreateYearPlan innerCommand : c.getYearPlans())
        {
            throwOnInconsistentCommands(c, innerCommand);
            YearPlanStateEvent.YearPlanStateCreated innerEvent = mapCreate(innerCommand, c, version, this.state);
            e.addYearPlanEvent(innerEvent);
        }

        return e;
    }

    protected PersonStateEvent.PersonStateMergePatched map(PersonCommand.MergePatchPerson c)
    {
        PersonStateEventId stateEventId = new PersonStateEventId(c.getPersonalName(), c.getVersion());
        PersonStateEvent.PersonStateMergePatched e = newPersonStateMergePatched(stateEventId);
        e.setBirthDate(c.getBirthDate());
        e.setLoves(c.getLoves());
        e.setActive(c.getActive());
        e.setIsPropertyBirthDateRemoved(c.getIsPropertyBirthDateRemoved());
        e.setIsPropertyLovesRemoved(c.getIsPropertyLovesRemoved());
        e.setIsPropertyActiveRemoved(c.getIsPropertyActiveRemoved());
        ((AbstractPersonStateEvent)e).setCommandId(c.getCommandId());
        e.setCreatedBy(c.getRequesterId());
        e.setCreatedAt(new Date());
        Long version = c.getVersion();
        for (YearPlanCommand innerCommand : c.getYearPlanCommands())
        {
            throwOnInconsistentCommands(c, innerCommand);
            YearPlanStateEvent innerEvent = map(innerCommand, c, version, this.state);
            e.addYearPlanEvent(innerEvent);
        }

        return e;
    }

    protected PersonStateEvent.PersonStateDeleted map(PersonCommand.DeletePerson c)
    {
        PersonStateEventId stateEventId = new PersonStateEventId(c.getPersonalName(), c.getVersion());
        PersonStateEvent.PersonStateDeleted e = newPersonStateDeleted(stateEventId);
        ((AbstractPersonStateEvent)e).setCommandId(c.getCommandId());
        e.setCreatedBy(c.getRequesterId());
        e.setCreatedAt(new Date());
        return e;
    }


    protected YearPlanStateEvent map(YearPlanCommand c, PersonCommand outerCommand, long version, PersonState outerState)
    {
        YearPlanCommand.CreateYearPlan create = (c.getCommandType().equals(CommandType.CREATE)) ? ((YearPlanCommand.CreateYearPlan)c) : null;
        if(create != null)
        {
            return mapCreate(create, outerCommand, version, outerState);
        }

        YearPlanCommand.MergePatchYearPlan merge = (c.getCommandType().equals(CommandType.MERGE_PATCH)) ? ((YearPlanCommand.MergePatchYearPlan)c) : null;
        if(merge != null)
        {
            return mapMergePatch(merge, outerCommand, version, outerState);
        }

        YearPlanCommand.RemoveYearPlan remove = (c.getCommandType().equals(CommandType.REMOVE)) ? ((YearPlanCommand.RemoveYearPlan)c) : null;
        if (remove != null)
        {
            return mapRemove(remove, outerCommand, version);
        }
        throw new UnsupportedOperationException();
    }

    protected YearPlanStateEvent.YearPlanStateCreated mapCreate(YearPlanCommand.CreateYearPlan c, PersonCommand outerCommand, Long version, PersonState outerState)
    {
        ((AbstractCommand)c).setRequesterId(outerCommand.getRequesterId());
        YearPlanStateEventId stateEventId = new YearPlanStateEventId(c.getPersonalName(), c.getYear(), version);
        YearPlanStateEvent.YearPlanStateCreated e = newYearPlanStateCreated(stateEventId);
        YearPlanState s = outerState.getYearPlans().get(c.getYear());

        e.setDescription(c.getDescription());
        e.setActive(c.getActive());
        e.setCreatedBy(c.getRequesterId());
        e.setCreatedAt(new Date());

        for (MonthPlanCommand.CreateMonthPlan innerCommand : c.getMonthPlans())
        {
            throwOnInconsistentCommands(c, innerCommand);

            MonthPlanStateEvent.MonthPlanStateCreated innerEvent = mapCreate(innerCommand, c, version, s);
            e.addMonthPlanEvent(innerEvent);
        }

        return e;

    }// END map(ICreate... ////////////////////////////

    protected YearPlanStateEvent.YearPlanStateMergePatched mapMergePatch(YearPlanCommand.MergePatchYearPlan c, PersonCommand outerCommand, Long version, PersonState outerState)
    {
        ((AbstractCommand)c).setRequesterId(outerCommand.getRequesterId());
        YearPlanStateEventId stateEventId = new YearPlanStateEventId(c.getPersonalName(), c.getYear(), version);
        YearPlanStateEvent.YearPlanStateMergePatched e = newYearPlanStateMergePatched(stateEventId);
        YearPlanState s = outerState.getYearPlans().get(c.getYear());

        e.setDescription(c.getDescription());
        e.setActive(c.getActive());
        e.setIsPropertyDescriptionRemoved(c.getIsPropertyDescriptionRemoved());
        e.setIsPropertyActiveRemoved(c.getIsPropertyActiveRemoved());
        e.setCreatedBy(c.getRequesterId());
        e.setCreatedAt(new Date());

        for (MonthPlanCommand innerCommand : c.getMonthPlanCommands())
        {
            throwOnInconsistentCommands(c, innerCommand);

            MonthPlanStateEvent innerEvent = map(innerCommand, c, version, s);
            e.addMonthPlanEvent(innerEvent);
        }

        return e;

    }// END map(IMergePatch... ////////////////////////////

    protected YearPlanStateEvent.YearPlanStateRemoved mapRemove(YearPlanCommand.RemoveYearPlan c, PersonCommand outerCommand, Long version)
    {
        ((AbstractCommand)c).setRequesterId(outerCommand.getRequesterId());
        YearPlanStateEventId stateEventId = new YearPlanStateEventId(c.getPersonalName(), c.getYear(), version);
        YearPlanStateEvent.YearPlanStateRemoved e = newYearPlanStateRemoved(stateEventId);

        e.setCreatedBy(c.getRequesterId());
        e.setCreatedAt(new Date());

        return e;

    }// END map(IRemove... ////////////////////////////


    protected MonthPlanStateEvent map(MonthPlanCommand c, YearPlanCommand outerCommand, long version, YearPlanState outerState)
    {
        MonthPlanCommand.CreateMonthPlan create = (c.getCommandType().equals(CommandType.CREATE)) ? ((MonthPlanCommand.CreateMonthPlan)c) : null;
        if(create != null)
        {
            return mapCreate(create, outerCommand, version, outerState);
        }

        MonthPlanCommand.MergePatchMonthPlan merge = (c.getCommandType().equals(CommandType.MERGE_PATCH)) ? ((MonthPlanCommand.MergePatchMonthPlan)c) : null;
        if(merge != null)
        {
            return mapMergePatch(merge, outerCommand, version, outerState);
        }

        MonthPlanCommand.RemoveMonthPlan remove = (c.getCommandType().equals(CommandType.REMOVE)) ? ((MonthPlanCommand.RemoveMonthPlan)c) : null;
        if (remove != null)
        {
            return mapRemove(remove, outerCommand, version);
        }
        throw new UnsupportedOperationException();
    }

    protected MonthPlanStateEvent.MonthPlanStateCreated mapCreate(MonthPlanCommand.CreateMonthPlan c, YearPlanCommand outerCommand, Long version, YearPlanState outerState)
    {
        ((AbstractCommand)c).setRequesterId(outerCommand.getRequesterId());
        MonthPlanStateEventId stateEventId = new MonthPlanStateEventId(c.getPersonalName(), c.getYear(), c.getMonth(), version);
        MonthPlanStateEvent.MonthPlanStateCreated e = newMonthPlanStateCreated(stateEventId);
        MonthPlanState s = outerState.getMonthPlans().get(c.getMonth());

        e.setDescription(c.getDescription());
        e.setActive(c.getActive());
        e.setCreatedBy(c.getRequesterId());
        e.setCreatedAt(new Date());

        for (DayPlanCommand.CreateDayPlan innerCommand : c.getDayPlans())
        {
            throwOnInconsistentCommands(c, innerCommand);

            DayPlanStateEvent.DayPlanStateCreated innerEvent = mapCreate(innerCommand, c, version, s);
            e.addDayPlanEvent(innerEvent);
        }

        return e;

    }// END map(ICreate... ////////////////////////////

    protected MonthPlanStateEvent.MonthPlanStateMergePatched mapMergePatch(MonthPlanCommand.MergePatchMonthPlan c, YearPlanCommand outerCommand, Long version, YearPlanState outerState)
    {
        ((AbstractCommand)c).setRequesterId(outerCommand.getRequesterId());
        MonthPlanStateEventId stateEventId = new MonthPlanStateEventId(c.getPersonalName(), c.getYear(), c.getMonth(), version);
        MonthPlanStateEvent.MonthPlanStateMergePatched e = newMonthPlanStateMergePatched(stateEventId);
        MonthPlanState s = outerState.getMonthPlans().get(c.getMonth());

        e.setDescription(c.getDescription());
        e.setActive(c.getActive());
        e.setIsPropertyDescriptionRemoved(c.getIsPropertyDescriptionRemoved());
        e.setIsPropertyActiveRemoved(c.getIsPropertyActiveRemoved());
        e.setCreatedBy(c.getRequesterId());
        e.setCreatedAt(new Date());

        for (DayPlanCommand innerCommand : c.getDayPlanCommands())
        {
            throwOnInconsistentCommands(c, innerCommand);

            DayPlanStateEvent innerEvent = map(innerCommand, c, version, s);
            e.addDayPlanEvent(innerEvent);
        }

        return e;

    }// END map(IMergePatch... ////////////////////////////

    protected MonthPlanStateEvent.MonthPlanStateRemoved mapRemove(MonthPlanCommand.RemoveMonthPlan c, YearPlanCommand outerCommand, Long version)
    {
        ((AbstractCommand)c).setRequesterId(outerCommand.getRequesterId());
        MonthPlanStateEventId stateEventId = new MonthPlanStateEventId(c.getPersonalName(), c.getYear(), c.getMonth(), version);
        MonthPlanStateEvent.MonthPlanStateRemoved e = newMonthPlanStateRemoved(stateEventId);

        e.setCreatedBy(c.getRequesterId());
        e.setCreatedAt(new Date());

        return e;

    }// END map(IRemove... ////////////////////////////


    protected DayPlanStateEvent map(DayPlanCommand c, MonthPlanCommand outerCommand, long version, MonthPlanState outerState)
    {
        DayPlanCommand.CreateDayPlan create = (c.getCommandType().equals(CommandType.CREATE)) ? ((DayPlanCommand.CreateDayPlan)c) : null;
        if(create != null)
        {
            return mapCreate(create, outerCommand, version, outerState);
        }

        DayPlanCommand.MergePatchDayPlan merge = (c.getCommandType().equals(CommandType.MERGE_PATCH)) ? ((DayPlanCommand.MergePatchDayPlan)c) : null;
        if(merge != null)
        {
            return mapMergePatch(merge, outerCommand, version, outerState);
        }

        DayPlanCommand.RemoveDayPlan remove = (c.getCommandType().equals(CommandType.REMOVE)) ? ((DayPlanCommand.RemoveDayPlan)c) : null;
        if (remove != null)
        {
            return mapRemove(remove, outerCommand, version);
        }
        throw new UnsupportedOperationException();
    }

    protected DayPlanStateEvent.DayPlanStateCreated mapCreate(DayPlanCommand.CreateDayPlan c, MonthPlanCommand outerCommand, Long version, MonthPlanState outerState)
    {
        ((AbstractCommand)c).setRequesterId(outerCommand.getRequesterId());
        DayPlanStateEventId stateEventId = new DayPlanStateEventId(c.getPersonalName(), c.getYear(), c.getMonth(), c.getDay(), version);
        DayPlanStateEvent.DayPlanStateCreated e = newDayPlanStateCreated(stateEventId);
        DayPlanState s = outerState.getDayPlans().get(c.getDay());

        e.setDescription(c.getDescription());
        e.setActive(c.getActive());
        e.setCreatedBy(c.getRequesterId());
        e.setCreatedAt(new Date());
        return e;

    }// END map(ICreate... ////////////////////////////

    protected DayPlanStateEvent.DayPlanStateMergePatched mapMergePatch(DayPlanCommand.MergePatchDayPlan c, MonthPlanCommand outerCommand, Long version, MonthPlanState outerState)
    {
        ((AbstractCommand)c).setRequesterId(outerCommand.getRequesterId());
        DayPlanStateEventId stateEventId = new DayPlanStateEventId(c.getPersonalName(), c.getYear(), c.getMonth(), c.getDay(), version);
        DayPlanStateEvent.DayPlanStateMergePatched e = newDayPlanStateMergePatched(stateEventId);
        DayPlanState s = outerState.getDayPlans().get(c.getDay());

        e.setDescription(c.getDescription());
        e.setActive(c.getActive());
        e.setIsPropertyDescriptionRemoved(c.getIsPropertyDescriptionRemoved());
        e.setIsPropertyActiveRemoved(c.getIsPropertyActiveRemoved());
        e.setCreatedBy(c.getRequesterId());
        e.setCreatedAt(new Date());
        return e;

    }// END map(IMergePatch... ////////////////////////////

    protected DayPlanStateEvent.DayPlanStateRemoved mapRemove(DayPlanCommand.RemoveDayPlan c, MonthPlanCommand outerCommand, Long version)
    {
        ((AbstractCommand)c).setRequesterId(outerCommand.getRequesterId());
        DayPlanStateEventId stateEventId = new DayPlanStateEventId(c.getPersonalName(), c.getYear(), c.getMonth(), c.getDay(), version);
        DayPlanStateEvent.DayPlanStateRemoved e = newDayPlanStateRemoved(stateEventId);

        e.setCreatedBy(c.getRequesterId());
        e.setCreatedAt(new Date());

        return e;

    }// END map(IRemove... ////////////////////////////

    protected void throwOnInconsistentCommands(PersonCommand command, YearPlanCommand innerCommand)
    {
        AbstractPersonCommand properties = command instanceof AbstractPersonCommand ? (AbstractPersonCommand) command : null;
        AbstractYearPlanCommand innerProperties = innerCommand instanceof AbstractYearPlanCommand ? (AbstractYearPlanCommand) innerCommand : null;
        if (properties == null || innerProperties == null) { return; }
        String outerPersonalNameName = "PersonalName";
        PersonalName outerPersonalNameValue = properties.getPersonalName();
        String innerPersonalNameName = "PersonalName";
        PersonalName innerPersonalNameValue = innerProperties.getPersonalName();
        if (innerPersonalNameValue == null) {
            innerProperties.setPersonalName(outerPersonalNameValue);
        }
        else if (innerPersonalNameValue != outerPersonalNameValue 
            && (innerPersonalNameValue == null || innerPersonalNameValue != null && !innerPersonalNameValue.equals(outerPersonalNameValue))) 
        {
            throw DomainError.named("inconsistentId", "Outer %1$s %2$s NOT equals inner %3$s %4$s", outerPersonalNameName, outerPersonalNameValue, innerPersonalNameName, innerPersonalNameValue);
        }
    }// END throwOnInconsistentCommands /////////////////////

    protected void throwOnInconsistentCommands(YearPlanCommand command, MonthPlanCommand innerCommand)
    {
        AbstractYearPlanCommand properties = command instanceof AbstractYearPlanCommand ? (AbstractYearPlanCommand) command : null;
        AbstractMonthPlanCommand innerProperties = innerCommand instanceof AbstractMonthPlanCommand ? (AbstractMonthPlanCommand) innerCommand : null;
        if (properties == null || innerProperties == null) { return; }
        String outerPersonalNameName = "PersonalName";
        PersonalName outerPersonalNameValue = properties.getPersonalName();
        String innerPersonalNameName = "PersonalName";
        PersonalName innerPersonalNameValue = innerProperties.getPersonalName();
        if (innerPersonalNameValue == null) {
            innerProperties.setPersonalName(outerPersonalNameValue);
        }
        else if (innerPersonalNameValue != outerPersonalNameValue 
            && (innerPersonalNameValue == null || innerPersonalNameValue != null && !innerPersonalNameValue.equals(outerPersonalNameValue))) 
        {
            throw DomainError.named("inconsistentId", "Outer %1$s %2$s NOT equals inner %3$s %4$s", outerPersonalNameName, outerPersonalNameValue, innerPersonalNameName, innerPersonalNameValue);
        }
        String outerYearName = "Year";
        Integer outerYearValue = properties.getYear();
        String innerYearName = "Year";
        Integer innerYearValue = innerProperties.getYear();
        if (innerYearValue == null) {
            innerProperties.setYear(outerYearValue);
        }
        else if (innerYearValue != outerYearValue 
            && (innerYearValue == null || innerYearValue != null && !innerYearValue.equals(outerYearValue))) 
        {
            throw DomainError.named("inconsistentId", "Outer %1$s %2$s NOT equals inner %3$s %4$s", outerYearName, outerYearValue, innerYearName, innerYearValue);
        }
    }// END throwOnInconsistentCommands /////////////////////

    protected void throwOnInconsistentCommands(MonthPlanCommand command, DayPlanCommand innerCommand)
    {
        AbstractMonthPlanCommand properties = command instanceof AbstractMonthPlanCommand ? (AbstractMonthPlanCommand) command : null;
        AbstractDayPlanCommand innerProperties = innerCommand instanceof AbstractDayPlanCommand ? (AbstractDayPlanCommand) innerCommand : null;
        if (properties == null || innerProperties == null) { return; }
        String outerPersonalNameName = "PersonalName";
        PersonalName outerPersonalNameValue = properties.getPersonalName();
        String innerPersonalNameName = "PersonalName";
        PersonalName innerPersonalNameValue = innerProperties.getPersonalName();
        if (innerPersonalNameValue == null) {
            innerProperties.setPersonalName(outerPersonalNameValue);
        }
        else if (innerPersonalNameValue != outerPersonalNameValue 
            && (innerPersonalNameValue == null || innerPersonalNameValue != null && !innerPersonalNameValue.equals(outerPersonalNameValue))) 
        {
            throw DomainError.named("inconsistentId", "Outer %1$s %2$s NOT equals inner %3$s %4$s", outerPersonalNameName, outerPersonalNameValue, innerPersonalNameName, innerPersonalNameValue);
        }
        String outerYearName = "Year";
        Integer outerYearValue = properties.getYear();
        String innerYearName = "Year";
        Integer innerYearValue = innerProperties.getYear();
        if (innerYearValue == null) {
            innerProperties.setYear(outerYearValue);
        }
        else if (innerYearValue != outerYearValue 
            && (innerYearValue == null || innerYearValue != null && !innerYearValue.equals(outerYearValue))) 
        {
            throw DomainError.named("inconsistentId", "Outer %1$s %2$s NOT equals inner %3$s %4$s", outerYearName, outerYearValue, innerYearName, innerYearValue);
        }
        String outerMonthName = "Month";
        Integer outerMonthValue = properties.getMonth();
        String innerMonthName = "Month";
        Integer innerMonthValue = innerProperties.getMonth();
        if (innerMonthValue == null) {
            innerProperties.setMonth(outerMonthValue);
        }
        else if (innerMonthValue != outerMonthValue 
            && (innerMonthValue == null || innerMonthValue != null && !innerMonthValue.equals(outerMonthValue))) 
        {
            throw DomainError.named("inconsistentId", "Outer %1$s %2$s NOT equals inner %3$s %4$s", outerMonthName, outerMonthValue, innerMonthName, innerMonthValue);
        }
    }// END throwOnInconsistentCommands /////////////////////


    private static boolean isCommandCreate(PersonCommand c)
    {
        return ((c instanceof PersonCommand.CreatePerson) 
            && c.getVersion().equals(PersonState.VERSION_NULL));
    }


    ////////////////////////

    protected PersonStateEvent.PersonStateCreated newPersonStateCreated(String commandId, String requesterId) {
        PersonStateEventId stateEventId = new PersonStateEventId(this.state.getPersonalName(), this.state.getVersion());
        PersonStateEvent.PersonStateCreated e = newPersonStateCreated(stateEventId);
        ((AbstractPersonStateEvent)e).setCommandId(commandId);
        e.setCreatedBy(requesterId);
        e.setCreatedAt(new Date());
        return e;
    }

    protected PersonStateEvent.PersonStateMergePatched newPersonStateMergePatched(String commandId, String requesterId) {
        PersonStateEventId stateEventId = new PersonStateEventId(this.state.getPersonalName(), this.state.getVersion());
        PersonStateEvent.PersonStateMergePatched e = newPersonStateMergePatched(stateEventId);
        ((AbstractPersonStateEvent)e).setCommandId(commandId);
        e.setCreatedBy(requesterId);
        e.setCreatedAt(new Date());
        return e;
    }

    protected PersonStateEvent.PersonStateDeleted newPersonStateDeleted(String commandId, String requesterId) {
        PersonStateEventId stateEventId = new PersonStateEventId(this.state.getPersonalName(), this.state.getVersion());
        PersonStateEvent.PersonStateDeleted e = newPersonStateDeleted(stateEventId);
        ((AbstractPersonStateEvent)e).setCommandId(commandId);
        e.setCreatedBy(requesterId);
        e.setCreatedAt(new Date());
        return e;
    }

    protected PersonStateEvent.PersonStateCreated newPersonStateCreated(PersonStateEventId stateEventId) {
        return new AbstractPersonStateEvent.SimplePersonStateCreated(stateEventId);
    }

    protected PersonStateEvent.PersonStateMergePatched newPersonStateMergePatched(PersonStateEventId stateEventId) {
        return new AbstractPersonStateEvent.SimplePersonStateMergePatched(stateEventId);
    }

    protected PersonStateEvent.PersonStateDeleted newPersonStateDeleted(PersonStateEventId stateEventId)
    {
        return new AbstractPersonStateEvent.SimplePersonStateDeleted(stateEventId);
    }

    protected YearPlanStateEvent.YearPlanStateCreated newYearPlanStateCreated(YearPlanStateEventId stateEventId) {
        return new AbstractYearPlanStateEvent.SimpleYearPlanStateCreated(stateEventId);
    }

    protected YearPlanStateEvent.YearPlanStateMergePatched newYearPlanStateMergePatched(YearPlanStateEventId stateEventId) {
        return new AbstractYearPlanStateEvent.SimpleYearPlanStateMergePatched(stateEventId);
    }

    protected YearPlanStateEvent.YearPlanStateRemoved newYearPlanStateRemoved(YearPlanStateEventId stateEventId)
    {
        return new AbstractYearPlanStateEvent.SimpleYearPlanStateRemoved(stateEventId);
    }

    protected MonthPlanStateEvent.MonthPlanStateCreated newMonthPlanStateCreated(MonthPlanStateEventId stateEventId) {
        return new AbstractMonthPlanStateEvent.SimpleMonthPlanStateCreated(stateEventId);
    }

    protected MonthPlanStateEvent.MonthPlanStateMergePatched newMonthPlanStateMergePatched(MonthPlanStateEventId stateEventId) {
        return new AbstractMonthPlanStateEvent.SimpleMonthPlanStateMergePatched(stateEventId);
    }

    protected MonthPlanStateEvent.MonthPlanStateRemoved newMonthPlanStateRemoved(MonthPlanStateEventId stateEventId)
    {
        return new AbstractMonthPlanStateEvent.SimpleMonthPlanStateRemoved(stateEventId);
    }

    protected DayPlanStateEvent.DayPlanStateCreated newDayPlanStateCreated(DayPlanStateEventId stateEventId) {
        return new AbstractDayPlanStateEvent.SimpleDayPlanStateCreated(stateEventId);
    }

    protected DayPlanStateEvent.DayPlanStateMergePatched newDayPlanStateMergePatched(DayPlanStateEventId stateEventId) {
        return new AbstractDayPlanStateEvent.SimpleDayPlanStateMergePatched(stateEventId);
    }

    protected DayPlanStateEvent.DayPlanStateRemoved newDayPlanStateRemoved(DayPlanStateEventId stateEventId)
    {
        return new AbstractDayPlanStateEvent.SimpleDayPlanStateRemoved(stateEventId);
    }


    public static class SimplePersonAggregate extends AbstractPersonAggregate
    {
        public SimplePersonAggregate(PersonState state) {
            super(state);
        }
    }

}

