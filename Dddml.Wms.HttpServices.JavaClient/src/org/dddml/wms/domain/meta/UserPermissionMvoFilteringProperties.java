package org.dddml.wms.domain.meta;

import java.util.HashMap;
import java.util.Map;

public final class UserPermissionMvoFilteringProperties
{

    private UserPermissionMvoFilteringProperties()
    {
    }

    public final static String[] propertyNames = new String[] {
            "Version",
            "CreatedBy",
            "CreatedAt",
            "UpdatedBy",
            "UpdatedAt",
            "Active",
            "Deleted",
            "UserUserName",
            "UserAccessFailedCount",
            "UserEmail",
            "UserEmailConfirmed",
            "UserLockoutEnabled",
            "UserLockoutEndDateUtc",
            "UserPasswordHash",
            "UserPhoneNumber",
            "UserPhoneNumberConfirmed",
            "UserTwoFactorEnabled",
            "UserSecurityStamp",
            "UserVersion",
            "UserCreatedBy",
            "UserCreatedAt",
            "UserUpdatedBy",
            "UserUpdatedAt",
            "UserActive",
            "UserDeleted",
            "UserPermissionId.UserId",
            "UserPermissionId.PermissionId",
    };

    public final static String[] propertyTypes = new String[] {
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

    public final static Map<String, String> propertyMap;

    static {
        propertyMap = new HashMap<String, String>();
        for (int i = 0; i < propertyNames.length; i++ ) {
            propertyMap.put(propertyNames[i], propertyTypes[i]);
        }
    }

}

