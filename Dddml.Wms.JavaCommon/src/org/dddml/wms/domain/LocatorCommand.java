package org.dddml.wms.domain;

import java.util.Date;
import org.dddml.wms.domain.Command;

public interface LocatorCommand extends Command
{
    String getLocatorId();

    void setLocatorId(String locatorId);

    Long getVersion();

    void setVersion(Long version);


    interface CreateOrMergePatchLocator extends LocatorCommand
    {
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

        Boolean getActive();

        void setActive(Boolean active);

    }

    interface CreateLocator extends CreateOrMergePatchLocator
    {
    }

    interface MergePatchLocator extends CreateOrMergePatchLocator
    {
        Boolean getIsPropertyWarehouseIdRemoved();

        void setIsPropertyWarehouseIdRemoved(Boolean removed);

        Boolean getIsPropertyParentLocatorIdRemoved();

        void setIsPropertyParentLocatorIdRemoved(Boolean removed);

        Boolean getIsPropertyLocatorTypeRemoved();

        void setIsPropertyLocatorTypeRemoved(Boolean removed);

        Boolean getIsPropertyPriorityNumberRemoved();

        void setIsPropertyPriorityNumberRemoved(Boolean removed);

        Boolean getIsPropertyIsDefaultRemoved();

        void setIsPropertyIsDefaultRemoved(Boolean removed);

        Boolean getIsPropertyXRemoved();

        void setIsPropertyXRemoved(Boolean removed);

        Boolean getIsPropertyYRemoved();

        void setIsPropertyYRemoved(Boolean removed);

        Boolean getIsPropertyZRemoved();

        void setIsPropertyZRemoved(Boolean removed);

        Boolean getIsPropertyActiveRemoved();

        void setIsPropertyActiveRemoved(Boolean removed);

    }

	interface DeleteLocator extends LocatorCommand
	{
	}

}

