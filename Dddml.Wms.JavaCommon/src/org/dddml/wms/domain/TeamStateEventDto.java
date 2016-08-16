package org.dddml.wms.domain;

import java.util.Date;
import org.dddml.wms.domain.AbstractStateEvent;

public class TeamStateEventDto extends AbstractStateEvent
{
    private String stateEventType;

    public String getStateEventType() {
        return this.stateEventType;
    }

    public void setStateEventType(String type)
    {
        this.stateEventType = type;
    }

    private TeamStateEventIdDto stateEventId;

    public TeamStateEventIdDto getStateEventId() {
        return this.stateEventId;
    }

    public void getStateEventId(TeamStateEventIdDto stateEventId) {
        this.stateEventId = stateEventId;
    }

    private String description;

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
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

    private PersonalNameDto[] players;

    public PersonalNameDto[] getPlayers() {
        return this.players;
    }

    public void setPlayers(PersonalNameDto[] players) {
        this.players = players;
    }

    private String[] mascots;

    public String[] getMascots() {
        return this.mascots;
    }

    public void setMascots(String[] mascots) {
        this.mascots = mascots;
    }

    private String commandId;

    public String getCommandId() {
        return commandId;
    }

    public void setCommandId(String commandId) {
        this.commandId = commandId;
    }

    private Boolean isPropertyDescriptionRemoved;

    public Boolean getIsPropertyDescriptionRemoved() {
        return this.isPropertyDescriptionRemoved;
    }

    public void setIsPropertyDescriptionRemoved(Boolean removed) {
        this.isPropertyDescriptionRemoved = removed;
    }

    private Boolean isPropertyPlayersRemoved;

    public Boolean getIsPropertyPlayersRemoved() {
        return this.isPropertyPlayersRemoved;
    }

    public void setIsPropertyPlayersRemoved(Boolean removed) {
        this.isPropertyPlayersRemoved = removed;
    }

    private Boolean isPropertyMascotsRemoved;

    public Boolean getIsPropertyMascotsRemoved() {
        return this.isPropertyMascotsRemoved;
    }

    public void setIsPropertyMascotsRemoved(Boolean removed) {
        this.isPropertyMascotsRemoved = removed;
    }

    private Boolean isPropertyActiveRemoved;

    public Boolean getIsPropertyActiveRemoved() {
        return this.isPropertyActiveRemoved;
    }

    public void setIsPropertyActiveRemoved(Boolean removed) {
        this.isPropertyActiveRemoved = removed;
    }


	public static class TeamStateCreatedDto extends TeamStateEventDto
	{
        @Override
        public String getStateEventType()
        {
            return STATE_EVENT_TYPE_CREATED;
        }

	}


	public static class TeamStateMergePatchedDto extends TeamStateEventDto
	{
        @Override
        public String getStateEventType()
        {
            return STATE_EVENT_TYPE_MERGE_PATCHED;
        }

	}


	public class TeamStateDeletedDto extends TeamStateEventDto
	{
        @Override
        public String getStateEventType()
        {
            return STATE_EVENT_TYPE_DELETED;
        }

	}


}

