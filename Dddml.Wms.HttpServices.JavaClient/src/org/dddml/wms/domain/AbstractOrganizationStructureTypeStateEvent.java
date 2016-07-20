package org.dddml.wms.domain;

import java.util.*;
import java.util.Date;
import org.dddml.wms.specialization.*;

public abstract class AbstractOrganizationStructureTypeStateEvent implements OrganizationStructureTypeStateEvent
{
    private OrganizationStructureTypeStateEventId stateEventId;

    public OrganizationStructureTypeStateEventId getStateEventId() {
        return this.stateEventId;
    }

    public void setStateEventId(OrganizationStructureTypeStateEventId stateEventId) {
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

    protected AbstractOrganizationStructureTypeStateEvent() {
    }

    protected AbstractOrganizationStructureTypeStateEvent(OrganizationStructureTypeStateEventId stateEventId) {
        this.stateEventId = stateEventId;
    }


    public abstract String getStateEventType();


    public static abstract class AbstractOrganizationStructureTypeStateCreated extends AbstractOrganizationStructureTypeStateEvent implements OrganizationStructureTypeStateCreated
    {
        public AbstractOrganizationStructureTypeStateCreated() {
        }

        public AbstractOrganizationStructureTypeStateCreated(OrganizationStructureTypeStateEventId stateEventId) {
            super(stateEventId);
        }

        public String getStateEventType() {
            return StateEventType.CREATED;
        }

    }


    public static abstract class AbstractOrganizationStructureTypeStateMergePatched extends AbstractOrganizationStructureTypeStateEvent implements OrganizationStructureTypeStateMergePatched
    {
        public AbstractOrganizationStructureTypeStateMergePatched() {
        }

        public AbstractOrganizationStructureTypeStateMergePatched(OrganizationStructureTypeStateEventId stateEventId) {
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


    public static abstract class AbstractOrganizationStructureTypeStateDeleted extends AbstractOrganizationStructureTypeStateEvent implements OrganizationStructureTypeStateDeleted
    {
        public AbstractOrganizationStructureTypeStateDeleted() {
        }

        public AbstractOrganizationStructureTypeStateDeleted(OrganizationStructureTypeStateEventId stateEventId) {
            super(stateEventId);
        }

        public String getStateEventType() {
            return StateEventType.DELETED;
        }

    }
}

