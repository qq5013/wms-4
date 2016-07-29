package org.dddml.wms.domain;

import java.util.Map;
import java.util.List;
import org.dddml.support.criterion.Criterion;
import org.joda.money.Money;
import java.math.BigDecimal;
import java.util.Date;
import org.dddml.wms.specialization.Event;
import org.dddml.wms.domain.Command;

public interface InOutApplicationService
{
    void when(InOutCommand.CreateInOut c);

    void when(InOutCommand.MergePatchInOut c);

    void when(InOutCommand.DeleteInOut c);

    InOutState get(String id);

    Iterable<InOutState> getAll(Integer firstResult, Integer maxResults);

    Iterable<InOutState> get(Iterable<Map.Entry<String, Object>> filter, List<String> orders, Integer firstResult, Integer maxResults);

    Iterable<InOutState> get(Criterion filter, List<String> orders, Integer firstResult, Integer maxResults);

    Iterable<InOutState> getByProperty(String propertyName, Object propertyValue, List<String> orders, Integer firstResult, Integer maxResults);

    long getCount(Iterable<Map.Entry<String, Object>> filter);

    long getCount(Criterion filter);

    InOutStateEvent getStateEvent(String documentNumber, long version);

}

