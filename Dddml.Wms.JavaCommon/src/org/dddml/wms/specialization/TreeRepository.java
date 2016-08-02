package org.dddml.wms.specialization;

import org.dddml.support.criterion.Criterion;

public interface TreeRepository<T, TId>
{
    Iterable<T> GetRoots(Criterion filter, java.util.List<String> orders, Integer firstResult, Integer maxResults);

    Iterable<T> GetChildren(TId parentId, Criterion filter, java.util.List<String> orders, Integer firstResult, Integer maxResults);

    Iterable<TId> GetRootIds(Criterion filter, java.util.List<String> orders, Integer firstResult, Integer maxResults);

    Iterable<TId> GetChildIds(TId parentId, Criterion filter, java.util.List<String> orders, Integer firstResult, Integer maxResults);

    Iterable<T> GetRoots(Iterable<java.util.Map.Entry<String, Object>> filter, java.util.List<String> orders, Integer firstResult, Integer maxResults);

    Iterable<T> GetChildren(TId parentId, Iterable<java.util.Map.Entry<String, Object>> filter, java.util.List<String> orders, Integer firstResult, Integer maxResults);

    Iterable<TId> GetRootIds(Iterable<java.util.Map.Entry<String, Object>> filter, java.util.List<String> orders, Integer firstResult, Integer maxResults);

    Iterable<TId> GetChildIds(TId parentId, Iterable<java.util.Map.Entry<String, Object>> filter, java.util.List<String> orders, Integer firstResult, Integer maxResults);

}