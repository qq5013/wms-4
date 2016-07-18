package org.dddml.wms.domain.meta;

import java.util.HashMap;
import java.util.Map;

public final class LocatorFilteringProperties
{

    private LocatorFilteringProperties()
    {
    }

    public static final String[] propertyNames = new String[] {
            "LocatorId",
            "WarehouseId",
            "ParentLocatorId",
            "LocatorType",
            "PriorityNumber",
            "IsDefault",
            "X",
            "Y",
            "Z",
            "Version",
            "CreatedBy",
            "CreatedAt",
            "UpdatedBy",
            "UpdatedAt",
            "Active",
            "Deleted",
    };

    public static final String[] propertyTypes = new String[] {
            "String",
            "String",
            "String",
            "String",
            "String",
            "Boolean",
            "String",
            "String",
            "String",
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

