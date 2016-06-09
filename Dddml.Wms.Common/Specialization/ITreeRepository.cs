using Dddml.Support.Criterion;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace Dddml.Wms.Specialization
{
    public interface ITreeRepository<T, TId>
    {
        IEnumerable<T> GetRoots(ICriterion filter, IList<string> orders, int firstResult = 0, int maxResults = int.MaxValue);

        IEnumerable<T> GetChildren(TId parentId, ICriterion filter, IList<string> orders, int firstResult = 0, int maxResults = int.MaxValue);
    }
}
