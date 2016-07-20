package org.dddml.wms.domain;

import java.util.*;
import java.util.Date;
import org.dddml.wms.specialization.*;

public abstract class AbstractUserClaimStateEvent implements UserClaimStateEvent
{
    private UserClaimStateEventId stateEventId;

    public UserClaimStateEventId getStateEventId() {
        return this.stateEventId;
    }

    public void setStateEventId(UserClaimStateEventId stateEventId) {
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

    private String claimType;

    public String getClaimType()
    {
        return this.claimType;
    }

    public void setClaimType(String claimType)
    {
        this.claimType = claimType;
    }

    private String claimValue;

    public String getClaimValue()
    {
        return this.claimValue;
    }

    public void setClaimValue(String claimValue)
    {
        this.claimValue = claimValue;
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

    protected AbstractUserClaimStateEvent() {
    }

    protected AbstractUserClaimStateEvent(UserClaimStateEventId stateEventId) {
        this.stateEventId = stateEventId;
    }


    public abstract String getStateEventType();


    public static abstract class AbstractUserClaimStateCreated extends AbstractUserClaimStateEvent implements UserClaimStateCreated
    {
        public AbstractUserClaimStateCreated() {
        }

        public AbstractUserClaimStateCreated(UserClaimStateEventId stateEventId) {
            super(stateEventId);
        }

        public String getStateEventType() {
            return StateEventType.CREATED;
        }

    }


/*
    public static abstract class AbstractUserClaimStateMergePatched extends AbstractUserClaimStateEvent implements UserClaimStateMergePatched
    {
        Boolean isPropertyClaimTypeRemoved();

        void setPropertyClaimTypeRemoved(Boolean removed);

        Boolean isPropertyClaimValueRemoved();

        void setPropertyClaimValueRemoved(Boolean removed);

        Boolean isPropertyActiveRemoved();

        void setPropertyActiveRemoved(Boolean removed);


    }
*/

    public static abstract class AbstractUserClaimStateRemoved extends AbstractUserClaimStateEvent implements UserClaimStateRemoved
    {
        public AbstractUserClaimStateRemoved() {
        }

        public AbstractUserClaimStateRemoved(UserClaimStateEventId stateEventId) {
            super(stateEventId);
        }

        public String getStateEventType() {
            return StateEventType.REMOVED;
        }

    }

}

