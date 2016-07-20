package org.dddml.wms.domain;

import java.util.*;
import java.util.Date;
import org.dddml.wms.specialization.*;

public abstract class AbstractAttributeSetInstanceExtensionFieldStateEvent implements AttributeSetInstanceExtensionFieldStateEvent
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


/*
    public static abstract class AbstractAttributeSetInstanceExtensionFieldStateMergePatched extends AbstractAttributeSetInstanceExtensionFieldStateEvent implements AttributeSetInstanceExtensionFieldStateMergePatched
    {
        Boolean isPropertyNameRemoved();

        void setPropertyNameRemoved(Boolean removed);

        Boolean isPropertyTypeRemoved();

        void setPropertyTypeRemoved(Boolean removed);

        Boolean isPropertyLengthRemoved();

        void setPropertyLengthRemoved(Boolean removed);

        Boolean isPropertyAliasRemoved();

        void setPropertyAliasRemoved(Boolean removed);

        Boolean isPropertyDescriptionRemoved();

        void setPropertyDescriptionRemoved(Boolean removed);

        Boolean isPropertyActiveRemoved();

        void setPropertyActiveRemoved(Boolean removed);


    }
*/

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

}

