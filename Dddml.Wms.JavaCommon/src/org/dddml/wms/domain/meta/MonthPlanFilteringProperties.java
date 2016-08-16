package org.dddml.wms.domain.meta;

import java.util.HashMap;
import java.util.Map;

public final class MonthPlanFilteringProperties
{

    private MonthPlanFilteringProperties()
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
            "monthPlanId.personalNameFirstName",
            "monthPlanId.personalNameLastName",
            "monthPlanId.year",
            "monthPlanId.month",
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

