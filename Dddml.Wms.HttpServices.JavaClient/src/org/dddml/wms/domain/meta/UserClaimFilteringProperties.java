package org.dddml.wms.domain.meta;

import java.util.HashMap;
import java.util.Map;

public final class UserClaimFilteringProperties
{

    private UserClaimFilteringProperties()
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
            "UserId",
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

