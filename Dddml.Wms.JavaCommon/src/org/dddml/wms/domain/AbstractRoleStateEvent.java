package org.dddml.wms.domain;

import java.util.*;
import java.util.Date;
import org.dddml.wms.specialization.*;

public abstract class AbstractRoleStateEvent extends AbstractStateEvent implements RoleStateEvent 
{
    private RoleStateEventId stateEventId;

    public RoleStateEventId getStateEventId() {
        return this.stateEventId;
    }

    public void setStateEventId(RoleStateEventId stateEventId) {
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

    protected AbstractRoleStateEvent() {
    }

    protected AbstractRoleStateEvent(RoleStateEventId stateEventId) {
        this.stateEventId = stateEventId;
    }


    public abstract String getStateEventType();


    public static abstract class AbstractRoleStateCreated extends AbstractRoleStateEvent implements RoleStateCreated
    {
        public AbstractRoleStateCreated() {
        }

        public AbstractRoleStateCreated(RoleStateEventId stateEventId) {
            super(stateEventId);
        }

        public String getStateEventType() {
            return StateEventType.CREATED;
        }

    }


    public static abstract class AbstractRoleStateMergePatched extends AbstractRoleStateEvent implements RoleStateMergePatched
    {
        public AbstractRoleStateMergePatched() {
        }

        public AbstractRoleStateMergePatched(RoleStateEventId stateEventId) {
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

        private Boolean isPropertyActiveRemoved;

        public Boolean getIsPropertyActiveRemoved() {
            return this.isPropertyActiveRemoved;
        }

        public void setIsPropertyActiveRemoved(Boolean removed) {
            this.isPropertyActiveRemoved = removed;
        }

    }


    public static abstract class AbstractRoleStateDeleted extends AbstractRoleStateEvent implements RoleStateDeleted
    {
        public AbstractRoleStateDeleted() {
        }

        public AbstractRoleStateDeleted(RoleStateEventId stateEventId) {
            super(stateEventId);
        }

        public String getStateEventType() {
            return StateEventType.DELETED;
        }

    }
        public static class SimpleRoleStateCreated extends AbstractRoleStateCreated
        {
			public SimpleRoleStateCreated() {
			}

			public SimpleRoleStateCreated(RoleStateEventId stateEventId) {
				super(stateEventId);
			}
        }

        public static class SimpleRoleStateMergePatched extends AbstractRoleStateMergePatched
        {
			public SimpleRoleStateMergePatched() {
			}

			public SimpleRoleStateMergePatched(RoleStateEventId stateEventId) {
				super(stateEventId);
			}
        }

        public static class SimpleRoleStateDeleted extends AbstractRoleStateDeleted
        {
			public SimpleRoleStateDeleted() {
			}

			public SimpleRoleStateDeleted(RoleStateEventId stateEventId) {
				super(stateEventId);
			}
        }

}

