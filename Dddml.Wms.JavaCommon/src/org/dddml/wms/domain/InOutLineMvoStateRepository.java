package org.dddml.wms.domain;

import java.util.Map;
import java.util.List;
import org.dddml.support.criterion.Criterion;
import java.math.BigDecimal;
import java.util.Date;
import org.joda.money.Money;

public interface InOutLineMvoStateRepository
{
    InOutLineMvoState get(InOutLineId id);

    Iterable<InOutLineMvoState> getAll(Integer firstResult, Integer maxResults);
    
    void save(InOutLineMvoState state);
    
    Iterable<InOutLineMvoState> get(Iterable<Map.Entry<String, Object>> filter, List<String> orders, Integer firstResult, Integer maxResults);

    Iterable<InOutLineMvoState> get(Criterion filter, List<String> orders, Integer firstResult, Integer maxResults);

    InOutLineMvoState getFirst(Iterable<Map.Entry<String, Object>> filter, List<String> orders);

    InOutLineMvoState getFirst(Map.Entry<String, Object> keyValue, List<String> orders);

    Iterable<InOutLineMvoState> getByProperty(String propertyName, Object propertyValue, List<String> orders, Integer firstResult, Integer maxResults);

    long getCount(Iterable<Map.Entry<String, Object>> filter);

    long getCount(Criterion filter);

}

