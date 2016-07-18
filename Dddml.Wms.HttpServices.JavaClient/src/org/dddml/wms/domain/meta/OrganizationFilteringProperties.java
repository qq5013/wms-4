package org.dddml.wms.domain.meta;

import java.util.HashMap;
import java.util.Map;

public final class OrganizationFilteringProperties
{

    private OrganizationFilteringProperties()
    {
    }

    public static final String[] propertyNames = new String[] {
            "OrganizationId",
            "Name",
            "Description",
            "Type",
            "IsSummary",
            "Version",
            "CreatedBy",
            "CreatedAt",
            "UpdatedBy",
            "UpdatedAt",
            "Active",
            "Deleted",
    };

    public static final String[] propertyTypes = new String[] {
            "String",
            "String",
            "String",
            "String",
            "Boolean",
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

