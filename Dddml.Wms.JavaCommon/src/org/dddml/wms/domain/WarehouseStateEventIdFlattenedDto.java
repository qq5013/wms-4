package org.dddml.wms.domain;

import java.util.HashMap;
import java.util.Map;

public class WarehouseStateEventIdFlattenedDto
{


    public static final String[] propertyNames = new String[]{
            "warehouseId",
            "version",
        };

    public static final String[] propertyTypes = new String[]{
            "String",
            "Long",
        };

    public static final Map<String, String> propertyTypeMap;

    static {
        propertyTypeMap = new HashMap<String, String>();
        for (int i = 0; i < propertyNames.length; i++ ) {
            propertyTypeMap.put(propertyNames[i], propertyTypes[i]);
        }
    }
	
    private WarehouseStateEventId value;

    public WarehouseStateEventIdFlattenedDto()
    {
        this(new WarehouseStateEventId());
    }

    public WarehouseStateEventIdFlattenedDto(WarehouseStateEventId value)
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

        WarehouseStateEventIdFlattenedDto other = (WarehouseStateEventIdFlattenedDto)obj;
        return value.equals(other.value);
    }

    @Override
    public int hashCode()
    {
        return value.hashCode();
    }

}

