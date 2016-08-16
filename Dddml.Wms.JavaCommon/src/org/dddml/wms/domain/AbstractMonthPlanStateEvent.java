package org.dddml.wms.domain;

import java.util.*;
import java.util.Date;
import org.dddml.wms.specialization.*;

public abstract class AbstractMonthPlanStateEvent extends AbstractStateEvent implements MonthPlanStateEvent 
{
    private MonthPlanStateEventId stateEventId;

    public MonthPlanStateEventId getStateEventId() {
        return this.stateEventId;
    }

    public void setStateEventId(MonthPlanStateEventId stateEventId) {
        this.stateEventId = stateEventId;
    }
    
    private boolean stateEventReadOnly;

    public boolean getStateEventReadOnly() { return this.stateEventReadOnly; }

    public void setStateEventReadOnly(boolean readOnly) { this.stateEventReadOnly = readOnly; }

    private Long version;

    public Long getVersion()
    {
        return this.version;
    }

    public void setVersion(Long version)
    {
        this.version = version;
    }

    private String description;

    public String getDescription()
    {
        return this.description;
    }

    public void setDescription(String description)
    {
        this.description = description;
    }

    private String createdBy;

    public String getCreatedBy()
    {
        return this.createdBy;
    }

    public void setCreatedBy(String createdBy)
    {
        this.createdBy = createdBy;
    }

    private Date createdAt;

    public Date getCreatedAt()
    {
        return this.createdAt;
    }

    public void setCreatedAt(Date createdAt)
    {
        this.createdAt = createdAt;
    }

    private Boolean active;

    public Boolean getActive()
    {
        return this.active;
    }

    public void setActive(Boolean active)
    {
        this.active = active;
    }

    private PersonalName personalName;

    public PersonalName getPersonalName()
    {
        return this.personalName;
    }

    public void setPersonalName(PersonalName personalName)
    {
        this.personalName = personalName;
    }

    private Integer year;

    public Integer getYear()
    {
        return this.year;
    }

    public void setYear(Integer year)
    {
        this.year = year;
    }


    private String commandId;

    public String getCommandId() {
        return commandId;
    }

    public void setCommandId(String commandId) {
        this.commandId = commandId;
    }

    protected AbstractMonthPlanStateEvent() {
    }

    protected AbstractMonthPlanStateEvent(MonthPlanStateEventId stateEventId) {
        this.stateEventId = stateEventId;
    }

    protected DayPlanStateEventDao getDayPlanStateEventDao() {
        return (DayPlanStateEventDao)ApplicationContext.current.get("DayPlanStateEventDao");
    }

    protected DayPlanStateEventId newDayPlanStateEventId(Integer day)
    {
        DayPlanStateEventId stateEventId = new DayPlanStateEventId(this.getStateEventId().getPersonalName(), this.getStateEventId().getYear(), this.getStateEventId().getMonth(), 
            day, 
            this.getStateEventId().getPersonVersion());
        return stateEventId;
    }

    protected void throwOnInconsistentEventIds(DayPlanStateEvent e)
    {
        throwOnInconsistentEventIds(this, e);
    }

    public static void throwOnInconsistentEventIds(MonthPlanStateEvent oe, DayPlanStateEvent e)
    {
        if (!oe.getStateEventId().getPersonalName().equals(e.getStateEventId().getPersonalName()))
        { 
            throw DomainError.named("inconsistentEventIds", "Outer Id PersonalName %1$s but inner id PersonalName %2$s", 
                oe.getStateEventId().getPersonalName(), e.getStateEventId().getPersonalName());
        }
        if (!oe.getStateEventId().getYear().equals(e.getStateEventId().getYear()))
        { 
            throw DomainError.named("inconsistentEventIds", "Outer Id Year %1$s but inner id Year %2$s", 
                oe.getStateEventId().getYear(), e.getStateEventId().getYear());
        }
        if (!oe.getStateEventId().getMonth().equals(e.getStateEventId().getMonth()))
        { 
            throw DomainError.named("inconsistentEventIds", "Outer Id Month %1$s but inner id Month %2$s", 
                oe.getStateEventId().getMonth(), e.getStateEventId().getMonth());
        }
    }

    public DayPlanStateEvent.DayPlanStateCreated newDayPlanStateCreated(Integer day) {
        return new AbstractDayPlanStateEvent.SimpleDayPlanStateCreated(newDayPlanStateEventId(day));
    }

    public DayPlanStateEvent.DayPlanStateMergePatched newDayPlanStateMergePatched(Integer day) {
        return new AbstractDayPlanStateEvent.SimpleDayPlanStateMergePatched(newDayPlanStateEventId(day));
    }

    public DayPlanStateEvent.DayPlanStateRemoved newDayPlanStateRemoved(Integer day) {
        return new AbstractDayPlanStateEvent.SimpleDayPlanStateRemoved(newDayPlanStateEventId(day));
    }


    public abstract String getStateEventType();


    public static abstract class AbstractMonthPlanStateCreated extends AbstractMonthPlanStateEvent implements MonthPlanStateCreated, Saveable
    {
        public AbstractMonthPlanStateCreated() {
        }

        public AbstractMonthPlanStateCreated(MonthPlanStateEventId stateEventId) {
            super(stateEventId);
        }

        public String getStateEventType() {
            return StateEventType.CREATED;
        }

        private Map<DayPlanStateEventId, DayPlanStateEvent.DayPlanStateCreated> dayPlanEvents = new HashMap<DayPlanStateEventId, DayPlanStateEvent.DayPlanStateCreated>();
        
        private Iterable<DayPlanStateEvent.DayPlanStateCreated> readOnlyDayPlanEvents;

        public Iterable<DayPlanStateEvent.DayPlanStateCreated> getDayPlanEvents()
        {
            if (!getStateEventReadOnly())
            {
                return this.dayPlanEvents.values();
            }
            else
            {
                if (readOnlyDayPlanEvents != null) { return readOnlyDayPlanEvents; }
                DayPlanStateEventDao eventDao = getDayPlanStateEventDao();
                List<DayPlanStateEvent.DayPlanStateCreated> eL = new ArrayList<DayPlanStateEvent.DayPlanStateCreated>();
                for (DayPlanStateEvent e : eventDao.findByMonthPlanStateEventId(this.getStateEventId()))
                {
                    e.setStateEventReadOnly(true);
                    eL.add((DayPlanStateEvent.DayPlanStateCreated)e);
                }
                return (readOnlyDayPlanEvents = eL);
            }
        }

        public void setDayPlanEvents(Iterable<DayPlanStateEvent.DayPlanStateCreated> es)
        {
            if (es != null)
            {
                for (DayPlanStateEvent.DayPlanStateCreated e : es)
                {
                    addDayPlanEvent(e);
                }
            }
            else { this.dayPlanEvents.clear(); }
        }
        
        public void addDayPlanEvent(DayPlanStateEvent.DayPlanStateCreated e)
        {
            throwOnInconsistentEventIds(e);
            this.dayPlanEvents.put(e.getStateEventId(), e);
        }

        public void save()
        {
            for (DayPlanStateEvent.DayPlanStateCreated e : this.getDayPlanEvents()) {
                getDayPlanStateEventDao().save(e);
            }
        }
    }


    public static abstract class AbstractMonthPlanStateMergePatched extends AbstractMonthPlanStateEvent implements MonthPlanStateMergePatched, Saveable
    {
        public AbstractMonthPlanStateMergePatched() {
        }

        public AbstractMonthPlanStateMergePatched(MonthPlanStateEventId stateEventId) {
            super(stateEventId);
        }

        public String getStateEventType() {
            return StateEventType.MERGE_PATCHED;
        }

        private Boolean isPropertyDescriptionRemoved;

        public Boolean getIsPropertyDescriptionRemoved() {
            return this.isPropertyDescriptionRemoved;
        }

        public void setIsPropertyDescriptionRemoved(Boolean removed) {
            this.isPropertyDescriptionRemoved = removed;
        }

        private Boolean isPropertyActiveRemoved;

        public Boolean getIsPropertyActiveRemoved() {
            return this.isPropertyActiveRemoved;
        }

        public void setIsPropertyActiveRemoved(Boolean removed) {
            this.isPropertyActiveRemoved = removed;
        }

        private Map<DayPlanStateEventId, DayPlanStateEvent> dayPlanEvents = new HashMap<DayPlanStateEventId, DayPlanStateEvent>();
        
        private Iterable<DayPlanStateEvent> readOnlyDayPlanEvents;

        public Iterable<DayPlanStateEvent> getDayPlanEvents()
        {
            if (!getStateEventReadOnly())
            {
                return this.dayPlanEvents.values();
            }
            else
            {
                if (readOnlyDayPlanEvents != null) { return readOnlyDayPlanEvents; }
                DayPlanStateEventDao eventDao = getDayPlanStateEventDao();
                List<DayPlanStateEvent> eL = new ArrayList<DayPlanStateEvent>();
                for (DayPlanStateEvent e : eventDao.findByMonthPlanStateEventId(this.getStateEventId()))
                {
                    e.setStateEventReadOnly(true);
                    eL.add((DayPlanStateEvent)e);
                }
                return (readOnlyDayPlanEvents = eL);
            }
        }

        public void setDayPlanEvents(Iterable<DayPlanStateEvent> es)
        {
            if (es != null)
            {
                for (DayPlanStateEvent e : es)
                {
                    addDayPlanEvent(e);
                }
            }
            else { this.dayPlanEvents.clear(); }
        }
        
        public void addDayPlanEvent(DayPlanStateEvent e)
        {
            throwOnInconsistentEventIds(e);
            this.dayPlanEvents.put(e.getStateEventId(), e);
        }

        public void save()
        {
            for (DayPlanStateEvent e : this.getDayPlanEvents()) {
                getDayPlanStateEventDao().save(e);
            }
        }
    }


    public static abstract class AbstractMonthPlanStateRemoved extends AbstractMonthPlanStateEvent implements MonthPlanStateRemoved, Saveable
    {
        public AbstractMonthPlanStateRemoved() {
        }

        public AbstractMonthPlanStateRemoved(MonthPlanStateEventId stateEventId) {
            super(stateEventId);
        }

        public String getStateEventType() {
            return StateEventType.REMOVED;
        }

		
        private Map<DayPlanStateEventId, DayPlanStateEvent.DayPlanStateRemoved> dayPlanEvents = new HashMap<DayPlanStateEventId, DayPlanStateEvent.DayPlanStateRemoved>();
        
        private Iterable<DayPlanStateEvent.DayPlanStateRemoved> readOnlyDayPlanEvents;

        public Iterable<DayPlanStateEvent.DayPlanStateRemoved> getDayPlanEvents()
        {
            if (!getStateEventReadOnly())
            {
                return this.dayPlanEvents.values();
            }
            else
            {
                if (readOnlyDayPlanEvents != null) { return readOnlyDayPlanEvents; }
                DayPlanStateEventDao eventDao = getDayPlanStateEventDao();
                List<DayPlanStateEvent.DayPlanStateRemoved> eL = new ArrayList<DayPlanStateEvent.DayPlanStateRemoved>();
                for (DayPlanStateEvent e : eventDao.findByMonthPlanStateEventId(this.getStateEventId()))
                {
                    e.setStateEventReadOnly(true);
                    eL.add((DayPlanStateEvent.DayPlanStateRemoved)e);
                }
                return (readOnlyDayPlanEvents = eL);
            }
        }

        public void setDayPlanEvents(Iterable<DayPlanStateEvent.DayPlanStateRemoved> es)
        {
            if (es != null)
            {
                for (DayPlanStateEvent.DayPlanStateRemoved e : es)
                {
                    addDayPlanEvent(e);
                }
            }
            else { this.dayPlanEvents.clear(); }
        }
        
        public void addDayPlanEvent(DayPlanStateEvent.DayPlanStateRemoved e)
        {
            throwOnInconsistentEventIds(e);
            this.dayPlanEvents.put(e.getStateEventId(), e);
        }

        public void save()
        {
            for (DayPlanStateEvent.DayPlanStateRemoved e : this.getDayPlanEvents()) {
                getDayPlanStateEventDao().save(e);
            }
        }
    }
        public static class SimpleMonthPlanStateCreated extends AbstractMonthPlanStateCreated
        {
			public SimpleMonthPlanStateCreated() {
			}

			public SimpleMonthPlanStateCreated(MonthPlanStateEventId stateEventId) {
				super(stateEventId);
			}
        }

        public static class SimpleMonthPlanStateMergePatched extends AbstractMonthPlanStateMergePatched
        {
			public SimpleMonthPlanStateMergePatched() {
			}

			public SimpleMonthPlanStateMergePatched(MonthPlanStateEventId stateEventId) {
				super(stateEventId);
			}
        }

        public static class SimpleMonthPlanStateRemoved extends AbstractMonthPlanStateRemoved
        {
			public SimpleMonthPlanStateRemoved() {
			}

			public SimpleMonthPlanStateRemoved(MonthPlanStateEventId stateEventId) {
				super(stateEventId);
			}
        }

}

