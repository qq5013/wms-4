package org.dddml.wms.domain;

import java.util.Date;
import org.dddml.wms.specialization.Event;

public interface UserStateEvent extends Event
{

    UserStateEventId getStateEventId();

    boolean getStateEventReadOnly();

    void setStateEventReadOnly(boolean readOnly);

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

    Boolean getActive();

    void setActive(Boolean active);

    

    interface UserStateCreated extends UserStateEvent
    {
        Iterable<UserRoleStateEvent.UserRoleStateCreated> getUserRoleEvents();
        
        void addUserRoleEvent(UserRoleStateEvent.UserRoleStateCreated e);

        UserRoleStateEvent.UserRoleStateCreated newUserRoleStateCreated(String roleId);

        Iterable<UserClaimStateEvent.UserClaimStateCreated> getUserClaimEvents();
        
        void addUserClaimEvent(UserClaimStateEvent.UserClaimStateCreated e);

        UserClaimStateEvent.UserClaimStateCreated newUserClaimStateCreated(Integer claimId);

        Iterable<UserPermissionStateEvent.UserPermissionStateCreated> getUserPermissionEvents();
        
        void addUserPermissionEvent(UserPermissionStateEvent.UserPermissionStateCreated e);

        UserPermissionStateEvent.UserPermissionStateCreated newUserPermissionStateCreated(String permissionId);

        Iterable<UserLoginStateEvent.UserLoginStateCreated> getUserLoginEvents();
        
        void addUserLoginEvent(UserLoginStateEvent.UserLoginStateCreated e);

        UserLoginStateEvent.UserLoginStateCreated newUserLoginStateCreated(LoginKey loginKey);

    
    }


    interface UserStateMergePatched extends UserStateEvent
    {
        Boolean isPropertyUserNameRemoved();

        void setPropertyUserNameRemoved(Boolean removed);

        Boolean isPropertyAccessFailedCountRemoved();

        void setPropertyAccessFailedCountRemoved(Boolean removed);

        Boolean isPropertyEmailRemoved();

        void setPropertyEmailRemoved(Boolean removed);

        Boolean isPropertyEmailConfirmedRemoved();

        void setPropertyEmailConfirmedRemoved(Boolean removed);

        Boolean isPropertyLockoutEnabledRemoved();

        void setPropertyLockoutEnabledRemoved(Boolean removed);

        Boolean isPropertyLockoutEndDateUtcRemoved();

        void setPropertyLockoutEndDateUtcRemoved(Boolean removed);

        Boolean isPropertyPasswordHashRemoved();

        void setPropertyPasswordHashRemoved(Boolean removed);

        Boolean isPropertyPhoneNumberRemoved();

        void setPropertyPhoneNumberRemoved(Boolean removed);

        Boolean isPropertyPhoneNumberConfirmedRemoved();

        void setPropertyPhoneNumberConfirmedRemoved(Boolean removed);

        Boolean isPropertyTwoFactorEnabledRemoved();

        void setPropertyTwoFactorEnabledRemoved(Boolean removed);

        Boolean isPropertySecurityStampRemoved();

        void setPropertySecurityStampRemoved(Boolean removed);

        Boolean isPropertyActiveRemoved();

        void setPropertyActiveRemoved(Boolean removed);

        Iterable<UserRoleStateEvent> getUserRoleEvents();
        
        void addUserRoleEvent(UserRoleStateEvent e);

        UserRoleStateEvent.UserRoleStateCreated newUserRoleStateCreated(String roleId);

        UserRoleStateEvent.UserRoleStateMergePatched newUserRoleStateMergePatched(String roleId);

        UserRoleStateEvent.UserRoleStateRemoved newUserRoleStateRemoved(String roleId);

        Iterable<UserClaimStateEvent> getUserClaimEvents();
        
        void addUserClaimEvent(UserClaimStateEvent e);

        UserClaimStateEvent.UserClaimStateCreated newUserClaimStateCreated(Integer claimId);

        UserClaimStateEvent.UserClaimStateMergePatched newUserClaimStateMergePatched(Integer claimId);

        UserClaimStateEvent.UserClaimStateRemoved newUserClaimStateRemoved(Integer claimId);

        Iterable<UserPermissionStateEvent> getUserPermissionEvents();
        
        void addUserPermissionEvent(UserPermissionStateEvent e);

        UserPermissionStateEvent.UserPermissionStateCreated newUserPermissionStateCreated(String permissionId);

        UserPermissionStateEvent.UserPermissionStateMergePatched newUserPermissionStateMergePatched(String permissionId);

        UserPermissionStateEvent.UserPermissionStateRemoved newUserPermissionStateRemoved(String permissionId);

        Iterable<UserLoginStateEvent> getUserLoginEvents();
        
        void addUserLoginEvent(UserLoginStateEvent e);

        UserLoginStateEvent.UserLoginStateCreated newUserLoginStateCreated(LoginKey loginKey);

        UserLoginStateEvent.UserLoginStateMergePatched newUserLoginStateMergePatched(LoginKey loginKey);

        UserLoginStateEvent.UserLoginStateRemoved newUserLoginStateRemoved(LoginKey loginKey);


    }


    interface UserStateDeleted extends UserStateEvent
    {
        Iterable<UserRoleStateEvent.UserRoleStateRemoved> getUserRoleEvents();
        
        void addUserRoleEvent(UserRoleStateEvent.UserRoleStateRemoved e);
        
        UserRoleStateEvent.UserRoleStateRemoved newUserRoleStateRemoved(String roleId);

        Iterable<UserClaimStateEvent.UserClaimStateRemoved> getUserClaimEvents();
        
        void addUserClaimEvent(UserClaimStateEvent.UserClaimStateRemoved e);
        
        UserClaimStateEvent.UserClaimStateRemoved newUserClaimStateRemoved(Integer claimId);

        Iterable<UserPermissionStateEvent.UserPermissionStateRemoved> getUserPermissionEvents();
        
        void addUserPermissionEvent(UserPermissionStateEvent.UserPermissionStateRemoved e);
        
        UserPermissionStateEvent.UserPermissionStateRemoved newUserPermissionStateRemoved(String permissionId);

        Iterable<UserLoginStateEvent.UserLoginStateRemoved> getUserLoginEvents();
        
        void addUserLoginEvent(UserLoginStateEvent.UserLoginStateRemoved e);
        
        UserLoginStateEvent.UserLoginStateRemoved newUserLoginStateRemoved(LoginKey loginKey);

    }


}

