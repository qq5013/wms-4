package org.dddml.wms.domain;

import java.util.List;
import java.util.Date;
import org.dddml.wms.specialization.Event;
import org.dddml.wms.domain.Command;

public interface WarehouseAggregate
{
    WarehouseState getState();

    List<Event> getChanges();

    void create(WarehouseCommand.CreateWarehouse c);

    void mergePatch(WarehouseCommand.MergePatchWarehouse c);

    void delete(WarehouseCommand.DeleteWarehouse c);

    void throwOnInvalidStateTransition(Command c);
}

