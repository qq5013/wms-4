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

	public abstract class UserStateEventDtoBase : IStateEventDto, IUserStateCreated, IUserStateMergePatched, IUserStateDeleted
	{

		public virtual UserStateEventIdDto StateEventId { get; set; }

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


		public virtual string CreatedBy { get; set; }

		public virtual DateTime CreatedAt { get; set; }

        public virtual string CommandId { get; set; }

		UserStateEventId IGlobalIdentity<UserStateEventId>.GlobalId {
			get {
				return this.StateEventId.ToUserStateEventId();
			}
		}

        public virtual bool StateEventReadOnly { get; set; }

        bool IUserStateEvent.ReadOnly
        {
            get
            {
                return this.StateEventReadOnly;
            }
            set
            {
                this.StateEventReadOnly = value;
            }
        }

		public virtual bool? IsPropertyUserNameRemoved { get; set; }

        bool IUserStateMergePatched.IsPropertyUserNameRemoved
        {
            get 
            {
                var b = this.IsPropertyUserNameRemoved;
                if (b != null && b.HasValue)
                {
                    return b.Value;
                }
                return default(bool);
            }
            set 
            {
                this.IsPropertyUserNameRemoved = value;
            }
        }

		public virtual bool? IsPropertyAccessFailedCountRemoved { get; set; }

        bool IUserStateMergePatched.IsPropertyAccessFailedCountRemoved
        {
            get 
            {
                var b = this.IsPropertyAccessFailedCountRemoved;
                if (b != null && b.HasValue)
                {
                    return b.Value;
                }
                return default(bool);
            }
            set 
            {
                this.IsPropertyAccessFailedCountRemoved = value;
            }
        }

		public virtual bool? IsPropertyEmailRemoved { get; set; }

        bool IUserStateMergePatched.IsPropertyEmailRemoved
        {
            get 
            {
                var b = this.IsPropertyEmailRemoved;
                if (b != null && b.HasValue)
                {
                    return b.Value;
                }
                return default(bool);
            }
            set 
            {
                this.IsPropertyEmailRemoved = value;
            }
        }

		public virtual bool? IsPropertyEmailConfirmedRemoved { get; set; }

        bool IUserStateMergePatched.IsPropertyEmailConfirmedRemoved
        {
            get 
            {
                var b = this.IsPropertyEmailConfirmedRemoved;
                if (b != null && b.HasValue)
                {
                    return b.Value;
                }
                return default(bool);
            }
            set 
            {
                this.IsPropertyEmailConfirmedRemoved = value;
            }
        }

		public virtual bool? IsPropertyLockoutEnabledRemoved { get; set; }

        bool IUserStateMergePatched.IsPropertyLockoutEnabledRemoved
        {
            get 
            {
                var b = this.IsPropertyLockoutEnabledRemoved;
                if (b != null && b.HasValue)
                {
                    return b.Value;
                }
                return default(bool);
            }
            set 
            {
                this.IsPropertyLockoutEnabledRemoved = value;
            }
        }

		public virtual bool? IsPropertyLockoutEndDateUtcRemoved { get; set; }

        bool IUserStateMergePatched.IsPropertyLockoutEndDateUtcRemoved
        {
            get 
            {
                var b = this.IsPropertyLockoutEndDateUtcRemoved;
                if (b != null && b.HasValue)
                {
                    return b.Value;
                }
                return default(bool);
            }
            set 
            {
                this.IsPropertyLockoutEndDateUtcRemoved = value;
            }
        }

		public virtual bool? IsPropertyPasswordHashRemoved { get; set; }

        bool IUserStateMergePatched.IsPropertyPasswordHashRemoved
        {
            get 
            {
                var b = this.IsPropertyPasswordHashRemoved;
                if (b != null && b.HasValue)
                {
                    return b.Value;
                }
                return default(bool);
            }
            set 
            {
                this.IsPropertyPasswordHashRemoved = value;
            }
        }

		public virtual bool? IsPropertyPhoneNumberRemoved { get; set; }

        bool IUserStateMergePatched.IsPropertyPhoneNumberRemoved
        {
            get 
            {
                var b = this.IsPropertyPhoneNumberRemoved;
                if (b != null && b.HasValue)
                {
                    return b.Value;
                }
                return default(bool);
            }
            set 
            {
                this.IsPropertyPhoneNumberRemoved = value;
            }
        }

		public virtual bool? IsPropertyPhoneNumberConfirmedRemoved { get; set; }

        bool IUserStateMergePatched.IsPropertyPhoneNumberConfirmedRemoved
        {
            get 
            {
                var b = this.IsPropertyPhoneNumberConfirmedRemoved;
                if (b != null && b.HasValue)
                {
                    return b.Value;
                }
                return default(bool);
            }
            set 
            {
                this.IsPropertyPhoneNumberConfirmedRemoved = value;
            }
        }

		public virtual bool? IsPropertyTwoFactorEnabledRemoved { get; set; }

        bool IUserStateMergePatched.IsPropertyTwoFactorEnabledRemoved
        {
            get 
            {
                var b = this.IsPropertyTwoFactorEnabledRemoved;
                if (b != null && b.HasValue)
                {
                    return b.Value;
                }
                return default(bool);
            }
            set 
            {
                this.IsPropertyTwoFactorEnabledRemoved = value;
            }
        }

		public virtual bool? IsPropertySecurityStampRemoved { get; set; }

        bool IUserStateMergePatched.IsPropertySecurityStampRemoved
        {
            get 
            {
                var b = this.IsPropertySecurityStampRemoved;
                if (b != null && b.HasValue)
                {
                    return b.Value;
                }
                return default(bool);
            }
            set 
            {
                this.IsPropertySecurityStampRemoved = value;
            }
        }

		public virtual bool? IsPropertyActiveRemoved { get; set; }

        bool IUserStateMergePatched.IsPropertyActiveRemoved
        {
            get 
            {
                var b = this.IsPropertyActiveRemoved;
                if (b != null && b.HasValue)
                {
                    return b.Value;
                }
                return default(bool);
            }
            set 
            {
                this.IsPropertyActiveRemoved = value;
            }
        }


		string ICreated<string>.CreatedBy {
			get {
				return this.CreatedBy;
			}
			set {
				this.CreatedBy = value;
			}
		}

		DateTime ICreated<string>.CreatedAt {
			get {
				return this.CreatedAt;
			}
			set {
				this.CreatedAt = value;
			}
		}


        private UserRoleStateCreatedOrMergePatchedOrRemovedDtos _userRoleEvents = new UserRoleStateCreatedOrMergePatchedOrRemovedDtos();

        public virtual UserRoleStateCreatedOrMergePatchedOrRemovedDto[] UserRoleEvents
        {
            get
            {
                return _userRoleEvents.ToArray();
            }
            set
            {
                _userRoleEvents.Clear();
                _userRoleEvents.AddRange(value);
            }
        }



        private UserRoleStateEventIdDto NewUserRoleStateEventId(string roleId)
        {
            var eId = new UserRoleStateEventIdDto();
            eId.UserId = this.StateEventId.UserId;
            eId.RoleId = roleId;
            eId.UserVersion = this.StateEventId.Version;
            return eId;
        }

        public virtual UserRoleStateCreatedDto NewUserRoleStateCreated(string roleId)
        {
            var e = new UserRoleStateCreatedDto();
            var eId = NewUserRoleStateEventId(roleId);
            e.StateEventId = eId;
            return e;
        }

        public virtual UserRoleStateMergePatchedDto NewUserRoleStateMergePatched(string roleId)
        {
            var e = new UserRoleStateMergePatchedDto();
            var eId = NewUserRoleStateEventId(roleId);
            e.StateEventId = eId;
            return e;
        }

        public virtual UserRoleStateRemovedDto NewUserRoleStateRemoved(string roleId)
        {
            var e = new UserRoleStateRemovedDto();
            var eId = NewUserRoleStateEventId(roleId);
            e.StateEventId = eId;
            return e;
        }

        IEnumerable<IUserRoleStateCreated> IUserStateCreated.UserRoleEvents
        {
            get { return this._userRoleEvents; }
        }

        void IUserStateCreated.AddUserRoleEvent(IUserRoleStateCreated e)
        {
            this._userRoleEvents.AddUserRoleEvent(e);
        }

        IUserRoleStateCreated IUserStateCreated.NewUserRoleStateCreated(string roleId)
        {
            return NewUserRoleStateCreated(roleId);
        }

        IEnumerable<IUserRoleStateEvent> IUserStateMergePatched.UserRoleEvents
        {
            get { return this._userRoleEvents; }
        }

        void IUserStateMergePatched.AddUserRoleEvent(IUserRoleStateEvent e)
        {
            this._userRoleEvents.AddUserRoleEvent(e);
        }

        IUserRoleStateCreated IUserStateMergePatched.NewUserRoleStateCreated(string roleId)
        {
            return NewUserRoleStateCreated(roleId);
        }

        IUserRoleStateMergePatched IUserStateMergePatched.NewUserRoleStateMergePatched(string roleId)
        {
            return NewUserRoleStateMergePatched(roleId);
        }

        IUserRoleStateRemoved IUserStateMergePatched.NewUserRoleStateRemoved(string roleId)
        {
            return NewUserRoleStateRemoved(roleId);
        }


        IEnumerable<IUserRoleStateRemoved> IUserStateDeleted.UserRoleEvents
        {
            get { return this._userRoleEvents; }
        }

        void IUserStateDeleted.AddUserRoleEvent(IUserRoleStateRemoved e)
        {
            this._userRoleEvents.AddUserRoleEvent(e);
        }

        IUserRoleStateRemoved IUserStateDeleted.NewUserRoleStateRemoved(string roleId)
        {
            return NewUserRoleStateRemoved(roleId);
        }


        private UserClaimStateCreatedOrMergePatchedOrRemovedDtos _userClaimEvents = new UserClaimStateCreatedOrMergePatchedOrRemovedDtos();

        public virtual UserClaimStateCreatedOrMergePatchedOrRemovedDto[] UserClaimEvents
        {
            get
            {
                return _userClaimEvents.ToArray();
            }
            set
            {
                _userClaimEvents.Clear();
                _userClaimEvents.AddRange(value);
            }
        }



        private UserClaimStateEventIdDto NewUserClaimStateEventId(int claimId)
        {
            var eId = new UserClaimStateEventIdDto();
            eId.UserId = this.StateEventId.UserId;
            eId.ClaimId = claimId;
            eId.UserVersion = this.StateEventId.Version;
            return eId;
        }

        public virtual UserClaimStateCreatedDto NewUserClaimStateCreated(int claimId)
        {
            var e = new UserClaimStateCreatedDto();
            var eId = NewUserClaimStateEventId(claimId);
            e.StateEventId = eId;
            return e;
        }

        public virtual UserClaimStateMergePatchedDto NewUserClaimStateMergePatched(int claimId)
        {
            var e = new UserClaimStateMergePatchedDto();
            var eId = NewUserClaimStateEventId(claimId);
            e.StateEventId = eId;
            return e;
        }

        public virtual UserClaimStateRemovedDto NewUserClaimStateRemoved(int claimId)
        {
            var e = new UserClaimStateRemovedDto();
            var eId = NewUserClaimStateEventId(claimId);
            e.StateEventId = eId;
            return e;
        }

        IEnumerable<IUserClaimStateCreated> IUserStateCreated.UserClaimEvents
        {
            get { return this._userClaimEvents; }
        }

        void IUserStateCreated.AddUserClaimEvent(IUserClaimStateCreated e)
        {
            this._userClaimEvents.AddUserClaimEvent(e);
        }

        IUserClaimStateCreated IUserStateCreated.NewUserClaimStateCreated(int claimId)
        {
            return NewUserClaimStateCreated(claimId);
        }

        IEnumerable<IUserClaimStateEvent> IUserStateMergePatched.UserClaimEvents
        {
            get { return this._userClaimEvents; }
        }

        void IUserStateMergePatched.AddUserClaimEvent(IUserClaimStateEvent e)
        {
            this._userClaimEvents.AddUserClaimEvent(e);
        }

        IUserClaimStateCreated IUserStateMergePatched.NewUserClaimStateCreated(int claimId)
        {
            return NewUserClaimStateCreated(claimId);
        }

        IUserClaimStateMergePatched IUserStateMergePatched.NewUserClaimStateMergePatched(int claimId)
        {
            return NewUserClaimStateMergePatched(claimId);
        }

        IUserClaimStateRemoved IUserStateMergePatched.NewUserClaimStateRemoved(int claimId)
        {
            return NewUserClaimStateRemoved(claimId);
        }


        IEnumerable<IUserClaimStateRemoved> IUserStateDeleted.UserClaimEvents
        {
            get { return this._userClaimEvents; }
        }

        void IUserStateDeleted.AddUserClaimEvent(IUserClaimStateRemoved e)
        {
            this._userClaimEvents.AddUserClaimEvent(e);
        }

        IUserClaimStateRemoved IUserStateDeleted.NewUserClaimStateRemoved(int claimId)
        {
            return NewUserClaimStateRemoved(claimId);
        }


        private UserPermissionStateCreatedOrMergePatchedOrRemovedDtos _userPermissionEvents = new UserPermissionStateCreatedOrMergePatchedOrRemovedDtos();

        public virtual UserPermissionStateCreatedOrMergePatchedOrRemovedDto[] UserPermissionEvents
        {
            get
            {
                return _userPermissionEvents.ToArray();
            }
            set
            {
                _userPermissionEvents.Clear();
                _userPermissionEvents.AddRange(value);
            }
        }



        private UserPermissionStateEventIdDto NewUserPermissionStateEventId(string permissionId)
        {
            var eId = new UserPermissionStateEventIdDto();
            eId.UserId = this.StateEventId.UserId;
            eId.PermissionId = permissionId;
            eId.UserVersion = this.StateEventId.Version;
            return eId;
        }

        public virtual UserPermissionStateCreatedDto NewUserPermissionStateCreated(string permissionId)
        {
            var e = new UserPermissionStateCreatedDto();
            var eId = NewUserPermissionStateEventId(permissionId);
            e.StateEventId = eId;
            return e;
        }

        public virtual UserPermissionStateMergePatchedDto NewUserPermissionStateMergePatched(string permissionId)
        {
            var e = new UserPermissionStateMergePatchedDto();
            var eId = NewUserPermissionStateEventId(permissionId);
            e.StateEventId = eId;
            return e;
        }

        public virtual UserPermissionStateRemovedDto NewUserPermissionStateRemoved(string permissionId)
        {
            var e = new UserPermissionStateRemovedDto();
            var eId = NewUserPermissionStateEventId(permissionId);
            e.StateEventId = eId;
            return e;
        }

        IEnumerable<IUserPermissionStateCreated> IUserStateCreated.UserPermissionEvents
        {
            get { return this._userPermissionEvents; }
        }

        void IUserStateCreated.AddUserPermissionEvent(IUserPermissionStateCreated e)
        {
            this._userPermissionEvents.AddUserPermissionEvent(e);
        }

        IUserPermissionStateCreated IUserStateCreated.NewUserPermissionStateCreated(string permissionId)
        {
            return NewUserPermissionStateCreated(permissionId);
        }

        IEnumerable<IUserPermissionStateEvent> IUserStateMergePatched.UserPermissionEvents
        {
            get { return this._userPermissionEvents; }
        }

        void IUserStateMergePatched.AddUserPermissionEvent(IUserPermissionStateEvent e)
        {
            this._userPermissionEvents.AddUserPermissionEvent(e);
        }

        IUserPermissionStateCreated IUserStateMergePatched.NewUserPermissionStateCreated(string permissionId)
        {
            return NewUserPermissionStateCreated(permissionId);
        }

        IUserPermissionStateMergePatched IUserStateMergePatched.NewUserPermissionStateMergePatched(string permissionId)
        {
            return NewUserPermissionStateMergePatched(permissionId);
        }

        IUserPermissionStateRemoved IUserStateMergePatched.NewUserPermissionStateRemoved(string permissionId)
        {
            return NewUserPermissionStateRemoved(permissionId);
        }


        IEnumerable<IUserPermissionStateRemoved> IUserStateDeleted.UserPermissionEvents
        {
            get { return this._userPermissionEvents; }
        }

        void IUserStateDeleted.AddUserPermissionEvent(IUserPermissionStateRemoved e)
        {
            this._userPermissionEvents.AddUserPermissionEvent(e);
        }

        IUserPermissionStateRemoved IUserStateDeleted.NewUserPermissionStateRemoved(string permissionId)
        {
            return NewUserPermissionStateRemoved(permissionId);
        }


        private UserLoginStateCreatedOrMergePatchedOrRemovedDtos _userLoginEvents = new UserLoginStateCreatedOrMergePatchedOrRemovedDtos();

        public virtual UserLoginStateCreatedOrMergePatchedOrRemovedDto[] UserLoginEvents
        {
            get
            {
                return _userLoginEvents.ToArray();
            }
            set
            {
                _userLoginEvents.Clear();
                _userLoginEvents.AddRange(value);
            }
        }



        private UserLoginStateEventIdDto NewUserLoginStateEventId(LoginKey loginKey)
        {
            var eId = new UserLoginStateEventIdDto();
            eId.UserId = this.StateEventId.UserId;
            eId.LoginKey = new LoginKeyDto(loginKey);
            eId.UserVersion = this.StateEventId.Version;
            return eId;
        }

        public virtual UserLoginStateCreatedDto NewUserLoginStateCreated(LoginKey loginKey)
        {
            var e = new UserLoginStateCreatedDto();
            var eId = NewUserLoginStateEventId(loginKey);
            e.StateEventId = eId;
            return e;
        }

        public virtual UserLoginStateMergePatchedDto NewUserLoginStateMergePatched(LoginKey loginKey)
        {
            var e = new UserLoginStateMergePatchedDto();
            var eId = NewUserLoginStateEventId(loginKey);
            e.StateEventId = eId;
            return e;
        }

        public virtual UserLoginStateRemovedDto NewUserLoginStateRemoved(LoginKey loginKey)
        {
            var e = new UserLoginStateRemovedDto();
            var eId = NewUserLoginStateEventId(loginKey);
            e.StateEventId = eId;
            return e;
        }

        IEnumerable<IUserLoginStateCreated> IUserStateCreated.UserLoginEvents
        {
            get { return this._userLoginEvents; }
        }

        void IUserStateCreated.AddUserLoginEvent(IUserLoginStateCreated e)
        {
            this._userLoginEvents.AddUserLoginEvent(e);
        }

        IUserLoginStateCreated IUserStateCreated.NewUserLoginStateCreated(LoginKey loginKey)
        {
            return NewUserLoginStateCreated(loginKey);
        }

        IEnumerable<IUserLoginStateEvent> IUserStateMergePatched.UserLoginEvents
        {
            get { return this._userLoginEvents; }
        }

        void IUserStateMergePatched.AddUserLoginEvent(IUserLoginStateEvent e)
        {
            this._userLoginEvents.AddUserLoginEvent(e);
        }

        IUserLoginStateCreated IUserStateMergePatched.NewUserLoginStateCreated(LoginKey loginKey)
        {
            return NewUserLoginStateCreated(loginKey);
        }

        IUserLoginStateMergePatched IUserStateMergePatched.NewUserLoginStateMergePatched(LoginKey loginKey)
        {
            return NewUserLoginStateMergePatched(loginKey);
        }

        IUserLoginStateRemoved IUserStateMergePatched.NewUserLoginStateRemoved(LoginKey loginKey)
        {
            return NewUserLoginStateRemoved(loginKey);
        }


        IEnumerable<IUserLoginStateRemoved> IUserStateDeleted.UserLoginEvents
        {
            get { return this._userLoginEvents; }
        }

        void IUserStateDeleted.AddUserLoginEvent(IUserLoginStateRemoved e)
        {
            this._userLoginEvents.AddUserLoginEvent(e);
        }

        IUserLoginStateRemoved IUserStateDeleted.NewUserLoginStateRemoved(LoginKey loginKey)
        {
            return NewUserLoginStateRemoved(loginKey);
        }


        UserStateEventId IUserStateEvent.StateEventId
        {
            get { return this.StateEventId.ToUserStateEventId(); }
        }

        protected UserStateEventDtoBase()
        {
        }

        protected UserStateEventDtoBase(UserStateEventIdDto stateEventId)
        {
            this.StateEventId = stateEventId;
        }

        // //////////////////////////////////////////////////

        string IStateEventDto.StateEventType 
        {
            get { return this.GetStateEventType(); }
        }

        protected abstract string GetStateEventType();

	}


    public class UserStateCreatedOrMergePatchedOrDeletedDto : UserStateEventDtoBase
    {
        private string _stateEventType;

        public virtual string StateEventType
        {
            get { return _stateEventType; }
            set { _stateEventType = value; }
        }

        protected override string GetStateEventType()
        {
            return this._stateEventType;
        }

    }



	public class UserStateCreatedDto : UserStateCreatedOrMergePatchedOrDeletedDto
	{
		public UserStateCreatedDto()
		{
		}

        public override string StateEventType
        {
            get { return this.GetStateEventType(); }
            set
            {
                // do nothing
            }
        }

        protected override string GetStateEventType()
        {
            return Dddml.Wms.Specialization.StateEventType.Created;
        }

	}


	public class UserStateMergePatchedDto : UserStateCreatedOrMergePatchedOrDeletedDto
	{
		public UserStateMergePatchedDto()
		{
		}

        public override string StateEventType
        {
            get { return this.GetStateEventType(); }
            set
            {
                // do nothing
            }
        }

        protected override string GetStateEventType()
        {
            return Dddml.Wms.Specialization.StateEventType.MergePatched;
        }

	}


	public class UserStateDeletedDto : UserStateCreatedOrMergePatchedOrDeletedDto
	{
		public UserStateDeletedDto()
		{
		}

        public override string StateEventType
        {
            get { return this.GetStateEventType(); }
            set
            {
                // do nothing
            }
        }

        protected override string GetStateEventType()
        {
            return Dddml.Wms.Specialization.StateEventType.Deleted;
        }

	}


    public partial class UserStateCreatedOrMergePatchedOrDeletedDtos : IEnumerable<IUserStateCreated>, IEnumerable<IUserStateMergePatched>, IEnumerable<IUserStateDeleted>
    {
        private List<UserStateCreatedOrMergePatchedOrDeletedDto> _innerStateEvents = new List<UserStateCreatedOrMergePatchedOrDeletedDto>();

        public virtual UserStateCreatedOrMergePatchedOrDeletedDto[] ToArray()
        {
            return _innerStateEvents.ToArray();
        }

        public virtual void Clear()
        {
            _innerStateEvents.Clear();
        }

        public virtual void AddRange(IEnumerable<UserStateCreatedOrMergePatchedOrDeletedDto> es)
        {
            _innerStateEvents.AddRange(es);
        }

        public IEnumerator<IUserStateCreated> GetEnumerator()
        {
            return _innerStateEvents.GetEnumerator();
        }

        System.Collections.IEnumerator System.Collections.IEnumerable.GetEnumerator()
        {
            return _innerStateEvents.GetEnumerator();
        }

        IEnumerator<IUserStateMergePatched> IEnumerable<IUserStateMergePatched>.GetEnumerator()
        {
            return _innerStateEvents.GetEnumerator();
        }

        IEnumerator<IUserStateDeleted> IEnumerable<IUserStateDeleted>.GetEnumerator()
        {
            return _innerStateEvents.GetEnumerator();
        }

        public void AddUserEvent(IUserStateCreated e)
        {
            _innerStateEvents.Add((UserStateCreatedDto)e);
        }

        public void AddUserEvent(IUserStateEvent e)
        {
            _innerStateEvents.Add((UserStateCreatedOrMergePatchedOrDeletedDto)e);
        }

        public void AddUserEvent(IUserStateDeleted e)
        {
            _innerStateEvents.Add((UserStateDeletedDto)e);
        }

    }


}

