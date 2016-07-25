package org.dddml.wms.domain;

import java.util.*;
import java.util.Date;
import org.dddml.wms.domain.AbstractCommand;

public abstract class AbstractAudienceCommand extends AbstractCommand implements AudienceCommand
{
    private String clientId;

    public String getClientId()
    {
        return this.clientId;
    }

    public void setClientId(String clientId)
    {
        this.clientId = clientId;
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


    public static abstract class AbstractCreateOrMergePatchAudience extends AbstractAudienceCommand implements CreateOrMergePatchAudience
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

        private String base64Secret;

        public String getBase64Secret()
        {
            return this.base64Secret;
        }

        public void setBase64Secret(String base64Secret)
        {
            this.base64Secret = base64Secret;
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

    public static abstract class AbstractCreateAudience extends AbstractCreateOrMergePatchAudience implements CreateAudience
    {
        @Override
        public String getCommandType() {
            return COMMAND_TYPE_CREATE;
        }

    }

    public static abstract class AbstractMergePatchAudience extends AbstractCreateOrMergePatchAudience implements MergePatchAudience
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

        private Boolean isPropertyBase64SecretRemoved;

        public Boolean getIsPropertyBase64SecretRemoved()
        {
            return this.isPropertyBase64SecretRemoved;
        }

        public void setIsPropertyBase64SecretRemoved(Boolean removed)
        {
            this.isPropertyBase64SecretRemoved = removed;
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

    public static class SimpleCreateAudience extends AbstractCreateAudience
    {
    }

    public static class SimpleMergePatchAudience extends AbstractMergePatchAudience
    {
    }

	public static class SimpleDeleteAudience extends AbstractAudienceCommand implements DeleteAudience
	{
        @Override
        public String getCommandType() {
            return COMMAND_TYPE_DELETE;
        }
	}


}

