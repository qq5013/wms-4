package org.dddml.wms.domain;

import java.util.Set;
import java.util.Date;
import org.dddml.wms.specialization.Event;
import org.dddml.wms.domain.WarehouseStateEvent.*;

public interface WarehouseState
{
    Long VERSION_ZERO = 0L;

    Long VERSION_NULL = VERSION_ZERO - 1;

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

    String getCreatedBy();

    void setCreatedBy(String createdBy);

    Date getCreatedAt();

    void setCreatedAt(Date createdAt);

    String getUpdatedBy();

    void setUpdatedBy(String updatedBy);

    Date getUpdatedAt();

    void setUpdatedAt(Date updatedAt);

    Boolean getActive();

    void setActive(Boolean active);

    Boolean getDeleted();

    void setDeleted(Boolean deleted);


    boolean isStateUnsaved();


    void mutate(Event e);

    void when(WarehouseStateCreated e);

    void when(WarehouseStateMergePatched e);

    void when(WarehouseStateDeleted e);
    
}

