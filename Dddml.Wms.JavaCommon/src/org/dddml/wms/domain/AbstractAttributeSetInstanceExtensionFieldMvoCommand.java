package org.dddml.wms.domain;

import java.util.*;
import java.util.Date;
import org.dddml.wms.domain.AbstractCommand;

public abstract class AbstractAttributeSetInstanceExtensionFieldMvoCommand extends AbstractCommand implements AttributeSetInstanceExtensionFieldMvoCommand
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

    private Long attrSetInstEFGroupVersion;

    public Long getAttrSetInstEFGroupVersion()
    {
        return this.attrSetInstEFGroupVersion;
    }

    public void setAttrSetInstEFGroupVersion(Long attrSetInstEFGroupVersion)
    {
        this.attrSetInstEFGroupVersion = attrSetInstEFGroupVersion;
    }


    public static abstract class AbstractCreateOrMergePatchAttributeSetInstanceExtensionFieldMvo extends AbstractAttributeSetInstanceExtensionFieldMvoCommand implements CreateOrMergePatchAttributeSetInstanceExtensionFieldMvo
    {
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

    }

    public static abstract class AbstractCreateAttributeSetInstanceExtensionFieldMvo extends AbstractCreateOrMergePatchAttributeSetInstanceExtensionFieldMvo implements CreateAttributeSetInstanceExtensionFieldMvo
    {
        @Override
        public String getCommandType() {
            return COMMAND_TYPE_CREATE;
        }

    }

    public static abstract class AbstractMergePatchAttributeSetInstanceExtensionFieldMvo extends AbstractCreateOrMergePatchAttributeSetInstanceExtensionFieldMvo implements MergePatchAttributeSetInstanceExtensionFieldMvo
    {
        @Override
        public String getCommandType() {
            return COMMAND_TYPE_MERGE_PATCH;
        }

        private Boolean isPropertyNameRemoved;

        public Boolean getIsPropertyNameRemoved()
        {
            return this.isPropertyNameRemoved;
        }

        public void setIsPropertyNameRemoved(Boolean removed)
        {
            this.isPropertyNameRemoved = removed;
        }

        private Boolean isPropertyTypeRemoved;

        public Boolean getIsPropertyTypeRemoved()
        {
            return this.isPropertyTypeRemoved;
        }

        public void setIsPropertyTypeRemoved(Boolean removed)
        {
            this.isPropertyTypeRemoved = removed;
        }

        private Boolean isPropertyLengthRemoved;

        public Boolean getIsPropertyLengthRemoved()
        {
            return this.isPropertyLengthRemoved;
        }

        public void setIsPropertyLengthRemoved(Boolean removed)
        {
            this.isPropertyLengthRemoved = removed;
        }

        private Boolean isPropertyAliasRemoved;

        public Boolean getIsPropertyAliasRemoved()
        {
            return this.isPropertyAliasRemoved;
        }

        public void setIsPropertyAliasRemoved(Boolean removed)
        {
            this.isPropertyAliasRemoved = removed;
        }

        private Boolean isPropertyDescriptionRemoved;

        public Boolean getIsPropertyDescriptionRemoved()
        {
            return this.isPropertyDescriptionRemoved;
        }

        public void setIsPropertyDescriptionRemoved(Boolean removed)
        {
            this.isPropertyDescriptionRemoved = removed;
        }

        private Boolean isPropertyVersionRemoved;

        public Boolean getIsPropertyVersionRemoved()
        {
            return this.isPropertyVersionRemoved;
        }

        public void setIsPropertyVersionRemoved(Boolean removed)
        {
            this.isPropertyVersionRemoved = removed;
        }

        private Boolean isPropertyActiveRemoved;

        public Boolean getIsPropertyActiveRemoved()
        {
            return this.isPropertyActiveRemoved;
        }

        public void setIsPropertyActiveRemoved(Boolean removed)
        {
            this.isPropertyActiveRemoved = removed;
        }

        private Boolean isPropertyAttrSetInstEFGroupFieldTypeRemoved;

        public Boolean getIsPropertyAttrSetInstEFGroupFieldTypeRemoved()
        {
            return this.isPropertyAttrSetInstEFGroupFieldTypeRemoved;
        }

        public void setIsPropertyAttrSetInstEFGroupFieldTypeRemoved(Boolean removed)
        {
            this.isPropertyAttrSetInstEFGroupFieldTypeRemoved = removed;
        }

        private Boolean isPropertyAttrSetInstEFGroupFieldLengthRemoved;

        public Boolean getIsPropertyAttrSetInstEFGroupFieldLengthRemoved()
        {
            return this.isPropertyAttrSetInstEFGroupFieldLengthRemoved;
        }

        public void setIsPropertyAttrSetInstEFGroupFieldLengthRemoved(Boolean removed)
        {
            this.isPropertyAttrSetInstEFGroupFieldLengthRemoved = removed;
        }

        private Boolean isPropertyAttrSetInstEFGroupFieldCountRemoved;

        public Boolean getIsPropertyAttrSetInstEFGroupFieldCountRemoved()
        {
            return this.isPropertyAttrSetInstEFGroupFieldCountRemoved;
        }

        public void setIsPropertyAttrSetInstEFGroupFieldCountRemoved(Boolean removed)
        {
            this.isPropertyAttrSetInstEFGroupFieldCountRemoved = removed;
        }

        private Boolean isPropertyAttrSetInstEFGroupNameFormatRemoved;

        public Boolean getIsPropertyAttrSetInstEFGroupNameFormatRemoved()
        {
            return this.isPropertyAttrSetInstEFGroupNameFormatRemoved;
        }

        public void setIsPropertyAttrSetInstEFGroupNameFormatRemoved(Boolean removed)
        {
            this.isPropertyAttrSetInstEFGroupNameFormatRemoved = removed;
        }

        private Boolean isPropertyAttrSetInstEFGroupDescriptionRemoved;

        public Boolean getIsPropertyAttrSetInstEFGroupDescriptionRemoved()
        {
            return this.isPropertyAttrSetInstEFGroupDescriptionRemoved;
        }

        public void setIsPropertyAttrSetInstEFGroupDescriptionRemoved(Boolean removed)
        {
            this.isPropertyAttrSetInstEFGroupDescriptionRemoved = removed;
        }

        private Boolean isPropertyAttrSetInstEFGroupCreatedByRemoved;

        public Boolean getIsPropertyAttrSetInstEFGroupCreatedByRemoved()
        {
            return this.isPropertyAttrSetInstEFGroupCreatedByRemoved;
        }

        public void setIsPropertyAttrSetInstEFGroupCreatedByRemoved(Boolean removed)
        {
            this.isPropertyAttrSetInstEFGroupCreatedByRemoved = removed;
        }

        private Boolean isPropertyAttrSetInstEFGroupCreatedAtRemoved;

        public Boolean getIsPropertyAttrSetInstEFGroupCreatedAtRemoved()
        {
            return this.isPropertyAttrSetInstEFGroupCreatedAtRemoved;
        }

        public void setIsPropertyAttrSetInstEFGroupCreatedAtRemoved(Boolean removed)
        {
            this.isPropertyAttrSetInstEFGroupCreatedAtRemoved = removed;
        }

        private Boolean isPropertyAttrSetInstEFGroupUpdatedByRemoved;

        public Boolean getIsPropertyAttrSetInstEFGroupUpdatedByRemoved()
        {
            return this.isPropertyAttrSetInstEFGroupUpdatedByRemoved;
        }

        public void setIsPropertyAttrSetInstEFGroupUpdatedByRemoved(Boolean removed)
        {
            this.isPropertyAttrSetInstEFGroupUpdatedByRemoved = removed;
        }

        private Boolean isPropertyAttrSetInstEFGroupUpdatedAtRemoved;

        public Boolean getIsPropertyAttrSetInstEFGroupUpdatedAtRemoved()
        {
            return this.isPropertyAttrSetInstEFGroupUpdatedAtRemoved;
        }

        public void setIsPropertyAttrSetInstEFGroupUpdatedAtRemoved(Boolean removed)
        {
            this.isPropertyAttrSetInstEFGroupUpdatedAtRemoved = removed;
        }

        private Boolean isPropertyAttrSetInstEFGroupActiveRemoved;

        public Boolean getIsPropertyAttrSetInstEFGroupActiveRemoved()
        {
            return this.isPropertyAttrSetInstEFGroupActiveRemoved;
        }

        public void setIsPropertyAttrSetInstEFGroupActiveRemoved(Boolean removed)
        {
            this.isPropertyAttrSetInstEFGroupActiveRemoved = removed;
        }

        private Boolean isPropertyAttrSetInstEFGroupDeletedRemoved;

        public Boolean getIsPropertyAttrSetInstEFGroupDeletedRemoved()
        {
            return this.isPropertyAttrSetInstEFGroupDeletedRemoved;
        }

        public void setIsPropertyAttrSetInstEFGroupDeletedRemoved(Boolean removed)
        {
            this.isPropertyAttrSetInstEFGroupDeletedRemoved = removed;
        }

    }

    public static class SimpleCreateAttributeSetInstanceExtensionFieldMvo extends AbstractCreateAttributeSetInstanceExtensionFieldMvo
    {
    }

    public static class SimpleMergePatchAttributeSetInstanceExtensionFieldMvo extends AbstractMergePatchAttributeSetInstanceExtensionFieldMvo
    {
    }

	public static class SimpleDeleteAttributeSetInstanceExtensionFieldMvo extends AbstractAttributeSetInstanceExtensionFieldMvoCommand implements DeleteAttributeSetInstanceExtensionFieldMvo
	{
        @Override
        public String getCommandType() {
            return COMMAND_TYPE_DELETE;
        }
	}


}

