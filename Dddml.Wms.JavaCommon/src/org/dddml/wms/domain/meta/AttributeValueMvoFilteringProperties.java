package org.dddml.wms.domain.meta;

import java.util.HashMap;
import java.util.Map;

public final class AttributeValueMvoFilteringProperties
{

    private AttributeValueMvoFilteringProperties()
    {
    }

    public static final String[] propertyNames = new String[] {
            "name",
            "description",
            "referenceId",
            "version",
            "createdBy",
            "createdAt",
            "updatedBy",
            "updatedAt",
            "active",
            "deleted",
            "attributeName",
            "attributeOrganizationId",
            "attributeDescription",
            "attributeIsMandatory",
            "attributeIsInstanceAttribute",
            "attributeAttributeValueType",
            "attributeAttributeValueLength",
            "attributeIsList",
            "attributeFieldName",
            "attributeReferenceId",
            "attributeVersion",
            "attributeCreatedBy",
            "attributeCreatedAt",
            "attributeUpdatedBy",
            "attributeUpdatedAt",
            "attributeActive",
            "attributeDeleted",
            "attributeValueId.attributeId",
            "attributeValueId.value",
    };

    public static final String[] propertyTypes = new String[] {
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

    public static final Map<String, String> propertyTypeMap;

    static {
        propertyTypeMap = new HashMap<String, String>();
        for (int i = 0; i < propertyNames.length; i++ ) {
            propertyTypeMap.put(propertyNames[i], propertyTypes[i]);
        }
    }

}

