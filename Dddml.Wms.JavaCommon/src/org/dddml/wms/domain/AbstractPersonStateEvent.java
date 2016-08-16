package org.dddml.wms.domain;

import java.util.*;
import java.util.Date;
import org.dddml.wms.specialization.*;

public abstract class AbstractPersonStateEvent extends AbstractStateEvent implements PersonStateEvent 
{
    private PersonStateEventId stateEventId;

    public PersonStateEventId getStateEventId() {
        return this.stateEventId;
    }

    public void setStateEventId(PersonStateEventId stateEventId) {
        this.stateEventId = stateEventId;
    }
    
    private boolean stateEventReadOnly;

    public boolean getStateEventReadOnly() { return this.stateEventReadOnly; }

    public void setStateEventReadOnly(boolean readOnly) { this.stateEventReadOnly = readOnly; }

    private Date birthDate;

    public Date getBirthDate()
    {
        return this.birthDate;
    }

    public void setBirthDate(Date birthDate)
    {
        this.birthDate = birthDate;
    }

    private PersonalName loves;

    public PersonalName getLoves()
    {
        return this.loves;
    }

    public void setLoves(PersonalName loves)
    {
        this.loves = loves;
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


    private String commandId;

    public String getCommandId() {
        return commandId;
    }

    public void setCommandId(String commandId) {
        this.commandId = commandId;
    }

    protected AbstractPersonStateEvent() {
    }

    protected AbstractPersonStateEvent(PersonStateEventId stateEventId) {
        this.stateEventId = stateEventId;
    }

    protected YearPlanStateEventDao getYearPlanStateEventDao() {
        return (YearPlanStateEventDao)ApplicationContext.current.get("YearPlanStateEventDao");
    }

    protected YearPlanStateEventId newYearPlanStateEventId(Integer year)
    {
        YearPlanStateEventId stateEventId = new YearPlanStateEventId(this.getStateEventId().getPersonalName(), 
            year, 
            this.getStateEventId().getVersion());
        return stateEventId;
    }

    protected void throwOnInconsistentEventIds(YearPlanStateEvent e)
    {
        throwOnInconsistentEventIds(this, e);
    }

    public static void throwOnInconsistentEventIds(PersonStateEvent oe, YearPlanStateEvent e)
    {
        if (!oe.getStateEventId().getPersonalName().equals(e.getStateEventId().getPersonalName()))
        { 
            throw DomainError.named("inconsistentEventIds", "Outer Id PersonalName %1$s but inner id PersonalName %2$s", 
                oe.getStateEventId().getPersonalName(), e.getStateEventId().getPersonalName());
        }
    }

    public YearPlanStateEvent.YearPlanStateCreated newYearPlanStateCreated(Integer year) {
        return new AbstractYearPlanStateEvent.SimpleYearPlanStateCreated(newYearPlanStateEventId(year));
    }

    public YearPlanStateEvent.YearPlanStateMergePatched newYearPlanStateMergePatched(Integer year) {
        return new AbstractYearPlanStateEvent.SimpleYearPlanStateMergePatched(newYearPlanStateEventId(year));
    }

    public YearPlanStateEvent.YearPlanStateRemoved newYearPlanStateRemoved(Integer year) {
        return new AbstractYearPlanStateEvent.SimpleYearPlanStateRemoved(newYearPlanStateEventId(year));
    }


    public abstract String getStateEventType();


    public static abstract class AbstractPersonStateCreated extends AbstractPersonStateEvent implements PersonStateCreated, Saveable
    {
        public AbstractPersonStateCreated() {
        }

        public AbstractPersonStateCreated(PersonStateEventId stateEventId) {
            super(stateEventId);
        }

        public String getStateEventType() {
            return StateEventType.CREATED;
        }

        private Map<YearPlanStateEventId, YearPlanStateEvent.YearPlanStateCreated> yearPlanEvents = new HashMap<YearPlanStateEventId, YearPlanStateEvent.YearPlanStateCreated>();
        
        private Iterable<YearPlanStateEvent.YearPlanStateCreated> readOnlyYearPlanEvents;

        public Iterable<YearPlanStateEvent.YearPlanStateCreated> getYearPlanEvents()
        {
            if (!getStateEventReadOnly())
            {
                return this.yearPlanEvents.values();
            }
            else
            {
                if (readOnlyYearPlanEvents != null) { return readOnlyYearPlanEvents; }
                YearPlanStateEventDao eventDao = getYearPlanStateEventDao();
                List<YearPlanStateEvent.YearPlanStateCreated> eL = new ArrayList<YearPlanStateEvent.YearPlanStateCreated>();
                for (YearPlanStateEvent e : eventDao.findByPersonStateEventId(this.getStateEventId()))
                {
                    e.setStateEventReadOnly(true);
                    eL.add((YearPlanStateEvent.YearPlanStateCreated)e);
                }
                return (readOnlyYearPlanEvents = eL);
            }
        }

        public void setYearPlanEvents(Iterable<YearPlanStateEvent.YearPlanStateCreated> es)
        {
            if (es != null)
            {
                for (YearPlanStateEvent.YearPlanStateCreated e : es)
                {
                    addYearPlanEvent(e);
                }
            }
            else { this.yearPlanEvents.clear(); }
        }
        
        public void addYearPlanEvent(YearPlanStateEvent.YearPlanStateCreated e)
        {
            throwOnInconsistentEventIds(e);
            this.yearPlanEvents.put(e.getStateEventId(), e);
        }

        public void save()
        {
            for (YearPlanStateEvent.YearPlanStateCreated e : this.getYearPlanEvents()) {
                getYearPlanStateEventDao().save(e);
            }
        }
    }


    public static abstract class AbstractPersonStateMergePatched extends AbstractPersonStateEvent implements PersonStateMergePatched, Saveable
    {
        public AbstractPersonStateMergePatched() {
        }

        public AbstractPersonStateMergePatched(PersonStateEventId stateEventId) {
            super(stateEventId);
        }

        public String getStateEventType() {
            return StateEventType.MERGE_PATCHED;
        }

        private Boolean isPropertyBirthDateRemoved;

        public Boolean getIsPropertyBirthDateRemoved() {
            return this.isPropertyBirthDateRemoved;
        }

        public void setIsPropertyBirthDateRemoved(Boolean removed) {
            this.isPropertyBirthDateRemoved = removed;
        }

        private Boolean isPropertyLovesRemoved;

        public Boolean getIsPropertyLovesRemoved() {
            return this.isPropertyLovesRemoved;
        }

        public void setIsPropertyLovesRemoved(Boolean removed) {
            this.isPropertyLovesRemoved = removed;
        }

        private Boolean isPropertyActiveRemoved;

        public Boolean getIsPropertyActiveRemoved() {
            return this.isPropertyActiveRemoved;
        }

        public void setIsPropertyActiveRemoved(Boolean removed) {
            this.isPropertyActiveRemoved = removed;
        }

        private Map<YearPlanStateEventId, YearPlanStateEvent> yearPlanEvents = new HashMap<YearPlanStateEventId, YearPlanStateEvent>();
        
        private Iterable<YearPlanStateEvent> readOnlyYearPlanEvents;

        public Iterable<YearPlanStateEvent> getYearPlanEvents()
        {
            if (!getStateEventReadOnly())
            {
                return this.yearPlanEvents.values();
            }
            else
            {
                if (readOnlyYearPlanEvents != null) { return readOnlyYearPlanEvents; }
                YearPlanStateEventDao eventDao = getYearPlanStateEventDao();
                List<YearPlanStateEvent> eL = new ArrayList<YearPlanStateEvent>();
                for (YearPlanStateEvent e : eventDao.findByPersonStateEventId(this.getStateEventId()))
                {
                    e.setStateEventReadOnly(true);
                    eL.add((YearPlanStateEvent)e);
                }
                return (readOnlyYearPlanEvents = eL);
            }
        }

        public void setYearPlanEvents(Iterable<YearPlanStateEvent> es)
        {
            if (es != null)
            {
                for (YearPlanStateEvent e : es)
                {
                    addYearPlanEvent(e);
                }
            }
            else { this.yearPlanEvents.clear(); }
        }
        
        public void addYearPlanEvent(YearPlanStateEvent e)
        {
            throwOnInconsistentEventIds(e);
            this.yearPlanEvents.put(e.getStateEventId(), e);
        }

        public void save()
        {
            for (YearPlanStateEvent e : this.getYearPlanEvents()) {
                getYearPlanStateEventDao().save(e);
            }
        }
    }


    public static abstract class AbstractPersonStateDeleted extends AbstractPersonStateEvent implements PersonStateDeleted, Saveable
    {
        public AbstractPersonStateDeleted() {
        }

        public AbstractPersonStateDeleted(PersonStateEventId stateEventId) {
            super(stateEventId);
        }

        public String getStateEventType() {
            return StateEventType.DELETED;
        }

		
        private Map<YearPlanStateEventId, YearPlanStateEvent.YearPlanStateRemoved> yearPlanEvents = new HashMap<YearPlanStateEventId, YearPlanStateEvent.YearPlanStateRemoved>();
        
        private Iterable<YearPlanStateEvent.YearPlanStateRemoved> readOnlyYearPlanEvents;

        public Iterable<YearPlanStateEvent.YearPlanStateRemoved> getYearPlanEvents()
        {
            if (!getStateEventReadOnly())
            {
                return this.yearPlanEvents.values();
            }
            else
            {
                if (readOnlyYearPlanEvents != null) { return readOnlyYearPlanEvents; }
                YearPlanStateEventDao eventDao = getYearPlanStateEventDao();
                List<YearPlanStateEvent.YearPlanStateRemoved> eL = new ArrayList<YearPlanStateEvent.YearPlanStateRemoved>();
                for (YearPlanStateEvent e : eventDao.findByPersonStateEventId(this.getStateEventId()))
                {
                    e.setStateEventReadOnly(true);
                    eL.add((YearPlanStateEvent.YearPlanStateRemoved)e);
                }
                return (readOnlyYearPlanEvents = eL);
            }
        }

        public void setYearPlanEvents(Iterable<YearPlanStateEvent.YearPlanStateRemoved> es)
        {
            if (es != null)
            {
                for (YearPlanStateEvent.YearPlanStateRemoved e : es)
                {
                    addYearPlanEvent(e);
                }
            }
            else { this.yearPlanEvents.clear(); }
        }
        
        public void addYearPlanEvent(YearPlanStateEvent.YearPlanStateRemoved e)
        {
            throwOnInconsistentEventIds(e);
            this.yearPlanEvents.put(e.getStateEventId(), e);
        }

        public void save()
        {
            for (YearPlanStateEvent.YearPlanStateRemoved e : this.getYearPlanEvents()) {
                getYearPlanStateEventDao().save(e);
            }
        }
    }
        public static class SimplePersonStateCreated extends AbstractPersonStateCreated
        {
			public SimplePersonStateCreated() {
			}

			public SimplePersonStateCreated(PersonStateEventId stateEventId) {
				super(stateEventId);
			}
        }

        public static class SimplePersonStateMergePatched extends AbstractPersonStateMergePatched
        {
			public SimplePersonStateMergePatched() {
			}

			public SimplePersonStateMergePatched(PersonStateEventId stateEventId) {
				super(stateEventId);
			}
        }

        public static class SimplePersonStateDeleted extends AbstractPersonStateDeleted
        {
			public SimplePersonStateDeleted() {
			}

			public SimplePersonStateDeleted(PersonStateEventId stateEventId) {
				super(stateEventId);
			}
        }

}

