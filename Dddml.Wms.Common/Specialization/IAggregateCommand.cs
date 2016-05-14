using System;

namespace Dddml.Wms.Specialization
{
    public interface IAggregateCommand<TId, TVersion> : ICommand
    {
        TId AggregateId { get; }

		TVersion AggregateVersion { get; }

    }

}

