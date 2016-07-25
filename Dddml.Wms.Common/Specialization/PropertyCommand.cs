using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace Dddml.Wms.Specialization
{
    public class PropertyCommand<TContent, TState> : IPropertyCommand<TContent, TState>
    {
        public TContent Content { get; set; }

        public Func<TState> GetState { get; set; }

        public Action<TState> SetState { get; set; }

        public string OuterCommandType { get; set; }
    }
}
