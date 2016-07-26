package org.dddml.wms.domain;

import java.util.*;
import java.util.Date;
import org.dddml.wms.domain.AbstractCommand;

public abstract class AbstractUserClaimCommand extends AbstractCommand implements UserClaimCommand
{
    private Integer claimId;

    public Integer getClaimId()
    {
        return this.claimId;
    }

    public void setClaimId(Integer claimId)
    {
        this.claimId = claimId;
    }

    private String userId;

    public String getUserId()
    {
        return this.userId;
    }

    public void setUserId(String userId)
    {
        this.userId = userId;
    }


    public static abstract class AbstractCreateOrMergePatchUserClaim extends AbstractUserClaimCommand implements CreateOrMergePatchUserClaim
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

    }

    public static abstract class AbstractCreateUserClaim extends AbstractCreateOrMergePatchUserClaim implements CreateUserClaim
    {
        @Override
        public String getCommandType() {
            return COMMAND_TYPE_CREATE;
        }

    }

    public static abstract class AbstractMergePatchUserClaim extends AbstractCreateOrMergePatchUserClaim implements MergePatchUserClaim
    {
        @Override
        public String getCommandType() {
            return COMMAND_TYPE_MERGE_PATCH;
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

    }

    public static class SimpleCreateUserClaim extends AbstractCreateUserClaim
    {
    }

    public static class SimpleMergePatchUserClaim extends AbstractMergePatchUserClaim
    {
    }

	public static class SimpleRemoveUserClaim extends AbstractUserClaimCommand implements RemoveUserClaim
	{
        @Override
        public String getCommandType() {
            return COMMAND_TYPE_REMOVE;
        }
	}


}

