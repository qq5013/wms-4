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


    public static abstract class AbstractPermissionStateMergePatched extends AbstractPermissionStateEvent implements PermissionStateMergePatched
    {
        public AbstractPermissionStateMergePatched() {
        }

        public AbstractPermissionStateMergePatched(PermissionStateEventId stateEventId) {
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

        private Boolean isPropertyParentPermissionIdRemoved;

        public Boolean getIsPropertyParentPermissionIdRemoved() {
            return this.isPropertyParentPermissionIdRemoved;
        }

        public void setIsPropertyParentPermissionIdRemoved(Boolean removed) {
            this.isPropertyParentPermissionIdRemoved = removed;
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
        public static class SimplePermissionStateCreated extends AbstractPermissionStateCreated
        {
			public SimplePermissionStateCreated() {
			}

			public SimplePermissionStateCreated(PermissionStateEventId stateEventId) {
				super(stateEventId);
			}
        }

        public static class SimplePermissionStateMergePatched extends AbstractPermissionStateMergePatched
        {
			public SimplePermissionStateMergePatched() {
			}

			public SimplePermissionStateMergePatched(PermissionStateEventId stateEventId) {
				super(stateEventId);
			}
        }

        public static class SimplePermissionStateDeleted extends AbstractPermissionStateDeleted
        {
			public SimplePermissionStateDeleted() {
			}

			public SimplePermissionStateDeleted(PermissionStateEventId stateEventId) {
				super(stateEventId);
			}
        }

}

