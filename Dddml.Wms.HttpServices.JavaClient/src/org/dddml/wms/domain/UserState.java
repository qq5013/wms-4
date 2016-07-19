package org.dddml.wms.domain;

import java.util.Set;
import java.util.Date;
import org.dddml.wms.specialization.Event;
import org.dddml.wms.domain.UserStateEvent.*;

public interface UserState
{
    String getUserId();

    void setUserId(String userId);

    String getUserName();

    void setUserName(String userName);

    Integer getAccessFailedCount();

    void setAccessFailedCount(Integer accessFailedCount);

    String getEmail();

    void setEmail(String email);

    Boolean getEmailConfirmed();

    void setEmailConfirmed(Boolean emailConfirmed);

    Boolean getLockoutEnabled();

    void setLockoutEnabled(Boolean lockoutEnabled);

    Date getLockoutEndDateUtc();

    void setLockoutEndDateUtc(Date lockoutEndDateUtc);

    String getPasswordHash();

    void setPasswordHash(String passwordHash);

    String getPhoneNumber();

    void setPhoneNumber(String phoneNumber);

    Boolean getPhoneNumberConfirmed();

    void setPhoneNumberConfirmed(Boolean phoneNumberConfirmed);

    Boolean getTwoFactorEnabled();

    void setTwoFactorEnabled(Boolean twoFactorEnabled);

    String getSecurityStamp();

    void setSecurityStamp(String securityStamp);

    Long getVersion();

    void setVersion(Long version);

    Boolean getActive();

    void setActive(Boolean active);


    boolean isStateUnsaved();

    UserRoleStates getUserRoles();

    UserClaimStates getUserClaims();

    UserPermissionStates getUserPermissions();

    UserLoginStates getUserLogins();


    void when(UserStateCreated e);

    void when(UserStateMergePatched e);

    void when(UserStateDeleted e);

    void mutate(Event e);

    
}

