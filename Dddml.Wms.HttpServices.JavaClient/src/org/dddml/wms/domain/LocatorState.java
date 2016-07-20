package org.dddml.wms.domain;

import java.util.Set;
import java.util.Date;
import org.dddml.wms.specialization.Event;
import org.dddml.wms.domain.LocatorStateEvent.*;

public interface LocatorState
{

    String getLocatorId();

    void setLocatorId(String locatorId);

    String getWarehouseId();

    void setWarehouseId(String warehouseId);

    String getParentLocatorId();

    void setParentLocatorId(String parentLocatorId);

    String getLocatorType();

    void setLocatorType(String locatorType);

    String getPriorityNumber();

    void setPriorityNumber(String priorityNumber);

    Boolean getIsDefault();

    void setIsDefault(Boolean isDefault);

    String getX();

    void setX(String x);

    String getY();

    void setY(String y);

    String getZ();

    void setZ(String z);

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


    void when(LocatorStateCreated e);

    void when(LocatorStateMergePatched e);

    void when(LocatorStateDeleted e);

    void mutate(Event e);

    
}

