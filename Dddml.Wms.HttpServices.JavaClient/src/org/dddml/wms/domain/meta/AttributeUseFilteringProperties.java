package org.dddml.wms.domain.meta;

import java.util.HashMap;
import java.util.Map;

public final class AttributeUseFilteringProperties
{

    private AttributeUseFilteringProperties()
    {
    }

    public final static String[] propertyNames = new String[] {
            "AttributeId",
            "SequenceNumber",
            "Version",
            "CreatedBy",
            "CreatedAt",
            "UpdatedBy",
            "UpdatedAt",
            "Active",
            "Deleted",
            "AttributeSetId",
            "AttributeSetAttributeUseId.AttributeSetId",
            "AttributeSetAttributeUseId.AttributeId",
    };

    public final static String[] propertyTypes = new String[] {
            "String",
            "Integer",
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

