package org.dddml.wms.domain;

import java.util.*;
import java.util.Date;
import org.dddml.wms.domain.Command;

public interface UserRoleMvoCommand extends Command
{
    UserRoleId getUserRoleId();

    void setUserRoleId(UserRoleId userRoleId);

    Long getUserVersion();

    void setUserVersion(Long userVersion);


    interface CreateOrMergePatchUserRoleMvo extends UserRoleMvoCommand
    {
        Long getVersion();

        void setVersion(Long version);

        Boolean getActive();

        void setActive(Boolean active);

        String getUserUserName();

        void setUserUserName(String userUserName);

        Integer getUserAccessFailedCount();

        void setUserAccessFailedCount(Integer userAccessFailedCount);

        String getUserEmail();

        void setUserEmail(String userEmail);

        Boolean getUserEmailConfirmed();

        void setUserEmailConfirmed(Boolean userEmailConfirmed);

        Boolean getUserLockoutEnabled();

        void setUserLockoutEnabled(Boolean userLockoutEnabled);

        Date getUserLockoutEndDateUtc();

        void setUserLockoutEndDateUtc(Date userLockoutEndDateUtc);

        String getUserPasswordHash();

        void setUserPasswordHash(String userPasswordHash);

        String getUserPhoneNumber();

        void setUserPhoneNumber(String userPhoneNumber);

        Boolean getUserPhoneNumberConfirmed();

        void setUserPhoneNumberConfirmed(Boolean userPhoneNumberConfirmed);

        Boolean getUserTwoFactorEnabled();

        void setUserTwoFactorEnabled(Boolean userTwoFactorEnabled);

        String getUserSecurityStamp();

        void setUserSecurityStamp(String userSecurityStamp);

        String getUserCreatedBy();

        void setUserCreatedBy(String userCreatedBy);

        Date getUserCreatedAt();

        void setUserCreatedAt(Date userCreatedAt);

        String getUserUpdatedBy();

        void setUserUpdatedBy(String userUpdatedBy);

        Date getUserUpdatedAt();

        void setUserUpdatedAt(Date userUpdatedAt);

        Boolean getUserActive();

        void setUserActive(Boolean userActive);

        Boolean getUserDeleted();

        void setUserDeleted(Boolean userDeleted);

    }

    interface CreateUserRoleMvo extends CreateOrMergePatchUserRoleMvo
    {
    }

    interface MergePatchUserRoleMvo extends CreateOrMergePatchUserRoleMvo
    {
        Boolean getIsPropertyVersionRemoved();

        void setIsPropertyVersionRemoved(Boolean removed);

        Boolean getIsPropertyActiveRemoved();

        void setIsPropertyActiveRemoved(Boolean removed);

        Boolean getIsPropertyUserUserNameRemoved();

        void setIsPropertyUserUserNameRemoved(Boolean removed);

        Boolean getIsPropertyUserAccessFailedCountRemoved();

        void setIsPropertyUserAccessFailedCountRemoved(Boolean removed);

        Boolean getIsPropertyUserEmailRemoved();

        void setIsPropertyUserEmailRemoved(Boolean removed);

        Boolean getIsPropertyUserEmailConfirmedRemoved();

        void setIsPropertyUserEmailConfirmedRemoved(Boolean removed);

        Boolean getIsPropertyUserLockoutEnabledRemoved();

        void setIsPropertyUserLockoutEnabledRemoved(Boolean removed);

        Boolean getIsPropertyUserLockoutEndDateUtcRemoved();

        void setIsPropertyUserLockoutEndDateUtcRemoved(Boolean removed);

        Boolean getIsPropertyUserPasswordHashRemoved();

        void setIsPropertyUserPasswordHashRemoved(Boolean removed);

        Boolean getIsPropertyUserPhoneNumberRemoved();

        void setIsPropertyUserPhoneNumberRemoved(Boolean removed);

        Boolean getIsPropertyUserPhoneNumberConfirmedRemoved();

        void setIsPropertyUserPhoneNumberConfirmedRemoved(Boolean removed);

        Boolean getIsPropertyUserTwoFactorEnabledRemoved();

        void setIsPropertyUserTwoFactorEnabledRemoved(Boolean removed);

        Boolean getIsPropertyUserSecurityStampRemoved();

        void setIsPropertyUserSecurityStampRemoved(Boolean removed);

        Boolean getIsPropertyUserCreatedByRemoved();

        void setIsPropertyUserCreatedByRemoved(Boolean removed);

        Boolean getIsPropertyUserCreatedAtRemoved();

        void setIsPropertyUserCreatedAtRemoved(Boolean removed);

        Boolean getIsPropertyUserUpdatedByRemoved();

        void setIsPropertyUserUpdatedByRemoved(Boolean removed);

        Boolean getIsPropertyUserUpdatedAtRemoved();

        void setIsPropertyUserUpdatedAtRemoved(Boolean removed);

        Boolean getIsPropertyUserActiveRemoved();

        void setIsPropertyUserActiveRemoved(Boolean removed);

        Boolean getIsPropertyUserDeletedRemoved();

        void setIsPropertyUserDeletedRemoved(Boolean removed);

    }

	interface DeleteUserRoleMvo extends UserRoleMvoCommand
	{
	}

}

