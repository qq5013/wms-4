using System;


namespace Dddml.Wms.Specialization
{
    public interface IIdGenerator<TId, TCommand>
    {
        TId GenerateId(TCommand command);

        TId GetNextId();
    }

}
