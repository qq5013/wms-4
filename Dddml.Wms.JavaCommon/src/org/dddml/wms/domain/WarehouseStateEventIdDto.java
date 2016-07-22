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


    @Override
    public boolean equals(Object obj)
    {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }

        WarehouseStateEventIdDto other = (WarehouseStateEventIdDto)obj;
        return value.equals(other.value);
    }

    @Override
    public int hashCode()
    {
        return value.hashCode();
    }

}

