package org.dddml.wms.domain;

import java.util.Date;
import org.dddml.wms.domain.AbstractStateEventDto;

public class AttributeSetStateEventDto extends AbstractStateEventDto
{
    private String stateEventType;

    public String getStateEventType() {
        return this.stateEventType;
    }

    public void setStateEventType(String type)
    {
        this.stateEventType = type;
    }

    private AttributeSetStateEventIdDto stateEventId;

    public AttributeSetStateEventIdDto getStateEventId() {
        return this.stateEventId;
    }

    public void getStateEventId(AttributeSetStateEventIdDto stateEventId) {
        this.stateEventId = stateEventId;
    }

    private String name;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String organizationId;

    public String getOrganizationId() {
        return this.organizationId;
    }

    public void setOrganizationId(String organizationId) {
        this.organizationId = organizationId;
    }

    private String description;

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    private String serialNumberAttributeId;

    public String getSerialNumberAttributeId() {
        return this.serialNumberAttributeId;
    }

    public void setSerialNumberAttributeId(String serialNumberAttributeId) {
        this.serialNumberAttributeId = serialNumberAttributeId;
    }

    private String lotAttributeId;

    public String getLotAttributeId() {
        return this.lotAttributeId;
    }

    public void setLotAttributeId(String lotAttributeId) {
        this.lotAttributeId = lotAttributeId;
    }

    private String referenceId;

    public String getReferenceId() {
        return this.referenceId;
    }

    public void setReferenceId(String referenceId) {
        this.referenceId = referenceId;
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

    private Boolean isPropertyNameRemoved;

    public Boolean getIsPropertyNameRemoved() {
        return this.isPropertyNameRemoved;
    }

    public void setIsPropertyNameRemoved(Boolean removed) {
        this.isPropertyNameRemoved = removed;
    }

    private Boolean isPropertyOrganizationIdRemoved;

    public Boolean getIsPropertyOrganizationIdRemoved() {
        return this.isPropertyOrganizationIdRemoved;
    }

    public void setIsPropertyOrganizationIdRemoved(Boolean removed) {
        this.isPropertyOrganizationIdRemoved = removed;
    }

    private Boolean isPropertyDescriptionRemoved;

    public Boolean getIsPropertyDescriptionRemoved() {
        return this.isPropertyDescriptionRemoved;
    }

    public void setIsPropertyDescriptionRemoved(Boolean removed) {
        this.isPropertyDescriptionRemoved = removed;
    }

    private Boolean isPropertySerialNumberAttributeIdRemoved;

    public Boolean getIsPropertySerialNumberAttributeIdRemoved() {
        return this.isPropertySerialNumberAttributeIdRemoved;
    }

    public void setIsPropertySerialNumberAttributeIdRemoved(Boolean removed) {
        this.isPropertySerialNumberAttributeIdRemoved = removed;
    }

    private Boolean isPropertyLotAttributeIdRemoved;

    public Boolean getIsPropertyLotAttributeIdRemoved() {
        return this.isPropertyLotAttributeIdRemoved;
    }

    public void setIsPropertyLotAttributeIdRemoved(Boolean removed) {
        this.isPropertyLotAttributeIdRemoved = removed;
    }

    private Boolean isPropertyReferenceIdRemoved;

    public Boolean getIsPropertyReferenceIdRemoved() {
        return this.isPropertyReferenceIdRemoved;
    }

    public void setIsPropertyReferenceIdRemoved(Boolean removed) {
        this.isPropertyReferenceIdRemoved = removed;
    }

    private Boolean isPropertyActiveRemoved;

    public Boolean getIsPropertyActiveRemoved() {
        return this.isPropertyActiveRemoved;
    }

    public void setIsPropertyActiveRemoved(Boolean removed) {
        this.isPropertyActiveRemoved = removed;
    }


    private AttributeUseStateEventDto[] attributeUseEvents;

    public AttributeUseStateEventDto[] getAttributeUseEvents() {
        return this.attributeUseEvents;
    }

    public void setAttributeUseEvents(AttributeUseStateEventDto[] events) {
        this.attributeUseEvents = events;
    }


	public static class AttributeSetStateCreatedDto extends AttributeSetStateEventDto
	{
        @Override
        public String getStateEventType()
        {
            return AbstractStateEventDto.STATE_EVENT_TYPE_CREATED;
        }

	}


	public static class AttributeSetStateMergePatchedDto extends AttributeSetStateEventDto
	{
        @Override
        public String getStateEventType()
        {
            return AbstractStateEventDto.STATE_EVENT_TYPE_MERGE_PATCHED;
        }

	}


	public class AttributeSetStateDeletedDto extends AttributeSetStateEventDto
	{
        @Override
        public String getStateEventType()
        {
            return AbstractStateEventDto.STATE_EVENT_TYPE_DELETED;
        }

	}


}

