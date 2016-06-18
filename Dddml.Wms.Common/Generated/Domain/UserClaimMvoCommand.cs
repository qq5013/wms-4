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

	public abstract class UserClaimMvoCommandBase : IUserClaimMvoCommand
	{
		public virtual UserClaimId UserClaimId { get; set; }


		UserClaimId IAggregateCommand<UserClaimId, long>.AggregateId
		{
			get
			{
				return this.UserClaimId;
			}
		}


		long IAggregateCommand<UserClaimId, long>.AggregateVersion
		{
			get
			{
				return this.UserVersion;
			}
		}

		public virtual long UserVersion { get; set; }

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

		public virtual string ClaimType { get; set; }

		public virtual string ClaimValue { get; set; }

		public virtual long? Version { get; set; }

		public virtual bool? Active { get; set; }

		public virtual int? UserAccessFailedCount { get; set; }

		public virtual string UserEmail { get; set; }

		public virtual bool? UserEmailConfirmed { get; set; }

		public virtual bool? UserLockoutEnabled { get; set; }

		public virtual DateTime? UserLockoutEndDateUtc { get; set; }

		public virtual string UserPasswordHash { get; set; }

		public virtual string UserPhoneNumber { get; set; }

		public virtual bool? UserPhoneNumberConfirmed { get; set; }

		public virtual bool? UserTwoFactorEnabled { get; set; }

		public virtual string UserSecurityStamp { get; set; }

		public virtual string UserCreatedBy { get; set; }

		public virtual DateTime? UserCreatedAt { get; set; }

		public virtual string UserUpdatedBy { get; set; }

		public virtual DateTime? UserUpdatedAt { get; set; }

		public virtual bool? UserActive { get; set; }

		public virtual bool? UserDeleted { get; set; }


		// //////////////////////////////////////////////////

        string ICommandDto.CommandType 
        {
            get { return this.GetCommandType(); }
        }

        protected abstract string GetCommandType();


	}


    public abstract class UserClaimMvoIdGeneratorBase : IIdGenerator<UserClaimId, ICreateUserClaimMvo>
    {
        public abstract UserClaimId GenerateId(ICreateUserClaimMvo command);

        public abstract UserClaimId GetNextId();

        public virtual UserClaimId GetOrGenerateId(ICreateUserClaimMvo command, out bool reused)
        {
            throw new NotSupportedException();
        }

    }

	public class CreateUserClaimMvo : UserClaimMvoCommandBase, ICreateUserClaimMvo
	{
		
		public CreateUserClaimMvo ()
		{
		}


        protected override string GetCommandType()
        {
            return Dddml.Wms.Specialization.CommandType.Create;
        }
	}


	public class MergePatchUserClaimMvo :UserClaimMvoCommandBase, IMergePatchUserClaimMvo
	{

		public virtual bool IsPropertyClaimTypeRemoved { get; set; }

		public virtual bool IsPropertyClaimValueRemoved { get; set; }

		public virtual bool IsPropertyVersionRemoved { get; set; }

		public virtual bool IsPropertyActiveRemoved { get; set; }

		public virtual bool IsPropertyUserAccessFailedCountRemoved { get; set; }

		public virtual bool IsPropertyUserEmailRemoved { get; set; }

		public virtual bool IsPropertyUserEmailConfirmedRemoved { get; set; }

		public virtual bool IsPropertyUserLockoutEnabledRemoved { get; set; }

		public virtual bool IsPropertyUserLockoutEndDateUtcRemoved { get; set; }

		public virtual bool IsPropertyUserPasswordHashRemoved { get; set; }

		public virtual bool IsPropertyUserPhoneNumberRemoved { get; set; }

		public virtual bool IsPropertyUserPhoneNumberConfirmedRemoved { get; set; }

		public virtual bool IsPropertyUserTwoFactorEnabledRemoved { get; set; }

		public virtual bool IsPropertyUserSecurityStampRemoved { get; set; }

		public virtual bool IsPropertyUserCreatedByRemoved { get; set; }

		public virtual bool IsPropertyUserCreatedAtRemoved { get; set; }

		public virtual bool IsPropertyUserUpdatedByRemoved { get; set; }

		public virtual bool IsPropertyUserUpdatedAtRemoved { get; set; }

		public virtual bool IsPropertyUserActiveRemoved { get; set; }

		public virtual bool IsPropertyUserDeletedRemoved { get; set; }


		public MergePatchUserClaimMvo ()
		{
		}

        protected override string GetCommandType()
        {
            return Dddml.Wms.Specialization.CommandType.MergePatch;
        }

	}

	public class DeleteUserClaimMvo : UserClaimMvoCommandBase, IDeleteUserClaimMvo
	{
		public DeleteUserClaimMvo ()
		{
		}

        protected override string GetCommandType()
        {
            return Dddml.Wms.Specialization.CommandType.Delete;
        }

	}



}

