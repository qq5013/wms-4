package org.dddml.wms.specialization;

import org.dddml.support.criterion.Criterion;

public interface TreeRepository<T, TId>
{
    Iterable<T> getRoots(Criterion filter, java.util.List<String> orders, Integer firstResult, Integer maxResults);

    Iterable<T> getChildren(TId parentId, Criterion filter, java.util.List<String> orders, Integer firstResult, Integer maxResults);

    Iterable<TId> getRootIds(Criterion filter, java.util.List<String> orders, Integer firstResult, Integer maxResults);

    Iterable<TId> getChildIds(TId parentId, Criterion filter, java.util.List<String> orders, Integer firstResult, Integer maxResults);

    Iterable<T> getRoots(Iterable<java.util.Map.Entry<String, Object>> filter, java.util.List<String> orders, Integer firstResult, Integer maxResults);

    Iterable<T> getChildren(TId parentId, Iterable<java.util.Map.Entry<String, Object>> filter, java.util.List<String> orders, Integer firstResult, Integer maxResults);

    Iterable<TId> getRootIds(Iterable<java.util.Map.Entry<String, Object>> filter, java.util.List<String> orders, Integer firstResult, Integer maxResults);

    Iterable<TId> getChildIds(TId parentId, Iterable<java.util.Map.Entry<String, Object>> filter, java.util.List<String> orders, Integer firstResult, Integer maxResults);

}