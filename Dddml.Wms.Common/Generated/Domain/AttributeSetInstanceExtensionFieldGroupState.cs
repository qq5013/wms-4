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

	public partial class AttributeSetInstanceExtensionFieldGroupState : AttributeSetInstanceExtensionFieldGroupStateProperties, IAttributeSetInstanceExtensionFieldGroupState, ISaveable
	{

		//public virtual long Version { get; set; }

		public virtual string CreatedBy { get; set; }

		public virtual DateTime CreatedAt { get; set; }

		public virtual string UpdatedBy { get; set; }

		public virtual DateTime UpdatedAt { get; set; }

		public virtual bool Deleted { get; set; }


		#region IIdentity implementation

		string IGlobalIdentity<string>.GlobalId
		{
			get
			{
				return this.Id;
			}
		}

		#endregion



		#region IActive implementation

		bool IActive.Active
		{
			get
			{
				return this.Active;
			}
		}

		#endregion

		#region IDeleted implementation

		bool IDeleted.Deleted
		{
			get
			{
				return this.Deleted;
			}
		}

		#endregion

		#region ICreated implementation

		string ICreated<string>.CreatedBy
		{
			get
			{
				return this.CreatedBy;
			}
			set
			{
				this.CreatedBy = value;
			}
		}

		DateTime ICreated<string>.CreatedAt
		{
			get
			{
				return this.CreatedAt;
			}
			set
			{
				this.CreatedAt = value;
			}
		}

		#endregion

		#region IUpdated implementation

		string IUpdated<string>.UpdatedBy
		{
			get
			{
				return this.UpdatedBy;
			}
		}

		DateTime IUpdated<string>.UpdatedAt
		{
			get
			{
				return this.UpdatedAt;
			}
		}

		#endregion

		#region IVersioned implementation

		long IVersioned<long>.Version
		{
			get
			{
				return this.Version;
			}
		}


		#endregion

		public static long VersionZero
		{
			get
			{
				return (long)0;
			}
		}


        private IAttributeSetInstanceExtensionFieldStates _fields;
      
        public virtual IAttributeSetInstanceExtensionFieldStates Fields
        {
            get
            {
                return this._fields;
            }
        }

        protected internal virtual void SetFields(IAttributeSetInstanceExtensionFieldStates value)
        {
            this._fields = value;
        }



		public AttributeSetInstanceExtensionFieldGroupState ()
		{
            _fields = new AttributeSetInstanceExtensionFieldStates(this);

            InitializeProperties();
		}



		#region Saveable Implements

        public virtual void Save()
        {
            _fields.Save();

        }


		#endregion


		public virtual void When(IAttributeSetInstanceExtensionFieldGroupStateCreated e)
		{
			ThrowOnWrongEvent(e);
			this.FieldType = e.FieldType;

			this.FieldLength = e.FieldLength;

            this.FieldCount = (e.FieldCount != null && e.FieldCount.HasValue) ? e.FieldCount.Value : default(int);

			this.NameFormat = e.NameFormat;

			this.Description = e.Description;

            this.Active = (e.Active != null && e.Active.HasValue) ? e.Active.Value : default(bool);

			this.Deleted = false;

			this.CreatedBy = e.CreatedBy;
			this.CreatedAt = e.CreatedAt;

			foreach (IAttributeSetInstanceExtensionFieldStateCreated innerEvent in e.AttributeSetInstanceExtensionFieldEvents) {
				IAttributeSetInstanceExtensionFieldState innerState = this.Fields.Get(innerEvent.GlobalId.Index);
				innerState.Mutate (innerEvent);
			}

		}


		public virtual void When(IAttributeSetInstanceExtensionFieldGroupStateMergePatched e)
		{
			ThrowOnWrongEvent(e);

			if (e.FieldType == null)
			{
				if (e.IsPropertyFieldTypeRemoved)
				{
					this.FieldType = default(string);
				}
			}
			else
			{
				this.FieldType = e.FieldType;
			}

			if (e.FieldLength == null)
			{
				if (e.IsPropertyFieldLengthRemoved)
				{
					this.FieldLength = default(int?);
				}
			}
			else
			{
				this.FieldLength = e.FieldLength;
			}

			if (e.FieldCount == null)
			{
				if (e.IsPropertyFieldCountRemoved)
				{
					this.FieldCount = default(int);
				}
			}
			else
			{
				this.FieldCount = (e.FieldCount != null && e.FieldCount.HasValue) ? e.FieldCount.Value : default(int);
			}

			if (e.NameFormat == null)
			{
				if (e.IsPropertyNameFormatRemoved)
				{
					this.NameFormat = default(string);
				}
			}
			else
			{
				this.NameFormat = e.NameFormat;
			}

			if (e.Description == null)
			{
				if (e.IsPropertyDescriptionRemoved)
				{
					this.Description = default(string);
				}
			}
			else
			{
				this.Description = e.Description;
			}

			if (e.Active == null)
			{
				if (e.IsPropertyActiveRemoved)
				{
					this.Active = default(bool);
				}
			}
			else
			{
				this.Active = (e.Active != null && e.Active.HasValue) ? e.Active.Value : default(bool);
			}


			this.UpdatedBy = e.CreatedBy;
			this.UpdatedAt = e.CreatedAt;


			foreach (IAttributeSetInstanceExtensionFieldStateEvent innerEvent in e.AttributeSetInstanceExtensionFieldEvents)
            {
                IAttributeSetInstanceExtensionFieldState innerState = this.Fields.Get(innerEvent.GlobalId.Index);

                innerState.Mutate(innerEvent);
                var removed = innerEvent as IAttributeSetInstanceExtensionFieldStateRemoved;
                if (removed != null)
                {
                    this.Fields.Remove(innerState);
                }
          
            }

		}

		public virtual void When(IAttributeSetInstanceExtensionFieldGroupStateDeleted e)
		{
			ThrowOnWrongEvent(e);

			this.Deleted = true;
			this.UpdatedBy = e.CreatedBy;
			this.UpdatedAt = e.CreatedAt;

            foreach (var innerState in this.Fields)
            {
                this.Fields.Remove(innerState);
                
                var innerE = e.NewAttributeSetInstanceExtensionFieldStateRemoved(innerState.Index);
                ((AttributeSetInstanceExtensionFieldStateEventBase)innerE).CreatedAt = e.CreatedAt;
                ((AttributeSetInstanceExtensionFieldStateEventBase)innerE).CreatedBy = e.CreatedBy;
                innerState.When(innerE);
                //e.AddAttributeSetInstanceExtensionFieldEvent(innerE);

            }

		}


		public virtual void Mutate(IEvent e)
		{
			((dynamic)this).When((dynamic)e);
		}

		protected void ThrowOnWrongEvent(IAttributeSetInstanceExtensionFieldGroupStateEvent stateEvent)
		{
			var stateEntityId = this.Id; // Aggregate Id
			var eventEntityId = stateEvent.StateEventId.Id; // EntityBase.Aggregate.GetStateEventIdPropertyIdName();
			if (stateEntityId != eventEntityId)
			{
				DomainError.Named("mutateWrongEntity", "Entity Id {0} in state but entity id {1} in event", stateEntityId, eventEntityId);
			}

			var stateVersion = this.Version;
			var eventVersion = stateEvent.StateEventId.Version;
			if (stateVersion != eventVersion)
			{
				throw DomainError.Named("concurrencyConflict", "Conflict between state version {0} and event version {1}", stateVersion, eventVersion);
			}

		}
	}

}

