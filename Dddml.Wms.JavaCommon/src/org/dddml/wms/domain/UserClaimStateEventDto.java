package org.dddml.wms.domain;

import java.util.Date;
import org.dddml.wms.domain.AbstractStateEventDto;

public class UserClaimStateEventDto extends AbstractStateEventDto
{
    private String stateEventType;

    public String getStateEventType() {
        return this.stateEventType;
    }

    public void setStateEventType(String type)
    {
        this.stateEventType = type;
    }

    private UserClaimStateEventIdDto stateEventId;

    public UserClaimStateEventIdDto getStateEventId() {
        return this.stateEventId;
    }

    public void getStateEventId(UserClaimStateEventIdDto stateEventId) {
        this.stateEventId = stateEventId;
    }

    private String claimType;

    public String getClaimType() {
        return this.claimType;
    }

    public void setClaimType(String claimType) {
        this.claimType = claimType;
    }

    private String claimValue;

    public String getClaimValue() {
        return this.claimValue;
    }

    public void setClaimValue(String claimValue) {
        this.claimValue = claimValue;
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

    private Boolean isPropertyClaimTypeRemoved;

    public Boolean getIsPropertyClaimTypeRemoved() {
        return this.isPropertyClaimTypeRemoved;
    }

    public void setIsPropertyClaimTypeRemoved(Boolean removed) {
        this.isPropertyClaimTypeRemoved = removed;
    }

    private Boolean isPropertyClaimValueRemoved;

    public Boolean getIsPropertyClaimValueRemoved() {
        return this.isPropertyClaimValueRemoved;
    }

    public void setIsPropertyClaimValueRemoved(Boolean removed) {
        this.isPropertyClaimValueRemoved = removed;
    }

    private Boolean isPropertyActiveRemoved;

    public Boolean getIsPropertyActiveRemoved() {
        return this.isPropertyActiveRemoved;
    }

    public void setIsPropertyActiveRemoved(Boolean removed) {
        this.isPropertyActiveRemoved = removed;
    }


	public static class UserClaimStateCreatedDto extends UserClaimStateEventDto
	{
        @Override
        public String getStateEventType()
        {
            return AbstractStateEventDto.STATE_EVENT_TYPE_CREATED;
        }

	}


	public static class UserClaimStateMergePatchedDto extends UserClaimStateEventDto
	{
        @Override
        public String getStateEventType()
        {
            return AbstractStateEventDto.STATE_EVENT_TYPE_MERGE_PATCHED;
        }

	}


	public class UserClaimStateRemovedDto extends UserClaimStateEventDto
	{
        @Override
        public String getStateEventType()
        {
            return AbstractStateEventDto.STATE_EVENT_TYPE_REMOVED;
        }

	}


}

