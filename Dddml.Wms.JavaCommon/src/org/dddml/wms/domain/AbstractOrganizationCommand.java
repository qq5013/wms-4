package org.dddml.wms.domain;

import java.util.*;
import java.util.Date;
import org.dddml.wms.domain.AbstractCommand;

public abstract class AbstractOrganizationCommand extends AbstractCommand implements OrganizationCommand
{
    private String organizationId;

    public String getOrganizationId()
    {
        return this.organizationId;
    }

    public void setOrganizationId(String organizationId)
    {
        this.organizationId = organizationId;
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


    public static abstract class AbstractCreateOrMergePatchOrganization extends AbstractOrganizationCommand implements CreateOrMergePatchOrganization
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

        private String description;

        public String getDescription()
        {
            return this.description;
        }

        public void setDescription(String description)
        {
            this.description = description;
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

        private Boolean isSummary;

        public Boolean getIsSummary()
        {
            return this.isSummary;
        }

        public void setIsSummary(Boolean isSummary)
        {
            this.isSummary = isSummary;
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

    public static abstract class AbstractCreateOrganization extends AbstractCreateOrMergePatchOrganization implements CreateOrganization
    {
        @Override
        public String getCommandType() {
            return COMMAND_TYPE_CREATE;
        }

    }

    public static abstract class AbstractMergePatchOrganization extends AbstractCreateOrMergePatchOrganization implements MergePatchOrganization
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

        private Boolean isPropertyDescriptionRemoved;

        public Boolean getIsPropertyDescriptionRemoved()
        {
            return this.isPropertyDescriptionRemoved;
        }

        public void setIsPropertyDescriptionRemoved(Boolean removed)
        {
            this.isPropertyDescriptionRemoved = removed;
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

        private Boolean isPropertyIsSummaryRemoved;

        public Boolean getIsPropertyIsSummaryRemoved()
        {
            return this.isPropertyIsSummaryRemoved;
        }

        public void setIsPropertyIsSummaryRemoved(Boolean removed)
        {
            this.isPropertyIsSummaryRemoved = removed;
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

    public static class SimpleCreateOrganization extends AbstractCreateOrganization
    {
    }

    public static class SimpleMergePatchOrganization extends AbstractMergePatchOrganization
    {
    }

	public static class SimpleDeleteOrganization extends AbstractOrganizationCommand implements DeleteOrganization
	{
        @Override
        public String getCommandType() {
            return COMMAND_TYPE_DELETE;
        }
	}


}

