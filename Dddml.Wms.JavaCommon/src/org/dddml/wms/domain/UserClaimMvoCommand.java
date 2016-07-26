package org.dddml.wms.domain;

import java.util.Date;
import org.dddml.wms.domain.Command;

public interface UserClaimMvoCommand extends Command
{
    UserClaimId getUserClaimId();

    Long getUserVersion();


    interface CreateOrMergePatchUserClaimMvo extends UserClaimMvoCommand
    {
        String getClaimType();

        String getClaimValue();

        Long getVersion();

        Boolean getActive();

        String getUserUserName();

        Integer getUserAccessFailedCount();

        String getUserEmail();

        Boolean getUserEmailConfirmed();

        Boolean getUserLockoutEnabled();

        Date getUserLockoutEndDateUtc();

        String getUserPasswordHash();

        String getUserPhoneNumber();

        Boolean getUserPhoneNumberConfirmed();

        Boolean getUserTwoFactorEnabled();

        String getUserSecurityStamp();

        String getUserCreatedBy();

        Date getUserCreatedAt();

        String getUserUpdatedBy();

        Date getUserUpdatedAt();

        Boolean getUserActive();

        Boolean getUserDeleted();

    }

    interface CreateUserClaimMvo extends CreateOrMergePatchUserClaimMvo
    {
    }

    interface MergePatchUserClaimMvo extends CreateOrMergePatchUserClaimMvo
    {
        Boolean getIsPropertyClaimTypeRemoved();

        Boolean getIsPropertyClaimValueRemoved();

        Boolean getIsPropertyVersionRemoved();

        Boolean getIsPropertyActiveRemoved();

        Boolean getIsPropertyUserUserNameRemoved();

        Boolean getIsPropertyUserAccessFailedCountRemoved();

        Boolean getIsPropertyUserEmailRemoved();

        Boolean getIsPropertyUserEmailConfirmedRemoved();

        Boolean getIsPropertyUserLockoutEnabledRemoved();

        Boolean getIsPropertyUserLockoutEndDateUtcRemoved();

        Boolean getIsPropertyUserPasswordHashRemoved();

        Boolean getIsPropertyUserPhoneNumberRemoved();

        Boolean getIsPropertyUserPhoneNumberConfirmedRemoved();

        Boolean getIsPropertyUserTwoFactorEnabledRemoved();

        Boolean getIsPropertyUserSecurityStampRemoved();

        Boolean getIsPropertyUserCreatedByRemoved();

        Boolean getIsPropertyUserCreatedAtRemoved();

        Boolean getIsPropertyUserUpdatedByRemoved();

        Boolean getIsPropertyUserUpdatedAtRemoved();

        Boolean getIsPropertyUserActiveRemoved();

        Boolean getIsPropertyUserDeletedRemoved();

    }

	interface DeleteUserClaimMvo extends UserClaimMvoCommand
	{
	}

}

