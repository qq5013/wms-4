package org.dddml.wms.domain;

import java.util.Date;
import org.dddml.wms.domain.Command;

public interface WarehouseCommand extends Command
{
    String getWarehouseId();

    Long getVersion();


    interface CreateOrMergePatchWarehouse extends WarehouseCommand
    {
        String getName();

        String getDescription();

        Boolean getIsInTransit();

        Boolean getActive();

    }

    interface CreateWarehouse extends CreateOrMergePatchWarehouse
    {
    }

    interface MergePatchWarehouse extends CreateOrMergePatchWarehouse
    {
        Boolean getIsPropertyNameRemoved();

        Boolean getIsPropertyDescriptionRemoved();

        Boolean getIsPropertyIsInTransitRemoved();

        Boolean getIsPropertyActiveRemoved();

    }

	interface DeleteWarehouse extends WarehouseCommand
	{
	}

}

