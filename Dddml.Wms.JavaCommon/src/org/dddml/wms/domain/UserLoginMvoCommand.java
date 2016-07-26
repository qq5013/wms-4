package org.dddml.wms.domain;

import java.util.Date;
import org.dddml.wms.domain.Command;

public interface UserLoginMvoCommand extends Command
{
    UserLoginId getUserLoginId();

    Long getUserVersion();


    interface CreateOrMergePatchUserLoginMvo extends UserLoginMvoCommand
    {
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

    interface CreateUserLoginMvo extends CreateOrMergePatchUserLoginMvo
    {
    }

    interface MergePatchUserLoginMvo extends CreateOrMergePatchUserLoginMvo
    {
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

	interface DeleteUserLoginMvo extends UserLoginMvoCommand
	{
	}

}

