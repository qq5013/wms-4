package org.dddml.wms.domain;

import java.util.Iterator;
import java.util.Date;
import org.dddml.wms.specialization.Event;

public interface UserRoleMvoStateEvent extends Event
{

    UserRoleMvoStateEventId getStateEventId();

    boolean getStateEventReadOnly();

    void setStateEventReadOnly(boolean readOnly);

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

    

    interface UserRoleMvoStateCreated extends UserRoleMvoStateEvent
    {
    
    }


    interface UserRoleMvoStateMergePatched extends UserRoleMvoStateEvent
    {
        Boolean isPropertyVersionRemoved();

        void setPropertyVersionRemoved(Boolean removed);

        Boolean isPropertyActiveRemoved();

        void setPropertyActiveRemoved(Boolean removed);

        Boolean isPropertyUserUserNameRemoved();

        void setPropertyUserUserNameRemoved(Boolean removed);

        Boolean isPropertyUserAccessFailedCountRemoved();

        void setPropertyUserAccessFailedCountRemoved(Boolean removed);

        Boolean isPropertyUserEmailRemoved();

        void setPropertyUserEmailRemoved(Boolean removed);

        Boolean isPropertyUserEmailConfirmedRemoved();

        void setPropertyUserEmailConfirmedRemoved(Boolean removed);

        Boolean isPropertyUserLockoutEnabledRemoved();

        void setPropertyUserLockoutEnabledRemoved(Boolean removed);

        Boolean isPropertyUserLockoutEndDateUtcRemoved();

        void setPropertyUserLockoutEndDateUtcRemoved(Boolean removed);

        Boolean isPropertyUserPasswordHashRemoved();

        void setPropertyUserPasswordHashRemoved(Boolean removed);

        Boolean isPropertyUserPhoneNumberRemoved();

        void setPropertyUserPhoneNumberRemoved(Boolean removed);

        Boolean isPropertyUserPhoneNumberConfirmedRemoved();

        void setPropertyUserPhoneNumberConfirmedRemoved(Boolean removed);

        Boolean isPropertyUserTwoFactorEnabledRemoved();

        void setPropertyUserTwoFactorEnabledRemoved(Boolean removed);

        Boolean isPropertyUserSecurityStampRemoved();

        void setPropertyUserSecurityStampRemoved(Boolean removed);

        Boolean isPropertyUserCreatedByRemoved();

        void setPropertyUserCreatedByRemoved(Boolean removed);

        Boolean isPropertyUserCreatedAtRemoved();

        void setPropertyUserCreatedAtRemoved(Boolean removed);

        Boolean isPropertyUserUpdatedByRemoved();

        void setPropertyUserUpdatedByRemoved(Boolean removed);

        Boolean isPropertyUserUpdatedAtRemoved();

        void setPropertyUserUpdatedAtRemoved(Boolean removed);

        Boolean isPropertyUserActiveRemoved();

        void setPropertyUserActiveRemoved(Boolean removed);

        Boolean isPropertyUserDeletedRemoved();

        void setPropertyUserDeletedRemoved(Boolean removed);


    }


    interface UserRoleMvoStateDeleted extends UserRoleMvoStateEvent
    {
    }


}

