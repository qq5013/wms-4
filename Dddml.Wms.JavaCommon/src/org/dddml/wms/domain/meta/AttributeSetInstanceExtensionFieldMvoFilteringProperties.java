package org.dddml.wms.domain.meta;

import java.util.HashMap;
import java.util.Map;

public final class AttributeSetInstanceExtensionFieldMvoFilteringProperties
{

    private AttributeSetInstanceExtensionFieldMvoFilteringProperties()
    {
    }

    public static final String[] propertyNames = new String[] {
            "name",
            "type",
            "length",
            "alias",
            "description",
            "version",
            "createdBy",
            "createdAt",
            "updatedBy",
            "updatedAt",
            "active",
            "deleted",
            "attrSetInstEFGroupFieldType",
            "attrSetInstEFGroupFieldLength",
            "attrSetInstEFGroupFieldCount",
            "attrSetInstEFGroupNameFormat",
            "attrSetInstEFGroupDescription",
            "attrSetInstEFGroupVersion",
            "attrSetInstEFGroupCreatedBy",
            "attrSetInstEFGroupCreatedAt",
            "attrSetInstEFGroupUpdatedBy",
            "attrSetInstEFGroupUpdatedAt",
            "attrSetInstEFGroupActive",
            "attrSetInstEFGroupDeleted",
            "attributeSetInstanceExtensionFieldId.groupId",
            "attributeSetInstanceExtensionFieldId.index",
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
            "Integer",
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
    };

    public static final Map<String, String> propertyTypeMap;

    static {
        propertyTypeMap = new HashMap<String, String>();
        for (int i = 0; i < propertyNames.length; i++ ) {
            propertyTypeMap.put(propertyNames[i], propertyTypes[i]);
        }
    }

}

