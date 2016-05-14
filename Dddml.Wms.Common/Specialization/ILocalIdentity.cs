using System;


namespace Dddml.Wms.Specialization
{
    public interface ILocalIdentity<TId>
    {
        TId LocalId { get; }
    }
}
