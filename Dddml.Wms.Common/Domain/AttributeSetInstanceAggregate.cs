using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using Dddml.Wms.Specialization;
using Dddml.Wms.Support;

namespace Dddml.Wms.Domain
{
    public partial class AttributeSetInstanceAggregate
    {
        protected override void BeforeApply(IEvent e)
        {
            if (e is IAttributeSetInstanceStateCreated)
            {
                var eC = e as IAttributeSetInstanceStateCreated;
                eC.Hash = AttributeSetInstancePropertyUtils.GetHash(eC);
            }
            base.BeforeApply(e);
        }
    }
}
