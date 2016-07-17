package org.dddml.wms.domain;

import org.dddml.wms.domain.AttributeSetInstanceExtensionFieldStateDto;
import java.util.Date;

public class CreateOrMergePatchAttributeSetInstanceExtensionFieldGroupDto extends AbstractAttributeSetInstanceExtensionFieldGroupCommandDto
{
    private String fieldType;

    public String getFieldType()
    {
        return this.fieldType;
    }

    public void setFieldType(String fieldType)
    {
        this.fieldType = fieldType;
    }

    private Integer fieldLength;

    public Integer getFieldLength()
    {
        return this.fieldLength;
    }

    public void setFieldLength(Integer fieldLength)
    {
        this.fieldLength = fieldLength;
    }

    private Integer fieldCount;

    public Integer getFieldCount()
    {
        return this.fieldCount;
    }

    public void setFieldCount(Integer fieldCount)
    {
        this.fieldCount = fieldCount;
    }

    private String nameFormat;

    public String getNameFormat()
    {
        return this.nameFormat;
    }

    public void setNameFormat(String nameFormat)
    {
        this.nameFormat = nameFormat;
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

    private Boolean active;

    public Boolean getActive()
    {
        return this.active;
    }

    public void setActive(Boolean active)
    {
        this.active = active;
    }

    private CreateOrMergePatchAttributeSetInstanceExtensionFieldDto[] fields;

    public CreateOrMergePatchAttributeSetInstanceExtensionFieldDto[] getFields()
    {
        return this.fields;
    }

    public void setFields(CreateOrMergePatchAttributeSetInstanceExtensionFieldDto[] fields)
    {
        this.fields = fields;
    }

    private Boolean isPropertyFieldTypeRemoved;

    public Boolean getIsPropertyFieldTypeRemoved()
    {
        return this.isPropertyFieldTypeRemoved;
    }

    public void setIsPropertyFieldTypeRemoved(Boolean isPropertyFieldTypeRemoved)
    {
        this.isPropertyFieldTypeRemoved = isPropertyFieldTypeRemoved;
    }

    private Boolean isPropertyFieldLengthRemoved;

    public Boolean getIsPropertyFieldLengthRemoved()
    {
        return this.isPropertyFieldLengthRemoved;
    }

    public void setIsPropertyFieldLengthRemoved(Boolean isPropertyFieldLengthRemoved)
    {
        this.isPropertyFieldLengthRemoved = isPropertyFieldLengthRemoved;
    }

    private Boolean isPropertyFieldCountRemoved;

    public Boolean getIsPropertyFieldCountRemoved()
    {
        return this.isPropertyFieldCountRemoved;
    }

    public void setIsPropertyFieldCountRemoved(Boolean isPropertyFieldCountRemoved)
    {
        this.isPropertyFieldCountRemoved = isPropertyFieldCountRemoved;
    }

    private Boolean isPropertyNameFormatRemoved;

    public Boolean getIsPropertyNameFormatRemoved()
    {
        return this.isPropertyNameFormatRemoved;
    }

    public void setIsPropertyNameFormatRemoved(Boolean isPropertyNameFormatRemoved)
    {
        this.isPropertyNameFormatRemoved = isPropertyNameFormatRemoved;
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

    private Boolean isPropertyActiveRemoved;

    public Boolean getIsPropertyActiveRemoved()
    {
        return this.isPropertyActiveRemoved;
    }

    public void setIsPropertyActiveRemoved(Boolean isPropertyActiveRemoved)
    {
        this.isPropertyActiveRemoved = isPropertyActiveRemoved;
    }


}

