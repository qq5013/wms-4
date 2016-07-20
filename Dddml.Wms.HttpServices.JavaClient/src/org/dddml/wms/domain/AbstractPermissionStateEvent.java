package org.dddml.wms.domain;

import java.util.*;
import java.util.Date;
import org.dddml.wms.specialization.*;

public abstract class AbstractPermissionStateEvent implements PermissionStateEvent
{
    private PermissionStateEventId stateEventId;

    public PermissionStateEventId getStateEventId() {
        return this.stateEventId;
    }

    public void setStateEventId(PermissionStateEventId stateEventId) {
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

    private String parentPermissionId;

    public String getParentPermissionId()
    {
        return this.parentPermissionId;
    }

    public void setParentPermissionId(String parentPermissionId)
    {
        this.parentPermissionId = parentPermissionId;
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

    protected AbstractPermissionStateEvent() {
    }

    protected AbstractPermissionStateEvent(PermissionStateEventId stateEventId) {
        this.stateEventId = stateEventId;
    }


    public abstract String getStateEventType();


    public static abstract class AbstractPermissionStateCreated extends AbstractPermissionStateEvent implements PermissionStateCreated
    {
        public AbstractPermissionStateCreated() {
        }

        public AbstractPermissionStateCreated(PermissionStateEventId stateEventId) {
            super(stateEventId);
        }

        public String getStateEventType() {
            return StateEventType.CREATED;
        }

    }


/*
    public static abstract class AbstractPermissionStateMergePatched extends AbstractPermissionStateEvent implements PermissionStateMergePatched
    {
        Boolean isPropertyNameRemoved();

        void setPropertyNameRemoved(Boolean removed);

        Boolean isPropertyParentPermissionIdRemoved();

        void setPropertyParentPermissionIdRemoved(Boolean removed);

        Boolean isPropertyDescriptionRemoved();

        void setPropertyDescriptionRemoved(Boolean removed);

        Boolean isPropertyActiveRemoved();

        void setPropertyActiveRemoved(Boolean removed);


    }
*/

    public static abstract class AbstractPermissionStateDeleted extends AbstractPermissionStateEvent implements PermissionStateDeleted
    {
        public AbstractPermissionStateDeleted() {
        }

        public AbstractPermissionStateDeleted(PermissionStateEventId stateEventId) {
            super(stateEventId);
        }

        public String getStateEventType() {
            return StateEventType.DELETED;
        }

    }

}

