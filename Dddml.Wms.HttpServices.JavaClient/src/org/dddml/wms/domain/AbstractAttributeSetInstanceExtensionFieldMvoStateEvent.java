package org.dddml.wms.domain;

import java.util.*;
import java.util.Date;
import org.dddml.wms.specialization.*;

public abstract class AbstractAttributeSetInstanceExtensionFieldMvoStateEvent implements AttributeSetInstanceExtensionFieldMvoStateEvent
{
    private AttributeSetInstanceExtensionFieldMvoStateEventId stateEventId;

    public AttributeSetInstanceExtensionFieldMvoStateEventId getStateEventId() {
        return this.stateEventId;
    }

    public void setStateEventId(AttributeSetInstanceExtensionFieldMvoStateEventId stateEventId) {
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

    private String attrSetInstEFGroupFieldType;

    public String getAttrSetInstEFGroupFieldType()
    {
        return this.attrSetInstEFGroupFieldType;
    }

    public void setAttrSetInstEFGroupFieldType(String attrSetInstEFGroupFieldType)
    {
        this.attrSetInstEFGroupFieldType = attrSetInstEFGroupFieldType;
    }

    private Integer attrSetInstEFGroupFieldLength;

    public Integer getAttrSetInstEFGroupFieldLength()
    {
        return this.attrSetInstEFGroupFieldLength;
    }

    public void setAttrSetInstEFGroupFieldLength(Integer attrSetInstEFGroupFieldLength)
    {
        this.attrSetInstEFGroupFieldLength = attrSetInstEFGroupFieldLength;
    }

    private Integer attrSetInstEFGroupFieldCount;

    public Integer getAttrSetInstEFGroupFieldCount()
    {
        return this.attrSetInstEFGroupFieldCount;
    }

    public void setAttrSetInstEFGroupFieldCount(Integer attrSetInstEFGroupFieldCount)
    {
        this.attrSetInstEFGroupFieldCount = attrSetInstEFGroupFieldCount;
    }

    private String attrSetInstEFGroupNameFormat;

    public String getAttrSetInstEFGroupNameFormat()
    {
        return this.attrSetInstEFGroupNameFormat;
    }

    public void setAttrSetInstEFGroupNameFormat(String attrSetInstEFGroupNameFormat)
    {
        this.attrSetInstEFGroupNameFormat = attrSetInstEFGroupNameFormat;
    }

    private String attrSetInstEFGroupDescription;

    public String getAttrSetInstEFGroupDescription()
    {
        return this.attrSetInstEFGroupDescription;
    }

    public void setAttrSetInstEFGroupDescription(String attrSetInstEFGroupDescription)
    {
        this.attrSetInstEFGroupDescription = attrSetInstEFGroupDescription;
    }

    private String attrSetInstEFGroupCreatedBy;

    public String getAttrSetInstEFGroupCreatedBy()
    {
        return this.attrSetInstEFGroupCreatedBy;
    }

    public void setAttrSetInstEFGroupCreatedBy(String attrSetInstEFGroupCreatedBy)
    {
        this.attrSetInstEFGroupCreatedBy = attrSetInstEFGroupCreatedBy;
    }

    private Date attrSetInstEFGroupCreatedAt;

    public Date getAttrSetInstEFGroupCreatedAt()
    {
        return this.attrSetInstEFGroupCreatedAt;
    }

    public void setAttrSetInstEFGroupCreatedAt(Date attrSetInstEFGroupCreatedAt)
    {
        this.attrSetInstEFGroupCreatedAt = attrSetInstEFGroupCreatedAt;
    }

    private String attrSetInstEFGroupUpdatedBy;

    public String getAttrSetInstEFGroupUpdatedBy()
    {
        return this.attrSetInstEFGroupUpdatedBy;
    }

    public void setAttrSetInstEFGroupUpdatedBy(String attrSetInstEFGroupUpdatedBy)
    {
        this.attrSetInstEFGroupUpdatedBy = attrSetInstEFGroupUpdatedBy;
    }

    private Date attrSetInstEFGroupUpdatedAt;

    public Date getAttrSetInstEFGroupUpdatedAt()
    {
        return this.attrSetInstEFGroupUpdatedAt;
    }

    public void setAttrSetInstEFGroupUpdatedAt(Date attrSetInstEFGroupUpdatedAt)
    {
        this.attrSetInstEFGroupUpdatedAt = attrSetInstEFGroupUpdatedAt;
    }

    private Boolean attrSetInstEFGroupActive;

    public Boolean getAttrSetInstEFGroupActive()
    {
        return this.attrSetInstEFGroupActive;
    }

    public void setAttrSetInstEFGroupActive(Boolean attrSetInstEFGroupActive)
    {
        this.attrSetInstEFGroupActive = attrSetInstEFGroupActive;
    }

    private Boolean attrSetInstEFGroupDeleted;

    public Boolean getAttrSetInstEFGroupDeleted()
    {
        return this.attrSetInstEFGroupDeleted;
    }

    public void setAttrSetInstEFGroupDeleted(Boolean attrSetInstEFGroupDeleted)
    {
        this.attrSetInstEFGroupDeleted = attrSetInstEFGroupDeleted;
    }

    protected AbstractAttributeSetInstanceExtensionFieldMvoStateEvent() {
    }

    protected AbstractAttributeSetInstanceExtensionFieldMvoStateEvent(AttributeSetInstanceExtensionFieldMvoStateEventId stateEventId) {
        this.stateEventId = stateEventId;
    }


    public abstract String getStateEventType();


    public static abstract class AbstractAttributeSetInstanceExtensionFieldMvoStateCreated extends AbstractAttributeSetInstanceExtensionFieldMvoStateEvent implements AttributeSetInstanceExtensionFieldMvoStateCreated
    {
        public AbstractAttributeSetInstanceExtensionFieldMvoStateCreated() {
        }

        public AbstractAttributeSetInstanceExtensionFieldMvoStateCreated(AttributeSetInstanceExtensionFieldMvoStateEventId stateEventId) {
            super(stateEventId);
        }

        public String getStateEventType() {
            return StateEventType.CREATED;
        }

    }


/*
    public static abstract class AbstractAttributeSetInstanceExtensionFieldMvoStateMergePatched extends AbstractAttributeSetInstanceExtensionFieldMvoStateEvent implements AttributeSetInstanceExtensionFieldMvoStateMergePatched
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

        Boolean isPropertyVersionRemoved();

        void setPropertyVersionRemoved(Boolean removed);

        Boolean isPropertyActiveRemoved();

        void setPropertyActiveRemoved(Boolean removed);

        Boolean isPropertyAttrSetInstEFGroupFieldTypeRemoved();

        void setPropertyAttrSetInstEFGroupFieldTypeRemoved(Boolean removed);

        Boolean isPropertyAttrSetInstEFGroupFieldLengthRemoved();

        void setPropertyAttrSetInstEFGroupFieldLengthRemoved(Boolean removed);

        Boolean isPropertyAttrSetInstEFGroupFieldCountRemoved();

        void setPropertyAttrSetInstEFGroupFieldCountRemoved(Boolean removed);

        Boolean isPropertyAttrSetInstEFGroupNameFormatRemoved();

        void setPropertyAttrSetInstEFGroupNameFormatRemoved(Boolean removed);

        Boolean isPropertyAttrSetInstEFGroupDescriptionRemoved();

        void setPropertyAttrSetInstEFGroupDescriptionRemoved(Boolean removed);

        Boolean isPropertyAttrSetInstEFGroupCreatedByRemoved();

        void setPropertyAttrSetInstEFGroupCreatedByRemoved(Boolean removed);

        Boolean isPropertyAttrSetInstEFGroupCreatedAtRemoved();

        void setPropertyAttrSetInstEFGroupCreatedAtRemoved(Boolean removed);

        Boolean isPropertyAttrSetInstEFGroupUpdatedByRemoved();

        void setPropertyAttrSetInstEFGroupUpdatedByRemoved(Boolean removed);

        Boolean isPropertyAttrSetInstEFGroupUpdatedAtRemoved();

        void setPropertyAttrSetInstEFGroupUpdatedAtRemoved(Boolean removed);

        Boolean isPropertyAttrSetInstEFGroupActiveRemoved();

        void setPropertyAttrSetInstEFGroupActiveRemoved(Boolean removed);

        Boolean isPropertyAttrSetInstEFGroupDeletedRemoved();

        void setPropertyAttrSetInstEFGroupDeletedRemoved(Boolean removed);


    }
*/

    public static abstract class AbstractAttributeSetInstanceExtensionFieldMvoStateDeleted extends AbstractAttributeSetInstanceExtensionFieldMvoStateEvent implements AttributeSetInstanceExtensionFieldMvoStateDeleted
    {
        public AbstractAttributeSetInstanceExtensionFieldMvoStateDeleted() {
        }

        public AbstractAttributeSetInstanceExtensionFieldMvoStateDeleted(AttributeSetInstanceExtensionFieldMvoStateEventId stateEventId) {
            super(stateEventId);
        }

        public String getStateEventType() {
            return StateEventType.DELETED;
        }

    }

}

