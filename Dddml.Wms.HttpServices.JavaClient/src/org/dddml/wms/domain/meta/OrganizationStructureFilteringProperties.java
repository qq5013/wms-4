package org.dddml.wms.domain.meta;

import java.util.HashMap;
import java.util.Map;

public final class OrganizationStructureFilteringProperties
{

    private OrganizationStructureFilteringProperties()
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
            "Id.OrganizationStructureTypeId",
            "Id.ParentId",
            "Id.SubsidiaryId",
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

