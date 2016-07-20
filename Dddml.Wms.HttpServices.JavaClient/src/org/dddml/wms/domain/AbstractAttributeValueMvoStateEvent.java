package org.dddml.wms.domain;

import java.util.*;
import java.util.Date;
import org.dddml.wms.specialization.*;

public abstract class AbstractAttributeValueMvoStateEvent implements AttributeValueMvoStateEvent
{
    private AttributeValueMvoStateEventId stateEventId;

    public AttributeValueMvoStateEventId getStateEventId() {
        return this.stateEventId;
    }

    public void setStateEventId(AttributeValueMvoStateEventId stateEventId) {
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

    private String referenceId;

    public String getReferenceId()
    {
        return this.referenceId;
    }

    public void setReferenceId(String referenceId)
    {
        this.referenceId = referenceId;
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

    private String attributeName;

    public String getAttributeName()
    {
        return this.attributeName;
    }

    public void setAttributeName(String attributeName)
    {
        this.attributeName = attributeName;
    }

    private String attributeOrganizationId;

    public String getAttributeOrganizationId()
    {
        return this.attributeOrganizationId;
    }

    public void setAttributeOrganizationId(String attributeOrganizationId)
    {
        this.attributeOrganizationId = attributeOrganizationId;
    }

    private String attributeDescription;

    public String getAttributeDescription()
    {
        return this.attributeDescription;
    }

    public void setAttributeDescription(String attributeDescription)
    {
        this.attributeDescription = attributeDescription;
    }

    private Boolean attributeIsMandatory;

    public Boolean getAttributeIsMandatory()
    {
        return this.attributeIsMandatory;
    }

    public void setAttributeIsMandatory(Boolean attributeIsMandatory)
    {
        this.attributeIsMandatory = attributeIsMandatory;
    }

    private Boolean attributeIsInstanceAttribute;

    public Boolean getAttributeIsInstanceAttribute()
    {
        return this.attributeIsInstanceAttribute;
    }

    public void setAttributeIsInstanceAttribute(Boolean attributeIsInstanceAttribute)
    {
        this.attributeIsInstanceAttribute = attributeIsInstanceAttribute;
    }

    private String attributeAttributeValueType;

    public String getAttributeAttributeValueType()
    {
        return this.attributeAttributeValueType;
    }

    public void setAttributeAttributeValueType(String attributeAttributeValueType)
    {
        this.attributeAttributeValueType = attributeAttributeValueType;
    }

    private Integer attributeAttributeValueLength;

    public Integer getAttributeAttributeValueLength()
    {
        return this.attributeAttributeValueLength;
    }

    public void setAttributeAttributeValueLength(Integer attributeAttributeValueLength)
    {
        this.attributeAttributeValueLength = attributeAttributeValueLength;
    }

    private Boolean attributeIsList;

    public Boolean getAttributeIsList()
    {
        return this.attributeIsList;
    }

    public void setAttributeIsList(Boolean attributeIsList)
    {
        this.attributeIsList = attributeIsList;
    }

    private String attributeFieldName;

    public String getAttributeFieldName()
    {
        return this.attributeFieldName;
    }

    public void setAttributeFieldName(String attributeFieldName)
    {
        this.attributeFieldName = attributeFieldName;
    }

    private String attributeReferenceId;

    public String getAttributeReferenceId()
    {
        return this.attributeReferenceId;
    }

    public void setAttributeReferenceId(String attributeReferenceId)
    {
        this.attributeReferenceId = attributeReferenceId;
    }

    private String attributeCreatedBy;

    public String getAttributeCreatedBy()
    {
        return this.attributeCreatedBy;
    }

    public void setAttributeCreatedBy(String attributeCreatedBy)
    {
        this.attributeCreatedBy = attributeCreatedBy;
    }

    private Date attributeCreatedAt;

    public Date getAttributeCreatedAt()
    {
        return this.attributeCreatedAt;
    }

    public void setAttributeCreatedAt(Date attributeCreatedAt)
    {
        this.attributeCreatedAt = attributeCreatedAt;
    }

    private String attributeUpdatedBy;

    public String getAttributeUpdatedBy()
    {
        return this.attributeUpdatedBy;
    }

    public void setAttributeUpdatedBy(String attributeUpdatedBy)
    {
        this.attributeUpdatedBy = attributeUpdatedBy;
    }

    private Date attributeUpdatedAt;

    public Date getAttributeUpdatedAt()
    {
        return this.attributeUpdatedAt;
    }

    public void setAttributeUpdatedAt(Date attributeUpdatedAt)
    {
        this.attributeUpdatedAt = attributeUpdatedAt;
    }

    private Boolean attributeActive;

    public Boolean getAttributeActive()
    {
        return this.attributeActive;
    }

    public void setAttributeActive(Boolean attributeActive)
    {
        this.attributeActive = attributeActive;
    }

    private Boolean attributeDeleted;

    public Boolean getAttributeDeleted()
    {
        return this.attributeDeleted;
    }

    public void setAttributeDeleted(Boolean attributeDeleted)
    {
        this.attributeDeleted = attributeDeleted;
    }

    protected AbstractAttributeValueMvoStateEvent() {
    }

    protected AbstractAttributeValueMvoStateEvent(AttributeValueMvoStateEventId stateEventId) {
        this.stateEventId = stateEventId;
    }


    public abstract String getStateEventType();


    public static abstract class AbstractAttributeValueMvoStateCreated extends AbstractAttributeValueMvoStateEvent implements AttributeValueMvoStateCreated
    {
        public AbstractAttributeValueMvoStateCreated() {
        }

        public AbstractAttributeValueMvoStateCreated(AttributeValueMvoStateEventId stateEventId) {
            super(stateEventId);
        }

        public String getStateEventType() {
            return StateEventType.CREATED;
        }

    }


/*
    public static abstract class AbstractAttributeValueMvoStateMergePatched extends AbstractAttributeValueMvoStateEvent implements AttributeValueMvoStateMergePatched
    {
        Boolean isPropertyNameRemoved();

        void setPropertyNameRemoved(Boolean removed);

        Boolean isPropertyDescriptionRemoved();

        void setPropertyDescriptionRemoved(Boolean removed);

        Boolean isPropertyReferenceIdRemoved();

        void setPropertyReferenceIdRemoved(Boolean removed);

        Boolean isPropertyVersionRemoved();

        void setPropertyVersionRemoved(Boolean removed);

        Boolean isPropertyActiveRemoved();

        void setPropertyActiveRemoved(Boolean removed);

        Boolean isPropertyAttributeNameRemoved();

        void setPropertyAttributeNameRemoved(Boolean removed);

        Boolean isPropertyAttributeOrganizationIdRemoved();

        void setPropertyAttributeOrganizationIdRemoved(Boolean removed);

        Boolean isPropertyAttributeDescriptionRemoved();

        void setPropertyAttributeDescriptionRemoved(Boolean removed);

        Boolean isPropertyAttributeIsMandatoryRemoved();

        void setPropertyAttributeIsMandatoryRemoved(Boolean removed);

        Boolean isPropertyAttributeIsInstanceAttributeRemoved();

        void setPropertyAttributeIsInstanceAttributeRemoved(Boolean removed);

        Boolean isPropertyAttributeAttributeValueTypeRemoved();

        void setPropertyAttributeAttributeValueTypeRemoved(Boolean removed);

        Boolean isPropertyAttributeAttributeValueLengthRemoved();

        void setPropertyAttributeAttributeValueLengthRemoved(Boolean removed);

        Boolean isPropertyAttributeIsListRemoved();

        void setPropertyAttributeIsListRemoved(Boolean removed);

        Boolean isPropertyAttributeFieldNameRemoved();

        void setPropertyAttributeFieldNameRemoved(Boolean removed);

        Boolean isPropertyAttributeReferenceIdRemoved();

        void setPropertyAttributeReferenceIdRemoved(Boolean removed);

        Boolean isPropertyAttributeCreatedByRemoved();

        void setPropertyAttributeCreatedByRemoved(Boolean removed);

        Boolean isPropertyAttributeCreatedAtRemoved();

        void setPropertyAttributeCreatedAtRemoved(Boolean removed);

        Boolean isPropertyAttributeUpdatedByRemoved();

        void setPropertyAttributeUpdatedByRemoved(Boolean removed);

        Boolean isPropertyAttributeUpdatedAtRemoved();

        void setPropertyAttributeUpdatedAtRemoved(Boolean removed);

        Boolean isPropertyAttributeActiveRemoved();

        void setPropertyAttributeActiveRemoved(Boolean removed);

        Boolean isPropertyAttributeDeletedRemoved();

        void setPropertyAttributeDeletedRemoved(Boolean removed);


    }
*/

    public static abstract class AbstractAttributeValueMvoStateDeleted extends AbstractAttributeValueMvoStateEvent implements AttributeValueMvoStateDeleted
    {
        public AbstractAttributeValueMvoStateDeleted() {
        }

        public AbstractAttributeValueMvoStateDeleted(AttributeValueMvoStateEventId stateEventId) {
            super(stateEventId);
        }

        public String getStateEventType() {
            return StateEventType.DELETED;
        }

    }

}

