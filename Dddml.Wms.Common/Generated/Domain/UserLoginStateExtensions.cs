﻿// <autogenerated>
//   This file was generated by T4 code generator GenerateBoundedContextDomainAggregates.tt.
//   Any changes made to this file manually will be lost next time the file is regenerated.
// </autogenerated>

using System;
using System.Collections.Generic;
using Dddml.Wms.Specialization;
using Dddml.Wms.Domain;

namespace Dddml.Wms.Domain
{

	public static partial class UserLoginStateExtensions
	{

        public static IUserLoginCommand ToCreateOrMergePatchUserLogin(this UserLoginState state)
        {
            bool bUnsaved = ((IUserLoginState)state).IsUnsaved;
            if (bUnsaved)
            {
                return state.ToCreateUserLogin();
            }
            else 
            {
                return state.ToMergePatchUserLogin();
            }
        }

        public static RemoveUserLogin ToRemoveUserLogin(this UserLoginState state)
        {
            var cmd = new RemoveUserLogin();
            cmd.LoginKey = state.LoginKey;
            return cmd;
        }

        public static MergePatchUserLogin ToMergePatchUserLogin(this UserLoginState state)
        {
            var cmd = new MergePatchUserLogin();

            cmd.LoginKey = state.LoginKey;
            cmd.Active = state.Active;
            cmd.UserId = state.UserId;
            
            return cmd;
        }

        public static CreateUserLogin ToCreateUserLogin(this UserLoginState state)
        {
            var cmd = new CreateUserLogin();

            cmd.LoginKey = state.LoginKey;
            cmd.Active = state.Active;
            cmd.UserId = state.UserId;
            return cmd;
        }
		

	}

}
