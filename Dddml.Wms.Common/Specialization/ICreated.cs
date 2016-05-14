using System;

namespace Dddml.Wms.Specialization
{
	public interface ICreated<TUserId>
	{
		TUserId CreatedBy { get; }

		DateTime CreatedAt { get; }

	}
}

