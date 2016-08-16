package org.dddml.wms.domain.meta;

import java.util.HashMap;
import java.util.Map;

public final class YearPlanMvoFilteringProperties
{

    private YearPlanMvoFilteringProperties()
    {
    }

    public static final String[] propertyNames = new String[] {
            "description",
            "version",
            "createdBy",
            "createdAt",
            "updatedBy",
            "updatedAt",
            "active",
            "deleted",
            "personBirthDate",
            "personVersion",
            "personCreatedBy",
            "personCreatedAt",
            "personUpdatedBy",
            "personUpdatedAt",
            "personActive",
            "personDeleted",
            "yearPlanId.personalNameFirstName",
            "yearPlanId.personalNameLastName",
            "yearPlanId.year",
            "personLoves.firstName",
            "personLoves.lastName",
    };

    public static final String[] propertyTypes = new String[] {
            "String",
            "Long",
            "String",
            "Date",
            "String",
            "Date",
            "Boolean",
            "Boolean",
            "Date",
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

