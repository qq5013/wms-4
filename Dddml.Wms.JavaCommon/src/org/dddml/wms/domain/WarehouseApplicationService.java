package org.dddml.wms.domain;

import java.util.Map;
import java.util.List;
import java.util.Date;
import org.dddml.wms.specialization.Event;
import org.dddml.wms.domain.Command;

public interface WarehouseApplicationService
{
    void when(WarehouseCommand.CreateWarehouse c);

    void when(WarehouseCommand.MergePatchWarehouse c);

    void when(WarehouseCommand.DeleteWarehouse c);

    WarehouseState get(String id);

    Iterable<WarehouseState> getAll(Integer firstResult, Integer maxResults);

    Iterable<WarehouseState> get(Iterable<Map.Entry<String, Object>> filter, List<String> orders, Integer firstResult, Integer maxResults);

    //Iterable<WarehouseState> get(Criterion filter, List<String> orders, Integer firstResult, Integer maxResults);

    WarehouseState getFirst(Iterable<Map.Entry<String, Object>> filter, List<String> orders);

    WarehouseState getFirst(Map.Entry<String, Object> keyValue, List<String> orders);

    Iterable<WarehouseState> getByProperty(String propertyName, Object propertyValue, List<String> orders, Integer firstResult, Integer maxResults);

    long getCount(Iterable<Map.Entry<String, Object>> filter);

    //long getCount(Criterion filter);

    WarehouseStateEvent getStateEvent(String warehouseId, long version);

}

