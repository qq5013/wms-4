package org.dddml.wms.domain.meta;

import java.util.HashMap;
import java.util.Map;

public final class AttributeValueMvoFilteringProperties
{

    private AttributeValueMvoFilteringProperties()
    {
    }

    public final static String[] propertyNames = new String[] {
            "Name",
            "Description",
            "ReferenceId",
            "Version",
            "CreatedBy",
            "CreatedAt",
            "UpdatedBy",
            "UpdatedAt",
            "Active",
            "Deleted",
            "AttributeName",
            "AttributeOrganizationId",
            "AttributeDescription",
            "AttributeIsMandatory",
            "AttributeIsInstanceAttribute",
            "AttributeAttributeValueType",
            "AttributeAttributeValueLength",
            "AttributeIsList",
            "AttributeFieldName",
            "AttributeReferenceId",
            "AttributeVersion",
            "AttributeCreatedBy",
            "AttributeCreatedAt",
            "AttributeUpdatedBy",
            "AttributeUpdatedAt",
            "AttributeActive",
            "AttributeDeleted",
            "AttributeValueId.AttributeId",
            "AttributeValueId.Value",
    };

    public final static String[] propertyTypes = new String[] {
            "String",
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
            "Boolean",
            "Boolean",
            "String",
            "Integer",
            "Boolean",
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
    };

    public final static Map<String, String> propertyMap;

    static {
        propertyMap = new HashMap<String, String>();
        for (int i = 0; i < propertyNames.length; i++ ) {
            propertyMap.put(propertyNames[i], propertyTypes[i]);
        }
    }

}

