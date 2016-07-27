package org.dddml.wms.domain;

import java.util.*;
import java.util.Date;
import org.dddml.wms.specialization.*;

public abstract class AbstractWarehouseStateEvent extends AbstractStateEvent implements WarehouseStateEvent 
{
    private WarehouseStateEventId stateEventId;

    public WarehouseStateEventId getStateEventId() {
        return this.stateEventId;
    }

    public void setStateEventId(WarehouseStateEventId stateEventId) {
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

    private Boolean isInTransit;

    public Boolean getIsInTransit()
    {
        return this.isInTransit;
    }

    public void setIsInTransit(Boolean isInTransit)
    {
        this.isInTransit = isInTransit;
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

    protected AbstractWarehouseStateEvent() {
    }

    protected AbstractWarehouseStateEvent(WarehouseStateEventId stateEventId) {
        this.stateEventId = stateEventId;
    }


    public abstract String getStateEventType();


    public static abstract class AbstractWarehouseStateCreated extends AbstractWarehouseStateEvent implements WarehouseStateCreated
    {
        public AbstractWarehouseStateCreated() {
        }

        public AbstractWarehouseStateCreated(WarehouseStateEventId stateEventId) {
            super(stateEventId);
        }

        public String getStateEventType() {
            return StateEventType.CREATED;
        }

    }


    public static abstract class AbstractWarehouseStateMergePatched extends AbstractWarehouseStateEvent implements WarehouseStateMergePatched
    {
        public AbstractWarehouseStateMergePatched() {
        }

        public AbstractWarehouseStateMergePatched(WarehouseStateEventId stateEventId) {
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

        private Boolean isPropertyIsInTransitRemoved;

        public Boolean getIsPropertyIsInTransitRemoved() {
            return this.isPropertyIsInTransitRemoved;
        }

        public void setIsPropertyIsInTransitRemoved(Boolean removed) {
            this.isPropertyIsInTransitRemoved = removed;
        }

        private Boolean isPropertyActiveRemoved;

        public Boolean getIsPropertyActiveRemoved() {
            return this.isPropertyActiveRemoved;
        }

        public void setIsPropertyActiveRemoved(Boolean removed) {
            this.isPropertyActiveRemoved = removed;
        }

    }


    public static abstract class AbstractWarehouseStateDeleted extends AbstractWarehouseStateEvent implements WarehouseStateDeleted
    {
        public AbstractWarehouseStateDeleted() {
        }

        public AbstractWarehouseStateDeleted(WarehouseStateEventId stateEventId) {
            super(stateEventId);
        }

        public String getStateEventType() {
            return StateEventType.DELETED;
        }

    }
        public static class SimpleWarehouseStateCreated extends AbstractWarehouseStateCreated
        {
			public SimpleWarehouseStateCreated() {
			}

			public SimpleWarehouseStateCreated(WarehouseStateEventId stateEventId) {
				super(stateEventId);
			}
        }

        public static class SimpleWarehouseStateMergePatched extends AbstractWarehouseStateMergePatched
        {
			public SimpleWarehouseStateMergePatched() {
			}

			public SimpleWarehouseStateMergePatched(WarehouseStateEventId stateEventId) {
				super(stateEventId);
			}
        }

        public static class SimpleWarehouseStateDeleted extends AbstractWarehouseStateDeleted
        {
			public SimpleWarehouseStateDeleted() {
			}

			public SimpleWarehouseStateDeleted(WarehouseStateEventId stateEventId) {
				super(stateEventId);
			}
        }

}

