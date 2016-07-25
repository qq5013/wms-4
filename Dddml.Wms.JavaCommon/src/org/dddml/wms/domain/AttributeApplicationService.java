package org.dddml.wms.domain;

import java.util.Map;
import java.util.List;
import java.util.Date;
import org.dddml.wms.specialization.Event;
import org.dddml.wms.domain.Command;

public interface AttributeApplicationService
{
    void when(AttributeCommand.CreateAttribute c);

    void when(AttributeCommand.MergePatchAttribute c);

    void when(AttributeCommand.DeleteAttribute c);

    AttributeState get(String id);

    Iterable<AttributeState> getAll(Integer firstResult, Integer maxResults);

    Iterable<AttributeState> get(Iterable<Map.Entry<String, Object>> filter, List<String> orders, Integer firstResult, Integer maxResults);

    //Iterable<AttributeState> get(Criterion filter, List<String> orders, Integer firstResult, Integer maxResults);

    AttributeState getFirst(Iterable<Map.Entry<String, Object>> filter, List<String> orders);

    AttributeState getFirst(Map.Entry<String, Object> keyValue, List<String> orders);

    Iterable<AttributeState> getByProperty(String propertyName, Object propertyValue, List<String> orders, Integer firstResult, Integer maxResults);

    long getCount(Iterable<Map.Entry<String, Object>> filter);

    //long getCount(Criterion filter);

    AttributeStateEvent getStateEvent(String attributeId, long version);

}

