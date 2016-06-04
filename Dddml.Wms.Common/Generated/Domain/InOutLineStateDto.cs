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

	public partial class InOutLineStateDto : StateDtoBase, IInOutLineState
	{

        internal static IList<string> _collectionFieldNames = new string[] {  };

        protected override bool IsCollectionField(string fieldName)
        {
            return CollectionUtils.CollectionContainsIgnoringCase(_collectionFieldNames, fieldName);
        }

		private InOutLineState _state;

        public InOutLineStateDto()
        {
            this._state = new InOutLineState();
        }

		public InOutLineStateDto(InOutLineState state)
		{
            this._state = state;
		}

		internal InOutLineState ToInOutLineState()
		{
			return this._state;
		}


        public SkuIdDto SkuId
        {
            get
            {
                if ((this as IStateDto).ReturnedFieldsContains("SkuId"))
                {
					return new SkuIdDto(_state.SkuId);
                }
                return null;
            }
            set
            {
                _state.SkuId = value.ToSkuId();
            }
        }


        SkuId IInOutLineStateProperties.SkuId
        {
            get 
            {
                return (this._state as IInOutLineStateProperties).SkuId;
            }
            set 
            {
                this._state.SkuId = value;
            }
        }

		public virtual long? LineNumber
        {
            get
            {
                if ((this as IStateDto).ReturnedFieldsContains("LineNumber"))
                {
                    return _state.LineNumber;
                }
                return null;
            }
            set
            {
                if (value != null && value.HasValue)
                {
                    _state.LineNumber = value.Value;
                }
            }
        }

        long IInOutLineStateProperties.LineNumber
        {
            get 
            {
                return (this._state as IInOutLineStateProperties).LineNumber;
            }
            set 
            {
                this._state.LineNumber = value;
            }
        }

		public virtual string Description
		{
            get
            {
                if ((this as IStateDto).ReturnedFieldsContains("Description"))
                {
                    return _state.Description;
                }
                return null;
            }
            set
            {
                _state.Description = value;
            }
        }

        string IInOutLineStateProperties.Description
        {
            get 
            {
                return (this._state as IInOutLineStateProperties).Description;
            }
            set 
            {
                this._state.Description = value;
            }
        }

		public virtual string LocatorId
		{
            get
            {
                if ((this as IStateDto).ReturnedFieldsContains("LocatorId"))
                {
                    return _state.LocatorId;
                }
                return null;
            }
            set
            {
                _state.LocatorId = value;
            }
        }

        string IInOutLineStateProperties.LocatorId
        {
            get 
            {
                return (this._state as IInOutLineStateProperties).LocatorId;
            }
            set 
            {
                this._state.LocatorId = value;
            }
        }

		public virtual string Product
		{
            get
            {
                if ((this as IStateDto).ReturnedFieldsContains("Product"))
                {
                    return _state.Product;
                }
                return null;
            }
            set
            {
                _state.Product = value;
            }
        }

        string IInOutLineStateProperties.Product
        {
            get 
            {
                return (this._state as IInOutLineStateProperties).Product;
            }
            set 
            {
                this._state.Product = value;
            }
        }

		public virtual string UomId
		{
            get
            {
                if ((this as IStateDto).ReturnedFieldsContains("UomId"))
                {
                    return _state.UomId;
                }
                return null;
            }
            set
            {
                _state.UomId = value;
            }
        }

        string IInOutLineStateProperties.UomId
        {
            get 
            {
                return (this._state as IInOutLineStateProperties).UomId;
            }
            set 
            {
                this._state.UomId = value;
            }
        }

		public virtual decimal? MovementQuantity
        {
            get
            {
                if ((this as IStateDto).ReturnedFieldsContains("MovementQuantity"))
                {
                    return _state.MovementQuantity;
                }
                return null;
            }
            set
            {
                if (value != null && value.HasValue)
                {
                    _state.MovementQuantity = value.Value;
                }
            }
        }

        decimal IInOutLineStateProperties.MovementQuantity
        {
            get 
            {
                return (this._state as IInOutLineStateProperties).MovementQuantity;
            }
            set 
            {
                this._state.MovementQuantity = value;
            }
        }

		public virtual decimal? ConfirmedQuantity
        {
            get
            {
                if ((this as IStateDto).ReturnedFieldsContains("ConfirmedQuantity"))
                {
                    return _state.ConfirmedQuantity;
                }
                return null;
            }
            set
            {
                if (value != null && value.HasValue)
                {
                    _state.ConfirmedQuantity = value.Value;
                }
            }
        }

        decimal IInOutLineStateProperties.ConfirmedQuantity
        {
            get 
            {
                return (this._state as IInOutLineStateProperties).ConfirmedQuantity;
            }
            set 
            {
                this._state.ConfirmedQuantity = value;
            }
        }

		public virtual decimal? ScrappedQuantity
        {
            get
            {
                if ((this as IStateDto).ReturnedFieldsContains("ScrappedQuantity"))
                {
                    return _state.ScrappedQuantity;
                }
                return null;
            }
            set
            {
                if (value != null && value.HasValue)
                {
                    _state.ScrappedQuantity = value.Value;
                }
            }
        }

        decimal IInOutLineStateProperties.ScrappedQuantity
        {
            get 
            {
                return (this._state as IInOutLineStateProperties).ScrappedQuantity;
            }
            set 
            {
                this._state.ScrappedQuantity = value;
            }
        }

		public virtual decimal? TargetQuantity
        {
            get
            {
                if ((this as IStateDto).ReturnedFieldsContains("TargetQuantity"))
                {
                    return _state.TargetQuantity;
                }
                return null;
            }
            set
            {
                if (value != null && value.HasValue)
                {
                    _state.TargetQuantity = value.Value;
                }
            }
        }

        decimal IInOutLineStateProperties.TargetQuantity
        {
            get 
            {
                return (this._state as IInOutLineStateProperties).TargetQuantity;
            }
            set 
            {
                this._state.TargetQuantity = value;
            }
        }

		public virtual decimal? PickedQuantity
        {
            get
            {
                if ((this as IStateDto).ReturnedFieldsContains("PickedQuantity"))
                {
                    return _state.PickedQuantity;
                }
                return null;
            }
            set
            {
                if (value != null && value.HasValue)
                {
                    _state.PickedQuantity = value.Value;
                }
            }
        }

        decimal IInOutLineStateProperties.PickedQuantity
        {
            get 
            {
                return (this._state as IInOutLineStateProperties).PickedQuantity;
            }
            set 
            {
                this._state.PickedQuantity = value;
            }
        }

		public virtual bool? IsInvoiced
        {
            get
            {
                if ((this as IStateDto).ReturnedFieldsContains("IsInvoiced"))
                {
                    return _state.IsInvoiced;
                }
                return null;
            }
            set
            {
                if (value != null && value.HasValue)
                {
                    _state.IsInvoiced = value.Value;
                }
            }
        }

        bool IInOutLineStateProperties.IsInvoiced
        {
            get 
            {
                return (this._state as IInOutLineStateProperties).IsInvoiced;
            }
            set 
            {
                this._state.IsInvoiced = value;
            }
        }

		public virtual string AttributeSetInstanceId
		{
            get
            {
                if ((this as IStateDto).ReturnedFieldsContains("AttributeSetInstanceId"))
                {
                    return _state.AttributeSetInstanceId;
                }
                return null;
            }
            set
            {
                _state.AttributeSetInstanceId = value;
            }
        }

        string IInOutLineStateProperties.AttributeSetInstanceId
        {
            get 
            {
                return (this._state as IInOutLineStateProperties).AttributeSetInstanceId;
            }
            set 
            {
                this._state.AttributeSetInstanceId = value;
            }
        }

		public virtual bool? IsDescription
        {
            get
            {
                if ((this as IStateDto).ReturnedFieldsContains("IsDescription"))
                {
                    return _state.IsDescription;
                }
                return null;
            }
            set
            {
                if (value != null && value.HasValue)
                {
                    _state.IsDescription = value.Value;
                }
            }
        }

        bool IInOutLineStateProperties.IsDescription
        {
            get 
            {
                return (this._state as IInOutLineStateProperties).IsDescription;
            }
            set 
            {
                this._state.IsDescription = value;
            }
        }

		public virtual bool? Processed
        {
            get
            {
                if ((this as IStateDto).ReturnedFieldsContains("Processed"))
                {
                    return _state.Processed;
                }
                return null;
            }
            set
            {
                if (value != null && value.HasValue)
                {
                    _state.Processed = value.Value;
                }
            }
        }

        bool IInOutLineStateProperties.Processed
        {
            get 
            {
                return (this._state as IInOutLineStateProperties).Processed;
            }
            set 
            {
                this._state.Processed = value;
            }
        }

		public virtual decimal? QuantityEntered
        {
            get
            {
                if ((this as IStateDto).ReturnedFieldsContains("QuantityEntered"))
                {
                    return _state.QuantityEntered;
                }
                return null;
            }
            set
            {
                if (value != null && value.HasValue)
                {
                    _state.QuantityEntered = value.Value;
                }
            }
        }

        decimal IInOutLineStateProperties.QuantityEntered
        {
            get 
            {
                return (this._state as IInOutLineStateProperties).QuantityEntered;
            }
            set 
            {
                this._state.QuantityEntered = value;
            }
        }

		public virtual long? RmaLineNumber
        {
            get
            {
                if ((this as IStateDto).ReturnedFieldsContains("RmaLineNumber"))
                {
                    return _state.RmaLineNumber;
                }
                return null;
            }
            set
            {
                if (value != null && value.HasValue)
                {
                    _state.RmaLineNumber = value.Value;
                }
            }
        }

        long IInOutLineStateProperties.RmaLineNumber
        {
            get 
            {
                return (this._state as IInOutLineStateProperties).RmaLineNumber;
            }
            set 
            {
                this._state.RmaLineNumber = value;
            }
        }

		public virtual long? ReversalLineNumber
        {
            get
            {
                if ((this as IStateDto).ReturnedFieldsContains("ReversalLineNumber"))
                {
                    return _state.ReversalLineNumber;
                }
                return null;
            }
            set
            {
                if (value != null && value.HasValue)
                {
                    _state.ReversalLineNumber = value.Value;
                }
            }
        }

        long IInOutLineStateProperties.ReversalLineNumber
        {
            get 
            {
                return (this._state as IInOutLineStateProperties).ReversalLineNumber;
            }
            set 
            {
                this._state.ReversalLineNumber = value;
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

        bool IInOutLineStateProperties.Active
        {
            get 
            {
                return (this._state as IInOutLineStateProperties).Active;
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

        long IInOutLineStateProperties.Version
        {
            get 
            {
                return (this._state as IInOutLineStateProperties).Version;
            }
            set 
            {
                this._state.Version = value;
            }
        }

		public virtual string InOutDocumentNumber
		{
            get
            {
                if ((this as IStateDto).ReturnedFieldsContains("InOutDocumentNumber"))
                {
                    return _state.InOutDocumentNumber;
                }
                return null;
            }
            set
            {
                _state.InOutDocumentNumber = value;
            }
        }

        string IInOutLineStateProperties.InOutDocumentNumber
        {
            get 
            {
                return (this._state as IInOutLineStateProperties).InOutDocumentNumber;
            }
            set 
            {
                this._state.InOutDocumentNumber = value;
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


		InOutLineId IGlobalIdentity<InOutLineId>.GlobalId {
			get { return (_state as IInOutLineState).GlobalId; }
		}

        SkuId ILocalIdentity<SkuId>.LocalId
        {
			get { return (_state as IInOutLineState).LocalId; }
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
            get { return (_state as IInOutLineState).CreatedBy; }
            set { (_state as IInOutLineState).CreatedBy = value; }
		}

		DateTime ICreated<string>.CreatedAt
		{
            get { return (_state as IInOutLineState).CreatedAt; }
            set { (_state as IInOutLineState).CreatedAt = value; }
		}

		#endregion

		#region IUpdated implementation

		string IUpdated<string>.UpdatedBy
		{
            get { return (_state as IInOutLineState).UpdatedBy; }
		}

		DateTime IUpdated<string>.UpdatedAt
		{
            get { return (_state as IInOutLineState).UpdatedAt; }
		}

		#endregion

		#region IVersioned implementation

		long IVersioned<long>.Version
		{
            get { return _state.Version; }
		}


		#endregion



		void IInOutLineState.When(IInOutLineStateCreated e)
		{
            throw new NotSupportedException();
		}


		void IInOutLineState.When(IInOutLineStateMergePatched e)
		{
            throw new NotSupportedException();
		}

		void IInOutLineState.When(IInOutLineStateRemoved e)
		{
            throw new NotSupportedException();
		}


		void IInOutLineState.Mutate(IEvent e)
		{
            throw new NotSupportedException();
		}

        // //////////////////////////////////////////////////////////////


	}

    partial class InOutLineStateDtoCollection : StateDtoCollectionBase<InOutLineStateDto>
    {

        protected override bool IsCollectionField(string fieldName)
        {
            return CollectionUtils.CollectionContainsIgnoringCase(InOutLineStateDto._collectionFieldNames, fieldName);
        }

    }

}

