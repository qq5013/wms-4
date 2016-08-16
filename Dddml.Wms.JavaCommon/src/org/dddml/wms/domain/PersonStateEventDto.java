package org.dddml.wms.domain;

import java.util.Date;
import org.dddml.wms.domain.AbstractStateEvent;

public class PersonStateEventDto extends AbstractStateEvent
{
    private String stateEventType;

    public String getStateEventType() {
        return this.stateEventType;
    }

    public void setStateEventType(String type)
    {
        this.stateEventType = type;
    }

    private PersonStateEventIdDto stateEventId;

    public PersonStateEventIdDto getStateEventId() {
        return this.stateEventId;
    }

    public void getStateEventId(PersonStateEventIdDto stateEventId) {
        this.stateEventId = stateEventId;
    }

    private Date birthDate;

    public Date getBirthDate() {
        return this.birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    private PersonalName loves;

    public PersonalName getLoves() {
        return this.loves;
    }

    public void setLoves(PersonalName loves) {
        this.loves = loves;
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

    private Boolean isPropertyBirthDateRemoved;

    public Boolean getIsPropertyBirthDateRemoved() {
        return this.isPropertyBirthDateRemoved;
    }

    public void setIsPropertyBirthDateRemoved(Boolean removed) {
        this.isPropertyBirthDateRemoved = removed;
    }

    private Boolean isPropertyLovesRemoved;

    public Boolean getIsPropertyLovesRemoved() {
        return this.isPropertyLovesRemoved;
    }

    public void setIsPropertyLovesRemoved(Boolean removed) {
        this.isPropertyLovesRemoved = removed;
    }

    private Boolean isPropertyActiveRemoved;

    public Boolean getIsPropertyActiveRemoved() {
        return this.isPropertyActiveRemoved;
    }

    public void setIsPropertyActiveRemoved(Boolean removed) {
        this.isPropertyActiveRemoved = removed;
    }


    private YearPlanStateEventDto[] yearPlanEvents;

    public YearPlanStateEventDto[] getYearPlanEvents() {
        return this.yearPlanEvents;
    }

    public void setYearPlanEvents(YearPlanStateEventDto[] events) {
        this.yearPlanEvents = events;
    }


	public static class PersonStateCreatedDto extends PersonStateEventDto
	{
        @Override
        public String getStateEventType()
        {
            return STATE_EVENT_TYPE_CREATED;
        }

	}


	public static class PersonStateMergePatchedDto extends PersonStateEventDto
	{
        @Override
        public String getStateEventType()
        {
            return STATE_EVENT_TYPE_MERGE_PATCHED;
        }

	}


	public class PersonStateDeletedDto extends PersonStateEventDto
	{
        @Override
        public String getStateEventType()
        {
            return STATE_EVENT_TYPE_DELETED;
        }

	}


}

