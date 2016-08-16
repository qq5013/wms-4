package org.dddml.wms.domain;

import java.util.*;
import java.util.Date;
import org.dddml.wms.specialization.*;

public abstract class AbstractDayPlanStateEvent extends AbstractStateEvent implements DayPlanStateEvent 
{
    private DayPlanStateEventId stateEventId;

    public DayPlanStateEventId getStateEventId() {
        return this.stateEventId;
    }

    public void setStateEventId(DayPlanStateEventId stateEventId) {
        this.stateEventId = stateEventId;
    }
    
    private boolean stateEventReadOnly;

    public boolean getStateEventReadOnly() { return this.stateEventReadOnly; }

    public void setStateEventReadOnly(boolean readOnly) { this.stateEventReadOnly = readOnly; }

    private Long version;

    public Long getVersion()
    {
        return this.version;
    }

    public void setVersion(Long version)
    {
        this.version = version;
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

    private PersonalName personalName;

    public PersonalName getPersonalName()
    {
        return this.personalName;
    }

    public void setPersonalName(PersonalName personalName)
    {
        this.personalName = personalName;
    }

    private Integer year;

    public Integer getYear()
    {
        return this.year;
    }

    public void setYear(Integer year)
    {
        this.year = year;
    }

    private Integer month;

    public Integer getMonth()
    {
        return this.month;
    }

    public void setMonth(Integer month)
    {
        this.month = month;
    }


    private String commandId;

    public String getCommandId() {
        return commandId;
    }

    public void setCommandId(String commandId) {
        this.commandId = commandId;
    }

    protected AbstractDayPlanStateEvent() {
    }

    protected AbstractDayPlanStateEvent(DayPlanStateEventId stateEventId) {
        this.stateEventId = stateEventId;
    }


    public abstract String getStateEventType();


    public static abstract class AbstractDayPlanStateCreated extends AbstractDayPlanStateEvent implements DayPlanStateCreated
    {
        public AbstractDayPlanStateCreated() {
        }

        public AbstractDayPlanStateCreated(DayPlanStateEventId stateEventId) {
            super(stateEventId);
        }

        public String getStateEventType() {
            return StateEventType.CREATED;
        }

    }


    public static abstract class AbstractDayPlanStateMergePatched extends AbstractDayPlanStateEvent implements DayPlanStateMergePatched
    {
        public AbstractDayPlanStateMergePatched() {
        }

        public AbstractDayPlanStateMergePatched(DayPlanStateEventId stateEventId) {
            super(stateEventId);
        }

        public String getStateEventType() {
            return StateEventType.MERGE_PATCHED;
        }

        private Boolean isPropertyDescriptionRemoved;

        public Boolean getIsPropertyDescriptionRemoved() {
            return this.isPropertyDescriptionRemoved;
        }

        public void setIsPropertyDescriptionRemoved(Boolean removed) {
            this.isPropertyDescriptionRemoved = removed;
        }

        private Boolean isPropertyActiveRemoved;

        public Boolean getIsPropertyActiveRemoved() {
            return this.isPropertyActiveRemoved;
        }

        public void setIsPropertyActiveRemoved(Boolean removed) {
            this.isPropertyActiveRemoved = removed;
        }

    }


    public static abstract class AbstractDayPlanStateRemoved extends AbstractDayPlanStateEvent implements DayPlanStateRemoved
    {
        public AbstractDayPlanStateRemoved() {
        }

        public AbstractDayPlanStateRemoved(DayPlanStateEventId stateEventId) {
            super(stateEventId);
        }

        public String getStateEventType() {
            return StateEventType.REMOVED;
        }

    }
        public static class SimpleDayPlanStateCreated extends AbstractDayPlanStateCreated
        {
			public SimpleDayPlanStateCreated() {
			}

			public SimpleDayPlanStateCreated(DayPlanStateEventId stateEventId) {
				super(stateEventId);
			}
        }

        public static class SimpleDayPlanStateMergePatched extends AbstractDayPlanStateMergePatched
        {
			public SimpleDayPlanStateMergePatched() {
			}

			public SimpleDayPlanStateMergePatched(DayPlanStateEventId stateEventId) {
				super(stateEventId);
			}
        }

        public static class SimpleDayPlanStateRemoved extends AbstractDayPlanStateRemoved
        {
			public SimpleDayPlanStateRemoved() {
			}

			public SimpleDayPlanStateRemoved(DayPlanStateEventId stateEventId) {
				super(stateEventId);
			}
        }

}

