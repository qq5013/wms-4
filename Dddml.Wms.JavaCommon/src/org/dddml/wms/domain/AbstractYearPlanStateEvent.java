package org.dddml.wms.domain;

import java.util.*;
import java.util.Date;
import org.dddml.wms.specialization.*;

public abstract class AbstractYearPlanStateEvent extends AbstractStateEvent implements YearPlanStateEvent 
{
    private YearPlanStateEventId stateEventId;

    public YearPlanStateEventId getStateEventId() {
        return this.stateEventId;
    }

    public void setStateEventId(YearPlanStateEventId stateEventId) {
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


    private String commandId;

    public String getCommandId() {
        return commandId;
    }

    public void setCommandId(String commandId) {
        this.commandId = commandId;
    }

    protected AbstractYearPlanStateEvent() {
    }

    protected AbstractYearPlanStateEvent(YearPlanStateEventId stateEventId) {
        this.stateEventId = stateEventId;
    }

    protected MonthPlanStateEventDao getMonthPlanStateEventDao() {
        return (MonthPlanStateEventDao)ApplicationContext.current.get("MonthPlanStateEventDao");
    }

    protected MonthPlanStateEventId newMonthPlanStateEventId(Integer month)
    {
        MonthPlanStateEventId stateEventId = new MonthPlanStateEventId(this.getStateEventId().getPersonalName(), this.getStateEventId().getYear(), 
            month, 
            this.getStateEventId().getPersonVersion());
        return stateEventId;
    }

    protected void throwOnInconsistentEventIds(MonthPlanStateEvent e)
    {
        throwOnInconsistentEventIds(this, e);
    }

    public static void throwOnInconsistentEventIds(YearPlanStateEvent oe, MonthPlanStateEvent e)
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
    }

    public MonthPlanStateEvent.MonthPlanStateCreated newMonthPlanStateCreated(Integer month) {
        return new AbstractMonthPlanStateEvent.SimpleMonthPlanStateCreated(newMonthPlanStateEventId(month));
    }

    public MonthPlanStateEvent.MonthPlanStateMergePatched newMonthPlanStateMergePatched(Integer month) {
        return new AbstractMonthPlanStateEvent.SimpleMonthPlanStateMergePatched(newMonthPlanStateEventId(month));
    }

    public MonthPlanStateEvent.MonthPlanStateRemoved newMonthPlanStateRemoved(Integer month) {
        return new AbstractMonthPlanStateEvent.SimpleMonthPlanStateRemoved(newMonthPlanStateEventId(month));
    }


    public abstract String getStateEventType();


    public static abstract class AbstractYearPlanStateCreated extends AbstractYearPlanStateEvent implements YearPlanStateCreated, Saveable
    {
        public AbstractYearPlanStateCreated() {
        }

        public AbstractYearPlanStateCreated(YearPlanStateEventId stateEventId) {
            super(stateEventId);
        }

        public String getStateEventType() {
            return StateEventType.CREATED;
        }

        private Map<MonthPlanStateEventId, MonthPlanStateEvent.MonthPlanStateCreated> monthPlanEvents = new HashMap<MonthPlanStateEventId, MonthPlanStateEvent.MonthPlanStateCreated>();
        
        private Iterable<MonthPlanStateEvent.MonthPlanStateCreated> readOnlyMonthPlanEvents;

        public Iterable<MonthPlanStateEvent.MonthPlanStateCreated> getMonthPlanEvents()
        {
            if (!getStateEventReadOnly())
            {
                return this.monthPlanEvents.values();
            }
            else
            {
                if (readOnlyMonthPlanEvents != null) { return readOnlyMonthPlanEvents; }
                MonthPlanStateEventDao eventDao = getMonthPlanStateEventDao();
                List<MonthPlanStateEvent.MonthPlanStateCreated> eL = new ArrayList<MonthPlanStateEvent.MonthPlanStateCreated>();
                for (MonthPlanStateEvent e : eventDao.findByYearPlanStateEventId(this.getStateEventId()))
                {
                    e.setStateEventReadOnly(true);
                    eL.add((MonthPlanStateEvent.MonthPlanStateCreated)e);
                }
                return (readOnlyMonthPlanEvents = eL);
            }
        }

        public void setMonthPlanEvents(Iterable<MonthPlanStateEvent.MonthPlanStateCreated> es)
        {
            if (es != null)
            {
                for (MonthPlanStateEvent.MonthPlanStateCreated e : es)
                {
                    addMonthPlanEvent(e);
                }
            }
            else { this.monthPlanEvents.clear(); }
        }
        
        public void addMonthPlanEvent(MonthPlanStateEvent.MonthPlanStateCreated e)
        {
            throwOnInconsistentEventIds(e);
            this.monthPlanEvents.put(e.getStateEventId(), e);
        }

        public void save()
        {
            for (MonthPlanStateEvent.MonthPlanStateCreated e : this.getMonthPlanEvents()) {
                getMonthPlanStateEventDao().save(e);
            }
        }
    }


    public static abstract class AbstractYearPlanStateMergePatched extends AbstractYearPlanStateEvent implements YearPlanStateMergePatched, Saveable
    {
        public AbstractYearPlanStateMergePatched() {
        }

        public AbstractYearPlanStateMergePatched(YearPlanStateEventId stateEventId) {
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

        private Map<MonthPlanStateEventId, MonthPlanStateEvent> monthPlanEvents = new HashMap<MonthPlanStateEventId, MonthPlanStateEvent>();
        
        private Iterable<MonthPlanStateEvent> readOnlyMonthPlanEvents;

        public Iterable<MonthPlanStateEvent> getMonthPlanEvents()
        {
            if (!getStateEventReadOnly())
            {
                return this.monthPlanEvents.values();
            }
            else
            {
                if (readOnlyMonthPlanEvents != null) { return readOnlyMonthPlanEvents; }
                MonthPlanStateEventDao eventDao = getMonthPlanStateEventDao();
                List<MonthPlanStateEvent> eL = new ArrayList<MonthPlanStateEvent>();
                for (MonthPlanStateEvent e : eventDao.findByYearPlanStateEventId(this.getStateEventId()))
                {
                    e.setStateEventReadOnly(true);
                    eL.add((MonthPlanStateEvent)e);
                }
                return (readOnlyMonthPlanEvents = eL);
            }
        }

        public void setMonthPlanEvents(Iterable<MonthPlanStateEvent> es)
        {
            if (es != null)
            {
                for (MonthPlanStateEvent e : es)
                {
                    addMonthPlanEvent(e);
                }
            }
            else { this.monthPlanEvents.clear(); }
        }
        
        public void addMonthPlanEvent(MonthPlanStateEvent e)
        {
            throwOnInconsistentEventIds(e);
            this.monthPlanEvents.put(e.getStateEventId(), e);
        }

        public void save()
        {
            for (MonthPlanStateEvent e : this.getMonthPlanEvents()) {
                getMonthPlanStateEventDao().save(e);
            }
        }
    }


    public static abstract class AbstractYearPlanStateRemoved extends AbstractYearPlanStateEvent implements YearPlanStateRemoved, Saveable
    {
        public AbstractYearPlanStateRemoved() {
        }

        public AbstractYearPlanStateRemoved(YearPlanStateEventId stateEventId) {
            super(stateEventId);
        }

        public String getStateEventType() {
            return StateEventType.REMOVED;
        }

		
        private Map<MonthPlanStateEventId, MonthPlanStateEvent.MonthPlanStateRemoved> monthPlanEvents = new HashMap<MonthPlanStateEventId, MonthPlanStateEvent.MonthPlanStateRemoved>();
        
        private Iterable<MonthPlanStateEvent.MonthPlanStateRemoved> readOnlyMonthPlanEvents;

        public Iterable<MonthPlanStateEvent.MonthPlanStateRemoved> getMonthPlanEvents()
        {
            if (!getStateEventReadOnly())
            {
                return this.monthPlanEvents.values();
            }
            else
            {
                if (readOnlyMonthPlanEvents != null) { return readOnlyMonthPlanEvents; }
                MonthPlanStateEventDao eventDao = getMonthPlanStateEventDao();
                List<MonthPlanStateEvent.MonthPlanStateRemoved> eL = new ArrayList<MonthPlanStateEvent.MonthPlanStateRemoved>();
                for (MonthPlanStateEvent e : eventDao.findByYearPlanStateEventId(this.getStateEventId()))
                {
                    e.setStateEventReadOnly(true);
                    eL.add((MonthPlanStateEvent.MonthPlanStateRemoved)e);
                }
                return (readOnlyMonthPlanEvents = eL);
            }
        }

        public void setMonthPlanEvents(Iterable<MonthPlanStateEvent.MonthPlanStateRemoved> es)
        {
            if (es != null)
            {
                for (MonthPlanStateEvent.MonthPlanStateRemoved e : es)
                {
                    addMonthPlanEvent(e);
                }
            }
            else { this.monthPlanEvents.clear(); }
        }
        
        public void addMonthPlanEvent(MonthPlanStateEvent.MonthPlanStateRemoved e)
        {
            throwOnInconsistentEventIds(e);
            this.monthPlanEvents.put(e.getStateEventId(), e);
        }

        public void save()
        {
            for (MonthPlanStateEvent.MonthPlanStateRemoved e : this.getMonthPlanEvents()) {
                getMonthPlanStateEventDao().save(e);
            }
        }
    }
        public static class SimpleYearPlanStateCreated extends AbstractYearPlanStateCreated
        {
			public SimpleYearPlanStateCreated() {
			}

			public SimpleYearPlanStateCreated(YearPlanStateEventId stateEventId) {
				super(stateEventId);
			}
        }

        public static class SimpleYearPlanStateMergePatched extends AbstractYearPlanStateMergePatched
        {
			public SimpleYearPlanStateMergePatched() {
			}

			public SimpleYearPlanStateMergePatched(YearPlanStateEventId stateEventId) {
				super(stateEventId);
			}
        }

        public static class SimpleYearPlanStateRemoved extends AbstractYearPlanStateRemoved
        {
			public SimpleYearPlanStateRemoved() {
			}

			public SimpleYearPlanStateRemoved(YearPlanStateEventId stateEventId) {
				super(stateEventId);
			}
        }

}

