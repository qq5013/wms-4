package org.dddml.wms.domain.meta;

import java.util.HashMap;
import java.util.Map;

public final class WarehouseFilteringProperties
{

    private WarehouseFilteringProperties()
    {
    }

    public static final String[] propertyNames = new String[] {
            "warehouseId",
            "name",
            "description",
            "isInTransit",
            "version",
            "createdBy",
            "createdAt",
            "updatedBy",
            "updatedAt",
            "active",
            "deleted",
    };

    public static final String[] propertyTypes = new String[] {
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

    public static final Map<String, String> propertyTypeMap;

    static {
        propertyTypeMap = new HashMap<String, String>();
        for (int i = 0; i < propertyNames.length; i++ ) {
            propertyTypeMap.put(propertyNames[i], propertyTypes[i]);
        }
    }

}

