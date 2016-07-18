package org.dddml.wms.domain.meta;

import java.util.HashMap;
import java.util.Map;

public final class UserPermissionFilteringProperties
{

    private UserPermissionFilteringProperties()
    {
    }

    public static final String[] propertyNames = new String[] {
            "Version",
            "CreatedBy",
            "CreatedAt",
            "UpdatedBy",
            "UpdatedAt",
            "Active",
            "Deleted",
            "UserId",
            "UserPermissionId.UserId",
            "UserPermissionId.PermissionId",
    };

    public static final String[] propertyTypes = new String[] {
            "Long",
            "String",
            "Date",
            "String",
            "Date",
            "Boolean",
            "Boolean",
            "String",
            "String",
            "String",
    };

    public static final Map<String, String> propertyTypeMap;

    static {
        propertyTypeMap = new HashMap<String, String>();
        for (int i = 0; i < propertyNames.length; i++ ) {
            propertyTypeMap.put(propertyNames[i], propertyTypes[i]);
        }
    }

}

