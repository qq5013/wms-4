package org.dddml.wms.domain;

import java.util.*;
import java.util.Date;
import org.dddml.wms.domain.Command;

public interface UserClaimCommand extends Command
{
    Integer getClaimId();

    void setClaimId(Integer claimId);

    String getUserId();

    void setUserId(String userId);


    interface CreateOrMergePatchUserClaim extends UserClaimCommand
    {
        String getClaimType();

        void setClaimType(String claimType);

        String getClaimValue();

        void setClaimValue(String claimValue);

        Boolean getActive();

        void setActive(Boolean active);

    }

    interface CreateUserClaim extends CreateOrMergePatchUserClaim
    {
    }

    interface MergePatchUserClaim extends CreateOrMergePatchUserClaim
    {
        Boolean getIsPropertyClaimTypeRemoved();

        void setIsPropertyClaimTypeRemoved(Boolean removed);

        Boolean getIsPropertyClaimValueRemoved();

        void setIsPropertyClaimValueRemoved(Boolean removed);

        Boolean getIsPropertyActiveRemoved();

        void setIsPropertyActiveRemoved(Boolean removed);

    }

	interface RemoveUserClaim extends UserClaimCommand
	{
	}

}

