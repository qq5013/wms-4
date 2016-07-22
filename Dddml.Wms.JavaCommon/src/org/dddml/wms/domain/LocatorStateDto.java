package org.dddml.wms.domain;

import java.util.Date;


public class LocatorStateDto
{

    private String locatorId;

    public String getLocatorId()
    {
        return this.locatorId;
    }

    public void setLocatorId(String locatorId)
    {
        this.locatorId = locatorId;
    }

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

    private Long version;

    public Long getVersion()
    {
        return this.version;
    }

    public void setVersion(Long version)
    {
        this.version = version;
    }

    private String createdBy;

    public String getCreatedBy()
    {
        return this.createdBy;
    }

    public void setCreatedBy(String createdBy)
    {
        this.createdBy = createdBy;
    }

    private Date createdAt;

    public Date getCreatedAt()
    {
        return this.createdAt;
    }

    public void setCreatedAt(Date createdAt)
    {
        this.createdAt = createdAt;
    }

    private String updatedBy;

    public String getUpdatedBy()
    {
        return this.updatedBy;
    }

    public void setUpdatedBy(String updatedBy)
    {
        this.updatedBy = updatedBy;
    }

    private Date updatedAt;

    public Date getUpdatedAt()
    {
        return this.updatedAt;
    }

    public void setUpdatedAt(Date updatedAt)
    {
        this.updatedAt = updatedAt;
    }


}

