package org.dddml.wms.domain;

import java.util.Set;
import java.util.Date;
import org.dddml.wms.specialization.*;
import org.dddml.wms.domain.PersonStateEvent.*;

public abstract class AbstractPersonState implements PersonState, Saveable
{

    private PersonalName personalName;

    public PersonalName getPersonalName()
    {
        return this.personalName;
    }

    public void setPersonalName(PersonalName personalName)
    {
        this.personalName = personalName;
    }

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

    private YearPlanStates yearPlans;

    public YearPlanStates getYearPlans()
    {
        return this.yearPlans;
    }

    public void setYearPlans(YearPlanStates yearPlans)
    {
        this.yearPlans = yearPlans;
    }


    public AbstractPersonState()
    {
        yearPlans = new SimpleYearPlanStates(this);

        initializeProperties();
    }
    
    protected void initializeProperties() {
    }


    public void mutate(Event e) {
        if (e instanceof PersonStateCreated) {
            when((PersonStateCreated) e);
        } else if (e instanceof PersonStateMergePatched) {
            when((PersonStateMergePatched) e);
        } else if (e instanceof PersonStateDeleted) {
            when((PersonStateDeleted) e);
        }
    }

    public void when(PersonStateCreated e)
    {
        throwOnWrongEvent(e);
        this.setBirthDate(e.getBirthDate());
        this.setLoves(e.getLoves());
        this.setActive(e.getActive());

        this.setDeleted(false);

        this.setCreatedBy(e.getCreatedBy());
        this.setCreatedAt(e.getCreatedAt());

        for (YearPlanStateEvent.YearPlanStateCreated innerEvent : e.getYearPlanEvents()) {
            YearPlanState innerState = this.getYearPlans().get(innerEvent.getStateEventId().getYear());
            innerState.mutate(innerEvent);
        }
    }

    public void when(PersonStateMergePatched e)
    {
        throwOnWrongEvent(e);

        if (e.getBirthDate() == null)
        {
            if (e.getIsPropertyBirthDateRemoved() != null && e.getIsPropertyBirthDateRemoved())
            {
                this.setBirthDate(null);
            }
        }
        else
        {
            this.setBirthDate(e.getBirthDate());
        }
        if (e.getLoves() == null)
        {
            if (e.getIsPropertyLovesRemoved() != null && e.getIsPropertyLovesRemoved())
            {
                this.setLoves(null);
            }
        }
        else
        {
            this.setLoves(e.getLoves());
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

        for (YearPlanStateEvent innerEvent : e.getYearPlanEvents()) {
            YearPlanState innerState = this.getYearPlans().get(innerEvent.getStateEventId().getYear());
            innerState.mutate(innerEvent);
            if (innerEvent instanceof YearPlanStateEvent.YearPlanStateRemoved)
            {
                //YearPlanStateEvent.YearPlanStateRemoved removed = (YearPlanStateEvent.YearPlanStateRemoved)innerEvent;
                this.getYearPlans().remove(innerState);
            }
        }
    }

    public void when(PersonStateDeleted e)
    {
        throwOnWrongEvent(e);

        this.setDeleted(true);
        this.setUpdatedBy(e.getCreatedBy());
        this.setUpdatedAt(e.getCreatedAt());

        for (YearPlanState innerState : this.getYearPlans())
        {
            this.getYearPlans().remove(innerState);
        
            YearPlanStateEvent.YearPlanStateRemoved innerE = e.newYearPlanStateRemoved(innerState.getYear());
            innerE.setCreatedAt(e.getCreatedAt());
            innerE.setCreatedBy(e.getCreatedBy());
            innerState.when(innerE);
            //e.addYearPlanEvent(innerE);
        }
    }

    public void save()
    {
        yearPlans.save();

    }

    protected void throwOnWrongEvent(PersonStateEvent stateEvent)
    {
        PersonalName stateEntityId = this.getPersonalName(); // Aggregate Id
        PersonalName eventEntityId = stateEvent.getStateEventId().getPersonalName(); // EntityBase.Aggregate.GetStateEventIdPropertyIdName();
        if (!stateEntityId.equals(eventEntityId))
        {
            throw DomainError.named("mutateWrongEntity", "Entity Id %1$s in state but entity id %2$s in event", stateEntityId, eventEntityId);
        }

        Long stateVersion = this.getVersion();
        Long eventVersion = stateEvent.getStateEventId().getVersion();// Aggregate Version
        if (eventVersion == null) {
            throw new NullPointerException("stateEvent.getStateEventId().getVersion() == null");
        }
        if (!(stateVersion == null && eventVersion.equals(PersonState.VERSION_NULL)) && !eventVersion.equals(stateVersion))
        {
            throw DomainError.named("concurrencyConflict", "Conflict between state version (%1$s) and event version (%2$s)", stateVersion, eventVersion);
        }

    }

    public static class SimplePersonState extends AbstractPersonState
    {
    }

    static class SimpleYearPlanStates extends AbstractYearPlanStates
    {
        public SimpleYearPlanStates(PersonState outerState)
        {
            super(outerState);
        }
    }


}

