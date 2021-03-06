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
	public interface IUserStateEvent : IEvent, IStateEventDto, IGlobalIdentity<UserStateEventId>, ICreated<string>
	{
		UserStateEventId StateEventId { get; }

        bool ReadOnly { get; set; }

		string UserName { get; set; }

		int? AccessFailedCount { get; set; }

		string Email { get; set; }

		bool? EmailConfirmed { get; set; }

		bool? LockoutEnabled { get; set; }

		DateTime? LockoutEndDateUtc { get; set; }

		string PasswordHash { get; set; }

		string PhoneNumber { get; set; }

		bool? PhoneNumberConfirmed { get; set; }

		bool? TwoFactorEnabled { get; set; }

		string SecurityStamp { get; set; }

		bool? Active { get; set; }

	}

	public interface IUserStateCreated : IUserStateEvent//, IUserStateProperties
	{
		IEnumerable<IUserRoleStateCreated> UserRoleEvents { get; }
		
		void AddUserRoleEvent(IUserRoleStateCreated e);

		IUserRoleStateCreated NewUserRoleStateCreated(string roleId);

		IEnumerable<IUserClaimStateCreated> UserClaimEvents { get; }
		
		void AddUserClaimEvent(IUserClaimStateCreated e);

		IUserClaimStateCreated NewUserClaimStateCreated(int claimId);

		IEnumerable<IUserPermissionStateCreated> UserPermissionEvents { get; }
		
		void AddUserPermissionEvent(IUserPermissionStateCreated e);

		IUserPermissionStateCreated NewUserPermissionStateCreated(string permissionId);

		IEnumerable<IUserLoginStateCreated> UserLoginEvents { get; }
		
		void AddUserLoginEvent(IUserLoginStateCreated e);

		IUserLoginStateCreated NewUserLoginStateCreated(LoginKey loginKey);

	
	}


	public interface IUserStateMergePatched : IUserStateEvent//, IUserStateProperties
	{
		bool IsPropertyUserNameRemoved { get; set; }

		bool IsPropertyAccessFailedCountRemoved { get; set; }

		bool IsPropertyEmailRemoved { get; set; }

		bool IsPropertyEmailConfirmedRemoved { get; set; }

		bool IsPropertyLockoutEnabledRemoved { get; set; }

		bool IsPropertyLockoutEndDateUtcRemoved { get; set; }

		bool IsPropertyPasswordHashRemoved { get; set; }

		bool IsPropertyPhoneNumberRemoved { get; set; }

		bool IsPropertyPhoneNumberConfirmedRemoved { get; set; }

		bool IsPropertyTwoFactorEnabledRemoved { get; set; }

		bool IsPropertySecurityStampRemoved { get; set; }

		bool IsPropertyActiveRemoved { get; set; }

		IEnumerable<IUserRoleStateEvent> UserRoleEvents { get; }
		
		void AddUserRoleEvent(IUserRoleStateEvent e);

		IUserRoleStateCreated NewUserRoleStateCreated(string roleId);

		IUserRoleStateMergePatched NewUserRoleStateMergePatched(string roleId);

		IUserRoleStateRemoved NewUserRoleStateRemoved(string roleId);

		IEnumerable<IUserClaimStateEvent> UserClaimEvents { get; }
		
		void AddUserClaimEvent(IUserClaimStateEvent e);

		IUserClaimStateCreated NewUserClaimStateCreated(int claimId);

		IUserClaimStateMergePatched NewUserClaimStateMergePatched(int claimId);

		IUserClaimStateRemoved NewUserClaimStateRemoved(int claimId);

		IEnumerable<IUserPermissionStateEvent> UserPermissionEvents { get; }
		
		void AddUserPermissionEvent(IUserPermissionStateEvent e);

		IUserPermissionStateCreated NewUserPermissionStateCreated(string permissionId);

		IUserPermissionStateMergePatched NewUserPermissionStateMergePatched(string permissionId);

		IUserPermissionStateRemoved NewUserPermissionStateRemoved(string permissionId);

		IEnumerable<IUserLoginStateEvent> UserLoginEvents { get; }
		
		void AddUserLoginEvent(IUserLoginStateEvent e);

		IUserLoginStateCreated NewUserLoginStateCreated(LoginKey loginKey);

		IUserLoginStateMergePatched NewUserLoginStateMergePatched(LoginKey loginKey);

		IUserLoginStateRemoved NewUserLoginStateRemoved(LoginKey loginKey);


	}

	public interface IUserStateDeleted : IUserStateEvent
	{
		IEnumerable<IUserRoleStateRemoved> UserRoleEvents { get; }
		
		void AddUserRoleEvent(IUserRoleStateRemoved e);
		
		IUserRoleStateRemoved NewUserRoleStateRemoved(string roleId);

		IEnumerable<IUserClaimStateRemoved> UserClaimEvents { get; }
		
		void AddUserClaimEvent(IUserClaimStateRemoved e);
		
		IUserClaimStateRemoved NewUserClaimStateRemoved(int claimId);

		IEnumerable<IUserPermissionStateRemoved> UserPermissionEvents { get; }
		
		void AddUserPermissionEvent(IUserPermissionStateRemoved e);
		
		IUserPermissionStateRemoved NewUserPermissionStateRemoved(string permissionId);

		IEnumerable<IUserLoginStateRemoved> UserLoginEvents { get; }
		
		void AddUserLoginEvent(IUserLoginStateRemoved e);
		
		IUserLoginStateRemoved NewUserLoginStateRemoved(LoginKey loginKey);

	}


}

