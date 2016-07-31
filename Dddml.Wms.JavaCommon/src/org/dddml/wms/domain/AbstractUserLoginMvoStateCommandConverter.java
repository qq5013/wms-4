package org.dddml.wms.domain;

import java.util.*;
import java.util.Date;

public abstract class AbstractUserLoginMvoStateCommandConverter<TCreateUserLoginMvo extends UserLoginMvoCommand.CreateUserLoginMvo, TMergePatchUserLoginMvo extends UserLoginMvoCommand.MergePatchUserLoginMvo, TDeleteUserLoginMvo extends UserLoginMvoCommand.DeleteUserLoginMvo>
{
    public UserLoginMvoCommand toCreateOrMergePatchUserLoginMvo(UserLoginMvoState state)
    {
        //where TCreateUserLoginMvo : ICreateUserLoginMvo, new()
        //where TMergePatchUserLoginMvo : IMergePatchUserLoginMvo, new()
        boolean bUnsaved = state.isStateUnsaved();
        if (bUnsaved)
        {
            return toCreateUserLoginMvo(state);
        }
        else 
        {
            return toMergePatchUserLoginMvo(state);
        }
    }

    public TDeleteUserLoginMvo toDeleteUserLoginMvo(UserLoginMvoState state) //where TDeleteUserLoginMvo : IDeleteUserLoginMvo, new()
    {
        TDeleteUserLoginMvo cmd = newDeleteUserLoginMvo();
        cmd.setUserLoginId(state.getUserLoginId());
        cmd.setUserVersion(state.getUserVersion());

        return cmd;
    }

    public TMergePatchUserLoginMvo toMergePatchUserLoginMvo(UserLoginMvoState state) //where TMergePatchUserLoginMvo : IMergePatchUserLoginMvo, new()
    {
        TMergePatchUserLoginMvo cmd = newMergePatchUserLoginMvo();

        cmd.setUserVersion(state.getUserVersion());

        cmd.setUserLoginId(state.getUserLoginId());
        cmd.setVersion(state.getVersion());
        cmd.setActive(state.getActive());
        cmd.setUserUserName(state.getUserUserName());
        cmd.setUserAccessFailedCount(state.getUserAccessFailedCount());
        cmd.setUserEmail(state.getUserEmail());
        cmd.setUserEmailConfirmed(state.getUserEmailConfirmed());
        cmd.setUserLockoutEnabled(state.getUserLockoutEnabled());
        cmd.setUserLockoutEndDateUtc(state.getUserLockoutEndDateUtc());
        cmd.setUserPasswordHash(state.getUserPasswordHash());
        cmd.setUserPhoneNumber(state.getUserPhoneNumber());
        cmd.setUserPhoneNumberConfirmed(state.getUserPhoneNumberConfirmed());
        cmd.setUserTwoFactorEnabled(state.getUserTwoFactorEnabled());
        cmd.setUserSecurityStamp(state.getUserSecurityStamp());
        cmd.setUserCreatedBy(state.getUserCreatedBy());
        cmd.setUserCreatedAt(state.getUserCreatedAt());
        cmd.setUserUpdatedBy(state.getUserUpdatedBy());
        cmd.setUserUpdatedAt(state.getUserUpdatedAt());
        cmd.setUserActive(state.getUserActive());
        cmd.setUserDeleted(state.getUserDeleted());
            
        if (state.getVersion() == null) { cmd.setIsPropertyVersionRemoved(true); }
        if (state.getActive() == null) { cmd.setIsPropertyActiveRemoved(true); }
        if (state.getUserUserName() == null) { cmd.setIsPropertyUserUserNameRemoved(true); }
        if (state.getUserAccessFailedCount() == null) { cmd.setIsPropertyUserAccessFailedCountRemoved(true); }
        if (state.getUserEmail() == null) { cmd.setIsPropertyUserEmailRemoved(true); }
        if (state.getUserEmailConfirmed() == null) { cmd.setIsPropertyUserEmailConfirmedRemoved(true); }
        if (state.getUserLockoutEnabled() == null) { cmd.setIsPropertyUserLockoutEnabledRemoved(true); }
        if (state.getUserLockoutEndDateUtc() == null) { cmd.setIsPropertyUserLockoutEndDateUtcRemoved(true); }
        if (state.getUserPasswordHash() == null) { cmd.setIsPropertyUserPasswordHashRemoved(true); }
        if (state.getUserPhoneNumber() == null) { cmd.setIsPropertyUserPhoneNumberRemoved(true); }
        if (state.getUserPhoneNumberConfirmed() == null) { cmd.setIsPropertyUserPhoneNumberConfirmedRemoved(true); }
        if (state.getUserTwoFactorEnabled() == null) { cmd.setIsPropertyUserTwoFactorEnabledRemoved(true); }
        if (state.getUserSecurityStamp() == null) { cmd.setIsPropertyUserSecurityStampRemoved(true); }
        if (state.getUserCreatedBy() == null) { cmd.setIsPropertyUserCreatedByRemoved(true); }
        if (state.getUserCreatedAt() == null) { cmd.setIsPropertyUserCreatedAtRemoved(true); }
        if (state.getUserUpdatedBy() == null) { cmd.setIsPropertyUserUpdatedByRemoved(true); }
        if (state.getUserUpdatedAt() == null) { cmd.setIsPropertyUserUpdatedAtRemoved(true); }
        if (state.getUserActive() == null) { cmd.setIsPropertyUserActiveRemoved(true); }
        if (state.getUserDeleted() == null) { cmd.setIsPropertyUserDeletedRemoved(true); }
        return cmd;
    }

    public TCreateUserLoginMvo toCreateUserLoginMvo(UserLoginMvoState state) //where TCreateUserLoginMvo : ICreateUserLoginMvo, new()
    {
        TCreateUserLoginMvo cmd = newCreateUserLoginMvo();

        cmd.setUserVersion(state.getUserVersion());
        cmd.setUserLoginId(state.getUserLoginId());
        cmd.setVersion(state.getVersion());
        cmd.setActive(state.getActive());
        cmd.setUserUserName(state.getUserUserName());
        cmd.setUserAccessFailedCount(state.getUserAccessFailedCount());
        cmd.setUserEmail(state.getUserEmail());
        cmd.setUserEmailConfirmed(state.getUserEmailConfirmed());
        cmd.setUserLockoutEnabled(state.getUserLockoutEnabled());
        cmd.setUserLockoutEndDateUtc(state.getUserLockoutEndDateUtc());
        cmd.setUserPasswordHash(state.getUserPasswordHash());
        cmd.setUserPhoneNumber(state.getUserPhoneNumber());
        cmd.setUserPhoneNumberConfirmed(state.getUserPhoneNumberConfirmed());
        cmd.setUserTwoFactorEnabled(state.getUserTwoFactorEnabled());
        cmd.setUserSecurityStamp(state.getUserSecurityStamp());
        cmd.setUserCreatedBy(state.getUserCreatedBy());
        cmd.setUserCreatedAt(state.getUserCreatedAt());
        cmd.setUserUpdatedBy(state.getUserUpdatedBy());
        cmd.setUserUpdatedAt(state.getUserUpdatedAt());
        cmd.setUserActive(state.getUserActive());
        cmd.setUserDeleted(state.getUserDeleted());
        return cmd;
    }

    protected abstract TCreateUserLoginMvo newCreateUserLoginMvo();

    protected abstract TMergePatchUserLoginMvo newMergePatchUserLoginMvo(); 

    protected abstract TDeleteUserLoginMvo newDeleteUserLoginMvo();

    public static class SimpleUserLoginMvoStateCommandConverter extends AbstractUserLoginMvoStateCommandConverter<AbstractUserLoginMvoCommand.SimpleCreateUserLoginMvo, AbstractUserLoginMvoCommand.SimpleMergePatchUserLoginMvo, AbstractUserLoginMvoCommand.SimpleDeleteUserLoginMvo>
    {
        @Override
        protected AbstractUserLoginMvoCommand.SimpleCreateUserLoginMvo newCreateUserLoginMvo() {
            return new AbstractUserLoginMvoCommand.SimpleCreateUserLoginMvo();
        }

        @Override
        protected AbstractUserLoginMvoCommand.SimpleMergePatchUserLoginMvo newMergePatchUserLoginMvo() {
            return new AbstractUserLoginMvoCommand.SimpleMergePatchUserLoginMvo();
        }

        @Override
        protected AbstractUserLoginMvoCommand.SimpleDeleteUserLoginMvo newDeleteUserLoginMvo() {
            return new AbstractUserLoginMvoCommand.SimpleDeleteUserLoginMvo();
        }


    }

}

