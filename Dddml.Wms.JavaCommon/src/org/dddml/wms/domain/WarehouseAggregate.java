package org.dddml.wms.domain;

import java.util.List;
import java.util.Date;
import org.dddml.wms.specialization.Event;
import org.dddml.wms.domain.Command;

public interface WarehouseAggregate
{
    WarehouseState getState();

    List<Event> getChanges();

    void throwOnInvalidStateTransition(Command c);

    void create(WarehouseCommand.CreateWarehouse c);

    void mergePatch(WarehouseCommand.MergePatchWarehouse c);

    void delete(WarehouseCommand.DeleteWarehouse c);

}

