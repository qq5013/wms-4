using System;
using System.Collections.Generic;


namespace Dddml.Wms.Specialization
{
    public abstract class AggregateBase
    {
        protected virtual void OnApplying(IEvent e)
        {
        }
    }

}
