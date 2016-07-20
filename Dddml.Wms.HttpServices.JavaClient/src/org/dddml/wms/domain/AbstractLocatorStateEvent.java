package org.dddml.wms.domain;

import java.util.*;
import java.util.Date;
import org.dddml.wms.specialization.*;

public abstract class AbstractLocatorStateEvent implements LocatorStateEvent
{
    private LocatorStateEventId stateEventId;

    public LocatorStateEventId getStateEventId() {
        return this.stateEventId;
    }

    public void setStateEventId(LocatorStateEventId stateEventId) {
        this.stateEventId = stateEventId;
    }
    
    private boolean stateEventReadOnly;

    public boolean getStateEventReadOnly() { return this.stateEventReadOnly; }

    public void setStateEventReadOnly(boolean readOnly) { this.stateEventReadOnly = readOnly; }

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

    protected AbstractLocatorStateEvent() {
    }

    protected AbstractLocatorStateEvent(LocatorStateEventId stateEventId) {
        this.stateEventId = stateEventId;
    }


    public abstract String getStateEventType();


    public static abstract class AbstractLocatorStateCreated extends AbstractLocatorStateEvent implements LocatorStateCreated
    {
        public AbstractLocatorStateCreated() {
        }

        public AbstractLocatorStateCreated(LocatorStateEventId stateEventId) {
            super(stateEventId);
        }

        public String getStateEventType() {
            return StateEventType.CREATED;
        }

    }


    public static abstract class AbstractLocatorStateMergePatched extends AbstractLocatorStateEvent implements LocatorStateMergePatched
    {
        public AbstractLocatorStateMergePatched() {
        }

        public AbstractLocatorStateMergePatched(LocatorStateEventId stateEventId) {
            super(stateEventId);
        }

        public String getStateEventType() {
            return StateEventType.MERGE_PATCHED;
        }

        private Boolean isPropertyWarehouseIdRemoved;

        public Boolean getIsPropertyWarehouseIdRemoved() {
            return this.isPropertyWarehouseIdRemoved;
        }

        public void setIsPropertyWarehouseIdRemoved(Boolean removed) {
            this.isPropertyWarehouseIdRemoved = removed;
        }

        private Boolean isPropertyParentLocatorIdRemoved;

        public Boolean getIsPropertyParentLocatorIdRemoved() {
            return this.isPropertyParentLocatorIdRemoved;
        }

        public void setIsPropertyParentLocatorIdRemoved(Boolean removed) {
            this.isPropertyParentLocatorIdRemoved = removed;
        }

        private Boolean isPropertyLocatorTypeRemoved;

        public Boolean getIsPropertyLocatorTypeRemoved() {
            return this.isPropertyLocatorTypeRemoved;
        }

        public void setIsPropertyLocatorTypeRemoved(Boolean removed) {
            this.isPropertyLocatorTypeRemoved = removed;
        }

        private Boolean isPropertyPriorityNumberRemoved;

        public Boolean getIsPropertyPriorityNumberRemoved() {
            return this.isPropertyPriorityNumberRemoved;
        }

        public void setIsPropertyPriorityNumberRemoved(Boolean removed) {
            this.isPropertyPriorityNumberRemoved = removed;
        }

        private Boolean isPropertyIsDefaultRemoved;

        public Boolean getIsPropertyIsDefaultRemoved() {
            return this.isPropertyIsDefaultRemoved;
        }

        public void setIsPropertyIsDefaultRemoved(Boolean removed) {
            this.isPropertyIsDefaultRemoved = removed;
        }

        private Boolean isPropertyXRemoved;

        public Boolean getIsPropertyXRemoved() {
            return this.isPropertyXRemoved;
        }

        public void setIsPropertyXRemoved(Boolean removed) {
            this.isPropertyXRemoved = removed;
        }

        private Boolean isPropertyYRemoved;

        public Boolean getIsPropertyYRemoved() {
            return this.isPropertyYRemoved;
        }

        public void setIsPropertyYRemoved(Boolean removed) {
            this.isPropertyYRemoved = removed;
        }

        private Boolean isPropertyZRemoved;

        public Boolean getIsPropertyZRemoved() {
            return this.isPropertyZRemoved;
        }

        public void setIsPropertyZRemoved(Boolean removed) {
            this.isPropertyZRemoved = removed;
        }

        private Boolean isPropertyActiveRemoved;

        public Boolean getIsPropertyActiveRemoved() {
            return this.isPropertyActiveRemoved;
        }

        public void setIsPropertyActiveRemoved(Boolean removed) {
            this.isPropertyActiveRemoved = removed;
        }


    }


    public static abstract class AbstractLocatorStateDeleted extends AbstractLocatorStateEvent implements LocatorStateDeleted
    {
        public AbstractLocatorStateDeleted() {
        }

        public AbstractLocatorStateDeleted(LocatorStateEventId stateEventId) {
            super(stateEventId);
        }

        public String getStateEventType() {
            return StateEventType.DELETED;
        }

    }
}

