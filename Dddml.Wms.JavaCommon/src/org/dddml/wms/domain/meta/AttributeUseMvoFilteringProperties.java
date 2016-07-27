package org.dddml.wms.domain.meta;

import java.util.HashMap;
import java.util.Map;

public final class AttributeUseMvoFilteringProperties
{

    private AttributeUseMvoFilteringProperties()
    {
    }

    public static final String[] propertyNames = new String[] {
            "sequenceNumber",
            "version",
            "createdBy",
            "createdAt",
            "updatedBy",
            "updatedAt",
            "active",
            "deleted",
            "attributeSetName",
            "attributeSetOrganizationId",
            "attributeSetDescription",
            "attributeSetSerialNumberAttributeId",
            "attributeSetLotAttributeId",
            "attributeSetReferenceId",
            "attributeSetVersion",
            "attributeSetCreatedBy",
            "attributeSetCreatedAt",
            "attributeSetUpdatedBy",
            "attributeSetUpdatedAt",
            "attributeSetActive",
            "attributeSetDeleted",
            "attributeSetAttributeUseId.attributeSetId",
            "attributeSetAttributeUseId.attributeId",
    };

    public static final String[] propertyTypes = new String[] {
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
    };

    public static final Map<String, String> propertyTypeMap;

    static {
        propertyTypeMap = new HashMap<String, String>();
        for (int i = 0; i < propertyNames.length; i++ ) {
            propertyTypeMap.put(propertyNames[i], propertyTypes[i]);
        }
    }

}

