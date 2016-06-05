using System;


namespace Dddml.Wms.Specialization
{
    public interface IPropertyCommand<TContent, TState>
    {
        TContent Content { get; set; }

        Func<TState> GetState { get; set; }

        Action<TState> SetState { get; set; }

        string OutterCommandType { get; set; }
    }
}
