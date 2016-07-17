package org.dddml.wms.domain.meta;

import java.util.HashMap;
import java.util.Map;

public final class UserClaimFilteringProperties
{

    private UserClaimFilteringProperties()
    {
    }

    public final static String[] propertyNames = new String[] {
            "ClaimId",
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

    public final static String[] propertyTypes = new String[] {
            "Integer",
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

    public final static Map<String, String> propertyMap;

    static {
        propertyMap = new HashMap<String, String>();
        for (int i = 0; i < propertyNames.length; i++ ) {
            propertyMap.put(propertyNames[i], propertyTypes[i]);
        }
    }

}

