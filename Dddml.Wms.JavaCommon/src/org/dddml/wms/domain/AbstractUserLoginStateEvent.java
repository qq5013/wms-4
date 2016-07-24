package org.dddml.wms.domain;

import java.util.*;
import java.util.Date;
import org.dddml.wms.specialization.*;

public abstract class AbstractUserLoginStateEvent implements UserLoginStateEvent
{
    private UserLoginStateEventId stateEventId;

    public UserLoginStateEventId getStateEventId() {
        return this.stateEventId;
    }

    public void setStateEventId(UserLoginStateEventId stateEventId) {
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

    protected AbstractUserLoginStateEvent() {
    }

    protected AbstractUserLoginStateEvent(UserLoginStateEventId stateEventId) {
        this.stateEventId = stateEventId;
    }


    public abstract String getStateEventType();


    public static abstract class AbstractUserLoginStateCreated extends AbstractUserLoginStateEvent implements UserLoginStateCreated
    {
        public AbstractUserLoginStateCreated() {
        }

        public AbstractUserLoginStateCreated(UserLoginStateEventId stateEventId) {
            super(stateEventId);
        }

        public String getStateEventType() {
            return StateEventType.CREATED;
        }

    }


    public static abstract class AbstractUserLoginStateMergePatched extends AbstractUserLoginStateEvent implements UserLoginStateMergePatched
    {
        public AbstractUserLoginStateMergePatched() {
        }

        public AbstractUserLoginStateMergePatched(UserLoginStateEventId stateEventId) {
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


    public static abstract class AbstractUserLoginStateRemoved extends AbstractUserLoginStateEvent implements UserLoginStateRemoved
    {
        public AbstractUserLoginStateRemoved() {
        }

        public AbstractUserLoginStateRemoved(UserLoginStateEventId stateEventId) {
            super(stateEventId);
        }

        public String getStateEventType() {
            return StateEventType.REMOVED;
        }

    }
        public static class SimpleUserLoginStateCreated extends AbstractUserLoginStateCreated
        {
			public SimpleUserLoginStateCreated() {
			}

			public SimpleUserLoginStateCreated(UserLoginStateEventId stateEventId) {
				super(stateEventId);
			}
        }

        public static class SimpleUserLoginStateMergePatched extends AbstractUserLoginStateMergePatched
        {
			public SimpleUserLoginStateMergePatched() {
			}

			public SimpleUserLoginStateMergePatched(UserLoginStateEventId stateEventId) {
				super(stateEventId);
			}
        }

        public static class SimpleUserLoginStateRemoved extends AbstractUserLoginStateRemoved
        {
			public SimpleUserLoginStateRemoved() {
			}

			public SimpleUserLoginStateRemoved(UserLoginStateEventId stateEventId) {
				super(stateEventId);
			}
        }

}

