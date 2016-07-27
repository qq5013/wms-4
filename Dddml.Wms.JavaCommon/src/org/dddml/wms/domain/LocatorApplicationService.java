package org.dddml.wms.domain;

import java.util.Map;
import java.util.List;
import java.util.Date;
import org.dddml.wms.specialization.Event;
import org.dddml.wms.domain.Command;

public interface LocatorApplicationService
{
    void when(LocatorCommand.CreateLocator c);

    void when(LocatorCommand.MergePatchLocator c);

    void when(LocatorCommand.DeleteLocator c);

    LocatorState get(String id);

    Iterable<LocatorState> getAll(Integer firstResult, Integer maxResults);

    Iterable<LocatorState> get(Iterable<Map.Entry<String, Object>> filter, List<String> orders, Integer firstResult, Integer maxResults);

    //Iterable<LocatorState> get(Criterion filter, List<String> orders, Integer firstResult, Integer maxResults);

    Iterable<LocatorState> getByProperty(String propertyName, Object propertyValue, List<String> orders, Integer firstResult, Integer maxResults);

    long getCount(Iterable<Map.Entry<String, Object>> filter);

    //long getCount(Criterion filter);

    LocatorStateEvent getStateEvent(String locatorId, long version);

}

