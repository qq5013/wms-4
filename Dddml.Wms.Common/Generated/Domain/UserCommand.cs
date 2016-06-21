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

	public abstract class UserCommandBase : IUserCommand
	{
		public virtual string UserId { get; set; }


		string IAggregateCommand<string, long>.AggregateId
		{
			get
			{
				return this.UserId;
			}
		}


		long IAggregateCommand<string, long>.AggregateVersion
		{
			get
			{
				return this.Version;
			}
		}

		public virtual long Version { get; set; }

		public virtual string RequesterId { get; set; }

		public virtual string CommandId { get; set; }

        object ICommand.RequesterId
        {
            get { return this.RequesterId; }
            set { this.RequesterId = (string)value; }
        }

        string ICommand.CommandId
        {
            get { return this.CommandId; }
            set { this.CommandId = value; }
        }

		public virtual string UserName { get; set; }

		public virtual int? AccessFailedCount { get; set; }

		public virtual string Email { get; set; }

		public virtual bool? EmailConfirmed { get; set; }

		public virtual bool? LockoutEnabled { get; set; }

		public virtual DateTime? LockoutEndDateUtc { get; set; }

		public virtual string PasswordHash { get; set; }

		public virtual string PhoneNumber { get; set; }

		public virtual bool? PhoneNumberConfirmed { get; set; }

		public virtual bool? TwoFactorEnabled { get; set; }

		public virtual string SecurityStamp { get; set; }

		public virtual bool? Active { get; set; }


		// //////////////////////////////////////////////////

        string ICommandDto.CommandType 
        {
            get { return this.GetCommandType(); }
        }

        protected abstract string GetCommandType();


	}


    public abstract class UserIdGeneratorBase : IIdGenerator<string, ICreateUser>
    {
        public abstract string GenerateId(ICreateUser command);

        public abstract string GetNextId();

        public virtual string GetOrGenerateId(ICreateUser command, out bool reused)
        {
            throw new NotSupportedException();
        }

    }

	public class CreateUser : UserCommandBase, ICreateUser
	{
		
		public CreateUser ()
		{
		}


        private CreateUserRoleCommands _userRoles = new CreateUserRoleCommands();

        public ICreateUserRoleCommands UserRoles
        {
            get
            {
                return this._userRoles;
            }
        }

        public CreateUserRole NewCreateUserRole()
        {
            var c = new CreateUserRole();
            c.UserId = this.UserId;

            return c;
        }

        ICreateUserRole ICreateUser.NewCreateUserRole()
        {
            return this.NewCreateUserRole();
        }



        private CreateUserClaimCommands _userClaims = new CreateUserClaimCommands();

        public ICreateUserClaimCommands UserClaims
        {
            get
            {
                return this._userClaims;
            }
        }

        public CreateUserClaim NewCreateUserClaim()
        {
            var c = new CreateUserClaim();
            c.UserId = this.UserId;

            return c;
        }

        ICreateUserClaim ICreateUser.NewCreateUserClaim()
        {
            return this.NewCreateUserClaim();
        }



        private CreateUserPermissionCommands _userPermissions = new CreateUserPermissionCommands();

        public ICreateUserPermissionCommands UserPermissions
        {
            get
            {
                return this._userPermissions;
            }
        }

        public CreateUserPermission NewCreateUserPermission()
        {
            var c = new CreateUserPermission();
            c.UserId = this.UserId;

            return c;
        }

        ICreateUserPermission ICreateUser.NewCreateUserPermission()
        {
            return this.NewCreateUserPermission();
        }



        private CreateUserLoginCommands _userLogins = new CreateUserLoginCommands();

        public ICreateUserLoginCommands UserLogins
        {
            get
            {
                return this._userLogins;
            }
        }

        public CreateUserLogin NewCreateUserLogin()
        {
            var c = new CreateUserLogin();
            c.UserId = this.UserId;

            return c;
        }

        ICreateUserLogin ICreateUser.NewCreateUserLogin()
        {
            return this.NewCreateUserLogin();
        }



        protected override string GetCommandType()
        {
            return Dddml.Wms.Specialization.CommandType.Create;
        }
	}


	public class MergePatchUser :UserCommandBase, IMergePatchUser
	{

		public virtual bool IsPropertyUserNameRemoved { get; set; }

		public virtual bool IsPropertyAccessFailedCountRemoved { get; set; }

		public virtual bool IsPropertyEmailRemoved { get; set; }

		public virtual bool IsPropertyEmailConfirmedRemoved { get; set; }

		public virtual bool IsPropertyLockoutEnabledRemoved { get; set; }

		public virtual bool IsPropertyLockoutEndDateUtcRemoved { get; set; }

		public virtual bool IsPropertyPasswordHashRemoved { get; set; }

		public virtual bool IsPropertyPhoneNumberRemoved { get; set; }

		public virtual bool IsPropertyPhoneNumberConfirmedRemoved { get; set; }

		public virtual bool IsPropertyTwoFactorEnabledRemoved { get; set; }

		public virtual bool IsPropertySecurityStampRemoved { get; set; }

		public virtual bool IsPropertyActiveRemoved { get; set; }


		public MergePatchUser ()
		{
		}

        private UserRoleCommands _userRoleCommands = new UserRoleCommands();

        public IUserRoleCommands UserRoleCommands
        {
            get
            {
                return this._userRoleCommands;
            }
        }


        public CreateUserRole NewCreateUserRole()
        {
            var c = new CreateUserRole();
            c.UserId = this.UserId;

            return c;
        }

        ICreateUserRole IMergePatchUser.NewCreateUserRole()
        {
            return this.NewCreateUserRole();
        }

        public MergePatchUserRole NewMergePatchUserRole()
        {
            var c = new MergePatchUserRole();
            c.UserId = this.UserId;

            return c;
        }

        IMergePatchUserRole IMergePatchUser.NewMergePatchUserRole()
        {
            return this.NewMergePatchUserRole();
        }


        public RemoveUserRole NewRemoveUserRole()
        {
            var c = new RemoveUserRole();
            c.UserId = this.UserId;

            return c;
        }

        IRemoveUserRole IMergePatchUser.NewRemoveUserRole()
        {
            return this.NewRemoveUserRole();
        }


        private UserClaimCommands _userClaimCommands = new UserClaimCommands();

        public IUserClaimCommands UserClaimCommands
        {
            get
            {
                return this._userClaimCommands;
            }
        }


        public CreateUserClaim NewCreateUserClaim()
        {
            var c = new CreateUserClaim();
            c.UserId = this.UserId;

            return c;
        }

        ICreateUserClaim IMergePatchUser.NewCreateUserClaim()
        {
            return this.NewCreateUserClaim();
        }

        public MergePatchUserClaim NewMergePatchUserClaim()
        {
            var c = new MergePatchUserClaim();
            c.UserId = this.UserId;

            return c;
        }

        IMergePatchUserClaim IMergePatchUser.NewMergePatchUserClaim()
        {
            return this.NewMergePatchUserClaim();
        }


        public RemoveUserClaim NewRemoveUserClaim()
        {
            var c = new RemoveUserClaim();
            c.UserId = this.UserId;

            return c;
        }

        IRemoveUserClaim IMergePatchUser.NewRemoveUserClaim()
        {
            return this.NewRemoveUserClaim();
        }


        private UserPermissionCommands _userPermissionCommands = new UserPermissionCommands();

        public IUserPermissionCommands UserPermissionCommands
        {
            get
            {
                return this._userPermissionCommands;
            }
        }


        public CreateUserPermission NewCreateUserPermission()
        {
            var c = new CreateUserPermission();
            c.UserId = this.UserId;

            return c;
        }

        ICreateUserPermission IMergePatchUser.NewCreateUserPermission()
        {
            return this.NewCreateUserPermission();
        }

        public MergePatchUserPermission NewMergePatchUserPermission()
        {
            var c = new MergePatchUserPermission();
            c.UserId = this.UserId;

            return c;
        }

        IMergePatchUserPermission IMergePatchUser.NewMergePatchUserPermission()
        {
            return this.NewMergePatchUserPermission();
        }


        public RemoveUserPermission NewRemoveUserPermission()
        {
            var c = new RemoveUserPermission();
            c.UserId = this.UserId;

            return c;
        }

        IRemoveUserPermission IMergePatchUser.NewRemoveUserPermission()
        {
            return this.NewRemoveUserPermission();
        }


        private UserLoginCommands _userLoginCommands = new UserLoginCommands();

        public IUserLoginCommands UserLoginCommands
        {
            get
            {
                return this._userLoginCommands;
            }
        }


        public CreateUserLogin NewCreateUserLogin()
        {
            var c = new CreateUserLogin();
            c.UserId = this.UserId;

            return c;
        }

        ICreateUserLogin IMergePatchUser.NewCreateUserLogin()
        {
            return this.NewCreateUserLogin();
        }

        public MergePatchUserLogin NewMergePatchUserLogin()
        {
            var c = new MergePatchUserLogin();
            c.UserId = this.UserId;

            return c;
        }

        IMergePatchUserLogin IMergePatchUser.NewMergePatchUserLogin()
        {
            return this.NewMergePatchUserLogin();
        }


        public RemoveUserLogin NewRemoveUserLogin()
        {
            var c = new RemoveUserLogin();
            c.UserId = this.UserId;

            return c;
        }

        IRemoveUserLogin IMergePatchUser.NewRemoveUserLogin()
        {
            return this.NewRemoveUserLogin();
        }


        protected override string GetCommandType()
        {
            return Dddml.Wms.Specialization.CommandType.MergePatch;
        }

	}

	public class DeleteUser : UserCommandBase, IDeleteUser
	{
		public DeleteUser ()
		{
		}

        protected override string GetCommandType()
        {
            return Dddml.Wms.Specialization.CommandType.Delete;
        }

	}


    public class CreateUserRoleCommands : ICreateUserRoleCommands
    {
        private List<ICreateUserRole> _innerCommands = new List<ICreateUserRole>();

        public void Add(ICreateUserRole c)
        {
            _innerCommands.Add(c);
        }

        public void Remove(ICreateUserRole c)
        {
            _innerCommands.Remove(c);
        }

        public void Clear()
        {
            _innerCommands.Clear();
        }

        public IEnumerator<ICreateUserRole> GetEnumerator()
        {
            return _innerCommands.GetEnumerator();
        }

        System.Collections.IEnumerator System.Collections.IEnumerable.GetEnumerator()
        {
            return _innerCommands.GetEnumerator();
        }

    }

    public class UserRoleCommands : IUserRoleCommands
    {
        private List<IUserRoleCommand> _innerCommands = new List<IUserRoleCommand>();

        public void Add(IUserRoleCommand c)
        {
            _innerCommands.Add(c);
        }

        public void Remove(IUserRoleCommand c)
        {
            _innerCommands.Remove(c);
        }

        public void Clear()
        {
            _innerCommands.Clear();
        }

        public IEnumerator<IUserRoleCommand> GetEnumerator()
        {
            return _innerCommands.GetEnumerator();
        }

        System.Collections.IEnumerator System.Collections.IEnumerable.GetEnumerator()
        {
            return _innerCommands.GetEnumerator();
        }

    }



    public class CreateUserClaimCommands : ICreateUserClaimCommands
    {
        private List<ICreateUserClaim> _innerCommands = new List<ICreateUserClaim>();

        public void Add(ICreateUserClaim c)
        {
            _innerCommands.Add(c);
        }

        public void Remove(ICreateUserClaim c)
        {
            _innerCommands.Remove(c);
        }

        public void Clear()
        {
            _innerCommands.Clear();
        }

        public IEnumerator<ICreateUserClaim> GetEnumerator()
        {
            return _innerCommands.GetEnumerator();
        }

        System.Collections.IEnumerator System.Collections.IEnumerable.GetEnumerator()
        {
            return _innerCommands.GetEnumerator();
        }

    }

    public class UserClaimCommands : IUserClaimCommands
    {
        private List<IUserClaimCommand> _innerCommands = new List<IUserClaimCommand>();

        public void Add(IUserClaimCommand c)
        {
            _innerCommands.Add(c);
        }

        public void Remove(IUserClaimCommand c)
        {
            _innerCommands.Remove(c);
        }

        public void Clear()
        {
            _innerCommands.Clear();
        }

        public IEnumerator<IUserClaimCommand> GetEnumerator()
        {
            return _innerCommands.GetEnumerator();
        }

        System.Collections.IEnumerator System.Collections.IEnumerable.GetEnumerator()
        {
            return _innerCommands.GetEnumerator();
        }

    }



    public class CreateUserPermissionCommands : ICreateUserPermissionCommands
    {
        private List<ICreateUserPermission> _innerCommands = new List<ICreateUserPermission>();

        public void Add(ICreateUserPermission c)
        {
            _innerCommands.Add(c);
        }

        public void Remove(ICreateUserPermission c)
        {
            _innerCommands.Remove(c);
        }

        public void Clear()
        {
            _innerCommands.Clear();
        }

        public IEnumerator<ICreateUserPermission> GetEnumerator()
        {
            return _innerCommands.GetEnumerator();
        }

        System.Collections.IEnumerator System.Collections.IEnumerable.GetEnumerator()
        {
            return _innerCommands.GetEnumerator();
        }

    }

    public class UserPermissionCommands : IUserPermissionCommands
    {
        private List<IUserPermissionCommand> _innerCommands = new List<IUserPermissionCommand>();

        public void Add(IUserPermissionCommand c)
        {
            _innerCommands.Add(c);
        }

        public void Remove(IUserPermissionCommand c)
        {
            _innerCommands.Remove(c);
        }

        public void Clear()
        {
            _innerCommands.Clear();
        }

        public IEnumerator<IUserPermissionCommand> GetEnumerator()
        {
            return _innerCommands.GetEnumerator();
        }

        System.Collections.IEnumerator System.Collections.IEnumerable.GetEnumerator()
        {
            return _innerCommands.GetEnumerator();
        }

    }



    public class CreateUserLoginCommands : ICreateUserLoginCommands
    {
        private List<ICreateUserLogin> _innerCommands = new List<ICreateUserLogin>();

        public void Add(ICreateUserLogin c)
        {
            _innerCommands.Add(c);
        }

        public void Remove(ICreateUserLogin c)
        {
            _innerCommands.Remove(c);
        }

        public void Clear()
        {
            _innerCommands.Clear();
        }

        public IEnumerator<ICreateUserLogin> GetEnumerator()
        {
            return _innerCommands.GetEnumerator();
        }

        System.Collections.IEnumerator System.Collections.IEnumerable.GetEnumerator()
        {
            return _innerCommands.GetEnumerator();
        }

    }

    public class UserLoginCommands : IUserLoginCommands
    {
        private List<IUserLoginCommand> _innerCommands = new List<IUserLoginCommand>();

        public void Add(IUserLoginCommand c)
        {
            _innerCommands.Add(c);
        }

        public void Remove(IUserLoginCommand c)
        {
            _innerCommands.Remove(c);
        }

        public void Clear()
        {
            _innerCommands.Clear();
        }

        public IEnumerator<IUserLoginCommand> GetEnumerator()
        {
            return _innerCommands.GetEnumerator();
        }

        System.Collections.IEnumerator System.Collections.IEnumerable.GetEnumerator()
        {
            return _innerCommands.GetEnumerator();
        }

    }




}

