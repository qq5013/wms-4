package org.dddml.wms.domain.meta;

import java.util.HashMap;
import java.util.Map;

public final class UserClaimMvoFilteringProperties
{

    private UserClaimMvoFilteringProperties()
    {
    }

    public static final String[] propertyNames = new String[] {
            "ClaimType",
            "ClaimValue",
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
            "UserClaimId.UserId",
            "UserClaimId.ClaimId",
    };

    public static final String[] propertyTypes = new String[] {
            "String",
            "String",
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
            "Integer",
    };

    public static final Map<String, String> propertyTypeMap;

    static {
        propertyTypeMap = new HashMap<String, String>();
        for (int i = 0; i < propertyNames.length; i++ ) {
            propertyTypeMap.put(propertyNames[i], propertyTypes[i]);
        }
    }

}

