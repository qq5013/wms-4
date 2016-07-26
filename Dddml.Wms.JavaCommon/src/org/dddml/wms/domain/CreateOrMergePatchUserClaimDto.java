package org.dddml.wms.domain;

import java.util.Date;

public class CreateOrMergePatchUserClaimDto extends AbstractUserClaimCommandDto
{
    private String claimType;

    public String getClaimType()
    {
        return this.claimType;
    }

    public void setClaimType(String claimType)
    {
        this.claimType = claimType;
    }

    private String claimValue;

    public String getClaimValue()
    {
        return this.claimValue;
    }

    public void setClaimValue(String claimValue)
    {
        this.claimValue = claimValue;
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

    private Boolean isPropertyClaimTypeRemoved;

    public Boolean getIsPropertyClaimTypeRemoved()
    {
        return this.isPropertyClaimTypeRemoved;
    }

    public void setIsPropertyClaimTypeRemoved(Boolean removed)
    {
        this.isPropertyClaimTypeRemoved = removed;
    }

    private Boolean isPropertyClaimValueRemoved;

    public Boolean getIsPropertyClaimValueRemoved()
    {
        return this.isPropertyClaimValueRemoved;
    }

    public void setIsPropertyClaimValueRemoved(Boolean removed)
    {
        this.isPropertyClaimValueRemoved = removed;
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


    public static class CreateUserClaimDto extends CreateOrMergePatchUserClaimDto
    {
        @Override
        public String getCommandType() {
            return COMMAND_TYPE_CREATE;
        }

    }

    public static class MergePatchUserClaimDto extends CreateOrMergePatchUserClaimDto
    {
        @Override
        public String getCommandType() {
            return COMMAND_TYPE_MERGE_PATCH;
        }

    }

}

