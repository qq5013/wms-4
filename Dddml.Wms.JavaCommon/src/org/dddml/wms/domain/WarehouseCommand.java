package org.dddml.wms.domain;

import java.util.*;
import java.util.Date;
import org.dddml.wms.domain.Command;

public interface WarehouseCommand extends Command
{
    String getWarehouseId();

    void setWarehouseId(String warehouseId);

    Long getVersion();

    void setVersion(Long version);


    interface CreateOrMergePatchWarehouse extends WarehouseCommand
    {
        String getName();

        void setName(String name);

        String getDescription();

        void setDescription(String description);

        Boolean getIsInTransit();

        void setIsInTransit(Boolean isInTransit);

        Boolean getActive();

        void setActive(Boolean active);

    }

    interface CreateWarehouse extends CreateOrMergePatchWarehouse
    {
    }

    interface MergePatchWarehouse extends CreateOrMergePatchWarehouse
    {
        Boolean getIsPropertyNameRemoved();

        void setIsPropertyNameRemoved(Boolean removed);

        Boolean getIsPropertyDescriptionRemoved();

        void setIsPropertyDescriptionRemoved(Boolean removed);

        Boolean getIsPropertyIsInTransitRemoved();

        void setIsPropertyIsInTransitRemoved(Boolean removed);

        Boolean getIsPropertyActiveRemoved();

        void setIsPropertyActiveRemoved(Boolean removed);

    }

	interface DeleteWarehouse extends WarehouseCommand
	{
	}

}

