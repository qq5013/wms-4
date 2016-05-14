using System;

namespace Dddml.Wms.Specialization
{
    public interface ICommand
    {
        object RequesterId { get; set; }

        string CommandId { get; set; }
	}

}

