package org.dddml.wms.domain;

import java.util.*;
import java.util.Date;
import org.dddml.wms.specialization.*;

public abstract class AbstractOrganizationStateEvent extends AbstractStateEvent implements OrganizationStateEvent 
{
    private OrganizationStateEventId stateEventId;

    public OrganizationStateEventId getStateEventId() {
        return this.stateEventId;
    }

    public void setStateEventId(OrganizationStateEventId stateEventId) {
        this.stateEventId = stateEventId;
    }
    
    private boolean stateEventReadOnly;

    public boolean getStateEventReadOnly() { return this.stateEventReadOnly; }

    public void setStateEventReadOnly(boolean readOnly) { this.stateEventReadOnly = readOnly; }

    private String name;

    public String getName()
    {
        return this.name;
    }

    public void setName(String name)
    {
        this.name = name;
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

    private String type;

    public String getType()
    {
        return this.type;
    }

    public void setType(String type)
    {
        this.type = type;
    }

    private Boolean isSummary;

    public Boolean getIsSummary()
    {
        return this.isSummary;
    }

    public void setIsSummary(Boolean isSummary)
    {
        this.isSummary = isSummary;
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


    private String commandId;

    public String getCommandId() {
        return commandId;
    }

    public void setCommandId(String commandId) {
        this.commandId = commandId;
    }

    protected AbstractOrganizationStateEvent() {
    }

    protected AbstractOrganizationStateEvent(OrganizationStateEventId stateEventId) {
        this.stateEventId = stateEventId;
    }


    public abstract String getStateEventType();


    public static abstract class AbstractOrganizationStateCreated extends AbstractOrganizationStateEvent implements OrganizationStateCreated
    {
        public AbstractOrganizationStateCreated() {
        }

        public AbstractOrganizationStateCreated(OrganizationStateEventId stateEventId) {
            super(stateEventId);
        }

        public String getStateEventType() {
            return StateEventType.CREATED;
        }

    }


    public static abstract class AbstractOrganizationStateMergePatched extends AbstractOrganizationStateEvent implements OrganizationStateMergePatched
    {
        public AbstractOrganizationStateMergePatched() {
        }

        public AbstractOrganizationStateMergePatched(OrganizationStateEventId stateEventId) {
            super(stateEventId);
        }

        public String getStateEventType() {
            return StateEventType.MERGE_PATCHED;
        }

        private Boolean isPropertyNameRemoved;

        public Boolean getIsPropertyNameRemoved() {
            return this.isPropertyNameRemoved;
        }

        public void setIsPropertyNameRemoved(Boolean removed) {
            this.isPropertyNameRemoved = removed;
        }

        private Boolean isPropertyDescriptionRemoved;

        public Boolean getIsPropertyDescriptionRemoved() {
            return this.isPropertyDescriptionRemoved;
        }

        public void setIsPropertyDescriptionRemoved(Boolean removed) {
            this.isPropertyDescriptionRemoved = removed;
        }

        private Boolean isPropertyTypeRemoved;

        public Boolean getIsPropertyTypeRemoved() {
            return this.isPropertyTypeRemoved;
        }

        public void setIsPropertyTypeRemoved(Boolean removed) {
            this.isPropertyTypeRemoved = removed;
        }

        private Boolean isPropertyIsSummaryRemoved;

        public Boolean getIsPropertyIsSummaryRemoved() {
            return this.isPropertyIsSummaryRemoved;
        }

        public void setIsPropertyIsSummaryRemoved(Boolean removed) {
            this.isPropertyIsSummaryRemoved = removed;
        }

        private Boolean isPropertyActiveRemoved;

        public Boolean getIsPropertyActiveRemoved() {
            return this.isPropertyActiveRemoved;
        }

        public void setIsPropertyActiveRemoved(Boolean removed) {
            this.isPropertyActiveRemoved = removed;
        }

    }


    public static abstract class AbstractOrganizationStateDeleted extends AbstractOrganizationStateEvent implements OrganizationStateDeleted
    {
        public AbstractOrganizationStateDeleted() {
        }

        public AbstractOrganizationStateDeleted(OrganizationStateEventId stateEventId) {
            super(stateEventId);
        }

        public String getStateEventType() {
            return StateEventType.DELETED;
        }

    }
        public static class SimpleOrganizationStateCreated extends AbstractOrganizationStateCreated
        {
			public SimpleOrganizationStateCreated() {
			}

			public SimpleOrganizationStateCreated(OrganizationStateEventId stateEventId) {
				super(stateEventId);
			}
        }

        public static class SimpleOrganizationStateMergePatched extends AbstractOrganizationStateMergePatched
        {
			public SimpleOrganizationStateMergePatched() {
			}

			public SimpleOrganizationStateMergePatched(OrganizationStateEventId stateEventId) {
				super(stateEventId);
			}
        }

        public static class SimpleOrganizationStateDeleted extends AbstractOrganizationStateDeleted
        {
			public SimpleOrganizationStateDeleted() {
			}

			public SimpleOrganizationStateDeleted(OrganizationStateEventId stateEventId) {
				super(stateEventId);
			}
        }

}

