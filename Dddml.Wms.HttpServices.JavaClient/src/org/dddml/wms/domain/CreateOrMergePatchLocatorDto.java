package org.dddml.wms.domain;

import java.util.Date;

public class CreateOrMergePatchLocatorDto extends AbstractLocatorCommandDto
{
    private String warehouseId;

    public String getWarehouseId()
    {
        return this.warehouseId;
    }

    public void setWarehouseId(String warehouseId)
    {
        this.warehouseId = warehouseId;
    }

    private String parentLocatorId;

    public String getParentLocatorId()
    {
        return this.parentLocatorId;
    }

    public void setParentLocatorId(String parentLocatorId)
    {
        this.parentLocatorId = parentLocatorId;
    }

    private String locatorType;

    public String getLocatorType()
    {
        return this.locatorType;
    }

    public void setLocatorType(String locatorType)
    {
        this.locatorType = locatorType;
    }

    private String priorityNumber;

    public String getPriorityNumber()
    {
        return this.priorityNumber;
    }

    public void setPriorityNumber(String priorityNumber)
    {
        this.priorityNumber = priorityNumber;
    }

    private Boolean isDefault;

    public Boolean getIsDefault()
    {
        return this.isDefault;
    }

    public void setIsDefault(Boolean isDefault)
    {
        this.isDefault = isDefault;
    }

    private String x;

    public String getX()
    {
        return this.x;
    }

    public void setX(String x)
    {
        this.x = x;
    }

    private String y;

    public String getY()
    {
        return this.y;
    }

    public void setY(String y)
    {
        this.y = y;
    }

    private String z;

    public String getZ()
    {
        return this.z;
    }

    public void setZ(String z)
    {
        this.z = z;
    }

    private Boolean active;

    public Boolean getActive()
    {
        return this.active;
    }

    public void setActive(Boolean active)
    {
        this.active = active;
    }

    private Boolean isPropertyWarehouseIdRemoved;

    public Boolean getIsPropertyWarehouseIdRemoved()
    {
        return this.isPropertyWarehouseIdRemoved;
    }

    public void setIsPropertyWarehouseIdRemoved(Boolean isPropertyWarehouseIdRemoved)
    {
        this.isPropertyWarehouseIdRemoved = isPropertyWarehouseIdRemoved;
    }

    private Boolean isPropertyParentLocatorIdRemoved;

    public Boolean getIsPropertyParentLocatorIdRemoved()
    {
        return this.isPropertyParentLocatorIdRemoved;
    }

    public void setIsPropertyParentLocatorIdRemoved(Boolean isPropertyParentLocatorIdRemoved)
    {
        this.isPropertyParentLocatorIdRemoved = isPropertyParentLocatorIdRemoved;
    }

    private Boolean isPropertyLocatorTypeRemoved;

    public Boolean getIsPropertyLocatorTypeRemoved()
    {
        return this.isPropertyLocatorTypeRemoved;
    }

    public void setIsPropertyLocatorTypeRemoved(Boolean isPropertyLocatorTypeRemoved)
    {
        this.isPropertyLocatorTypeRemoved = isPropertyLocatorTypeRemoved;
    }

    private Boolean isPropertyPriorityNumberRemoved;

    public Boolean getIsPropertyPriorityNumberRemoved()
    {
        return this.isPropertyPriorityNumberRemoved;
    }

    public void setIsPropertyPriorityNumberRemoved(Boolean isPropertyPriorityNumberRemoved)
    {
        this.isPropertyPriorityNumberRemoved = isPropertyPriorityNumberRemoved;
    }

    private Boolean isPropertyIsDefaultRemoved;

    public Boolean getIsPropertyIsDefaultRemoved()
    {
        return this.isPropertyIsDefaultRemoved;
    }

    public void setIsPropertyIsDefaultRemoved(Boolean isPropertyIsDefaultRemoved)
    {
        this.isPropertyIsDefaultRemoved = isPropertyIsDefaultRemoved;
    }

    private Boolean isPropertyXRemoved;

    public Boolean getIsPropertyXRemoved()
    {
        return this.isPropertyXRemoved;
    }

    public void setIsPropertyXRemoved(Boolean isPropertyXRemoved)
    {
        this.isPropertyXRemoved = isPropertyXRemoved;
    }

    private Boolean isPropertyYRemoved;

    public Boolean getIsPropertyYRemoved()
    {
        return this.isPropertyYRemoved;
    }

    public void setIsPropertyYRemoved(Boolean isPropertyYRemoved)
    {
        this.isPropertyYRemoved = isPropertyYRemoved;
    }

    private Boolean isPropertyZRemoved;

    public Boolean getIsPropertyZRemoved()
    {
        return this.isPropertyZRemoved;
    }

    public void setIsPropertyZRemoved(Boolean isPropertyZRemoved)
    {
        this.isPropertyZRemoved = isPropertyZRemoved;
    }

    private Boolean isPropertyActiveRemoved;

    public Boolean getIsPropertyActiveRemoved()
    {
        return this.isPropertyActiveRemoved;
    }

    public void setIsPropertyActiveRemoved(Boolean isPropertyActiveRemoved)
    {
        this.isPropertyActiveRemoved = isPropertyActiveRemoved;
    }


}

