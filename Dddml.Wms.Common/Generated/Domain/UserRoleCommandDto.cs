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

	public abstract class UserRoleCommandDtoBase : ICommandDto, ICreateUserRole, IMergePatchUserRole, IDeleteUserRole
	{

		UserRoleId IAggregateCommand<UserRoleId, long>.AggregateId
		{
			get
			{
				return ((ICreateOrMergePatchOrDeleteUserRole)this).Id;
			}
		}


		long IAggregateCommand<UserRoleId, long>.AggregateVersion
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

		public virtual UserRoleIdDto Id { get; set; }

		public virtual bool? Active { get; set; }


        UserRoleId ICreateOrMergePatchOrDeleteUserRole.Id
        {
            get 
            {
                return this.Id.ToUserRoleId();
            }
            set 
            {
                this.Id = new UserRoleIdDto(value);
            }
        }

		public virtual bool? IsPropertyActiveRemoved { get; set; }

        bool IMergePatchUserRole.IsPropertyActiveRemoved
        {
            get
            {
                var b = this.IsPropertyActiveRemoved;
                if (b != null && b.HasValue)
                {
                    return b.Value;
                }
                return false;
            }
            set
            {
                this.IsPropertyActiveRemoved = value;
            }
        }


        // //////////////////////////////////////////////
/*
        private IUserRoleCommand _innerCommand;

        internal ICommand ToCommand()
        {
            //if (this._innerCommand != null)
            //{
            //    return this._innerCommand;
            //}
            var cmdType = GetCommandType();
            if (cmdType == CommandType.Create)
            {
                var cmd = ToCreateUserRole();
                this._innerCommand = cmd;
            }
            else if (cmdType == CommandType.MergePatch)
            {
                var cmd = ToMergePatchUserRole();
                this._innerCommand = cmd;
            }
            else if (cmdType == CommandType.Delete)
            {
                var cmd = ToDeleteUserRole();
                this._innerCommand = cmd;
            }
            else
            {
                throw DomainError.Named("invalidCommandType", String.Format("Invalid command type: {0}", cmdType));
            }
            return this._innerCommand;
        }

        internal DeleteUserRole ToDeleteUserRole()
        {
            var cmd = new DeleteUserRole();
            cmd.CommandId = this.CommandId;
            cmd.RequesterId = this.RequesterId;

            cmd.Id = ((ICreateOrMergePatchOrDeleteUserRole)this).Id;
            cmd.Version = this.Version;

            return cmd;
        }

        internal MergePatchUserRole ToMergePatchUserRole()
        {
            var cmd = new MergePatchUserRole();
            cmd.CommandId = this.CommandId;
            cmd.RequesterId = this.RequesterId;

            cmd.Version = this.Version;

            cmd.Id = ((ICreateOrMergePatchOrDeleteUserRole)this).Id;
            cmd.Active = ((ICreateOrMergePatchOrDeleteUserRole)this).Active;
            
            cmd.IsPropertyActiveRemoved = (this as IMergePatchUserRole).IsPropertyActiveRemoved;
            return cmd;
        }

        internal CreateUserRole ToCreateUserRole()
        {
            var cmd = new CreateUserRole();
            cmd.CommandId = this.CommandId;
            cmd.RequesterId = this.RequesterId;

            cmd.Version = this.Version;

            cmd.Id = ((ICreateOrMergePatchOrDeleteUserRole)this).Id;
            cmd.Active = ((ICreateOrMergePatchOrDeleteUserRole)this).Active;
            return cmd;
        }
*/
        // //////////////////////////////////////////////////

        string ICommandDto.CommandType 
        {
            get { return this.GetCommandType(); }
        }

        protected abstract string GetCommandType();

	}


    public class CreateOrMergePatchOrDeleteUserRoleDto : UserRoleCommandDtoBase
    {
        private string _commandType;

        public virtual string CommandType
        {
            get { return _commandType; }
            set { _commandType = value; }
        }

        protected override string GetCommandType()
        {
            return this._commandType;
        }

    }



	public class CreateUserRoleDto : CreateOrMergePatchOrDeleteUserRoleDto
	{

        public override string CommandType
        {
            get { return this.GetCommandType(); }
            set { 
				// do nothing
            }
        }

        protected override string GetCommandType()
        {
            return Dddml.Wms.Specialization.CommandType.Create;
        }

	}


	public class MergePatchUserRoleDto : CreateOrMergePatchOrDeleteUserRoleDto
	{

        public override string CommandType
        {
            get { return this.GetCommandType(); }
            set { 
				// do nothing
            }
        }

        protected override string GetCommandType()
        {
            return Dddml.Wms.Specialization.CommandType.MergePatch;
        }

	}

	public class DeleteUserRoleDto : CreateOrMergePatchOrDeleteUserRoleDto
	{
        protected override string GetCommandType()
        {
            return Dddml.Wms.Specialization.CommandType.Delete;
        }


        public override string CommandType
        {
            get { return this.GetCommandType(); }
            set { 
				// do nothing
            }
        }

	}





}
