package org.dddml.wms.domain;

import java.util.*;
import java.util.Date;
import org.dddml.wms.specialization.*;

public abstract class AbstractUserPermissionStateEvent implements UserPermissionStateEvent
{
    private UserPermissionStateEventId stateEventId;

    public UserPermissionStateEventId getStateEventId() {
        return this.stateEventId;
    }

    public void setStateEventId(UserPermissionStateEventId stateEventId) {
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

    protected AbstractUserPermissionStateEvent() {
    }

    protected AbstractUserPermissionStateEvent(UserPermissionStateEventId stateEventId) {
        this.stateEventId = stateEventId;
    }


    public abstract String getStateEventType();


    public static abstract class AbstractUserPermissionStateCreated extends AbstractUserPermissionStateEvent implements UserPermissionStateCreated
    {
        public AbstractUserPermissionStateCreated() {
        }

        public AbstractUserPermissionStateCreated(UserPermissionStateEventId stateEventId) {
            super(stateEventId);
        }

        public String getStateEventType() {
            return StateEventType.CREATED;
        }

    }


    public static abstract class AbstractUserPermissionStateMergePatched extends AbstractUserPermissionStateEvent implements UserPermissionStateMergePatched
    {
        public AbstractUserPermissionStateMergePatched() {
        }

        public AbstractUserPermissionStateMergePatched(UserPermissionStateEventId stateEventId) {
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


    public static abstract class AbstractUserPermissionStateRemoved extends AbstractUserPermissionStateEvent implements UserPermissionStateRemoved
    {
        public AbstractUserPermissionStateRemoved() {
        }

        public AbstractUserPermissionStateRemoved(UserPermissionStateEventId stateEventId) {
            super(stateEventId);
        }

        public String getStateEventType() {
            return StateEventType.REMOVED;
        }

    }
        public static class SimpleUserPermissionStateCreated extends AbstractUserPermissionStateCreated
        {
			public SimpleUserPermissionStateCreated() {
			}

			public SimpleUserPermissionStateCreated(UserPermissionStateEventId stateEventId) {
				super(stateEventId);
			}
        }

        public static class SimpleUserPermissionStateMergePatched extends AbstractUserPermissionStateMergePatched
        {
			public SimpleUserPermissionStateMergePatched() {
			}

			public SimpleUserPermissionStateMergePatched(UserPermissionStateEventId stateEventId) {
				super(stateEventId);
			}
        }

        public static class SimpleUserPermissionStateRemoved extends AbstractUserPermissionStateRemoved
        {
			public SimpleUserPermissionStateRemoved() {
			}

			public SimpleUserPermissionStateRemoved(UserPermissionStateEventId stateEventId) {
				super(stateEventId);
			}
        }

}

