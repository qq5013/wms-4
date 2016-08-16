package org.dddml.wms.domain.meta;

import java.util.HashMap;
import java.util.Map;

public final class MonthPlanMvoFilteringProperties
{

    private MonthPlanMvoFilteringProperties()
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
            "yearPlanDescription",
            "yearPlanVersion",
            "yearPlanCreatedBy",
            "yearPlanCreatedAt",
            "yearPlanUpdatedBy",
            "yearPlanUpdatedAt",
            "yearPlanActive",
            "yearPlanDeleted",
            "personBirthDate",
            "personVersion",
            "personCreatedBy",
            "personCreatedAt",
            "personUpdatedBy",
            "personUpdatedAt",
            "personActive",
            "personDeleted",
            "monthPlanId.personalNameFirstName",
            "monthPlanId.personalNameLastName",
            "monthPlanId.year",
            "monthPlanId.month",
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

