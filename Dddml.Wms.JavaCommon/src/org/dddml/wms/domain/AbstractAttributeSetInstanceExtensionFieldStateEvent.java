package org.dddml.wms.domain;

import java.util.*;
import java.util.Date;
import org.dddml.wms.specialization.*;

public abstract class AbstractAttributeSetInstanceExtensionFieldStateEvent extends AbstractStateEvent implements AttributeSetInstanceExtensionFieldStateEvent 
{
    private AttributeSetInstanceExtensionFieldStateEventId stateEventId;

    public AttributeSetInstanceExtensionFieldStateEventId getStateEventId() {
        return this.stateEventId;
    }

    public void setStateEventId(AttributeSetInstanceExtensionFieldStateEventId stateEventId) {
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

    private String name;

    public String getName()
    {
        return this.name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    private String type;

    public String getType()
    {
        return this.type;
    }

    public void setType(String type)
    {
        this.type = type;
    }

    private Integer length;

    public Integer getLength()
    {
        return this.length;
    }

    public void setLength(Integer length)
    {
        this.length = length;
    }

    private String alias;

    public String getAlias()
    {
        return this.alias;
    }

    public void setAlias(String alias)
    {
        this.alias = alias;
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

    private String groupId;

    public String getGroupId()
    {
        return this.groupId;
    }

    public void setGroupId(String groupId)
    {
        this.groupId = groupId;
    }


    private String commandId;

    public String getCommandId() {
        return commandId;
    }

    public void setCommandId(String commandId) {
        this.commandId = commandId;
    }

    protected AbstractAttributeSetInstanceExtensionFieldStateEvent() {
    }

    protected AbstractAttributeSetInstanceExtensionFieldStateEvent(AttributeSetInstanceExtensionFieldStateEventId stateEventId) {
        this.stateEventId = stateEventId;
    }


    public abstract String getStateEventType();


    public static abstract class AbstractAttributeSetInstanceExtensionFieldStateCreated extends AbstractAttributeSetInstanceExtensionFieldStateEvent implements AttributeSetInstanceExtensionFieldStateCreated
    {
        public AbstractAttributeSetInstanceExtensionFieldStateCreated() {
        }

        public AbstractAttributeSetInstanceExtensionFieldStateCreated(AttributeSetInstanceExtensionFieldStateEventId stateEventId) {
            super(stateEventId);
        }

        public String getStateEventType() {
            return StateEventType.CREATED;
        }

    }


    public static abstract class AbstractAttributeSetInstanceExtensionFieldStateMergePatched extends AbstractAttributeSetInstanceExtensionFieldStateEvent implements AttributeSetInstanceExtensionFieldStateMergePatched
    {
        public AbstractAttributeSetInstanceExtensionFieldStateMergePatched() {
        }

        public AbstractAttributeSetInstanceExtensionFieldStateMergePatched(AttributeSetInstanceExtensionFieldStateEventId stateEventId) {
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

        private Boolean isPropertyTypeRemoved;

        public Boolean getIsPropertyTypeRemoved() {
            return this.isPropertyTypeRemoved;
        }

        public void setIsPropertyTypeRemoved(Boolean removed) {
            this.isPropertyTypeRemoved = removed;
        }

        private Boolean isPropertyLengthRemoved;

        public Boolean getIsPropertyLengthRemoved() {
            return this.isPropertyLengthRemoved;
        }

        public void setIsPropertyLengthRemoved(Boolean removed) {
            this.isPropertyLengthRemoved = removed;
        }

        private Boolean isPropertyAliasRemoved;

        public Boolean getIsPropertyAliasRemoved() {
            return this.isPropertyAliasRemoved;
        }

        public void setIsPropertyAliasRemoved(Boolean removed) {
            this.isPropertyAliasRemoved = removed;
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


    public static abstract class AbstractAttributeSetInstanceExtensionFieldStateRemoved extends AbstractAttributeSetInstanceExtensionFieldStateEvent implements AttributeSetInstanceExtensionFieldStateRemoved
    {
        public AbstractAttributeSetInstanceExtensionFieldStateRemoved() {
        }

        public AbstractAttributeSetInstanceExtensionFieldStateRemoved(AttributeSetInstanceExtensionFieldStateEventId stateEventId) {
            super(stateEventId);
        }

        public String getStateEventType() {
            return StateEventType.REMOVED;
        }

    }
        public static class SimpleAttributeSetInstanceExtensionFieldStateCreated extends AbstractAttributeSetInstanceExtensionFieldStateCreated
        {
			public SimpleAttributeSetInstanceExtensionFieldStateCreated() {
			}

			public SimpleAttributeSetInstanceExtensionFieldStateCreated(AttributeSetInstanceExtensionFieldStateEventId stateEventId) {
				super(stateEventId);
			}
        }

        public static class SimpleAttributeSetInstanceExtensionFieldStateMergePatched extends AbstractAttributeSetInstanceExtensionFieldStateMergePatched
        {
			public SimpleAttributeSetInstanceExtensionFieldStateMergePatched() {
			}

			public SimpleAttributeSetInstanceExtensionFieldStateMergePatched(AttributeSetInstanceExtensionFieldStateEventId stateEventId) {
				super(stateEventId);
			}
        }

        public static class SimpleAttributeSetInstanceExtensionFieldStateRemoved extends AbstractAttributeSetInstanceExtensionFieldStateRemoved
        {
			public SimpleAttributeSetInstanceExtensionFieldStateRemoved() {
			}

			public SimpleAttributeSetInstanceExtensionFieldStateRemoved(AttributeSetInstanceExtensionFieldStateEventId stateEventId) {
				super(stateEventId);
			}
        }

}

