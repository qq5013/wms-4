package org.dddml.wms.domain;

import java.util.Map;
import java.util.List;
import org.dddml.support.criterion.Criterion;
import java.util.Date;

public interface AudienceStateRepository
{
    AudienceState get(String id);

    Iterable<AudienceState> getAll(Integer firstResult, Integer maxResults);
    
    void save(AudienceState state);
    
    Iterable<AudienceState> get(Iterable<Map.Entry<String, Object>> filter, List<String> orders, Integer firstResult, Integer maxResults);

    Iterable<AudienceState> get(Criterion filter, List<String> orders, Integer firstResult, Integer maxResults);

    AudienceState getFirst(Iterable<Map.Entry<String, Object>> filter, List<String> orders);

    AudienceState getFirst(Map.Entry<String, Object> keyValue, List<String> orders);

    Iterable<AudienceState> getByProperty(String propertyName, Object propertyValue, List<String> orders, Integer firstResult, Integer maxResults);

    long getCount(Iterable<Map.Entry<String, Object>> filter);

    long getCount(Criterion filter);

}

