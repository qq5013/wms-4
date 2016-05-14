using System;

namespace Dddml.Wms.Specialization
{
	public interface IGlobalIdentity<TId>
	{
		TId GlobalId { get; }
	}

}

