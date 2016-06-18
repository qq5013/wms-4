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

	public partial class UserRoleStateDto : StateDtoBase, IUserRoleState
	{

        internal static IList<string> _collectionFieldNames = new string[] {  };

        protected override bool IsCollectionField(string fieldName)
        {
            return CollectionUtils.CollectionContainsIgnoringCase(_collectionFieldNames, fieldName);
        }

		private UserRoleState _state;

        public UserRoleStateDto()
        {
            this._state = new UserRoleState();
        }

		public UserRoleStateDto(UserRoleState state)
		{
            this._state = state;
		}

		internal UserRoleState ToUserRoleState()
		{
			return this._state;
		}

		public virtual string RoleId
		{
            get
            {
                if ((this as IStateDto).ReturnedFieldsContains("RoleId"))
                {
                    return _state.RoleId;
                }
                return null;
            }
            set
            {
                _state.RoleId = value;
            }
        }

        string IUserRoleStateProperties.RoleId
        {
            get 
            {
                return (this._state as IUserRoleStateProperties).RoleId;
            }
            set 
            {
                this._state.RoleId = value;
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

        bool IUserRoleStateProperties.Active
        {
            get 
            {
                return (this._state as IUserRoleStateProperties).Active;
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

        long IUserRoleStateProperties.Version
        {
            get 
            {
                return (this._state as IUserRoleStateProperties).Version;
            }
            set 
            {
                this._state.Version = value;
            }
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

        string IUserRoleStateProperties.UserId
        {
            get 
            {
                return (this._state as IUserRoleStateProperties).UserId;
            }
            set 
            {
                this._state.UserId = value;
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


		UserRoleId IGlobalIdentity<UserRoleId>.GlobalId {
			get { return (_state as IUserRoleState).GlobalId; }
		}

        string ILocalIdentity<string>.LocalId
        {
			get { return (_state as IUserRoleState).LocalId; }
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
            get { return (_state as IUserRoleState).CreatedBy; }
            set { (_state as IUserRoleState).CreatedBy = value; }
		}

		DateTime ICreated<string>.CreatedAt
		{
            get { return (_state as IUserRoleState).CreatedAt; }
            set { (_state as IUserRoleState).CreatedAt = value; }
		}

		#endregion

		#region IUpdated implementation

		string IUpdated<string>.UpdatedBy
		{
            get { return (_state as IUserRoleState).UpdatedBy; }
		}

		DateTime IUpdated<string>.UpdatedAt
		{
            get { return (_state as IUserRoleState).UpdatedAt; }
		}

		#endregion

		#region IVersioned implementation

		long IVersioned<long>.Version
		{
            get { return _state.Version; }
		}


		#endregion



		void IUserRoleState.When(IUserRoleStateCreated e)
		{
            throw new NotSupportedException();
		}


		void IUserRoleState.When(IUserRoleStateMergePatched e)
		{
            throw new NotSupportedException();
		}

		void IUserRoleState.When(IUserRoleStateRemoved e)
		{
            throw new NotSupportedException();
		}


		void IUserRoleState.Mutate(IEvent e)
		{
            throw new NotSupportedException();
		}

        // //////////////////////////////////////////////////////////////


	}

    partial class UserRoleStateDtoCollection : StateDtoCollectionBase<UserRoleStateDto>
    {

        protected override bool IsCollectionField(string fieldName)
        {
            return CollectionUtils.CollectionContainsIgnoringCase(UserRoleStateDto._collectionFieldNames, fieldName);
        }

    }

}

