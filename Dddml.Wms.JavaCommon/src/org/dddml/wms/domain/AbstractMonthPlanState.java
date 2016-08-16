package org.dddml.wms.domain;

import java.util.Set;
import java.util.Date;
import org.dddml.wms.specialization.*;
import org.dddml.wms.domain.MonthPlanStateEvent.*;

public abstract class AbstractMonthPlanState implements MonthPlanState, Saveable
{

    private MonthPlanId monthPlanId = new MonthPlanId();

    public MonthPlanId getMonthPlanId() {
        return this.monthPlanId;
    }

    public void setMonthPlanId(MonthPlanId monthPlanId) {
        this.monthPlanId = monthPlanId;
    }

    public PersonalName getPersonalName() {
        return this.getMonthPlanId().getPersonalName();
    }
        
    public void setPersonalName(PersonalName personalName) {
        this.getMonthPlanId().setPersonalName(personalName);
    }

    public Integer getYear() {
        return this.getMonthPlanId().getYear();
    }
        
    public void setYear(Integer year) {
        this.getMonthPlanId().setYear(year);
    }

    public Integer getMonth() {
        return this.getMonthPlanId().getMonth();
    }
        
    public void setMonth(Integer month) {
        this.getMonthPlanId().setMonth(month);
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

    private Long version;

    public Long getVersion()
    {
        return this.version;
    }

    public void setVersion(Long version)
    {
        this.version = version;
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

    private String updatedBy;

    public String getUpdatedBy()
    {
        return this.updatedBy;
    }

    public void setUpdatedBy(String updatedBy)
    {
        this.updatedBy = updatedBy;
    }

    private Date updatedAt;

    public Date getUpdatedAt()
    {
        return this.updatedAt;
    }

    public void setUpdatedAt(Date updatedAt)
    {
        this.updatedAt = updatedAt;
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

    private Boolean deleted;

    public Boolean getDeleted()
    {
        return this.deleted;
    }

    public void setDeleted(Boolean deleted)
    {
        this.deleted = deleted;
    }

    public boolean isStateUnsaved() 
    {
        return this.getVersion() == null;
    }

    private DayPlanStates dayPlans;

    public DayPlanStates getDayPlans()
    {
        return this.dayPlans;
    }

    public void setDayPlans(DayPlanStates dayPlans)
    {
        this.dayPlans = dayPlans;
    }


    public AbstractMonthPlanState()
    {
        dayPlans = new SimpleDayPlanStates(this);

        initializeProperties();
    }
    
    protected void initializeProperties() {
    }


    public void mutate(Event e) {
        if (e instanceof MonthPlanStateCreated) {
            when((MonthPlanStateCreated) e);
        } else if (e instanceof MonthPlanStateMergePatched) {
            when((MonthPlanStateMergePatched) e);
        } else if (e instanceof MonthPlanStateRemoved) {
            when((MonthPlanStateRemoved) e);
        }
    }

    public void when(MonthPlanStateCreated e)
    {
        throwOnWrongEvent(e);
        this.setDescription(e.getDescription());
        this.setActive(e.getActive());

        this.setDeleted(false);

        this.setCreatedBy(e.getCreatedBy());
        this.setCreatedAt(e.getCreatedAt());

        for (DayPlanStateEvent.DayPlanStateCreated innerEvent : e.getDayPlanEvents()) {
            DayPlanState innerState = this.getDayPlans().get(innerEvent.getStateEventId().getDay());
            innerState.mutate(innerEvent);
        }
    }

    public void when(MonthPlanStateMergePatched e)
    {
        throwOnWrongEvent(e);

        if (e.getDescription() == null)
        {
            if (e.getIsPropertyDescriptionRemoved() != null && e.getIsPropertyDescriptionRemoved())
            {
                this.setDescription(null);
            }
        }
        else
        {
            this.setDescription(e.getDescription());
        }
        if (e.getActive() == null)
        {
            if (e.getIsPropertyActiveRemoved() != null && e.getIsPropertyActiveRemoved())
            {
                this.setActive(null);
            }
        }
        else
        {
            this.setActive(e.getActive());
        }

        this.setUpdatedBy(e.getCreatedBy());
        this.setUpdatedAt(e.getCreatedAt());

        for (DayPlanStateEvent innerEvent : e.getDayPlanEvents()) {
            DayPlanState innerState = this.getDayPlans().get(innerEvent.getStateEventId().getDay());
            innerState.mutate(innerEvent);
            if (innerEvent instanceof DayPlanStateEvent.DayPlanStateRemoved)
            {
                //DayPlanStateEvent.DayPlanStateRemoved removed = (DayPlanStateEvent.DayPlanStateRemoved)innerEvent;
                this.getDayPlans().remove(innerState);
            }
        }
    }

    public void when(MonthPlanStateRemoved e)
    {
        throwOnWrongEvent(e);

        this.setDeleted(true);
        this.setUpdatedBy(e.getCreatedBy());
        this.setUpdatedAt(e.getCreatedAt());

        for (DayPlanState innerState : this.getDayPlans())
        {
            this.getDayPlans().remove(innerState);
        
            DayPlanStateEvent.DayPlanStateRemoved innerE = e.newDayPlanStateRemoved(innerState.getDay());
            innerE.setCreatedAt(e.getCreatedAt());
            innerE.setCreatedBy(e.getCreatedBy());
            innerState.when(innerE);
            //e.addDayPlanEvent(innerE);
        }
    }

    public void save()
    {
        dayPlans.save();

    }

    protected void throwOnWrongEvent(MonthPlanStateEvent stateEvent)
    {
        PersonalName stateEntityIdPersonalName = this.getMonthPlanId().getPersonalName();
        PersonalName eventEntityIdPersonalName = stateEvent.getStateEventId().getPersonalName();
        if (!stateEntityIdPersonalName.equals(eventEntityIdPersonalName))
        {
            throw DomainError.named("mutateWrongEntity", "Entity Id PersonalName %1$s in state but entity id PersonalName %2$s in event", stateEntityIdPersonalName, eventEntityIdPersonalName);
        }

        Integer stateEntityIdYear = this.getMonthPlanId().getYear();
        Integer eventEntityIdYear = stateEvent.getStateEventId().getYear();
        if (!stateEntityIdYear.equals(eventEntityIdYear))
        {
            throw DomainError.named("mutateWrongEntity", "Entity Id Year %1$s in state but entity id Year %2$s in event", stateEntityIdYear, eventEntityIdYear);
        }

        Integer stateEntityIdMonth = this.getMonthPlanId().getMonth();
        Integer eventEntityIdMonth = stateEvent.getStateEventId().getMonth();
        if (!stateEntityIdMonth.equals(eventEntityIdMonth))
        {
            throw DomainError.named("mutateWrongEntity", "Entity Id Month %1$s in state but entity id Month %2$s in event", stateEntityIdMonth, eventEntityIdMonth);
        }

        Long stateVersion = this.getVersion();
        Long eventVersion = stateEvent.getVersion();
        if (eventVersion == null) {
            eventVersion = stateVersion == null ? MonthPlanState.VERSION_NULL : stateVersion;
            stateEvent.setVersion(eventVersion);
        }
        if (!(stateVersion == null && eventVersion.equals(MonthPlanState.VERSION_NULL)) && !eventVersion.equals(stateVersion))
        {
            throw DomainError.named("concurrencyConflict", "Conflict between state version (%1$s) and event version (%2$s)", stateVersion, eventVersion);
        }

    }

    public static class SimpleMonthPlanState extends AbstractMonthPlanState
    {
    }

    static class SimpleDayPlanStates extends AbstractDayPlanStates
    {
        public SimpleDayPlanStates(MonthPlanState outerState)
        {
            super(outerState);
        }
    }


}

