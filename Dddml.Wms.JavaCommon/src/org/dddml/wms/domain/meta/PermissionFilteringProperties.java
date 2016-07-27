package org.dddml.wms.domain.meta;

import java.util.HashMap;
import java.util.Map;

public final class PermissionFilteringProperties
{

    private PermissionFilteringProperties()
    {
    }

    public static final String[] propertyNames = new String[] {
            "permissionId",
            "name",
            "parentPermissionId",
            "description",
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

