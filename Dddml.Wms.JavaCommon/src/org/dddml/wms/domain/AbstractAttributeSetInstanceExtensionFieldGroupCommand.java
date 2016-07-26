package org.dddml.wms.domain;

import java.util.*;
import java.util.Date;
import org.dddml.wms.domain.AbstractCommand;

public abstract class AbstractAttributeSetInstanceExtensionFieldGroupCommand extends AbstractCommand implements AttributeSetInstanceExtensionFieldGroupCommand
{
    private String id;

    public String getId()
    {
        return this.id;
    }

    public void setId(String id)
    {
        this.id = id;
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


    public static abstract class AbstractCreateOrMergePatchAttributeSetInstanceExtensionFieldGroup extends AbstractAttributeSetInstanceExtensionFieldGroupCommand implements CreateOrMergePatchAttributeSetInstanceExtensionFieldGroup
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

        public AttributeSetInstanceExtensionFieldCommand.CreateAttributeSetInstanceExtensionField newCreateAttributeSetInstanceExtensionField()
        {
            AbstractAttributeSetInstanceExtensionFieldCommand.SimpleCreateAttributeSetInstanceExtensionField c = new AbstractAttributeSetInstanceExtensionFieldCommand.SimpleCreateAttributeSetInstanceExtensionField();
            c.setGroupId(this.getId());

            return c;
        }

        public AttributeSetInstanceExtensionFieldCommand.MergePatchAttributeSetInstanceExtensionField newMergePatchAttributeSetInstanceExtensionField()
        {
            AbstractAttributeSetInstanceExtensionFieldCommand.SimpleMergePatchAttributeSetInstanceExtensionField c = new AbstractAttributeSetInstanceExtensionFieldCommand.SimpleMergePatchAttributeSetInstanceExtensionField();
            c.setGroupId(this.getId());

            return c;
        }

        public AttributeSetInstanceExtensionFieldCommand.RemoveAttributeSetInstanceExtensionField newRemoveAttributeSetInstanceExtensionField()
        {
            AbstractAttributeSetInstanceExtensionFieldCommand.SimpleRemoveAttributeSetInstanceExtensionField c = new AbstractAttributeSetInstanceExtensionFieldCommand.SimpleRemoveAttributeSetInstanceExtensionField();
            c.setGroupId(this.getId());

            return c;
        }

    }

    public static abstract class AbstractCreateAttributeSetInstanceExtensionFieldGroup extends AbstractCreateOrMergePatchAttributeSetInstanceExtensionFieldGroup implements CreateAttributeSetInstanceExtensionFieldGroup
    {
        @Override
        public String getCommandType() {
            return COMMAND_TYPE_CREATE;
        }

        private CreateAttributeSetInstanceExtensionFieldCommands fields = new SimpleCreateAttributeSetInstanceExtensionFieldCommands();

        public CreateAttributeSetInstanceExtensionFieldCommands getFields()
        {
            return this.fields;
        }

    }

    public static abstract class AbstractMergePatchAttributeSetInstanceExtensionFieldGroup extends AbstractCreateOrMergePatchAttributeSetInstanceExtensionFieldGroup implements MergePatchAttributeSetInstanceExtensionFieldGroup
    {
        @Override
        public String getCommandType() {
            return COMMAND_TYPE_MERGE_PATCH;
        }

        private Boolean isPropertyFieldTypeRemoved;

        public Boolean getIsPropertyFieldTypeRemoved()
        {
            return this.isPropertyFieldTypeRemoved;
        }

        public void setIsPropertyFieldTypeRemoved(Boolean removed)
        {
            this.isPropertyFieldTypeRemoved = removed;
        }

        private Boolean isPropertyFieldLengthRemoved;

        public Boolean getIsPropertyFieldLengthRemoved()
        {
            return this.isPropertyFieldLengthRemoved;
        }

        public void setIsPropertyFieldLengthRemoved(Boolean removed)
        {
            this.isPropertyFieldLengthRemoved = removed;
        }

        private Boolean isPropertyFieldCountRemoved;

        public Boolean getIsPropertyFieldCountRemoved()
        {
            return this.isPropertyFieldCountRemoved;
        }

        public void setIsPropertyFieldCountRemoved(Boolean removed)
        {
            this.isPropertyFieldCountRemoved = removed;
        }

        private Boolean isPropertyNameFormatRemoved;

        public Boolean getIsPropertyNameFormatRemoved()
        {
            return this.isPropertyNameFormatRemoved;
        }

        public void setIsPropertyNameFormatRemoved(Boolean removed)
        {
            this.isPropertyNameFormatRemoved = removed;
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

        private Boolean isPropertyActiveRemoved;

        public Boolean getIsPropertyActiveRemoved()
        {
            return this.isPropertyActiveRemoved;
        }

        public void setIsPropertyActiveRemoved(Boolean removed)
        {
            this.isPropertyActiveRemoved = removed;
        }

        private AttributeSetInstanceExtensionFieldCommands attributeSetInstanceExtensionFieldCommands = new SimpleAttributeSetInstanceExtensionFieldCommands();

        public AttributeSetInstanceExtensionFieldCommands getAttributeSetInstanceExtensionFieldCommands()
        {
            return this.attributeSetInstanceExtensionFieldCommands;
        }

    }

    public static class SimpleCreateAttributeSetInstanceExtensionFieldGroup extends AbstractCreateAttributeSetInstanceExtensionFieldGroup
    {
    }

    public static class SimpleMergePatchAttributeSetInstanceExtensionFieldGroup extends AbstractMergePatchAttributeSetInstanceExtensionFieldGroup
    {
    }

	public static class SimpleDeleteAttributeSetInstanceExtensionFieldGroup extends AbstractAttributeSetInstanceExtensionFieldGroupCommand implements DeleteAttributeSetInstanceExtensionFieldGroup
	{
        @Override
        public String getCommandType() {
            return COMMAND_TYPE_DELETE;
        }
	}

    public static class SimpleCreateAttributeSetInstanceExtensionFieldCommands implements CreateAttributeSetInstanceExtensionFieldCommands
    {
        private List<AttributeSetInstanceExtensionFieldCommand.CreateAttributeSetInstanceExtensionField> innerCommands = new ArrayList<AttributeSetInstanceExtensionFieldCommand.CreateAttributeSetInstanceExtensionField>();

        public void add(AttributeSetInstanceExtensionFieldCommand.CreateAttributeSetInstanceExtensionField c)
        {
            innerCommands.add(c);
        }

        public void remove(AttributeSetInstanceExtensionFieldCommand.CreateAttributeSetInstanceExtensionField c)
        {
            innerCommands.remove(c);
        }

        public void clear()
        {
            innerCommands.clear();
        }

        @Override
        public Iterator<AttributeSetInstanceExtensionFieldCommand.CreateAttributeSetInstanceExtensionField> iterator()
        {
            return innerCommands.iterator();
        }
    }

    public static class SimpleAttributeSetInstanceExtensionFieldCommands implements AttributeSetInstanceExtensionFieldCommands
    {
        private List<AttributeSetInstanceExtensionFieldCommand> innerCommands = new ArrayList<AttributeSetInstanceExtensionFieldCommand>();

        public void add(AttributeSetInstanceExtensionFieldCommand c)
        {
            innerCommands.add(c);
        }

        public void remove(AttributeSetInstanceExtensionFieldCommand c)
        {
            innerCommands.remove(c);
        }

        public void clear()
        {
            innerCommands.clear();
        }

        @Override
        public Iterator<AttributeSetInstanceExtensionFieldCommand> iterator()
        {
            return innerCommands.iterator();
        }
    }


}

