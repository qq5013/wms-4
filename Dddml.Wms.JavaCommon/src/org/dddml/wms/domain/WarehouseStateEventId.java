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

    @Override
    public boolean equals(Object obj)
    {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }

        WarehouseStateEventId other = (WarehouseStateEventId)obj;
        return true 
            && (warehouseId == other.warehouseId || (warehouseId != null && warehouseId.equals(other.warehouseId)))
            && (version == other.version || (version != null && version.equals(other.version)))
            ;
    }

    @Override
    public int hashCode()
    {
        int hash = 0;
        if (this.warehouseId != null) {
            hash += 13 * this.warehouseId.hashCode();
        }
        if (this.version != null) {
            hash += 13 * this.version.hashCode();
        }
        return hash;
    }

}

