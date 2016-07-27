package org.dddml.wms.domain;

import java.util.Map;
import java.util.List;
import java.util.Date;
import org.dddml.wms.specialization.Event;
import org.dddml.wms.domain.Command;

public interface AudienceApplicationService
{
    void when(AudienceCommand.CreateAudience c);

    void when(AudienceCommand.MergePatchAudience c);

    void when(AudienceCommand.DeleteAudience c);

    AudienceState get(String id);

    Iterable<AudienceState> getAll(Integer firstResult, Integer maxResults);

    Iterable<AudienceState> get(Iterable<Map.Entry<String, Object>> filter, List<String> orders, Integer firstResult, Integer maxResults);

    //Iterable<AudienceState> get(Criterion filter, List<String> orders, Integer firstResult, Integer maxResults);

    Iterable<AudienceState> getByProperty(String propertyName, Object propertyValue, List<String> orders, Integer firstResult, Integer maxResults);

    long getCount(Iterable<Map.Entry<String, Object>> filter);

    //long getCount(Criterion filter);

    AudienceStateEvent getStateEvent(String clientId, long version);

}

