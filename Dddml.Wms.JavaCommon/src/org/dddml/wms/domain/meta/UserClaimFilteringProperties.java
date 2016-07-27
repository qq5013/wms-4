package org.dddml.wms.domain.meta;

import java.util.HashMap;
import java.util.Map;

public final class UserClaimFilteringProperties
{

    private UserClaimFilteringProperties()
    {
    }

    public static final String[] propertyNames = new String[] {
            "claimType",
            "claimValue",
            "version",
            "createdBy",
            "createdAt",
            "updatedBy",
            "updatedAt",
            "active",
            "deleted",
            "userId",
            "userClaimId.userId",
            "userClaimId.claimId",
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

