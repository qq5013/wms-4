package org.dddml.wms.domain.meta;

import java.util.HashMap;
import java.util.Map;

public final class UserLoginMvoFilteringProperties
{

    private UserLoginMvoFilteringProperties()
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
            "UserLoginId.UserId",
            "UserLoginId.LoginKeyLoginProvider",
            "UserLoginId.LoginKeyProviderKey",
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

