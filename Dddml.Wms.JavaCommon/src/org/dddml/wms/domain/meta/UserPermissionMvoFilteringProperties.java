package org.dddml.wms.domain.meta;

import java.util.HashMap;
import java.util.Map;

public final class UserPermissionMvoFilteringProperties
{

    private UserPermissionMvoFilteringProperties()
    {
    }

    public static final String[] propertyNames = new String[] {
            "version",
            "createdBy",
            "createdAt",
            "updatedBy",
            "updatedAt",
            "active",
            "deleted",
            "userUserName",
            "userAccessFailedCount",
            "userEmail",
            "userEmailConfirmed",
            "userLockoutEnabled",
            "userLockoutEndDateUtc",
            "userPasswordHash",
            "userPhoneNumber",
            "userPhoneNumberConfirmed",
            "userTwoFactorEnabled",
            "userSecurityStamp",
            "userVersion",
            "userCreatedBy",
            "userCreatedAt",
            "userUpdatedBy",
            "userUpdatedAt",
            "userActive",
            "userDeleted",
            "userPermissionId.userId",
            "userPermissionId.permissionId",
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
            "Integer",
            "String",
            "Boolean",
            "Boolean",
            "Date",
            "String",
            "String",
            "Boolean",
            "Boolean",
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
    };

    public static final Map<String, String> propertyTypeMap;

    static {
        propertyTypeMap = new HashMap<String, String>();
        for (int i = 0; i < propertyNames.length; i++ ) {
            propertyTypeMap.put(propertyNames[i], propertyTypes[i]);
        }
    }

}

