package org.dddml.wms.domain;

import java.util.Set;
import java.util.Date;
import org.dddml.wms.specialization.*;
import org.dddml.wms.domain.YearPlanStateEvent.*;

public abstract class AbstractYearPlanState implements YearPlanState, Saveable
{

    private YearPlanId yearPlanId = new YearPlanId();

    public YearPlanId getYearPlanId() {
        return this.yearPlanId;
    }

    public void setYearPlanId(YearPlanId yearPlanId) {
        this.yearPlanId = yearPlanId;
    }

    public PersonalName getPersonalName() {
        return this.getYearPlanId().getPersonalName();
    }
        
    public void setPersonalName(PersonalName personalName) {
        this.getYearPlanId().setPersonalName(personalName);
    }

    public Integer getYear() {
        return this.getYearPlanId().getYear();
    }
        
    public void setYear(Integer year) {
        this.getYearPlanId().setYear(year);
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

    private MonthPlanStates monthPlans;

    public MonthPlanStates getMonthPlans()
    {
        return this.monthPlans;
    }

    public void setMonthPlans(MonthPlanStates monthPlans)
    {
        this.monthPlans = monthPlans;
    }


    public AbstractYearPlanState()
    {
        monthPlans = new SimpleMonthPlanStates(this);

        initializeProperties();
    }
    
    protected void initializeProperties() {
    }


    public void mutate(Event e) {
        if (e instanceof YearPlanStateCreated) {
            when((YearPlanStateCreated) e);
        } else if (e instanceof YearPlanStateMergePatched) {
            when((YearPlanStateMergePatched) e);
        } else if (e instanceof YearPlanStateRemoved) {
            when((YearPlanStateRemoved) e);
        }
    }

    public void when(YearPlanStateCreated e)
    {
        throwOnWrongEvent(e);
        this.setDescription(e.getDescription());
        this.setActive(e.getActive());

        this.setDeleted(false);

        this.setCreatedBy(e.getCreatedBy());
        this.setCreatedAt(e.getCreatedAt());

        for (MonthPlanStateEvent.MonthPlanStateCreated innerEvent : e.getMonthPlanEvents()) {
            MonthPlanState innerState = this.getMonthPlans().get(innerEvent.getStateEventId().getMonth());
            innerState.mutate(innerEvent);
        }
    }

    public void when(YearPlanStateMergePatched e)
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

        for (MonthPlanStateEvent innerEvent : e.getMonthPlanEvents()) {
            MonthPlanState innerState = this.getMonthPlans().get(innerEvent.getStateEventId().getMonth());
            innerState.mutate(innerEvent);
            if (innerEvent instanceof MonthPlanStateEvent.MonthPlanStateRemoved)
            {
                //MonthPlanStateEvent.MonthPlanStateRemoved removed = (MonthPlanStateEvent.MonthPlanStateRemoved)innerEvent;
                this.getMonthPlans().remove(innerState);
            }
        }
    }

    public void when(YearPlanStateRemoved e)
    {
        throwOnWrongEvent(e);

        this.setDeleted(true);
        this.setUpdatedBy(e.getCreatedBy());
        this.setUpdatedAt(e.getCreatedAt());

        for (MonthPlanState innerState : this.getMonthPlans())
        {
            this.getMonthPlans().remove(innerState);
        
            MonthPlanStateEvent.MonthPlanStateRemoved innerE = e.newMonthPlanStateRemoved(innerState.getMonth());
            innerE.setCreatedAt(e.getCreatedAt());
            innerE.setCreatedBy(e.getCreatedBy());
            innerState.when(innerE);
            //e.addMonthPlanEvent(innerE);
        }
    }

    public void save()
    {
        monthPlans.save();

    }

    protected void throwOnWrongEvent(YearPlanStateEvent stateEvent)
    {
        PersonalName stateEntityIdPersonalName = this.getYearPlanId().getPersonalName();
        PersonalName eventEntityIdPersonalName = stateEvent.getStateEventId().getPersonalName();
        if (!stateEntityIdPersonalName.equals(eventEntityIdPersonalName))
        {
            throw DomainError.named("mutateWrongEntity", "Entity Id PersonalName %1$s in state but entity id PersonalName %2$s in event", stateEntityIdPersonalName, eventEntityIdPersonalName);
        }

        Integer stateEntityIdYear = this.getYearPlanId().getYear();
        Integer eventEntityIdYear = stateEvent.getStateEventId().getYear();
        if (!stateEntityIdYear.equals(eventEntityIdYear))
        {
            throw DomainError.named("mutateWrongEntity", "Entity Id Year %1$s in state but entity id Year %2$s in event", stateEntityIdYear, eventEntityIdYear);
        }

        Long stateVersion = this.getVersion();
        Long eventVersion = stateEvent.getVersion();
        if (eventVersion == null) {
            eventVersion = stateVersion == null ? YearPlanState.VERSION_NULL : stateVersion;
            stateEvent.setVersion(eventVersion);
        }
        if (!(stateVersion == null && eventVersion.equals(YearPlanState.VERSION_NULL)) && !eventVersion.equals(stateVersion))
        {
            throw DomainError.named("concurrencyConflict", "Conflict between state version (%1$s) and event version (%2$s)", stateVersion, eventVersion);
        }

    }

    public static class SimpleYearPlanState extends AbstractYearPlanState
    {
    }

    static class SimpleMonthPlanStates extends AbstractMonthPlanStates
    {
        public SimpleMonthPlanStates(YearPlanState outerState)
        {
            super(outerState);
        }
    }


}

