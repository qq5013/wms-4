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

	public abstract class UserLoginCommandBase : IUserLoginCommand
	{
		public virtual LoginKey LoginKey { get; set; }


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

		public virtual bool? Active { get; set; }

		// Outer Id:

		public virtual string UserId { get; set; }


		// //////////////////////////////////////////////////

        string ICommandDto.CommandType 
        {
            get { return this.GetCommandType(); }
        }

        protected abstract string GetCommandType();


	}


    public abstract class UserLoginIdGeneratorBase : IIdGenerator<LoginKey, ICreateUserLogin>
    {
        public abstract LoginKey GenerateId(ICreateUserLogin command);

        public abstract LoginKey GetNextId();

        public virtual LoginKey GetOrGenerateId(ICreateUserLogin command, out bool reused)
        {
            throw new NotSupportedException();
        }

    }

	public class CreateUserLogin : UserLoginCommandBase, ICreateUserLogin
	{
		
		public CreateUserLogin ()
		{
		}


        protected override string GetCommandType()
        {
            return Dddml.Wms.Specialization.CommandType.Create;
        }
	}


	public class MergePatchUserLogin :UserLoginCommandBase, IMergePatchUserLogin
	{

		public virtual bool IsPropertyActiveRemoved { get; set; }


		public MergePatchUserLogin ()
		{
		}

        protected override string GetCommandType()
        {
            return Dddml.Wms.Specialization.CommandType.MergePatch;
        }

	}

	public class RemoveUserLogin : UserLoginCommandBase, IRemoveUserLogin
	{
		public RemoveUserLogin ()
		{
		}

        protected override string GetCommandType()
        {
            return Dddml.Wms.Specialization.CommandType.Remove;
        }
	}



}

