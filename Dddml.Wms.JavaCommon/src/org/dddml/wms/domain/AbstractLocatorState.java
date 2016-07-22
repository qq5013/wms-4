package org.dddml.wms.domain;

import java.util.Set;
import java.util.Date;
import org.dddml.wms.specialization.Event;
import org.dddml.wms.specialization.DomainError;
import org.dddml.wms.domain.LocatorStateEvent.*;

public abstract class AbstractLocatorState implements LocatorState
{

    private String locatorId;

    public String getLocatorId()
    {
        return this.locatorId;
    }

    public void setLocatorId(String locatorId)
    {
        this.locatorId = locatorId;
    }

    private String warehouseId;

    public String getWarehouseId()
    {
        return this.warehouseId;
    }

    public void setWarehouseId(String warehouseId)
    {
        this.warehouseId = warehouseId;
    }

    private String parentLocatorId;

    public String getParentLocatorId()
    {
        return this.parentLocatorId;
    }

    public void setParentLocatorId(String parentLocatorId)
    {
        this.parentLocatorId = parentLocatorId;
    }

    private String locatorType;

    public String getLocatorType()
    {
        return this.locatorType;
    }

    public void setLocatorType(String locatorType)
    {
        this.locatorType = locatorType;
    }

    private String priorityNumber;

    public String getPriorityNumber()
    {
        return this.priorityNumber;
    }

    public void setPriorityNumber(String priorityNumber)
    {
        this.priorityNumber = priorityNumber;
    }

    private Boolean isDefault;

    public Boolean getIsDefault()
    {
        return this.isDefault;
    }

    public void setIsDefault(Boolean isDefault)
    {
        this.isDefault = isDefault;
    }

    private String x;

    public String getX()
    {
        return this.x;
    }

    public void setX(String x)
    {
        this.x = x;
    }

    private String y;

    public String getY()
    {
        return this.y;
    }

    public void setY(String y)
    {
        this.y = y;
    }

    private String z;

    public String getZ()
    {
        return this.z;
    }

    public void setZ(String z)
    {
        this.z = z;
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
        return VERSION_ZERO.equals(this.getVersion());
    }


    public AbstractLocatorState()
    {
        initializeProperties();
    }
    
    protected void initializeProperties() {
    }


    public void mutate(Event e) {
        if (e instanceof LocatorStateCreated) {
            when((LocatorStateCreated) e);
        } else if (e instanceof LocatorStateMergePatched) {
            when((LocatorStateMergePatched) e);
        } else if (e instanceof LocatorStateDeleted) {
            when((LocatorStateDeleted) e);
        }
    }

    public void when(LocatorStateCreated e)
    {
        throwOnWrongEvent(e);
        this.setWarehouseId(e.getWarehouseId());
        this.setParentLocatorId(e.getParentLocatorId());
        this.setLocatorType(e.getLocatorType());
        this.setPriorityNumber(e.getPriorityNumber());
        this.setIsDefault(e.getIsDefault());
        this.setX(e.getX());
        this.setY(e.getY());
        this.setZ(e.getZ());
        this.setActive(e.getActive());

        this.setDeleted(false);

        this.setCreatedBy(e.getCreatedBy());
        this.setCreatedAt(e.getCreatedAt());

    }

    public void when(LocatorStateMergePatched e)
    {
        throwOnWrongEvent(e);

        if (e.getWarehouseId() == null)
        {
            if (e.getIsPropertyWarehouseIdRemoved() != null && e.getIsPropertyWarehouseIdRemoved())
            {
                this.setWarehouseId(null);
            }
        }
        else
        {
            this.setWarehouseId(e.getWarehouseId());
        }
        if (e.getParentLocatorId() == null)
        {
            if (e.getIsPropertyParentLocatorIdRemoved() != null && e.getIsPropertyParentLocatorIdRemoved())
            {
                this.setParentLocatorId(null);
            }
        }
        else
        {
            this.setParentLocatorId(e.getParentLocatorId());
        }
        if (e.getLocatorType() == null)
        {
            if (e.getIsPropertyLocatorTypeRemoved() != null && e.getIsPropertyLocatorTypeRemoved())
            {
                this.setLocatorType(null);
            }
        }
        else
        {
            this.setLocatorType(e.getLocatorType());
        }
        if (e.getPriorityNumber() == null)
        {
            if (e.getIsPropertyPriorityNumberRemoved() != null && e.getIsPropertyPriorityNumberRemoved())
            {
                this.setPriorityNumber(null);
            }
        }
        else
        {
            this.setPriorityNumber(e.getPriorityNumber());
        }
        if (e.getIsDefault() == null)
        {
            if (e.getIsPropertyIsDefaultRemoved() != null && e.getIsPropertyIsDefaultRemoved())
            {
                this.setIsDefault(null);
            }
        }
        else
        {
            this.setIsDefault(e.getIsDefault());
        }
        if (e.getX() == null)
        {
            if (e.getIsPropertyXRemoved() != null && e.getIsPropertyXRemoved())
            {
                this.setX(null);
            }
        }
        else
        {
            this.setX(e.getX());
        }
        if (e.getY() == null)
        {
            if (e.getIsPropertyYRemoved() != null && e.getIsPropertyYRemoved())
            {
                this.setY(null);
            }
        }
        else
        {
            this.setY(e.getY());
        }
        if (e.getZ() == null)
        {
            if (e.getIsPropertyZRemoved() != null && e.getIsPropertyZRemoved())
            {
                this.setZ(null);
            }
        }
        else
        {
            this.setZ(e.getZ());
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

    public void when(LocatorStateDeleted e)
    {
        throwOnWrongEvent(e);

        this.setDeleted(true);
        this.setUpdatedBy(e.getCreatedBy());
        this.setUpdatedAt(e.getCreatedAt());

    }

    protected void throwOnWrongEvent(LocatorStateEvent stateEvent)
    {
        String stateEntityId = this.getLocatorId(); // Aggregate Id
        String eventEntityId = stateEvent.getStateEventId().getLocatorId(); // EntityBase.Aggregate.GetStateEventIdPropertyIdName();
        if (!stateEntityId.equals(eventEntityId))
        {
            throw DomainError.named("mutateWrongEntity", "Entity Id %1$s in state but entity id %2$s in event", stateEntityId, eventEntityId);
        }

        Long stateVersion = this.getVersion();
        Long eventVersion = stateEvent.getStateEventId().getVersion();
        if (!stateVersion.equals(eventVersion))
        {
            throw DomainError.named("concurrencyConflict", "Conflict between state version %1$s and event version %2$s", stateVersion, eventVersion);
        }

    }

    public static class SimpleLocatorState extends AbstractLocatorState
    {
    }


}

