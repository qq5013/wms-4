package org.dddml.wms.domain;

import java.util.Map;
import java.util.List;
import nodamoney.Money;
import java.math.BigDecimal;
import java.util.Date;

public interface InOutStateRepository
{
    InOutState get(String id);

    Iterable<InOutState> getAll(Integer firstResult, Integer maxResults);
    
    void save(InOutState state);
    
    Iterable<InOutState> get(Iterable<Map.Entry<String, Object>> filter, List<String> orders, Integer firstResult, Integer maxResults);

    //Iterable<InOutState> get(Criterion filter, List<String> orders, Integer firstResult, Integer maxResults);

    InOutState getFirst(Iterable<Map.Entry<String, Object>> filter, List<String> orders);

    InOutState getFirst(Map.Entry<String, Object> keyValue, List<String> orders);

    Iterable<InOutState> getByProperty(String propertyName, Object propertyValue, List<String> orders, Integer firstResult, Integer maxResults);

    long getCount(Iterable<Map.Entry<String, Object>> filter);

    //long getCount(Criterion filter);

}

