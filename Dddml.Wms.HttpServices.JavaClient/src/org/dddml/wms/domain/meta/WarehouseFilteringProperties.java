package org.dddml.wms.domain.meta;

import java.util.HashMap;
import java.util.Map;

public final class WarehouseFilteringProperties
{

    private WarehouseFilteringProperties()
    {
    }

    public final static String[] propertyNames = new String[] {
            "WarehouseId",
            "Name",
            "Description",
            "IsInTransit",
            "Version",
            "CreatedBy",
            "CreatedAt",
            "UpdatedBy",
            "UpdatedAt",
            "Active",
            "Deleted",
    };

    public final static String[] propertyTypes = new String[] {
            "String",
            "String",
            "String",
            "Boolean",
            "Long",
            "String",
            "Date",
            "String",
            "Date",
            "Boolean",
            "Boolean",
    };

    public final static Map<String, String> propertyMap;

    static {
        propertyMap = new HashMap<String, String>();
        for (int i = 0; i < propertyNames.length; i++ ) {
            propertyMap.put(propertyNames[i], propertyTypes[i]);
        }
    }

}

