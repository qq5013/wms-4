package org.dddml.wms.domain;


public class WarehouseStateEventId
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

    private Long version;

    public Long getVersion()
    {
        return this.version;
    }

    public void setVersion(Long version)
    {
        this.version = version;
    }

    WarehouseStateEventId ()
    {
    }

    public WarehouseStateEventId (String warehouseId, Long version)
    {
        this.warehouseId = warehouseId;
        this.version = version;
    }

}

