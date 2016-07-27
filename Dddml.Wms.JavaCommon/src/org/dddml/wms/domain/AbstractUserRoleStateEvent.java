package org.dddml.wms.domain;

import java.util.*;
import java.util.Date;
import org.dddml.wms.specialization.*;

public abstract class AbstractUserRoleStateEvent extends AbstractStateEvent implements UserRoleStateEvent 
{
    private UserRoleStateEventId stateEventId;

    public UserRoleStateEventId getStateEventId() {
        return this.stateEventId;
    }

    public void setStateEventId(UserRoleStateEventId stateEventId) {
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

    private String userId;

    public String getUserId()
    {
        return this.userId;
    }

    public void setUserId(String userId)
    {
        this.userId = userId;
    }


    private String commandId;

    public String getCommandId() {
        return commandId;
    }

    public void setCommandId(String commandId) {
        this.commandId = commandId;
    }

    protected AbstractUserRoleStateEvent() {
    }

    protected AbstractUserRoleStateEvent(UserRoleStateEventId stateEventId) {
        this.stateEventId = stateEventId;
    }


    public abstract String getStateEventType();


    public static abstract class AbstractUserRoleStateCreated extends AbstractUserRoleStateEvent implements UserRoleStateCreated
    {
        public AbstractUserRoleStateCreated() {
        }

        public AbstractUserRoleStateCreated(UserRoleStateEventId stateEventId) {
            super(stateEventId);
        }

        public String getStateEventType() {
            return StateEventType.CREATED;
        }

    }


    public static abstract class AbstractUserRoleStateMergePatched extends AbstractUserRoleStateEvent implements UserRoleStateMergePatched
    {
        public AbstractUserRoleStateMergePatched() {
        }

        public AbstractUserRoleStateMergePatched(UserRoleStateEventId stateEventId) {
            super(stateEventId);
        }

        public String getStateEventType() {
            return StateEventType.MERGE_PATCHED;
        }

        private Boolean isPropertyActiveRemoved;

        public Boolean getIsPropertyActiveRemoved() {
            return this.isPropertyActiveRemoved;
        }

        public void setIsPropertyActiveRemoved(Boolean removed) {
            this.isPropertyActiveRemoved = removed;
        }

    }


    public static abstract class AbstractUserRoleStateRemoved extends AbstractUserRoleStateEvent implements UserRoleStateRemoved
    {
        public AbstractUserRoleStateRemoved() {
        }

        public AbstractUserRoleStateRemoved(UserRoleStateEventId stateEventId) {
            super(stateEventId);
        }

        public String getStateEventType() {
            return StateEventType.REMOVED;
        }

    }
        public static class SimpleUserRoleStateCreated extends AbstractUserRoleStateCreated
        {
			public SimpleUserRoleStateCreated() {
			}

			public SimpleUserRoleStateCreated(UserRoleStateEventId stateEventId) {
				super(stateEventId);
			}
        }

        public static class SimpleUserRoleStateMergePatched extends AbstractUserRoleStateMergePatched
        {
			public SimpleUserRoleStateMergePatched() {
			}

			public SimpleUserRoleStateMergePatched(UserRoleStateEventId stateEventId) {
				super(stateEventId);
			}
        }

        public static class SimpleUserRoleStateRemoved extends AbstractUserRoleStateRemoved
        {
			public SimpleUserRoleStateRemoved() {
			}

			public SimpleUserRoleStateRemoved(UserRoleStateEventId stateEventId) {
				super(stateEventId);
			}
        }

}

