package org.dddml.wms.domain;

import java.util.Map;
import java.util.List;
import java.math.BigDecimal;
import java.util.Date;
import org.joda.money.Money;
import org.dddml.wms.specialization.Event;
import org.dddml.wms.domain.Command;

public interface InOutLineMvoApplicationService
{
    void when(InOutLineMvoCommand.CreateInOutLineMvo c);

    void when(InOutLineMvoCommand.MergePatchInOutLineMvo c);

    void when(InOutLineMvoCommand.DeleteInOutLineMvo c);

    InOutLineMvoState get(InOutLineId id);

    Iterable<InOutLineMvoState> getAll(Integer firstResult, Integer maxResults);

    Iterable<InOutLineMvoState> get(Iterable<Map.Entry<String, Object>> filter, List<String> orders, Integer firstResult, Integer maxResults);

    //Iterable<InOutLineMvoState> get(Criterion filter, List<String> orders, Integer firstResult, Integer maxResults);

    InOutLineMvoState getFirst(Iterable<Map.Entry<String, Object>> filter, List<String> orders);

    InOutLineMvoState getFirst(Map.Entry<String, Object> keyValue, List<String> orders);

    Iterable<InOutLineMvoState> getByProperty(String propertyName, Object propertyValue, List<String> orders, Integer firstResult, Integer maxResults);

    long getCount(Iterable<Map.Entry<String, Object>> filter);

    //long getCount(Criterion filter);

    InOutLineMvoStateEvent getStateEvent(InOutLineId inOutLineId, long version);

}

