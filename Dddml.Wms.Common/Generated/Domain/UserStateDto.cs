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

	public partial class UserStateDto : StateDtoBase, IUserState
	{

        internal static IList<string> _collectionFieldNames = new string[] { "UserRoles", "UserClaims", "UserPermissions", "UserLogins" };

        protected override bool IsCollectionField(string fieldName)
        {
            return CollectionUtils.CollectionContainsIgnoringCase(_collectionFieldNames, fieldName);
        }

		private UserState _state;

        public UserStateDto()
        {
            this._state = new UserState();
        }

		public UserStateDto(UserState state)
		{
            this._state = state;
		}

		internal UserState ToUserState()
		{
			return this._state;
		}

		public virtual string UserId
		{
            get
            {
                if ((this as IStateDto).ReturnedFieldsContains("UserId"))
                {
                    return _state.UserId;
                }
                return null;
            }
            set
            {
                _state.UserId = value;
            }
        }

        string IUserStateProperties.UserId
        {
            get 
            {
                return (this._state as IUserStateProperties).UserId;
            }
            set 
            {
                this._state.UserId = value;
            }
        }

		public virtual string UserName
		{
            get
            {
                if ((this as IStateDto).ReturnedFieldsContains("UserName"))
                {
                    return _state.UserName;
                }
                return null;
            }
            set
            {
                _state.UserName = value;
            }
        }

        string IUserStateProperties.UserName
        {
            get 
            {
                return (this._state as IUserStateProperties).UserName;
            }
            set 
            {
                this._state.UserName = value;
            }
        }

		public virtual int? AccessFailedCount
        {
            get
            {
                if ((this as IStateDto).ReturnedFieldsContains("AccessFailedCount"))
                {
                    return _state.AccessFailedCount;
                }
                return null;
            }
            set
            {
                if (value != null && value.HasValue)
                {
                    _state.AccessFailedCount = value.Value;
                }
            }
        }

        int IUserStateProperties.AccessFailedCount
        {
            get 
            {
                return (this._state as IUserStateProperties).AccessFailedCount;
            }
            set 
            {
                this._state.AccessFailedCount = value;
            }
        }

		public virtual string Email
		{
            get
            {
                if ((this as IStateDto).ReturnedFieldsContains("Email"))
                {
                    return _state.Email;
                }
                return null;
            }
            set
            {
                _state.Email = value;
            }
        }

        string IUserStateProperties.Email
        {
            get 
            {
                return (this._state as IUserStateProperties).Email;
            }
            set 
            {
                this._state.Email = value;
            }
        }

		public virtual bool? EmailConfirmed
        {
            get
            {
                if ((this as IStateDto).ReturnedFieldsContains("EmailConfirmed"))
                {
                    return _state.EmailConfirmed;
                }
                return null;
            }
            set
            {
                if (value != null && value.HasValue)
                {
                    _state.EmailConfirmed = value.Value;
                }
            }
        }

        bool IUserStateProperties.EmailConfirmed
        {
            get 
            {
                return (this._state as IUserStateProperties).EmailConfirmed;
            }
            set 
            {
                this._state.EmailConfirmed = value;
            }
        }

		public virtual bool? LockoutEnabled
        {
            get
            {
                if ((this as IStateDto).ReturnedFieldsContains("LockoutEnabled"))
                {
                    return _state.LockoutEnabled;
                }
                return null;
            }
            set
            {
                if (value != null && value.HasValue)
                {
                    _state.LockoutEnabled = value.Value;
                }
            }
        }

        bool IUserStateProperties.LockoutEnabled
        {
            get 
            {
                return (this._state as IUserStateProperties).LockoutEnabled;
            }
            set 
            {
                this._state.LockoutEnabled = value;
            }
        }

		public virtual DateTime? LockoutEndDateUtc
		{
            get
            {
                if ((this as IStateDto).ReturnedFieldsContains("LockoutEndDateUtc"))
                {
                    return _state.LockoutEndDateUtc;
                }
                return null;
            }
            set
            {
                _state.LockoutEndDateUtc = value;
            }
        }

        DateTime? IUserStateProperties.LockoutEndDateUtc
        {
            get 
            {
                return (this._state as IUserStateProperties).LockoutEndDateUtc;
            }
            set 
            {
                this._state.LockoutEndDateUtc = value;
            }
        }

		public virtual string PasswordHash
		{
            get
            {
                if ((this as IStateDto).ReturnedFieldsContains("PasswordHash"))
                {
                    return _state.PasswordHash;
                }
                return null;
            }
            set
            {
                _state.PasswordHash = value;
            }
        }

        string IUserStateProperties.PasswordHash
        {
            get 
            {
                return (this._state as IUserStateProperties).PasswordHash;
            }
            set 
            {
                this._state.PasswordHash = value;
            }
        }

		public virtual string PhoneNumber
		{
            get
            {
                if ((this as IStateDto).ReturnedFieldsContains("PhoneNumber"))
                {
                    return _state.PhoneNumber;
                }
                return null;
            }
            set
            {
                _state.PhoneNumber = value;
            }
        }

        string IUserStateProperties.PhoneNumber
        {
            get 
            {
                return (this._state as IUserStateProperties).PhoneNumber;
            }
            set 
            {
                this._state.PhoneNumber = value;
            }
        }

		public virtual bool? PhoneNumberConfirmed
        {
            get
            {
                if ((this as IStateDto).ReturnedFieldsContains("PhoneNumberConfirmed"))
                {
                    return _state.PhoneNumberConfirmed;
                }
                return null;
            }
            set
            {
                if (value != null && value.HasValue)
                {
                    _state.PhoneNumberConfirmed = value.Value;
                }
            }
        }

        bool IUserStateProperties.PhoneNumberConfirmed
        {
            get 
            {
                return (this._state as IUserStateProperties).PhoneNumberConfirmed;
            }
            set 
            {
                this._state.PhoneNumberConfirmed = value;
            }
        }

		public virtual bool? TwoFactorEnabled
        {
            get
            {
                if ((this as IStateDto).ReturnedFieldsContains("TwoFactorEnabled"))
                {
                    return _state.TwoFactorEnabled;
                }
                return null;
            }
            set
            {
                if (value != null && value.HasValue)
                {
                    _state.TwoFactorEnabled = value.Value;
                }
            }
        }

        bool IUserStateProperties.TwoFactorEnabled
        {
            get 
            {
                return (this._state as IUserStateProperties).TwoFactorEnabled;
            }
            set 
            {
                this._state.TwoFactorEnabled = value;
            }
        }

		public virtual string SecurityStamp
		{
            get
            {
                if ((this as IStateDto).ReturnedFieldsContains("SecurityStamp"))
                {
                    return _state.SecurityStamp;
                }
                return null;
            }
            set
            {
                _state.SecurityStamp = value;
            }
        }

        string IUserStateProperties.SecurityStamp
        {
            get 
            {
                return (this._state as IUserStateProperties).SecurityStamp;
            }
            set 
            {
                this._state.SecurityStamp = value;
            }
        }

		public virtual bool? Active
        {
            get
            {
                if ((this as IStateDto).ReturnedFieldsContains("Active"))
                {
                    return _state.Active;
                }
                return null;
            }
            set
            {
                if (value != null && value.HasValue)
                {
                    _state.Active = value.Value;
                }
            }
        }

        bool IUserStateProperties.Active
        {
            get 
            {
                return (this._state as IUserStateProperties).Active;
            }
            set 
            {
                this._state.Active = value;
            }
        }

		public virtual long? Version
        {
            get
            {
                if ((this as IStateDto).ReturnedFieldsContains("Version"))
                {
                    return _state.Version;
                }
                return null;
            }
            set
            {
                if (value != null && value.HasValue)
                {
                    _state.Version = value.Value;
                }
            }
        }

        long IUserStateProperties.Version
        {
            get 
            {
                return (this._state as IUserStateProperties).Version;
            }
            set 
            {
                this._state.Version = value;
            }
        }

		public virtual string CreatedBy
		{
            get
            {
                if ((this as IStateDto).ReturnedFieldsContains("CreatedBy"))
                {
                    return _state.CreatedBy;
                }
                return null;
            }
            set
            {
                _state.CreatedBy = value;
            }
        }
		public virtual DateTime? CreatedAt
        {
            get
            {
                if ((this as IStateDto).ReturnedFieldsContains("CreatedAt"))
                {
                    return _state.CreatedAt;
                }
                return null;
            }
            set
            {
                if (value != null && value.HasValue)
                {
                    _state.CreatedAt = value.Value;
                }
            }
        }
		public virtual string UpdatedBy
		{
            get
            {
                if ((this as IStateDto).ReturnedFieldsContains("UpdatedBy"))
                {
                    return _state.UpdatedBy;
                }
                return null;
            }
            set
            {
                _state.UpdatedBy = value;
            }
        }
		public virtual DateTime? UpdatedAt
        {
            get
            {
                if ((this as IStateDto).ReturnedFieldsContains("UpdatedAt"))
                {
                    return _state.UpdatedAt;
                }
                return null;
            }
            set
            {
                if (value != null && value.HasValue)
                {
                    _state.UpdatedAt = value.Value;
                }
            }
        }

		#region IIdentity implementation

		string IGlobalIdentity<string>.GlobalId
		{
			get { return (_state as IUserState).GlobalId; }
		}

		#endregion


		#region IActive implementation

		bool IActive.Active
		{
            get { return (_state as IActive).Active; }
		}

		#endregion

		#region IDeleted implementation

		bool IDeleted.Deleted
		{
            get { return (_state as IDeleted).Deleted; }
		}

		#endregion

		#region ICreated implementation

		string ICreated<string>.CreatedBy
		{
            get { return (_state as IUserState).CreatedBy; }
            set { (_state as IUserState).CreatedBy = value; }
		}

		DateTime ICreated<string>.CreatedAt
		{
            get { return (_state as IUserState).CreatedAt; }
            set { (_state as IUserState).CreatedAt = value; }
		}

		#endregion

		#region IUpdated implementation

		string IUpdated<string>.UpdatedBy
		{
            get { return (_state as IUserState).UpdatedBy; }
		}

		DateTime IUpdated<string>.UpdatedAt
		{
            get { return (_state as IUserState).UpdatedAt; }
		}

		#endregion

		#region IVersioned implementation

		long IVersioned<long>.Version
		{
            get { return _state.Version; }
		}

		#endregion

        bool IUserState.IsUnsaved
        {
            get { return ((IVersioned<long>)this).Version == UserState.VersionZero; }
        }

        public virtual UserRoleStateDto[] UserRoles
        {
            get 
            {
                if (!(this as IStateDto).ReturnedFieldsContains("UserRoles"))
                {
                    return null;
                }
                var dtos = new List<UserRoleStateDto>();
                if (this._state.UserRoles != null)
                {
                    foreach (var s in this._state.UserRoles)
                    {
                        var dto = new UserRoleStateDto((UserRoleState)s);
                        var returnFS = CollectionUtils.DictionaryGetValueIgnoringCase(ReturnedFields, "UserRoles");
                        if (!String.IsNullOrWhiteSpace(returnFS))
                        {
                            (dto as IStateDto).ReturnedFieldsString = returnFS;
                        }
                        else
                        {
                            (dto as IStateDto).AllFieldsReturned = this.AllFieldsReturned;
                        }
                        dtos.Add(dto);
                    }
                }
                return dtos.ToArray();
            }
            set 
            {
                if (value == null) { value = new UserRoleStateDto[0]; }
                var states = new List<UserRoleState>();
                foreach (var s in value)
                {
                    states.Add(s.ToUserRoleState());
                }
                this._state.SetUserRoles(new DtoUserRoleStates(this._state, states));
            }
        }

        IUserRoleStates IUserState.UserRoles
        {
            get { return _state.UserRoles; }
        }

        public virtual UserClaimStateDto[] UserClaims
        {
            get 
            {
                if (!(this as IStateDto).ReturnedFieldsContains("UserClaims"))
                {
                    return null;
                }
                var dtos = new List<UserClaimStateDto>();
                if (this._state.UserClaims != null)
                {
                    foreach (var s in this._state.UserClaims)
                    {
                        var dto = new UserClaimStateDto((UserClaimState)s);
                        var returnFS = CollectionUtils.DictionaryGetValueIgnoringCase(ReturnedFields, "UserClaims");
                        if (!String.IsNullOrWhiteSpace(returnFS))
                        {
                            (dto as IStateDto).ReturnedFieldsString = returnFS;
                        }
                        else
                        {
                            (dto as IStateDto).AllFieldsReturned = this.AllFieldsReturned;
                        }
                        dtos.Add(dto);
                    }
                }
                return dtos.ToArray();
            }
            set 
            {
                if (value == null) { value = new UserClaimStateDto[0]; }
                var states = new List<UserClaimState>();
                foreach (var s in value)
                {
                    states.Add(s.ToUserClaimState());
                }
                this._state.SetUserClaims(new DtoUserClaimStates(this._state, states));
            }
        }

        IUserClaimStates IUserState.UserClaims
        {
            get { return _state.UserClaims; }
        }

        public virtual UserPermissionStateDto[] UserPermissions
        {
            get 
            {
                if (!(this as IStateDto).ReturnedFieldsContains("UserPermissions"))
                {
                    return null;
                }
                var dtos = new List<UserPermissionStateDto>();
                if (this._state.UserPermissions != null)
                {
                    foreach (var s in this._state.UserPermissions)
                    {
                        var dto = new UserPermissionStateDto((UserPermissionState)s);
                        var returnFS = CollectionUtils.DictionaryGetValueIgnoringCase(ReturnedFields, "UserPermissions");
                        if (!String.IsNullOrWhiteSpace(returnFS))
                        {
                            (dto as IStateDto).ReturnedFieldsString = returnFS;
                        }
                        else
                        {
                            (dto as IStateDto).AllFieldsReturned = this.AllFieldsReturned;
                        }
                        dtos.Add(dto);
                    }
                }
                return dtos.ToArray();
            }
            set 
            {
                if (value == null) { value = new UserPermissionStateDto[0]; }
                var states = new List<UserPermissionState>();
                foreach (var s in value)
                {
                    states.Add(s.ToUserPermissionState());
                }
                this._state.SetUserPermissions(new DtoUserPermissionStates(this._state, states));
            }
        }

        IUserPermissionStates IUserState.UserPermissions
        {
            get { return _state.UserPermissions; }
        }

        public virtual UserLoginStateDto[] UserLogins
        {
            get 
            {
                if (!(this as IStateDto).ReturnedFieldsContains("UserLogins"))
                {
                    return null;
                }
                var dtos = new List<UserLoginStateDto>();
                if (this._state.UserLogins != null)
                {
                    foreach (var s in this._state.UserLogins)
                    {
                        var dto = new UserLoginStateDto((UserLoginState)s);
                        var returnFS = CollectionUtils.DictionaryGetValueIgnoringCase(ReturnedFields, "UserLogins");
                        if (!String.IsNullOrWhiteSpace(returnFS))
                        {
                            (dto as IStateDto).ReturnedFieldsString = returnFS;
                        }
                        else
                        {
                            (dto as IStateDto).AllFieldsReturned = this.AllFieldsReturned;
                        }
                        dtos.Add(dto);
                    }
                }
                return dtos.ToArray();
            }
            set 
            {
                if (value == null) { value = new UserLoginStateDto[0]; }
                var states = new List<UserLoginState>();
                foreach (var s in value)
                {
                    states.Add(s.ToUserLoginState());
                }
                this._state.SetUserLogins(new DtoUserLoginStates(this._state, states));
            }
        }

        IUserLoginStates IUserState.UserLogins
        {
            get { return _state.UserLogins; }
        }


		void IUserState.When(IUserStateCreated e)
		{
            throw new NotSupportedException();
		}


		void IUserState.When(IUserStateMergePatched e)
		{
            throw new NotSupportedException();
		}

		void IUserState.When(IUserStateDeleted e)
		{
            throw new NotSupportedException();
		}


		void IUserState.Mutate(IEvent e)
		{
            throw new NotSupportedException();
		}

        // //////////////////////////////////////////////////////////////


        public class DtoUserRoleStates : IUserRoleStates
        {

            private IUserState _outerState;

            private IEnumerable<IUserRoleState> _innerStates;

            public DtoUserRoleStates(IUserState outerState, IEnumerable<IUserRoleState> innerStates)
            {
                this._outerState = outerState;
                if (innerStates == null)
                {
                    this._innerStates = new IUserRoleState[] { };
                }
                else
                {
                    this._innerStates = innerStates;
                }
            }

            public IEnumerator<IUserRoleState> GetEnumerator()
            {
                return _innerStates.GetEnumerator();
            }

            System.Collections.IEnumerator System.Collections.IEnumerable.GetEnumerator()
            {
                return _innerStates.GetEnumerator();
            }

            public IUserRoleState Get(string roleId)
            {
                throw new NotSupportedException();
            }

            public void Remove(IUserRoleState state)
            {
                throw new NotSupportedException();
            }

            public void AddToSave(IUserRoleState state)
            {
                throw new NotSupportedException();
            }

            public void Save()
            {
                throw new NotSupportedException();
            }
        }

        public class DtoUserClaimStates : IUserClaimStates
        {

            private IUserState _outerState;

            private IEnumerable<IUserClaimState> _innerStates;

            public DtoUserClaimStates(IUserState outerState, IEnumerable<IUserClaimState> innerStates)
            {
                this._outerState = outerState;
                if (innerStates == null)
                {
                    this._innerStates = new IUserClaimState[] { };
                }
                else
                {
                    this._innerStates = innerStates;
                }
            }

            public IEnumerator<IUserClaimState> GetEnumerator()
            {
                return _innerStates.GetEnumerator();
            }

            System.Collections.IEnumerator System.Collections.IEnumerable.GetEnumerator()
            {
                return _innerStates.GetEnumerator();
            }

            public IUserClaimState Get(int claimId)
            {
                throw new NotSupportedException();
            }

            public void Remove(IUserClaimState state)
            {
                throw new NotSupportedException();
            }

            public void AddToSave(IUserClaimState state)
            {
                throw new NotSupportedException();
            }

            public void Save()
            {
                throw new NotSupportedException();
            }
        }

        public class DtoUserPermissionStates : IUserPermissionStates
        {

            private IUserState _outerState;

            private IEnumerable<IUserPermissionState> _innerStates;

            public DtoUserPermissionStates(IUserState outerState, IEnumerable<IUserPermissionState> innerStates)
            {
                this._outerState = outerState;
                if (innerStates == null)
                {
                    this._innerStates = new IUserPermissionState[] { };
                }
                else
                {
                    this._innerStates = innerStates;
                }
            }

            public IEnumerator<IUserPermissionState> GetEnumerator()
            {
                return _innerStates.GetEnumerator();
            }

            System.Collections.IEnumerator System.Collections.IEnumerable.GetEnumerator()
            {
                return _innerStates.GetEnumerator();
            }

            public IUserPermissionState Get(string permissionId)
            {
                throw new NotSupportedException();
            }

            public void Remove(IUserPermissionState state)
            {
                throw new NotSupportedException();
            }

            public void AddToSave(IUserPermissionState state)
            {
                throw new NotSupportedException();
            }

            public void Save()
            {
                throw new NotSupportedException();
            }
        }

        public class DtoUserLoginStates : IUserLoginStates
        {

            private IUserState _outerState;

            private IEnumerable<IUserLoginState> _innerStates;

            public DtoUserLoginStates(IUserState outerState, IEnumerable<IUserLoginState> innerStates)
            {
                this._outerState = outerState;
                if (innerStates == null)
                {
                    this._innerStates = new IUserLoginState[] { };
                }
                else
                {
                    this._innerStates = innerStates;
                }
            }

            public IEnumerator<IUserLoginState> GetEnumerator()
            {
                return _innerStates.GetEnumerator();
            }

            System.Collections.IEnumerator System.Collections.IEnumerable.GetEnumerator()
            {
                return _innerStates.GetEnumerator();
            }

            public IUserLoginState Get(LoginKey loginKey)
            {
                throw new NotSupportedException();
            }

            public void Remove(IUserLoginState state)
            {
                throw new NotSupportedException();
            }

            public void AddToSave(IUserLoginState state)
            {
                throw new NotSupportedException();
            }

            public void Save()
            {
                throw new NotSupportedException();
            }
        }

	}

    partial class UserStateDtoCollection : StateDtoCollectionBase<UserStateDto>
    {

        protected override bool IsCollectionField(string fieldName)
        {
            return CollectionUtils.CollectionContainsIgnoringCase(UserStateDto._collectionFieldNames, fieldName);
        }

    }

}

