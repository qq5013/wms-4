package org.dddml.wms.domain;

import java.util.Date;
import org.dddml.wms.domain.AbstractStateEventDto;

public class LocatorStateEventDto extends AbstractStateEventDto
{
    private String stateEventType;

    public String getStateEventType() {
        return this.stateEventType;
    }

    public void setStateEventType(String type)
    {
        this.stateEventType = type;
    }

    private LocatorStateEventIdDto stateEventId;

    public LocatorStateEventIdDto getStateEventId() {
        return this.stateEventId;
    }

    public void getStateEventId(LocatorStateEventIdDto stateEventId) {
        this.stateEventId = stateEventId;
    }

    private String warehouseId;

    public String getWarehouseId() {
        return this.warehouseId;
    }

    public void setWarehouseId(String warehouseId) {
        this.warehouseId = warehouseId;
    }

    private String parentLocatorId;

    public String getParentLocatorId() {
        return this.parentLocatorId;
    }

    public void setParentLocatorId(String parentLocatorId) {
        this.parentLocatorId = parentLocatorId;
    }

    private String locatorType;

    public String getLocatorType() {
        return this.locatorType;
    }

    public void setLocatorType(String locatorType) {
        this.locatorType = locatorType;
    }

    private String priorityNumber;

    public String getPriorityNumber() {
        return this.priorityNumber;
    }

    public void setPriorityNumber(String priorityNumber) {
        this.priorityNumber = priorityNumber;
    }

    private Boolean isDefault;

    public Boolean getIsDefault() {
        return this.isDefault;
    }

    public void setIsDefault(Boolean isDefault) {
        this.isDefault = isDefault;
    }

    private String x;

    public String getX() {
        return this.x;
    }

    public void setX(String x) {
        this.x = x;
    }

    private String y;

    public String getY() {
        return this.y;
    }

    public void setY(String y) {
        this.y = y;
    }

    private String z;

    public String getZ() {
        return this.z;
    }

    public void setZ(String z) {
        this.z = z;
    }

    private Boolean active;

    public Boolean getActive() {
        return this.active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    private String createdBy;

    public String getCreatedBy() {
        return this.createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    private Date createdAt;

    public Date getCreatedAt() {
        return this.createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    private String commandId;

    public String getCommandId() {
        return commandId;
    }

    public void setCommandId(String commandId) {
        this.commandId = commandId;
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


	public static class LocatorStateCreatedDto extends LocatorStateEventDto
	{
        @Override
        public String getStateEventType()
        {
            return AbstractStateEventDto.STATE_EVENT_TYPE_CREATED;
        }

	}


	public static class LocatorStateMergePatchedDto extends LocatorStateEventDto
	{
        @Override
        public String getStateEventType()
        {
            return AbstractStateEventDto.STATE_EVENT_TYPE_MERGE_PATCHED;
        }

	}


	public class LocatorStateDeletedDto extends LocatorStateEventDto
	{
        @Override
        public String getStateEventType()
        {
            return AbstractStateEventDto.STATE_EVENT_TYPE_DELETED;
        }

	}


}

