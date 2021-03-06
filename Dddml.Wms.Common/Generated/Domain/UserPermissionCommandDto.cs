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

	public abstract class UserPermissionCommandDtoBase : ICommandDto, ICreateUserPermission, IMergePatchUserPermission, IRemoveUserPermission
	{

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

		public virtual string PermissionId { get; set; }

		public virtual bool? Active { get; set; }

		public virtual string UserId { get; set; }

		public virtual bool? IsPropertyActiveRemoved { get; set; }

        bool IMergePatchUserPermission.IsPropertyActiveRemoved
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


        string ICommandDto.CommandType 
        {
            get { return this.GetCommandType(); }
        }

        protected abstract string GetCommandType();

	}


    public class CreateOrMergePatchOrRemoveUserPermissionDto : UserPermissionCommandDtoBase
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



	public class CreateUserPermissionDto : CreateOrMergePatchOrRemoveUserPermissionDto
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


	public class MergePatchUserPermissionDto : CreateOrMergePatchOrRemoveUserPermissionDto
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

	public class RemoveUserPermissionDto : CreateOrMergePatchOrRemoveUserPermissionDto
	{
        protected override string GetCommandType()
        {
            return Dddml.Wms.Specialization.CommandType.Remove;
        }


        public override string CommandType
        {
            get { return this.GetCommandType(); }
            set { 
				// do nothing
            }
        }

	}


    public partial class CreateOrMergePatchOrRemoveUserPermissionDtos : IUserPermissionCommands, ICreateUserPermissionCommands, IEnumerable<CreateOrMergePatchOrRemoveUserPermissionDto>
    {
        private List<CreateOrMergePatchOrRemoveUserPermissionDto> _innerCommands = new List<CreateOrMergePatchOrRemoveUserPermissionDto>();

        public virtual CreateOrMergePatchOrRemoveUserPermissionDto[] ToArray()
        {
            return _innerCommands.ToArray();
        }

        public virtual void Clear()
        {
            _innerCommands.Clear();
        }

        public virtual void AddRange(IEnumerable<CreateOrMergePatchOrRemoveUserPermissionDto> cs)
        {
            _innerCommands.AddRange(cs);
        }

        void IUserPermissionCommands.Add(IUserPermissionCommand c)
        {
            _innerCommands.Add((CreateOrMergePatchOrRemoveUserPermissionDto)c);
        }

        void IUserPermissionCommands.Remove(IUserPermissionCommand c)
        {
            _innerCommands.Remove((CreateOrMergePatchOrRemoveUserPermissionDto)c);
        }


        IEnumerator<CreateOrMergePatchOrRemoveUserPermissionDto> IEnumerable<CreateOrMergePatchOrRemoveUserPermissionDto>.GetEnumerator()
        {
            return _innerCommands.GetEnumerator();
        }

        IEnumerator<IUserPermissionCommand> IEnumerable<IUserPermissionCommand>.GetEnumerator()
        {
            return _innerCommands.GetEnumerator();
        }

        System.Collections.IEnumerator System.Collections.IEnumerable.GetEnumerator()
        {
            return _innerCommands.GetEnumerator();
        }

        void ICreateUserPermissionCommands.Add(ICreateUserPermission c)
        {
            _innerCommands.Add((CreateUserPermissionDto)c);
        }

        void ICreateUserPermissionCommands.Remove(ICreateUserPermission c)
        {
            _innerCommands.Remove((CreateUserPermissionDto)c);
        }

        IEnumerator<ICreateUserPermission> IEnumerable<ICreateUserPermission>.GetEnumerator()
        {
            return _innerCommands.GetEnumerator();
        }

    }






}

