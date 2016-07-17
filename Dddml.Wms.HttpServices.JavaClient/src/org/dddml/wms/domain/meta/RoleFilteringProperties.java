package org.dddml.wms.domain.meta;

import java.util.HashMap;
import java.util.Map;

public final class RoleFilteringProperties
{

    private RoleFilteringProperties()
    {
    }

    public final static String[] propertyNames = new String[] {
            "RoleId",
            "Name",
            "Description",
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

