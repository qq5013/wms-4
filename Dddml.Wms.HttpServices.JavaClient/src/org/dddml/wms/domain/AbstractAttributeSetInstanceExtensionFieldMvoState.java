package org.dddml.wms.domain;

import java.util.Set;
import java.util.Date;
import org.dddml.wms.specialization.Event;
import org.dddml.wms.specialization.DomainError;
import org.dddml.wms.domain.AttributeSetInstanceExtensionFieldMvoStateEvent.*;

public abstract class AbstractAttributeSetInstanceExtensionFieldMvoState implements AttributeSetInstanceExtensionFieldMvoState
{

    private AttributeSetInstanceExtensionFieldId attributeSetInstanceExtensionFieldId;

    public AttributeSetInstanceExtensionFieldId getAttributeSetInstanceExtensionFieldId()
    {
        return this.attributeSetInstanceExtensionFieldId;
    }

    public void setAttributeSetInstanceExtensionFieldId(AttributeSetInstanceExtensionFieldId attributeSetInstanceExtensionFieldId)
    {
        this.attributeSetInstanceExtensionFieldId = attributeSetInstanceExtensionFieldId;
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

    private String updatedBy;

    public String getUpdatedBy()
    {
        return this.updatedBy;
    }

    public void setUpdatedBy(String updatedBy)
    {
        this.updatedBy = updatedBy;
    }

    private Date updatedAt;

    public Date getUpdatedAt()
    {
        return this.updatedAt;
    }

    public void setUpdatedAt(Date updatedAt)
    {
        this.updatedAt = updatedAt;
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

    private Boolean deleted;

    public Boolean getDeleted()
    {
        return this.deleted;
    }

    public void setDeleted(Boolean deleted)
    {
        this.deleted = deleted;
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

    private Long attrSetInstEFGroupVersion;

    public Long getAttrSetInstEFGroupVersion()
    {
        return this.attrSetInstEFGroupVersion;
    }

    public void setAttrSetInstEFGroupVersion(Long attrSetInstEFGroupVersion)
    {
        this.attrSetInstEFGroupVersion = attrSetInstEFGroupVersion;
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

    public boolean isStateUnsaved() 
    {
        return VERSION_ZERO.equals(this.getAttrSetInstEFGroupVersion());
    }


    public AbstractAttributeSetInstanceExtensionFieldMvoState()
    {
        initializeProperties();
    }
    
    protected void initializeProperties() {
    }


    public void mutate(Event e) {
        if (e instanceof AttributeSetInstanceExtensionFieldMvoStateCreated) {
            when((AttributeSetInstanceExtensionFieldMvoStateCreated) e);
        } else if (e instanceof AttributeSetInstanceExtensionFieldMvoStateMergePatched) {
            when((AttributeSetInstanceExtensionFieldMvoStateMergePatched) e);
        } else if (e instanceof AttributeSetInstanceExtensionFieldMvoStateDeleted) {
            when((AttributeSetInstanceExtensionFieldMvoStateDeleted) e);
        }
    }

    public void when(AttributeSetInstanceExtensionFieldMvoStateCreated e)
    {
        throwOnWrongEvent(e);
        this.setName(e.getName());
        this.setType(e.getType());
        this.setLength(e.getLength());
        this.setAlias(e.getAlias());
        this.setDescription(e.getDescription());
        this.setVersion(e.getVersion());
        this.setActive(e.getActive());
        this.setAttrSetInstEFGroupFieldType(e.getAttrSetInstEFGroupFieldType());
        this.setAttrSetInstEFGroupFieldLength(e.getAttrSetInstEFGroupFieldLength());
        this.setAttrSetInstEFGroupFieldCount(e.getAttrSetInstEFGroupFieldCount());
        this.setAttrSetInstEFGroupNameFormat(e.getAttrSetInstEFGroupNameFormat());
        this.setAttrSetInstEFGroupDescription(e.getAttrSetInstEFGroupDescription());
        this.setAttrSetInstEFGroupCreatedBy(e.getAttrSetInstEFGroupCreatedBy());
        this.setAttrSetInstEFGroupCreatedAt(e.getAttrSetInstEFGroupCreatedAt());
        this.setAttrSetInstEFGroupUpdatedBy(e.getAttrSetInstEFGroupUpdatedBy());
        this.setAttrSetInstEFGroupUpdatedAt(e.getAttrSetInstEFGroupUpdatedAt());
        this.setAttrSetInstEFGroupActive(e.getAttrSetInstEFGroupActive());
        this.setAttrSetInstEFGroupDeleted(e.getAttrSetInstEFGroupDeleted());

        this.setDeleted(false);

        this.setCreatedBy(e.getCreatedBy());
        this.setCreatedAt(e.getCreatedAt());

    }

    public void when(AttributeSetInstanceExtensionFieldMvoStateMergePatched e)
    {
        throwOnWrongEvent(e);

        if (e.getName() == null)
        {
            if (e.getIsPropertyNameRemoved() != null && e.getIsPropertyNameRemoved())
            {
                this.setName(null);
            }
        }
        else
        {
            this.setName(e.getName());
        }
        if (e.getType() == null)
        {
            if (e.getIsPropertyTypeRemoved() != null && e.getIsPropertyTypeRemoved())
            {
                this.setType(null);
            }
        }
        else
        {
            this.setType(e.getType());
        }
        if (e.getLength() == null)
        {
            if (e.getIsPropertyLengthRemoved() != null && e.getIsPropertyLengthRemoved())
            {
                this.setLength(null);
            }
        }
        else
        {
            this.setLength(e.getLength());
        }
        if (e.getAlias() == null)
        {
            if (e.getIsPropertyAliasRemoved() != null && e.getIsPropertyAliasRemoved())
            {
                this.setAlias(null);
            }
        }
        else
        {
            this.setAlias(e.getAlias());
        }
        if (e.getDescription() == null)
        {
            if (e.getIsPropertyDescriptionRemoved() != null && e.getIsPropertyDescriptionRemoved())
            {
                this.setDescription(null);
            }
        }
        else
        {
            this.setDescription(e.getDescription());
        }
        if (e.getVersion() == null)
        {
            if (e.getIsPropertyVersionRemoved() != null && e.getIsPropertyVersionRemoved())
            {
                this.setVersion(null);
            }
        }
        else
        {
            this.setVersion(e.getVersion());
        }
        if (e.getActive() == null)
        {
            if (e.getIsPropertyActiveRemoved() != null && e.getIsPropertyActiveRemoved())
            {
                this.setActive(null);
            }
        }
        else
        {
            this.setActive(e.getActive());
        }
        if (e.getAttrSetInstEFGroupFieldType() == null)
        {
            if (e.getIsPropertyAttrSetInstEFGroupFieldTypeRemoved() != null && e.getIsPropertyAttrSetInstEFGroupFieldTypeRemoved())
            {
                this.setAttrSetInstEFGroupFieldType(null);
            }
        }
        else
        {
            this.setAttrSetInstEFGroupFieldType(e.getAttrSetInstEFGroupFieldType());
        }
        if (e.getAttrSetInstEFGroupFieldLength() == null)
        {
            if (e.getIsPropertyAttrSetInstEFGroupFieldLengthRemoved() != null && e.getIsPropertyAttrSetInstEFGroupFieldLengthRemoved())
            {
                this.setAttrSetInstEFGroupFieldLength(null);
            }
        }
        else
        {
            this.setAttrSetInstEFGroupFieldLength(e.getAttrSetInstEFGroupFieldLength());
        }
        if (e.getAttrSetInstEFGroupFieldCount() == null)
        {
            if (e.getIsPropertyAttrSetInstEFGroupFieldCountRemoved() != null && e.getIsPropertyAttrSetInstEFGroupFieldCountRemoved())
            {
                this.setAttrSetInstEFGroupFieldCount(null);
            }
        }
        else
        {
            this.setAttrSetInstEFGroupFieldCount(e.getAttrSetInstEFGroupFieldCount());
        }
        if (e.getAttrSetInstEFGroupNameFormat() == null)
        {
            if (e.getIsPropertyAttrSetInstEFGroupNameFormatRemoved() != null && e.getIsPropertyAttrSetInstEFGroupNameFormatRemoved())
            {
                this.setAttrSetInstEFGroupNameFormat(null);
            }
        }
        else
        {
            this.setAttrSetInstEFGroupNameFormat(e.getAttrSetInstEFGroupNameFormat());
        }
        if (e.getAttrSetInstEFGroupDescription() == null)
        {
            if (e.getIsPropertyAttrSetInstEFGroupDescriptionRemoved() != null && e.getIsPropertyAttrSetInstEFGroupDescriptionRemoved())
            {
                this.setAttrSetInstEFGroupDescription(null);
            }
        }
        else
        {
            this.setAttrSetInstEFGroupDescription(e.getAttrSetInstEFGroupDescription());
        }
        if (e.getAttrSetInstEFGroupCreatedBy() == null)
        {
            if (e.getIsPropertyAttrSetInstEFGroupCreatedByRemoved() != null && e.getIsPropertyAttrSetInstEFGroupCreatedByRemoved())
            {
                this.setAttrSetInstEFGroupCreatedBy(null);
            }
        }
        else
        {
            this.setAttrSetInstEFGroupCreatedBy(e.getAttrSetInstEFGroupCreatedBy());
        }
        if (e.getAttrSetInstEFGroupCreatedAt() == null)
        {
            if (e.getIsPropertyAttrSetInstEFGroupCreatedAtRemoved() != null && e.getIsPropertyAttrSetInstEFGroupCreatedAtRemoved())
            {
                this.setAttrSetInstEFGroupCreatedAt(null);
            }
        }
        else
        {
            this.setAttrSetInstEFGroupCreatedAt(e.getAttrSetInstEFGroupCreatedAt());
        }
        if (e.getAttrSetInstEFGroupUpdatedBy() == null)
        {
            if (e.getIsPropertyAttrSetInstEFGroupUpdatedByRemoved() != null && e.getIsPropertyAttrSetInstEFGroupUpdatedByRemoved())
            {
                this.setAttrSetInstEFGroupUpdatedBy(null);
            }
        }
        else
        {
            this.setAttrSetInstEFGroupUpdatedBy(e.getAttrSetInstEFGroupUpdatedBy());
        }
        if (e.getAttrSetInstEFGroupUpdatedAt() == null)
        {
            if (e.getIsPropertyAttrSetInstEFGroupUpdatedAtRemoved() != null && e.getIsPropertyAttrSetInstEFGroupUpdatedAtRemoved())
            {
                this.setAttrSetInstEFGroupUpdatedAt(null);
            }
        }
        else
        {
            this.setAttrSetInstEFGroupUpdatedAt(e.getAttrSetInstEFGroupUpdatedAt());
        }
        if (e.getAttrSetInstEFGroupActive() == null)
        {
            if (e.getIsPropertyAttrSetInstEFGroupActiveRemoved() != null && e.getIsPropertyAttrSetInstEFGroupActiveRemoved())
            {
                this.setAttrSetInstEFGroupActive(null);
            }
        }
        else
        {
            this.setAttrSetInstEFGroupActive(e.getAttrSetInstEFGroupActive());
        }
        if (e.getAttrSetInstEFGroupDeleted() == null)
        {
            if (e.getIsPropertyAttrSetInstEFGroupDeletedRemoved() != null && e.getIsPropertyAttrSetInstEFGroupDeletedRemoved())
            {
                this.setAttrSetInstEFGroupDeleted(null);
            }
        }
        else
        {
            this.setAttrSetInstEFGroupDeleted(e.getAttrSetInstEFGroupDeleted());
        }

        this.setUpdatedBy(e.getCreatedBy());
        this.setUpdatedAt(e.getCreatedAt());

    }

    public void when(AttributeSetInstanceExtensionFieldMvoStateDeleted e)
    {
        throwOnWrongEvent(e);

        this.setDeleted(true);
        this.setUpdatedBy(e.getCreatedBy());
        this.setUpdatedAt(e.getCreatedAt());

    }

    protected void throwOnWrongEvent(AttributeSetInstanceExtensionFieldMvoStateEvent stateEvent)
    {
        AttributeSetInstanceExtensionFieldId stateEntityId = this.getAttributeSetInstanceExtensionFieldId(); // Aggregate Id
        AttributeSetInstanceExtensionFieldId eventEntityId = stateEvent.getStateEventId().getAttributeSetInstanceExtensionFieldId(); // EntityBase.Aggregate.GetStateEventIdPropertyIdName();
        if (!stateEntityId.equals(eventEntityId))
        {
            throw DomainError.named("mutateWrongEntity", "Entity Id %1$s in state but entity id %2$s in event", stateEntityId, eventEntityId);
        }

        Long stateVersion = this.getAttrSetInstEFGroupVersion();
        Long eventVersion = stateEvent.getStateEventId().getAttrSetInstEFGroupVersion();
        if (!stateVersion.equals(eventVersion))
        {
            throw DomainError.named("concurrencyConflict", "Conflict between state version %1$s and event version %2$s", stateVersion, eventVersion);
        }

    }

    public static class SimpleAttributeSetInstanceExtensionFieldMvoState extends AbstractAttributeSetInstanceExtensionFieldMvoState
    {
    }


}

