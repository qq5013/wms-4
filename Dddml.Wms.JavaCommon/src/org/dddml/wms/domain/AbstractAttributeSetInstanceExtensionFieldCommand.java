package org.dddml.wms.domain;

import java.util.*;
import java.util.Date;
import org.dddml.wms.domain.AbstractCommand;

public abstract class AbstractAttributeSetInstanceExtensionFieldCommand extends AbstractCommand implements AttributeSetInstanceExtensionFieldCommand
{
    private String index;

    public String getIndex()
    {
        return this.index;
    }

    public void setIndex(String index)
    {
        this.index = index;
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


    public static abstract class AbstractCreateOrMergePatchAttributeSetInstanceExtensionField extends AbstractAttributeSetInstanceExtensionFieldCommand implements CreateOrMergePatchAttributeSetInstanceExtensionField
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

        private Boolean active;

        public Boolean getActive()
        {
            return this.active;
        }

        public void setActive(Boolean active)
        {
            this.active = active;
        }

    }

    public static abstract class AbstractCreateAttributeSetInstanceExtensionField extends AbstractCreateOrMergePatchAttributeSetInstanceExtensionField implements CreateAttributeSetInstanceExtensionField
    {
        @Override
        public String getCommandType() {
            return COMMAND_TYPE_CREATE;
        }

    }

    public static abstract class AbstractMergePatchAttributeSetInstanceExtensionField extends AbstractCreateOrMergePatchAttributeSetInstanceExtensionField implements MergePatchAttributeSetInstanceExtensionField
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

        private Boolean isPropertyActiveRemoved;

        public Boolean getIsPropertyActiveRemoved()
        {
            return this.isPropertyActiveRemoved;
        }

        public void setIsPropertyActiveRemoved(Boolean removed)
        {
            this.isPropertyActiveRemoved = removed;
        }

    }

    public static class SimpleCreateAttributeSetInstanceExtensionField extends AbstractCreateAttributeSetInstanceExtensionField
    {
    }

    public static class SimpleMergePatchAttributeSetInstanceExtensionField extends AbstractMergePatchAttributeSetInstanceExtensionField
    {
    }

	public static class SimpleRemoveAttributeSetInstanceExtensionField extends AbstractAttributeSetInstanceExtensionFieldCommand implements RemoveAttributeSetInstanceExtensionField
	{
        @Override
        public String getCommandType() {
            return COMMAND_TYPE_REMOVE;
        }
	}


}

