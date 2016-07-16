package org.dddml.wms.domain;


public class WarehouseStateEventIdDto
{
	
    private WarehouseStateEventId value;

    public WarehouseStateEventIdDto()
    {
        this(new WarehouseStateEventId());
    }

    public WarehouseStateEventIdDto(WarehouseStateEventId value)
    {
        this.value = value;
    }

    public WarehouseStateEventId toWarehouseStateEventId()
    {
        return this.value;
    }

    public String getWarehouseId()
    {
        return this.value.getWarehouseId();
    }

    public void setWarehouseId(String warehouseId)
    {
        this.value.setWarehouseId(warehouseId);
    }

    public Long getVersion()
    {
        return this.value.getVersion();
    }

    public void setVersion(Long version)
    {
        this.value.setVersion(version);
    }


}

