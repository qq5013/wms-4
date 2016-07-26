package org.dddml.wms.domain;

import java.util.Date;
import org.dddml.wms.domain.Command;

public interface LocatorCommand extends Command
{
    String getLocatorId();

    Long getVersion();


    interface CreateOrMergePatchLocator extends LocatorCommand
    {
        String getWarehouseId();

        String getParentLocatorId();

        String getLocatorType();

        String getPriorityNumber();

        Boolean getIsDefault();

        String getX();

        String getY();

        String getZ();

        Boolean getActive();

    }

    interface CreateLocator extends CreateOrMergePatchLocator
    {
    }

    interface MergePatchLocator extends CreateOrMergePatchLocator
    {
        Boolean getIsPropertyWarehouseIdRemoved();

        Boolean getIsPropertyParentLocatorIdRemoved();

        Boolean getIsPropertyLocatorTypeRemoved();

        Boolean getIsPropertyPriorityNumberRemoved();

        Boolean getIsPropertyIsDefaultRemoved();

        Boolean getIsPropertyXRemoved();

        Boolean getIsPropertyYRemoved();

        Boolean getIsPropertyZRemoved();

        Boolean getIsPropertyActiveRemoved();

    }

	interface DeleteLocator extends LocatorCommand
	{
	}

}

