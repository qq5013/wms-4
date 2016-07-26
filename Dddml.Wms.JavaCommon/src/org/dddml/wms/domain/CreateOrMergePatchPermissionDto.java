package org.dddml.wms.domain;

import java.util.Date;

public class CreateOrMergePatchPermissionDto extends AbstractPermissionCommandDto
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

    private String parentPermissionId;

    public String getParentPermissionId()
    {
        return this.parentPermissionId;
    }

    public void setParentPermissionId(String parentPermissionId)
    {
        this.parentPermissionId = parentPermissionId;
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

    private Boolean isPropertyNameRemoved;

    public Boolean getIsPropertyNameRemoved()
    {
        return this.isPropertyNameRemoved;
    }

    public void setIsPropertyNameRemoved(Boolean removed)
    {
        this.isPropertyNameRemoved = removed;
    }

    private Boolean isPropertyParentPermissionIdRemoved;

    public Boolean getIsPropertyParentPermissionIdRemoved()
    {
        return this.isPropertyParentPermissionIdRemoved;
    }

    public void setIsPropertyParentPermissionIdRemoved(Boolean removed)
    {
        this.isPropertyParentPermissionIdRemoved = removed;
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


    public static class CreatePermissionDto extends CreateOrMergePatchPermissionDto
    {
        @Override
        public String getCommandType() {
            return COMMAND_TYPE_CREATE;
        }

    }

    public static class MergePatchPermissionDto extends CreateOrMergePatchPermissionDto
    {
        @Override
        public String getCommandType() {
            return COMMAND_TYPE_MERGE_PATCH;
        }

    }

}

