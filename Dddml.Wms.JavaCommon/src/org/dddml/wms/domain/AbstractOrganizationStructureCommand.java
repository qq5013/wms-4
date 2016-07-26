package org.dddml.wms.domain;

import java.util.*;
import java.util.Date;
import org.dddml.wms.domain.AbstractCommand;

public abstract class AbstractOrganizationStructureCommand extends AbstractCommand implements OrganizationStructureCommand
{
    private OrganizationStructureId id;

    public OrganizationStructureId getId()
    {
        return this.id;
    }

    public void setId(OrganizationStructureId id)
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


    public static abstract class AbstractCreateOrMergePatchOrganizationStructure extends AbstractOrganizationStructureCommand implements CreateOrMergePatchOrganizationStructure
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

    public static abstract class AbstractCreateOrganizationStructure extends AbstractCreateOrMergePatchOrganizationStructure implements CreateOrganizationStructure
    {
        @Override
        public String getCommandType() {
            return COMMAND_TYPE_CREATE;
        }

    }

    public static abstract class AbstractMergePatchOrganizationStructure extends AbstractCreateOrMergePatchOrganizationStructure implements MergePatchOrganizationStructure
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

    public static class SimpleCreateOrganizationStructure extends AbstractCreateOrganizationStructure
    {
    }

    public static class SimpleMergePatchOrganizationStructure extends AbstractMergePatchOrganizationStructure
    {
    }

	public static class SimpleDeleteOrganizationStructure extends AbstractOrganizationStructureCommand implements DeleteOrganizationStructure
	{
        @Override
        public String getCommandType() {
            return COMMAND_TYPE_DELETE;
        }
	}


}

