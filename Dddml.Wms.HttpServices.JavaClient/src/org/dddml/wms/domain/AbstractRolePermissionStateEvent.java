package org.dddml.wms.domain;

import java.util.*;
import java.util.Date;
import org.dddml.wms.specialization.*;

public abstract class AbstractRolePermissionStateEvent implements RolePermissionStateEvent
{
    private RolePermissionStateEventId stateEventId;

    public RolePermissionStateEventId getStateEventId() {
        return this.stateEventId;
    }

    public void setStateEventId(RolePermissionStateEventId stateEventId) {
        this.stateEventId = stateEventId;
    }
    
    private boolean stateEventReadOnly;

    public boolean getStateEventReadOnly() { return this.stateEventReadOnly; }

    public void setStateEventReadOnly(boolean readOnly) { this.stateEventReadOnly = readOnly; }

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

    protected AbstractRolePermissionStateEvent() {
    }

    protected AbstractRolePermissionStateEvent(RolePermissionStateEventId stateEventId) {
        this.stateEventId = stateEventId;
    }


    public abstract String getStateEventType();


    public static abstract class AbstractRolePermissionStateCreated extends AbstractRolePermissionStateEvent implements RolePermissionStateCreated
    {
        public AbstractRolePermissionStateCreated() {
        }

        public AbstractRolePermissionStateCreated(RolePermissionStateEventId stateEventId) {
            super(stateEventId);
        }

        public String getStateEventType() {
            return StateEventType.CREATED;
        }

    }


/*
    public static abstract class AbstractRolePermissionStateMergePatched extends AbstractRolePermissionStateEvent implements RolePermissionStateMergePatched
    {
        Boolean isPropertyActiveRemoved();

        void setPropertyActiveRemoved(Boolean removed);


    }
*/

    public static abstract class AbstractRolePermissionStateDeleted extends AbstractRolePermissionStateEvent implements RolePermissionStateDeleted
    {
        public AbstractRolePermissionStateDeleted() {
        }

        public AbstractRolePermissionStateDeleted(RolePermissionStateEventId stateEventId) {
            super(stateEventId);
        }

        public String getStateEventType() {
            return StateEventType.DELETED;
        }

    }

}

