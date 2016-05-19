using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Dddml.Wms.Specialization
{
    public partial class PropertyMetadata
    {

        public virtual string Name { get; set; }

        public virtual string TypeName { get; set; }

        public virtual Type Type { get; set; }

        public virtual bool IsBasicType { get; set; }

        public virtual string DeclairingObjectName { get; set; }

        public virtual string DisplayName { get; set; }

        public virtual string Description { get; set; }

        public virtual int Length { get; set; }

        public virtual string GenericTypeName { get; set; }

        public virtual string ReferenceTypeName { get; set; }

        public virtual string ReferenceName { get; set; }

        public virtual string ItemTypeName { get; set; }

        public virtual string InverseOf { get; set; }

        public virtual bool IsDerived { get; set; }

        public virtual bool IsTransient { get; set; }

        public virtual bool IsHoisted { get; set; }

        public virtual bool IsReallyFlattened { get; set; }

        public virtual string SourceChainingName { get; set; }

        public virtual string OriginPropertyName { get; set; }

        public virtual bool IsNullableType { get; set; }

        public virtual bool IsDiscriminator { get; set; }

        public virtual bool IsReservedProperty  { get; set; }

        public virtual bool IsReservedPropertyVersion { get; set; }

        public virtual bool IsReservedPropertyDeleted { get; set; }

        public virtual bool IsReservedPropertyActive { get; set; }

        public virtual bool IsReservedPropertyCreatedBy { get; set; }

        public virtual bool IsReservedPropertyCreatedAt { get; set; }

        public virtual bool IsReservedPropertyUpdatedBy { get; set; }

        public virtual bool IsReservedPropertyUpdatedAt { get; set; }

        public virtual bool IsId { get; set; }

        public virtual bool IsGlobalId { get; set; }

        public virtual bool IsOuterId { get; set; }

        public virtual string DerivedFrom { get; set; }

        public virtual bool IsCollectionProperty
        {
            get { return !String.IsNullOrWhiteSpace(ItemTypeName); }
        }

        public virtual bool IsReferenceIdProperty
        {
            get { return !String.IsNullOrWhiteSpace(ReferenceTypeName); }
        }

    }
}
