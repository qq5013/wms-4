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

	public abstract class AttributeSetInstanceExtensionFieldGroupStateEventDtoBase : IStateEventDto, IAttributeSetInstanceExtensionFieldGroupStateCreated, IAttributeSetInstanceExtensionFieldGroupStateMergePatched, IAttributeSetInstanceExtensionFieldGroupStateDeleted
	{

		public virtual AttributeSetInstanceExtensionFieldGroupStateEventIdDto StateEventId { get; set; }

		public virtual string FieldType { get; set; }

		public virtual int? FieldLength { get; set; }

		public virtual int? FieldCount { get; set; }

		public virtual string NameFormat { get; set; }

		public virtual string Description { get; set; }

		public virtual bool? Active { get; set; }

		public virtual string CreatedBy { get; set; }

		public virtual DateTime CreatedAt { get; set; }

        public virtual string CommandId { get; set; }

		AttributeSetInstanceExtensionFieldGroupStateEventId IGlobalIdentity<AttributeSetInstanceExtensionFieldGroupStateEventId>.GlobalId {
			get {
				return this.StateEventId.ToAttributeSetInstanceExtensionFieldGroupStateEventId();
			}
		}

        public virtual bool StateEventReadOnly { get; set; }

        bool IAttributeSetInstanceExtensionFieldGroupStateEvent.ReadOnly
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

		public virtual bool? IsPropertyFieldTypeRemoved { get; set; }

        bool IAttributeSetInstanceExtensionFieldGroupStateMergePatched.IsPropertyFieldTypeRemoved
        {
            get 
            {
                var b = this.IsPropertyFieldTypeRemoved;
                if (b != null && b.HasValue)
                {
                    return b.Value;
                }
                return default(bool);
            }
            set 
            {
                this.IsPropertyFieldTypeRemoved = value;
            }
        }

		public virtual bool? IsPropertyFieldLengthRemoved { get; set; }

        bool IAttributeSetInstanceExtensionFieldGroupStateMergePatched.IsPropertyFieldLengthRemoved
        {
            get 
            {
                var b = this.IsPropertyFieldLengthRemoved;
                if (b != null && b.HasValue)
                {
                    return b.Value;
                }
                return default(bool);
            }
            set 
            {
                this.IsPropertyFieldLengthRemoved = value;
            }
        }

		public virtual bool? IsPropertyFieldCountRemoved { get; set; }

        bool IAttributeSetInstanceExtensionFieldGroupStateMergePatched.IsPropertyFieldCountRemoved
        {
            get 
            {
                var b = this.IsPropertyFieldCountRemoved;
                if (b != null && b.HasValue)
                {
                    return b.Value;
                }
                return default(bool);
            }
            set 
            {
                this.IsPropertyFieldCountRemoved = value;
            }
        }

		public virtual bool? IsPropertyNameFormatRemoved { get; set; }

        bool IAttributeSetInstanceExtensionFieldGroupStateMergePatched.IsPropertyNameFormatRemoved
        {
            get 
            {
                var b = this.IsPropertyNameFormatRemoved;
                if (b != null && b.HasValue)
                {
                    return b.Value;
                }
                return default(bool);
            }
            set 
            {
                this.IsPropertyNameFormatRemoved = value;
            }
        }

		public virtual bool? IsPropertyDescriptionRemoved { get; set; }

        bool IAttributeSetInstanceExtensionFieldGroupStateMergePatched.IsPropertyDescriptionRemoved
        {
            get 
            {
                var b = this.IsPropertyDescriptionRemoved;
                if (b != null && b.HasValue)
                {
                    return b.Value;
                }
                return default(bool);
            }
            set 
            {
                this.IsPropertyDescriptionRemoved = value;
            }
        }

		public virtual bool? IsPropertyActiveRemoved { get; set; }

        bool IAttributeSetInstanceExtensionFieldGroupStateMergePatched.IsPropertyActiveRemoved
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


        private AttributeSetInstanceExtensionFieldStateCreatedOrMergePatchedOrRemovedDtos _attributeSetInstanceExtensionFieldEvents = new AttributeSetInstanceExtensionFieldStateCreatedOrMergePatchedOrRemovedDtos();

        public virtual AttributeSetInstanceExtensionFieldStateCreatedOrMergePatchedOrRemovedDto[] AttributeSetInstanceExtensionFieldEvents
        {
            get
            {
                return _attributeSetInstanceExtensionFieldEvents.ToArray();
            }
            set
            {
                _attributeSetInstanceExtensionFieldEvents.Clear();
                _attributeSetInstanceExtensionFieldEvents.AddRange(value);
            }
        }



        private AttributeSetInstanceExtensionFieldStateEventIdDto NewAttributeSetInstanceExtensionFieldStateEventId(string index)
        {
            var eId = new AttributeSetInstanceExtensionFieldStateEventIdDto();
            eId.GroupId = this.StateEventId.Id;
            eId.Index = index;
            eId.AttributeSetInstanceExtensionFieldGroupVersion = this.StateEventId.Version;
            return eId;
        }

        public virtual AttributeSetInstanceExtensionFieldStateCreatedDto NewAttributeSetInstanceExtensionFieldStateCreated(string index)
        {
            var e = new AttributeSetInstanceExtensionFieldStateCreatedDto();
            var eId = NewAttributeSetInstanceExtensionFieldStateEventId(index);
            e.StateEventId = eId;
            return e;
        }

        public virtual AttributeSetInstanceExtensionFieldStateMergePatchedDto NewAttributeSetInstanceExtensionFieldStateMergePatched(string index)
        {
            var e = new AttributeSetInstanceExtensionFieldStateMergePatchedDto();
            var eId = NewAttributeSetInstanceExtensionFieldStateEventId(index);
            e.StateEventId = eId;
            return e;
        }

        public virtual AttributeSetInstanceExtensionFieldStateRemovedDto NewAttributeSetInstanceExtensionFieldStateRemoved(string index)
        {
            var e = new AttributeSetInstanceExtensionFieldStateRemovedDto();
            var eId = NewAttributeSetInstanceExtensionFieldStateEventId(index);
            e.StateEventId = eId;
            return e;
        }

        IEnumerable<IAttributeSetInstanceExtensionFieldStateCreated> IAttributeSetInstanceExtensionFieldGroupStateCreated.AttributeSetInstanceExtensionFieldEvents
        {
            get { return this._attributeSetInstanceExtensionFieldEvents; }
        }

        void IAttributeSetInstanceExtensionFieldGroupStateCreated.AddAttributeSetInstanceExtensionFieldEvent(IAttributeSetInstanceExtensionFieldStateCreated e)
        {
            this._attributeSetInstanceExtensionFieldEvents.AddAttributeSetInstanceExtensionFieldEvent(e);
        }

        IAttributeSetInstanceExtensionFieldStateCreated IAttributeSetInstanceExtensionFieldGroupStateCreated.NewAttributeSetInstanceExtensionFieldStateCreated(string index)
        {
            return NewAttributeSetInstanceExtensionFieldStateCreated(index);
        }

        IEnumerable<IAttributeSetInstanceExtensionFieldStateEvent> IAttributeSetInstanceExtensionFieldGroupStateMergePatched.AttributeSetInstanceExtensionFieldEvents
        {
            get { return this._attributeSetInstanceExtensionFieldEvents; }
        }

        void IAttributeSetInstanceExtensionFieldGroupStateMergePatched.AddAttributeSetInstanceExtensionFieldEvent(IAttributeSetInstanceExtensionFieldStateEvent e)
        {
            this._attributeSetInstanceExtensionFieldEvents.AddAttributeSetInstanceExtensionFieldEvent(e);
        }

        IAttributeSetInstanceExtensionFieldStateCreated IAttributeSetInstanceExtensionFieldGroupStateMergePatched.NewAttributeSetInstanceExtensionFieldStateCreated(string index)
        {
            return NewAttributeSetInstanceExtensionFieldStateCreated(index);
        }

        IAttributeSetInstanceExtensionFieldStateMergePatched IAttributeSetInstanceExtensionFieldGroupStateMergePatched.NewAttributeSetInstanceExtensionFieldStateMergePatched(string index)
        {
            return NewAttributeSetInstanceExtensionFieldStateMergePatched(index);
        }

        IAttributeSetInstanceExtensionFieldStateRemoved IAttributeSetInstanceExtensionFieldGroupStateMergePatched.NewAttributeSetInstanceExtensionFieldStateRemoved(string index)
        {
            return NewAttributeSetInstanceExtensionFieldStateRemoved(index);
        }


        IEnumerable<IAttributeSetInstanceExtensionFieldStateRemoved> IAttributeSetInstanceExtensionFieldGroupStateDeleted.AttributeSetInstanceExtensionFieldEvents
        {
            get { return this._attributeSetInstanceExtensionFieldEvents; }
        }

        void IAttributeSetInstanceExtensionFieldGroupStateDeleted.AddAttributeSetInstanceExtensionFieldEvent(IAttributeSetInstanceExtensionFieldStateRemoved e)
        {
            this._attributeSetInstanceExtensionFieldEvents.AddAttributeSetInstanceExtensionFieldEvent(e);
        }

        IAttributeSetInstanceExtensionFieldStateRemoved IAttributeSetInstanceExtensionFieldGroupStateDeleted.NewAttributeSetInstanceExtensionFieldStateRemoved(string index)
        {
            return NewAttributeSetInstanceExtensionFieldStateRemoved(index);
        }


        AttributeSetInstanceExtensionFieldGroupStateEventId IAttributeSetInstanceExtensionFieldGroupStateEvent.StateEventId
        {
            get { return this.StateEventId.ToAttributeSetInstanceExtensionFieldGroupStateEventId(); }
        }

        protected AttributeSetInstanceExtensionFieldGroupStateEventDtoBase()
        {
        }

        protected AttributeSetInstanceExtensionFieldGroupStateEventDtoBase(AttributeSetInstanceExtensionFieldGroupStateEventIdDto stateEventId)
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


    public class AttributeSetInstanceExtensionFieldGroupStateCreatedOrMergePatchedOrDeletedDto : AttributeSetInstanceExtensionFieldGroupStateEventDtoBase
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



	public class AttributeSetInstanceExtensionFieldGroupStateCreatedDto : AttributeSetInstanceExtensionFieldGroupStateCreatedOrMergePatchedOrDeletedDto
	{
		public AttributeSetInstanceExtensionFieldGroupStateCreatedDto()
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


	public class AttributeSetInstanceExtensionFieldGroupStateMergePatchedDto : AttributeSetInstanceExtensionFieldGroupStateCreatedOrMergePatchedOrDeletedDto
	{
		public AttributeSetInstanceExtensionFieldGroupStateMergePatchedDto()
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


	public class AttributeSetInstanceExtensionFieldGroupStateDeletedDto : AttributeSetInstanceExtensionFieldGroupStateCreatedOrMergePatchedOrDeletedDto
	{
		public AttributeSetInstanceExtensionFieldGroupStateDeletedDto()
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


    public partial class AttributeSetInstanceExtensionFieldGroupStateCreatedOrMergePatchedOrDeletedDtos : IEnumerable<IAttributeSetInstanceExtensionFieldGroupStateCreated>, IEnumerable<IAttributeSetInstanceExtensionFieldGroupStateMergePatched>, IEnumerable<IAttributeSetInstanceExtensionFieldGroupStateDeleted>
    {
        private List<AttributeSetInstanceExtensionFieldGroupStateCreatedOrMergePatchedOrDeletedDto> _innerStateEvents = new List<AttributeSetInstanceExtensionFieldGroupStateCreatedOrMergePatchedOrDeletedDto>();

        public virtual AttributeSetInstanceExtensionFieldGroupStateCreatedOrMergePatchedOrDeletedDto[] ToArray()
        {
            return _innerStateEvents.ToArray();
        }

        public virtual void Clear()
        {
            _innerStateEvents.Clear();
        }

        public virtual void AddRange(IEnumerable<AttributeSetInstanceExtensionFieldGroupStateCreatedOrMergePatchedOrDeletedDto> es)
        {
            _innerStateEvents.AddRange(es);
        }

        public IEnumerator<IAttributeSetInstanceExtensionFieldGroupStateCreated> GetEnumerator()
        {
            return _innerStateEvents.GetEnumerator();
        }

        System.Collections.IEnumerator System.Collections.IEnumerable.GetEnumerator()
        {
            return _innerStateEvents.GetEnumerator();
        }

        IEnumerator<IAttributeSetInstanceExtensionFieldGroupStateMergePatched> IEnumerable<IAttributeSetInstanceExtensionFieldGroupStateMergePatched>.GetEnumerator()
        {
            return _innerStateEvents.GetEnumerator();
        }

        IEnumerator<IAttributeSetInstanceExtensionFieldGroupStateDeleted> IEnumerable<IAttributeSetInstanceExtensionFieldGroupStateDeleted>.GetEnumerator()
        {
            return _innerStateEvents.GetEnumerator();
        }

        public void AddAttributeSetInstanceExtensionFieldGroupEvent(IAttributeSetInstanceExtensionFieldGroupStateCreated e)
        {
            _innerStateEvents.Add((AttributeSetInstanceExtensionFieldGroupStateCreatedDto)e);
        }

        public void AddAttributeSetInstanceExtensionFieldGroupEvent(IAttributeSetInstanceExtensionFieldGroupStateEvent e)
        {
            _innerStateEvents.Add((AttributeSetInstanceExtensionFieldGroupStateCreatedOrMergePatchedOrDeletedDto)e);
        }

        public void AddAttributeSetInstanceExtensionFieldGroupEvent(IAttributeSetInstanceExtensionFieldGroupStateDeleted e)
        {
            _innerStateEvents.Add((AttributeSetInstanceExtensionFieldGroupStateDeletedDto)e);
        }

    }


}

