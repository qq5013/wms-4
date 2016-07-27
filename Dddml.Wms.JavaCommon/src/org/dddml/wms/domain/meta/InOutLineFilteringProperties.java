package org.dddml.wms.domain.meta;

import java.util.HashMap;
import java.util.Map;

public final class InOutLineFilteringProperties
{

    private InOutLineFilteringProperties()
    {
    }

    public static final String[] propertyNames = new String[] {
            "lineNumber",
            "description",
            "locatorId",
            "product",
            "uomId",
            "movementQuantity",
            "confirmedQuantity",
            "scrappedQuantity",
            "targetQuantity",
            "pickedQuantity",
            "isInvoiced",
            "attributeSetInstanceId",
            "isDescription",
            "processed",
            "quantityEntered",
            "rmaLineNumber",
            "reversalLineNumber",
            "version",
            "createdBy",
            "createdAt",
            "updatedBy",
            "updatedAt",
            "active",
            "deleted",
            "inOutDocumentNumber",
            "skuId.productId",
            "skuId.attributeSetInstanceId",
            "inOutLineId.inOutDocumentNumber",
            "inOutLineId.skuIdProductId",
            "inOutLineId.skuIdAttributeSetInstanceId",
    };

    public static final String[] propertyTypes = new String[] {
            "Long",
            "String",
            "String",
            "String",
            "String",
            "BigDecimal",
            "BigDecimal",
            "BigDecimal",
            "BigDecimal",
            "BigDecimal",
            "Boolean",
            "String",
            "Boolean",
            "Boolean",
            "BigDecimal",
            "Long",
            "Long",
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
    };

    public static final Map<String, String> propertyTypeMap;

    static {
        propertyTypeMap = new HashMap<String, String>();
        for (int i = 0; i < propertyNames.length; i++ ) {
            propertyTypeMap.put(propertyNames[i], propertyTypes[i]);
        }
    }

}

