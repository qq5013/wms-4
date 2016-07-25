package org.dddml.wms.domain;

import java.util.Map;
import java.util.List;
import java.util.Date;
import org.dddml.wms.specialization.Event;
import org.dddml.wms.domain.Command;

public interface AttributeUseMvoApplicationService
{
    void when(AttributeUseMvoCommand.CreateAttributeUseMvo c);

    void when(AttributeUseMvoCommand.MergePatchAttributeUseMvo c);

    void when(AttributeUseMvoCommand.DeleteAttributeUseMvo c);

    AttributeUseMvoState get(AttributeSetAttributeUseId id);

    Iterable<AttributeUseMvoState> getAll(Integer firstResult, Integer maxResults);

    Iterable<AttributeUseMvoState> get(Iterable<Map.Entry<String, Object>> filter, List<String> orders, Integer firstResult, Integer maxResults);

    //Iterable<AttributeUseMvoState> get(Criterion filter, List<String> orders, Integer firstResult, Integer maxResults);

    AttributeUseMvoState getFirst(Iterable<Map.Entry<String, Object>> filter, List<String> orders);

    AttributeUseMvoState getFirst(Map.Entry<String, Object> keyValue, List<String> orders);

    Iterable<AttributeUseMvoState> getByProperty(String propertyName, Object propertyValue, List<String> orders, Integer firstResult, Integer maxResults);

    long getCount(Iterable<Map.Entry<String, Object>> filter);

    //long getCount(Criterion filter);

    AttributeUseMvoStateEvent getStateEvent(AttributeSetAttributeUseId attributeSetAttributeUseId, long version);

}

