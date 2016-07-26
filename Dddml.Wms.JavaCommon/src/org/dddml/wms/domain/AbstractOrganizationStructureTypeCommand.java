package org.dddml.wms.domain;

import java.util.*;
import java.util.Date;
import org.dddml.wms.domain.AbstractCommand;

public abstract class AbstractOrganizationStructureTypeCommand extends AbstractCommand implements OrganizationStructureTypeCommand
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


    public static abstract class AbstractCreateOrMergePatchOrganizationStructureType extends AbstractOrganizationStructureTypeCommand implements CreateOrMergePatchOrganizationStructureType
    {
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

    public static abstract class AbstractCreateOrganizationStructureType extends AbstractCreateOrMergePatchOrganizationStructureType implements CreateOrganizationStructureType
    {
        @Override
        public String getCommandType() {
            return COMMAND_TYPE_CREATE;
        }

    }

    public static abstract class AbstractMergePatchOrganizationStructureType extends AbstractCreateOrMergePatchOrganizationStructureType implements MergePatchOrganizationStructureType
    {
        @Override
        public String getCommandType() {
            return COMMAND_TYPE_MERGE_PATCH;
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

    public static class SimpleCreateOrganizationStructureType extends AbstractCreateOrganizationStructureType
    {
    }

    public static class SimpleMergePatchOrganizationStructureType extends AbstractMergePatchOrganizationStructureType
    {
    }

	public static class SimpleDeleteOrganizationStructureType extends AbstractOrganizationStructureTypeCommand implements DeleteOrganizationStructureType
	{
        @Override
        public String getCommandType() {
            return COMMAND_TYPE_DELETE;
        }
	}


}

