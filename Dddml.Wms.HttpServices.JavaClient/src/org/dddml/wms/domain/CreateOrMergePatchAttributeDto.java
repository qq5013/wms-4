package org.dddml.wms.domain;

import java.util.Date;

public class CreateOrMergePatchAttributeDto extends AbstractAttributeCommandDto
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

    private String organizationId;

    public String getOrganizationId()
    {
        return this.organizationId;
    }

    public void setOrganizationId(String organizationId)
    {
        this.organizationId = organizationId;
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

    private Boolean isMandatory;

    public Boolean getIsMandatory()
    {
        return this.isMandatory;
    }

    public void setIsMandatory(Boolean isMandatory)
    {
        this.isMandatory = isMandatory;
    }

    private Boolean isInstanceAttribute;

    public Boolean getIsInstanceAttribute()
    {
        return this.isInstanceAttribute;
    }

    public void setIsInstanceAttribute(Boolean isInstanceAttribute)
    {
        this.isInstanceAttribute = isInstanceAttribute;
    }

    private String attributeValueType;

    public String getAttributeValueType()
    {
        return this.attributeValueType;
    }

    public void setAttributeValueType(String attributeValueType)
    {
        this.attributeValueType = attributeValueType;
    }

    private Integer attributeValueLength;

    public Integer getAttributeValueLength()
    {
        return this.attributeValueLength;
    }

    public void setAttributeValueLength(Integer attributeValueLength)
    {
        this.attributeValueLength = attributeValueLength;
    }

    private Boolean isList;

    public Boolean getIsList()
    {
        return this.isList;
    }

    public void setIsList(Boolean isList)
    {
        this.isList = isList;
    }

    private String fieldName;

    public String getFieldName()
    {
        return this.fieldName;
    }

    public void setFieldName(String fieldName)
    {
        this.fieldName = fieldName;
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

    private Boolean active;

    public Boolean getActive()
    {
        return this.active;
    }

    public void setActive(Boolean active)
    {
        this.active = active;
    }

    private CreateOrMergePatchAttributeValueDto[] attributeValues;

    public CreateOrMergePatchAttributeValueDto[] getAttributeValues()
    {
        return this.attributeValues;
    }

    public void setAttributeValues(CreateOrMergePatchAttributeValueDto[] attributeValues)
    {
        this.attributeValues = attributeValues;
    }

    private Boolean isPropertyNameRemoved;

    public Boolean getIsPropertyNameRemoved()
    {
        return this.isPropertyNameRemoved;
    }

    public void setIsPropertyNameRemoved(Boolean isPropertyNameRemoved)
    {
        this.isPropertyNameRemoved = isPropertyNameRemoved;
    }

    private Boolean isPropertyOrganizationIdRemoved;

    public Boolean getIsPropertyOrganizationIdRemoved()
    {
        return this.isPropertyOrganizationIdRemoved;
    }

    public void setIsPropertyOrganizationIdRemoved(Boolean isPropertyOrganizationIdRemoved)
    {
        this.isPropertyOrganizationIdRemoved = isPropertyOrganizationIdRemoved;
    }

    private Boolean isPropertyDescriptionRemoved;

    public Boolean getIsPropertyDescriptionRemoved()
    {
        return this.isPropertyDescriptionRemoved;
    }

    public void setIsPropertyDescriptionRemoved(Boolean isPropertyDescriptionRemoved)
    {
        this.isPropertyDescriptionRemoved = isPropertyDescriptionRemoved;
    }

    private Boolean isPropertyIsMandatoryRemoved;

    public Boolean getIsPropertyIsMandatoryRemoved()
    {
        return this.isPropertyIsMandatoryRemoved;
    }

    public void setIsPropertyIsMandatoryRemoved(Boolean isPropertyIsMandatoryRemoved)
    {
        this.isPropertyIsMandatoryRemoved = isPropertyIsMandatoryRemoved;
    }

    private Boolean isPropertyIsInstanceAttributeRemoved;

    public Boolean getIsPropertyIsInstanceAttributeRemoved()
    {
        return this.isPropertyIsInstanceAttributeRemoved;
    }

    public void setIsPropertyIsInstanceAttributeRemoved(Boolean isPropertyIsInstanceAttributeRemoved)
    {
        this.isPropertyIsInstanceAttributeRemoved = isPropertyIsInstanceAttributeRemoved;
    }

    private Boolean isPropertyAttributeValueTypeRemoved;

    public Boolean getIsPropertyAttributeValueTypeRemoved()
    {
        return this.isPropertyAttributeValueTypeRemoved;
    }

    public void setIsPropertyAttributeValueTypeRemoved(Boolean isPropertyAttributeValueTypeRemoved)
    {
        this.isPropertyAttributeValueTypeRemoved = isPropertyAttributeValueTypeRemoved;
    }

    private Boolean isPropertyAttributeValueLengthRemoved;

    public Boolean getIsPropertyAttributeValueLengthRemoved()
    {
        return this.isPropertyAttributeValueLengthRemoved;
    }

    public void setIsPropertyAttributeValueLengthRemoved(Boolean isPropertyAttributeValueLengthRemoved)
    {
        this.isPropertyAttributeValueLengthRemoved = isPropertyAttributeValueLengthRemoved;
    }

    private Boolean isPropertyIsListRemoved;

    public Boolean getIsPropertyIsListRemoved()
    {
        return this.isPropertyIsListRemoved;
    }

    public void setIsPropertyIsListRemoved(Boolean isPropertyIsListRemoved)
    {
        this.isPropertyIsListRemoved = isPropertyIsListRemoved;
    }

    private Boolean isPropertyFieldNameRemoved;

    public Boolean getIsPropertyFieldNameRemoved()
    {
        return this.isPropertyFieldNameRemoved;
    }

    public void setIsPropertyFieldNameRemoved(Boolean isPropertyFieldNameRemoved)
    {
        this.isPropertyFieldNameRemoved = isPropertyFieldNameRemoved;
    }

    private Boolean isPropertyReferenceIdRemoved;

    public Boolean getIsPropertyReferenceIdRemoved()
    {
        return this.isPropertyReferenceIdRemoved;
    }

    public void setIsPropertyReferenceIdRemoved(Boolean isPropertyReferenceIdRemoved)
    {
        this.isPropertyReferenceIdRemoved = isPropertyReferenceIdRemoved;
    }

    private Boolean isPropertyActiveRemoved;

    public Boolean getIsPropertyActiveRemoved()
    {
        return this.isPropertyActiveRemoved;
    }

    public void setIsPropertyActiveRemoved(Boolean isPropertyActiveRemoved)
    {
        this.isPropertyActiveRemoved = isPropertyActiveRemoved;
    }


    public static class CreateAttributeDto extends CreateOrMergePatchAttributeDto
    {
        @Override
        public String getCommandType() {
            return AbstractCommandDto.COMMAND_TYPE_CREATE;
        }

    }

    public static class MergePatchAttributeDto extends CreateOrMergePatchAttributeDto
    {
        @Override
        public String getCommandType() {
            return AbstractCommandDto.COMMAND_TYPE_MERGE_PATCH;
        }

    }

}

