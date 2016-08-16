package org.dddml.wms.domain.meta;

import java.util.HashMap;
import java.util.Map;

public final class DayPlanFilteringProperties
{

    private DayPlanFilteringProperties()
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
            "year",
            "month",
            "dayPlanId.personalNameFirstName",
            "dayPlanId.personalNameLastName",
            "dayPlanId.year",
            "dayPlanId.month",
            "dayPlanId.day",
            "personalName.firstName",
            "personalName.lastName",
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
            "Integer",
            "Integer",
            "String",
            "String",
            "Integer",
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

