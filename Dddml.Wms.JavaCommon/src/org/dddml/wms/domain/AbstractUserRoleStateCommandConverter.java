package org.dddml.wms.domain;

import java.util.*;
import java.util.Date;

public abstract class AbstractUserRoleStateCommandConverter<TCreateUserRole extends UserRoleCommand.CreateUserRole, TMergePatchUserRole extends UserRoleCommand.MergePatchUserRole, TRemoveUserRole extends UserRoleCommand.RemoveUserRole>
{
    public UserRoleCommand toCreateOrMergePatchUserRole(UserRoleState state)
    {
        //where TCreateUserRole : ICreateUserRole, new()
        //where TMergePatchUserRole : IMergePatchUserRole, new()
        boolean bUnsaved = state.isStateUnsaved();
        if (bUnsaved)
        {
            return toCreateUserRole(state);
        }
        else 
        {
            return toMergePatchUserRole(state);
        }
    }

    public TRemoveUserRole toRemoveUserRole(UserRoleState state) //where TRemoveUserRole : IRemoveUserRole, new()
    {
        TRemoveUserRole cmd = newRemoveUserRole();
        cmd.setRoleId(state.getRoleId());
        return cmd;
    }

    public TMergePatchUserRole toMergePatchUserRole(UserRoleState state) //where TMergePatchUserRole : IMergePatchUserRole, new()
    {
        TMergePatchUserRole cmd = newMergePatchUserRole();

        cmd.setRoleId(state.getRoleId());
        cmd.setActive(state.getActive());
        cmd.setUserId(state.getUserId());
            
        if (state.getActive() == null) { cmd.setIsPropertyActiveRemoved(true); }
        return cmd;
    }

    public TCreateUserRole toCreateUserRole(UserRoleState state) //where TCreateUserRole : ICreateUserRole, new()
    {
        TCreateUserRole cmd = newCreateUserRole();

        cmd.setRoleId(state.getRoleId());
        cmd.setActive(state.getActive());
        cmd.setUserId(state.getUserId());
        return cmd;
    }

    protected abstract TCreateUserRole newCreateUserRole();

    protected abstract TMergePatchUserRole newMergePatchUserRole(); 

    protected abstract TRemoveUserRole newRemoveUserRole();

    public static class SimpleUserRoleStateCommandConverter extends AbstractUserRoleStateCommandConverter<AbstractUserRoleCommand.SimpleCreateUserRole, AbstractUserRoleCommand.SimpleMergePatchUserRole, AbstractUserRoleCommand.SimpleRemoveUserRole>
    {
        @Override
        protected AbstractUserRoleCommand.SimpleCreateUserRole newCreateUserRole() {
            return new AbstractUserRoleCommand.SimpleCreateUserRole();
        }

        @Override
        protected AbstractUserRoleCommand.SimpleMergePatchUserRole newMergePatchUserRole() {
            return new AbstractUserRoleCommand.SimpleMergePatchUserRole();
        }

        @Override
        protected AbstractUserRoleCommand.SimpleRemoveUserRole newRemoveUserRole() {
            return new AbstractUserRoleCommand.SimpleRemoveUserRole();
        }


    }

}

