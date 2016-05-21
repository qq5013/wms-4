using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;


namespace Dddml.Wms.Specialization
{

    public class GuidStringIdGenerator<TCommand> : IIdGenerator<string, TCommand>
    {

        public string GenerateId(TCommand command)
        {
            return GetNextId();
        }

        public string GetNextId()
        {
            return Guid.NewGuid().ToString();
        }

        public string GetOrGenerateId(TCommand command, out bool reused)
        {
            reused = false;
            return GetNextId();
        }

    }


}
