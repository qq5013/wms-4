package org.dddml.wms.domain.meta;

import java.util.HashMap;
import java.util.Map;

public final class UserFilteringProperties
{

    private UserFilteringProperties()
    {
    }

    public static final String[] propertyNames = new String[] {
            "userId",
            "userName",
            "accessFailedCount",
            "email",
            "emailConfirmed",
            "lockoutEnabled",
            "lockoutEndDateUtc",
            "passwordHash",
            "phoneNumber",
            "phoneNumberConfirmed",
            "twoFactorEnabled",
            "securityStamp",
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
    };

    public static final Map<String, String> propertyTypeMap;

    static {
        propertyTypeMap = new HashMap<String, String>();
        for (int i = 0; i < propertyNames.length; i++ ) {
            propertyTypeMap.put(propertyNames[i], propertyTypes[i]);
        }
    }

}

