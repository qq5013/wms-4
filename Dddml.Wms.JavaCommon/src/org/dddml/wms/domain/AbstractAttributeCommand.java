package org.dddml.wms.domain;

import java.util.*;
import java.util.Date;
import org.dddml.wms.domain.AbstractCommand;

public abstract class AbstractAttributeCommand extends AbstractCommand implements AttributeCommand
{
    private String attributeId;

    public String getAttributeId()
    {
        return this.attributeId;
    }

    public void setAttributeId(String attributeId)
    {
        this.attributeId = attributeId;
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


    public static abstract class AbstractCreateOrMergePatchAttribute extends AbstractAttributeCommand implements CreateOrMergePatchAttribute
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

        public AttributeValueCommand.CreateAttributeValue newCreateAttributeValue()
        {
            AbstractAttributeValueCommand.SimpleCreateAttributeValue c = new AbstractAttributeValueCommand.SimpleCreateAttributeValue();
            c.setAttributeId(this.getAttributeId());

            return c;
        }

        public AttributeValueCommand.MergePatchAttributeValue newMergePatchAttributeValue()
        {
            AbstractAttributeValueCommand.SimpleMergePatchAttributeValue c = new AbstractAttributeValueCommand.SimpleMergePatchAttributeValue();
            c.setAttributeId(this.getAttributeId());

            return c;
        }

        public AttributeValueCommand.RemoveAttributeValue newRemoveAttributeValue()
        {
            AbstractAttributeValueCommand.SimpleRemoveAttributeValue c = new AbstractAttributeValueCommand.SimpleRemoveAttributeValue();
            c.setAttributeId(this.getAttributeId());

            return c;
        }

    }

    public static abstract class AbstractCreateAttribute extends AbstractCreateOrMergePatchAttribute implements CreateAttribute
    {
        @Override
        public String getCommandType() {
            return COMMAND_TYPE_CREATE;
        }

        private CreateAttributeValueCommands attributeValues = new SimpleCreateAttributeValueCommands();

        public CreateAttributeValueCommands getAttributeValues()
        {
            return this.attributeValues;
        }

    }

    public static abstract class AbstractMergePatchAttribute extends AbstractCreateOrMergePatchAttribute implements MergePatchAttribute
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

        private Boolean isPropertyOrganizationIdRemoved;

        public Boolean getIsPropertyOrganizationIdRemoved()
        {
            return this.isPropertyOrganizationIdRemoved;
        }

        public void setIsPropertyOrganizationIdRemoved(Boolean removed)
        {
            this.isPropertyOrganizationIdRemoved = removed;
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

        private Boolean isPropertyIsMandatoryRemoved;

        public Boolean getIsPropertyIsMandatoryRemoved()
        {
            return this.isPropertyIsMandatoryRemoved;
        }

        public void setIsPropertyIsMandatoryRemoved(Boolean removed)
        {
            this.isPropertyIsMandatoryRemoved = removed;
        }

        private Boolean isPropertyIsInstanceAttributeRemoved;

        public Boolean getIsPropertyIsInstanceAttributeRemoved()
        {
            return this.isPropertyIsInstanceAttributeRemoved;
        }

        public void setIsPropertyIsInstanceAttributeRemoved(Boolean removed)
        {
            this.isPropertyIsInstanceAttributeRemoved = removed;
        }

        private Boolean isPropertyAttributeValueTypeRemoved;

        public Boolean getIsPropertyAttributeValueTypeRemoved()
        {
            return this.isPropertyAttributeValueTypeRemoved;
        }

        public void setIsPropertyAttributeValueTypeRemoved(Boolean removed)
        {
            this.isPropertyAttributeValueTypeRemoved = removed;
        }

        private Boolean isPropertyAttributeValueLengthRemoved;

        public Boolean getIsPropertyAttributeValueLengthRemoved()
        {
            return this.isPropertyAttributeValueLengthRemoved;
        }

        public void setIsPropertyAttributeValueLengthRemoved(Boolean removed)
        {
            this.isPropertyAttributeValueLengthRemoved = removed;
        }

        private Boolean isPropertyIsListRemoved;

        public Boolean getIsPropertyIsListRemoved()
        {
            return this.isPropertyIsListRemoved;
        }

        public void setIsPropertyIsListRemoved(Boolean removed)
        {
            this.isPropertyIsListRemoved = removed;
        }

        private Boolean isPropertyFieldNameRemoved;

        public Boolean getIsPropertyFieldNameRemoved()
        {
            return this.isPropertyFieldNameRemoved;
        }

        public void setIsPropertyFieldNameRemoved(Boolean removed)
        {
            this.isPropertyFieldNameRemoved = removed;
        }

        private Boolean isPropertyReferenceIdRemoved;

        public Boolean getIsPropertyReferenceIdRemoved()
        {
            return this.isPropertyReferenceIdRemoved;
        }

        public void setIsPropertyReferenceIdRemoved(Boolean removed)
        {
            this.isPropertyReferenceIdRemoved = removed;
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

        private AttributeValueCommands attributeValueCommands = new SimpleAttributeValueCommands();

        public AttributeValueCommands getAttributeValueCommands()
        {
            return this.attributeValueCommands;
        }

    }

    public static class SimpleCreateAttribute extends AbstractCreateAttribute
    {
    }

    public static class SimpleMergePatchAttribute extends AbstractMergePatchAttribute
    {
    }

	public static class SimpleDeleteAttribute extends AbstractAttributeCommand implements DeleteAttribute
	{
        @Override
        public String getCommandType() {
            return COMMAND_TYPE_DELETE;
        }
	}

    public static class SimpleCreateAttributeValueCommands implements CreateAttributeValueCommands
    {
        private List<AttributeValueCommand.CreateAttributeValue> innerCommands = new ArrayList<AttributeValueCommand.CreateAttributeValue>();

        public void add(AttributeValueCommand.CreateAttributeValue c)
        {
            innerCommands.add(c);
        }

        public void remove(AttributeValueCommand.CreateAttributeValue c)
        {
            innerCommands.remove(c);
        }

        public void clear()
        {
            innerCommands.clear();
        }

        @Override
        public Iterator<AttributeValueCommand.CreateAttributeValue> iterator()
        {
            return innerCommands.iterator();
        }
    }

    public static class SimpleAttributeValueCommands implements AttributeValueCommands
    {
        private List<AttributeValueCommand> innerCommands = new ArrayList<AttributeValueCommand>();

        public void add(AttributeValueCommand c)
        {
            innerCommands.add(c);
        }

        public void remove(AttributeValueCommand c)
        {
            innerCommands.remove(c);
        }

        public void clear()
        {
            innerCommands.clear();
        }

        @Override
        public Iterator<AttributeValueCommand> iterator()
        {
            return innerCommands.iterator();
        }
    }


}

