package org.dddml.wms.domain;

import java.util.Date;

public class CreateOrMergePatchAudienceDto extends AbstractAudienceCommandDto
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


    public static class CreateAudienceDto extends CreateOrMergePatchAudienceDto
    {
        @Override
        public String getCommandType() {
            return COMMAND_TYPE_CREATE;
        }

    }

    public static class MergePatchAudienceDto extends CreateOrMergePatchAudienceDto
    {
        @Override
        public String getCommandType() {
            return COMMAND_TYPE_MERGE_PATCH;
        }

    }

}

