package org.dddml.wms.domain;

import java.util.Set;
import java.util.Date;
import org.dddml.wms.specialization.Event;
import org.dddml.wms.domain.WarehouseStateEvent.*;

public interface WarehouseState
{
    String getWarehouseId();

    void setWarehouseId(String warehouseId);

    String getName();

    void setName(String name);

    String getDescription();

    void setDescription(String description);

    Boolean getIsInTransit();

    void setIsInTransit(Boolean isInTransit);

    Long getVersion();

    void setVersion(Long version);

    Boolean getActive();

    void setActive(Boolean active);


    boolean isStateUnsaved();


    void when(WarehouseStateCreated e);

    void when(WarehouseStateMergePatched e);

    void when(WarehouseStateDeleted e);

    void mutate(Event e);

    
}

