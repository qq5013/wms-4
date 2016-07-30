package org.dddml.wms.domain;

import java.util.Map;
import java.util.List;
import org.dddml.support.criterion.Criterion;
import java.util.Date;
import org.dddml.wms.specialization.Event;
import org.dddml.wms.domain.Command;

public interface AttributeSetApplicationService
{
    void when(AttributeSetCommand.CreateAttributeSet c);

    void when(AttributeSetCommand.MergePatchAttributeSet c);

    void when(AttributeSetCommand.DeleteAttributeSet c);

    AttributeSetState get(String id);

    Iterable<AttributeSetState> getAll(Integer firstResult, Integer maxResults);

    Iterable<AttributeSetState> get(Iterable<Map.Entry<String, Object>> filter, List<String> orders, Integer firstResult, Integer maxResults);

    Iterable<AttributeSetState> get(Criterion filter, List<String> orders, Integer firstResult, Integer maxResults);

    Iterable<AttributeSetState> getByProperty(String propertyName, Object propertyValue, List<String> orders, Integer firstResult, Integer maxResults);

    long getCount(Iterable<Map.Entry<String, Object>> filter);

    long getCount(Criterion filter);

    AttributeSetStateEvent getStateEvent(String attributeSetId, long version);

}

