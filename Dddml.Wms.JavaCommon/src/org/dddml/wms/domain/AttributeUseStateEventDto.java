package org.dddml.wms.domain;

import java.util.Date;
import org.dddml.wms.domain.AbstractStateEventDto;

public class AttributeUseStateEventDto extends AbstractStateEventDto
{
    private String stateEventType;

    public String getStateEventType() {
        return this.stateEventType;
    }

    public void setStateEventType(String type)
    {
        this.stateEventType = type;
    }

    private AttributeUseStateEventIdDto stateEventId;

    public AttributeUseStateEventIdDto getStateEventId() {
        return this.stateEventId;
    }

    public void getStateEventId(AttributeUseStateEventIdDto stateEventId) {
        this.stateEventId = stateEventId;
    }

    private Integer sequenceNumber;

    public Integer getSequenceNumber() {
        return this.sequenceNumber;
    }

    public void setSequenceNumber(Integer sequenceNumber) {
        this.sequenceNumber = sequenceNumber;
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

    private Long version;

    public Long getVersion() {
        return this.version;
    }

    public void setVersion(Long version) {
        this.version = version;
    }

    private String commandId;

    public String getCommandId() {
        return commandId;
    }

    public void setCommandId(String commandId) {
        this.commandId = commandId;
    }

    private Boolean isPropertySequenceNumberRemoved;

    public Boolean getIsPropertySequenceNumberRemoved() {
        return this.isPropertySequenceNumberRemoved;
    }

    public void setIsPropertySequenceNumberRemoved(Boolean removed) {
        this.isPropertySequenceNumberRemoved = removed;
    }

    private Boolean isPropertyActiveRemoved;

    public Boolean getIsPropertyActiveRemoved() {
        return this.isPropertyActiveRemoved;
    }

    public void setIsPropertyActiveRemoved(Boolean removed) {
        this.isPropertyActiveRemoved = removed;
    }


	public static class AttributeUseStateCreatedDto extends AttributeUseStateEventDto
	{
        @Override
        public String getStateEventType()
        {
            return AbstractStateEventDto.STATE_EVENT_TYPE_CREATED;
        }

	}


	public static class AttributeUseStateMergePatchedDto extends AttributeUseStateEventDto
	{
        @Override
        public String getStateEventType()
        {
            return AbstractStateEventDto.STATE_EVENT_TYPE_MERGE_PATCHED;
        }

	}


	public class AttributeUseStateRemovedDto extends AttributeUseStateEventDto
	{
        @Override
        public String getStateEventType()
        {
            return AbstractStateEventDto.STATE_EVENT_TYPE_REMOVED;
        }

	}


}

