package org.dddml.wms.domain;

import java.util.*;
import java.util.Date;

public abstract class AbstractUserLoginStateCommandConverter<TCreateUserLogin extends UserLoginCommand.CreateUserLogin, TMergePatchUserLogin extends UserLoginCommand.MergePatchUserLogin, TRemoveUserLogin extends UserLoginCommand.RemoveUserLogin>
{
    public UserLoginCommand toCreateOrMergePatchUserLogin(UserLoginState state)
    {
        //where TCreateUserLogin : ICreateUserLogin, new()
        //where TMergePatchUserLogin : IMergePatchUserLogin, new()
        boolean bUnsaved = state.isStateUnsaved();
        if (bUnsaved)
        {
            return toCreateUserLogin(state);
        }
        else 
        {
            return toMergePatchUserLogin(state);
        }
    }

    public TRemoveUserLogin toRemoveUserLogin(UserLoginState state) //where TRemoveUserLogin : IRemoveUserLogin, new()
    {
        TRemoveUserLogin cmd = newRemoveUserLogin();
        cmd.setLoginKey(state.getLoginKey());
        return cmd;
    }

    public TMergePatchUserLogin toMergePatchUserLogin(UserLoginState state) //where TMergePatchUserLogin : IMergePatchUserLogin, new()
    {
        TMergePatchUserLogin cmd = newMergePatchUserLogin();

        cmd.setLoginKey(state.getLoginKey());
        cmd.setActive(state.getActive());
        cmd.setUserId(state.getUserId());
            
        if (state.getActive() == null) { cmd.setIsPropertyActiveRemoved(true); }
        return cmd;
    }

    public TCreateUserLogin toCreateUserLogin(UserLoginState state) //where TCreateUserLogin : ICreateUserLogin, new()
    {
        TCreateUserLogin cmd = newCreateUserLogin();

        cmd.setLoginKey(state.getLoginKey());
        cmd.setActive(state.getActive());
        cmd.setUserId(state.getUserId());
        return cmd;
    }

    protected abstract TCreateUserLogin newCreateUserLogin();

    protected abstract TMergePatchUserLogin newMergePatchUserLogin(); 

    protected abstract TRemoveUserLogin newRemoveUserLogin();

    public static class SimpleUserLoginStateCommandConverter extends AbstractUserLoginStateCommandConverter<AbstractUserLoginCommand.SimpleCreateUserLogin, AbstractUserLoginCommand.SimpleMergePatchUserLogin, AbstractUserLoginCommand.SimpleRemoveUserLogin>
    {
        @Override
        protected AbstractUserLoginCommand.SimpleCreateUserLogin newCreateUserLogin() {
            return new AbstractUserLoginCommand.SimpleCreateUserLogin();
        }

        @Override
        protected AbstractUserLoginCommand.SimpleMergePatchUserLogin newMergePatchUserLogin() {
            return new AbstractUserLoginCommand.SimpleMergePatchUserLogin();
        }

        @Override
        protected AbstractUserLoginCommand.SimpleRemoveUserLogin newRemoveUserLogin() {
            return new AbstractUserLoginCommand.SimpleRemoveUserLogin();
        }


    }

}

