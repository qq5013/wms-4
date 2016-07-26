package org.dddml.wms.domain.meta;

import java.util.HashMap;
import java.util.Map;

public final class AttributeSetInstanceExtensionFieldFilteringProperties
{

    private AttributeSetInstanceExtensionFieldFilteringProperties()
    {
    }

    public static final String[] propertyNames = new String[] {
            "Name",
            "Type",
            "Length",
            "Alias",
            "Description",
            "Version",
            "CreatedBy",
            "CreatedAt",
            "UpdatedBy",
            "UpdatedAt",
            "Active",
            "Deleted",
            "GroupId",
            "AttributeSetInstanceExtensionFieldId.GroupId",
            "AttributeSetInstanceExtensionFieldId.Index",
    };

    public static final String[] propertyTypes = new String[] {
            "String",
            "String",
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

