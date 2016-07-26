package org.dddml.wms.domain;

import java.util.Date;
import org.dddml.wms.domain.Command;

public interface UserClaimCommand extends Command
{
    Integer getClaimId();

    String getUserId();


    interface CreateOrMergePatchUserClaim extends UserClaimCommand
    {
        String getClaimType();

        String getClaimValue();

        Boolean getActive();

    }

    interface CreateUserClaim extends CreateOrMergePatchUserClaim
    {
    }

    interface MergePatchUserClaim extends CreateOrMergePatchUserClaim
    {
        Boolean getIsPropertyClaimTypeRemoved();

        Boolean getIsPropertyClaimValueRemoved();

        Boolean getIsPropertyActiveRemoved();

    }

	interface RemoveUserClaim extends UserClaimCommand
	{
	}

}

