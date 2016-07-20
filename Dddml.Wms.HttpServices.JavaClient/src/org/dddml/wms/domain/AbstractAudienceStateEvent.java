package org.dddml.wms.domain;

import java.util.*;
import java.util.Date;
import org.dddml.wms.specialization.*;

public abstract class AbstractAudienceStateEvent implements AudienceStateEvent
{
    private AudienceStateEventId stateEventId;

    public AudienceStateEventId getStateEventId() {
        return this.stateEventId;
    }

    public void setStateEventId(AudienceStateEventId stateEventId) {
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

    private String base64Secret;

    public String getBase64Secret()
    {
        return this.base64Secret;
    }

    public void setBase64Secret(String base64Secret)
    {
        this.base64Secret = base64Secret;
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

    protected AbstractAudienceStateEvent() {
    }

    protected AbstractAudienceStateEvent(AudienceStateEventId stateEventId) {
        this.stateEventId = stateEventId;
    }


    public abstract String getStateEventType();


    public static abstract class AbstractAudienceStateCreated extends AbstractAudienceStateEvent implements AudienceStateCreated
    {
        public AbstractAudienceStateCreated() {
        }

        public AbstractAudienceStateCreated(AudienceStateEventId stateEventId) {
            super(stateEventId);
        }

        public String getStateEventType() {
            return StateEventType.CREATED;
        }

    }


    public static abstract class AbstractAudienceStateMergePatched extends AbstractAudienceStateEvent implements AudienceStateMergePatched
    {
        public AbstractAudienceStateMergePatched() {
        }

        public AbstractAudienceStateMergePatched(AudienceStateEventId stateEventId) {
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

        private Boolean isPropertyBase64SecretRemoved;

        public Boolean getIsPropertyBase64SecretRemoved() {
            return this.isPropertyBase64SecretRemoved;
        }

        public void setIsPropertyBase64SecretRemoved(Boolean removed) {
            this.isPropertyBase64SecretRemoved = removed;
        }

        private Boolean isPropertyActiveRemoved;

        public Boolean getIsPropertyActiveRemoved() {
            return this.isPropertyActiveRemoved;
        }

        public void setIsPropertyActiveRemoved(Boolean removed) {
            this.isPropertyActiveRemoved = removed;
        }


    }


    public static abstract class AbstractAudienceStateDeleted extends AbstractAudienceStateEvent implements AudienceStateDeleted
    {
        public AbstractAudienceStateDeleted() {
        }

        public AbstractAudienceStateDeleted(AudienceStateEventId stateEventId) {
            super(stateEventId);
        }

        public String getStateEventType() {
            return StateEventType.DELETED;
        }

    }
}

