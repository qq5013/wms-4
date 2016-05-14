using System;

namespace Dddml.Wms.Specialization
{
	public interface IVersioned<T>
	{
		T Version { get; }

		//T VersionZero { get; }
	}
}

