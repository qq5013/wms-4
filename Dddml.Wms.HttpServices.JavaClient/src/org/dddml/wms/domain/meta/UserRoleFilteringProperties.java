package org.dddml.wms.domain.meta;

import java.util.HashMap;
import java.util.Map;

public final class UserRoleFilteringProperties
{

    private UserRoleFilteringProperties()
    {
    }

    public final static String[] propertyNames = new String[] {
            "RoleId",
            "Version",
            "CreatedBy",
            "CreatedAt",
            "UpdatedBy",
            "UpdatedAt",
            "Active",
            "Deleted",
            "UserId",
            "UserRoleId.UserId",
            "UserRoleId.RoleId",
    };

    public final static String[] propertyTypes = new String[] {
            "String",
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

    public final static Map<String, String> propertyMap;

    static {
        propertyMap = new HashMap<String, String>();
        for (int i = 0; i < propertyNames.length; i++ ) {
            propertyMap.put(propertyNames[i], propertyTypes[i]);
        }
    }

}

