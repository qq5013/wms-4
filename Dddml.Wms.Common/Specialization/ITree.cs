using System;
using System.Collections.Generic;

namespace Dddml.Wms.Specialization
{
    public interface ITree<T>
    {
        T Content { get; }

        IEnumerable<ITree<T>> Children { get; }
    }
}
