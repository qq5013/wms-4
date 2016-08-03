package org.dddml.wms.specialization;

public interface Tree<T>
{
    T getContent();

    Iterable<Tree<T>> getChildren();
}
