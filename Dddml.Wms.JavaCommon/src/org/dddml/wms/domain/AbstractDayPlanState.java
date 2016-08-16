package org.dddml.wms.domain;

import java.util.Set;
import java.util.Date;
import org.dddml.wms.specialization.*;
import org.dddml.wms.domain.DayPlanStateEvent.*;

public abstract class AbstractDayPlanState implements DayPlanState
{

    private DayPlanId dayPlanId = new DayPlanId();

    public DayPlanId getDayPlanId() {
        return this.dayPlanId;
    }

    public void setDayPlanId(DayPlanId dayPlanId) {
        this.dayPlanId = dayPlanId;
    }

    public PersonalName getPersonalName() {
        return this.getDayPlanId().getPersonalName();
    }
        
    public void setPersonalName(PersonalName personalName) {
        this.getDayPlanId().setPersonalName(personalName);
    }

    public Integer getYear() {
        return this.getDayPlanId().getYear();
    }
        
    public void setYear(Integer year) {
        this.getDayPlanId().setYear(year);
    }

    public Integer getMonth() {
        return this.getDayPlanId().getMonth();
    }
        
    public void setMonth(Integer month) {
        this.getDayPlanId().setMonth(month);
    }

    public Integer getDay() {
        return this.getDayPlanId().getDay();
    }
        
    public void setDay(Integer day) {
        this.getDayPlanId().setDay(day);
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


    public AbstractDayPlanState()
    {
        initializeProperties();
    }
    
    protected void initializeProperties() {
    }


    public void mutate(Event e) {
        if (e instanceof DayPlanStateCreated) {
            when((DayPlanStateCreated) e);
        } else if (e instanceof DayPlanStateMergePatched) {
            when((DayPlanStateMergePatched) e);
        } else if (e instanceof DayPlanStateRemoved) {
            when((DayPlanStateRemoved) e);
        }
    }

    public void when(DayPlanStateCreated e)
    {
        throwOnWrongEvent(e);
        this.setDescription(e.getDescription());
        this.setActive(e.getActive());

        this.setDeleted(false);

        this.setCreatedBy(e.getCreatedBy());
        this.setCreatedAt(e.getCreatedAt());

    }

    public void when(DayPlanStateMergePatched e)
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

    }

    public void when(DayPlanStateRemoved e)
    {
        throwOnWrongEvent(e);

        this.setDeleted(true);
        this.setUpdatedBy(e.getCreatedBy());
        this.setUpdatedAt(e.getCreatedAt());

    }

    public void save()
    {
    }

    protected void throwOnWrongEvent(DayPlanStateEvent stateEvent)
    {
        PersonalName stateEntityIdPersonalName = this.getDayPlanId().getPersonalName();
        PersonalName eventEntityIdPersonalName = stateEvent.getStateEventId().getPersonalName();
        if (!stateEntityIdPersonalName.equals(eventEntityIdPersonalName))
        {
            throw DomainError.named("mutateWrongEntity", "Entity Id PersonalName %1$s in state but entity id PersonalName %2$s in event", stateEntityIdPersonalName, eventEntityIdPersonalName);
        }

        Integer stateEntityIdYear = this.getDayPlanId().getYear();
        Integer eventEntityIdYear = stateEvent.getStateEventId().getYear();
        if (!stateEntityIdYear.equals(eventEntityIdYear))
        {
            throw DomainError.named("mutateWrongEntity", "Entity Id Year %1$s in state but entity id Year %2$s in event", stateEntityIdYear, eventEntityIdYear);
        }

        Integer stateEntityIdMonth = this.getDayPlanId().getMonth();
        Integer eventEntityIdMonth = stateEvent.getStateEventId().getMonth();
        if (!stateEntityIdMonth.equals(eventEntityIdMonth))
        {
            throw DomainError.named("mutateWrongEntity", "Entity Id Month %1$s in state but entity id Month %2$s in event", stateEntityIdMonth, eventEntityIdMonth);
        }

        Integer stateEntityIdDay = this.getDayPlanId().getDay();
        Integer eventEntityIdDay = stateEvent.getStateEventId().getDay();
        if (!stateEntityIdDay.equals(eventEntityIdDay))
        {
            throw DomainError.named("mutateWrongEntity", "Entity Id Day %1$s in state but entity id Day %2$s in event", stateEntityIdDay, eventEntityIdDay);
        }

        Long stateVersion = this.getVersion();
        Long eventVersion = stateEvent.getVersion();
        if (eventVersion == null) {
            eventVersion = stateVersion == null ? DayPlanState.VERSION_NULL : stateVersion;
            stateEvent.setVersion(eventVersion);
        }
        if (!(stateVersion == null && eventVersion.equals(DayPlanState.VERSION_NULL)) && !eventVersion.equals(stateVersion))
        {
            throw DomainError.named("concurrencyConflict", "Conflict between state version (%1$s) and event version (%2$s)", stateVersion, eventVersion);
        }

    }

    public static class SimpleDayPlanState extends AbstractDayPlanState
    {
    }


}

