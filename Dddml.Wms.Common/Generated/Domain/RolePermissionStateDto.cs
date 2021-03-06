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

	public partial class RolePermissionStateDto : StateDtoBase, IRolePermissionState
	{

        internal static IList<string> _collectionFieldNames = new string[] {  };

        protected override bool IsCollectionField(string fieldName)
        {
            return CollectionUtils.CollectionContainsIgnoringCase(_collectionFieldNames, fieldName);
        }

		private RolePermissionState _state;

        public RolePermissionStateDto()
        {
            this._state = new RolePermissionState();
        }

		public RolePermissionStateDto(RolePermissionState state)
		{
            this._state = state;
		}

		internal RolePermissionState ToRolePermissionState()
		{
			return this._state;
		}


        public RolePermissionIdDto Id
        {
            get
            {
                if ((this as IStateDto).ReturnedFieldsContains("Id"))
                {
					return new RolePermissionIdDto(_state.Id);
                }
                return null;
            }
            set
            {
                _state.Id = value.ToRolePermissionId();
            }
        }


        RolePermissionId IRolePermissionStateProperties.Id
        {
            get 
            {
                return (this._state as IRolePermissionStateProperties).Id;
            }
            set 
            {
                this._state.Id = value;
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

        bool IRolePermissionStateProperties.Active
        {
            get 
            {
                return (this._state as IRolePermissionStateProperties).Active;
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

        long IRolePermissionStateProperties.Version
        {
            get 
            {
                return (this._state as IRolePermissionStateProperties).Version;
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

		RolePermissionId IGlobalIdentity<RolePermissionId>.GlobalId
		{
			get { return (_state as IRolePermissionState).GlobalId; }
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
            get { return (_state as IRolePermissionState).CreatedBy; }
            set { (_state as IRolePermissionState).CreatedBy = value; }
		}

		DateTime ICreated<string>.CreatedAt
		{
            get { return (_state as IRolePermissionState).CreatedAt; }
            set { (_state as IRolePermissionState).CreatedAt = value; }
		}

		#endregion

		#region IUpdated implementation

		string IUpdated<string>.UpdatedBy
		{
            get { return (_state as IRolePermissionState).UpdatedBy; }
		}

		DateTime IUpdated<string>.UpdatedAt
		{
            get { return (_state as IRolePermissionState).UpdatedAt; }
		}

		#endregion

		#region IVersioned implementation

		long IVersioned<long>.Version
		{
            get { return _state.Version; }
		}

		#endregion

        bool IRolePermissionState.IsUnsaved
        {
            get { return ((IVersioned<long>)this).Version == RolePermissionState.VersionZero; }
        }


		void IRolePermissionState.When(IRolePermissionStateCreated e)
		{
            throw new NotSupportedException();
		}


		void IRolePermissionState.When(IRolePermissionStateMergePatched e)
		{
            throw new NotSupportedException();
		}

		void IRolePermissionState.When(IRolePermissionStateDeleted e)
		{
            throw new NotSupportedException();
		}


		void IRolePermissionState.Mutate(IEvent e)
		{
            throw new NotSupportedException();
		}

        // //////////////////////////////////////////////////////////////


	}

    partial class RolePermissionStateDtoCollection : StateDtoCollectionBase<RolePermissionStateDto>
    {

        protected override bool IsCollectionField(string fieldName)
        {
            return CollectionUtils.CollectionContainsIgnoringCase(RolePermissionStateDto._collectionFieldNames, fieldName);
        }

    }

}

