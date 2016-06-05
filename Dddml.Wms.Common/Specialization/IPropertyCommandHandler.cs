using System;

namespace Dddml.Wms.Specialization
{
    public interface IPropertyCommandHandler<TContent, TState>
    {
        void Execute(IPropertyCommand<TContent, TState> command);
    }
}
