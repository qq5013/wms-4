package org.dddml.wms.domain.meta;

import java.util.HashMap;
import java.util.Map;

public final class InOutLineFilteringProperties
{

    private InOutLineFilteringProperties()
    {
    }

    public static final String[] propertyNames = new String[] {
            "LineNumber",
            "Description",
            "LocatorId",
            "Product",
            "UomId",
            "MovementQuantity",
            "ConfirmedQuantity",
            "ScrappedQuantity",
            "TargetQuantity",
            "PickedQuantity",
            "IsInvoiced",
            "AttributeSetInstanceId",
            "IsDescription",
            "Processed",
            "QuantityEntered",
            "RmaLineNumber",
            "ReversalLineNumber",
            "Version",
            "CreatedBy",
            "CreatedAt",
            "UpdatedBy",
            "UpdatedAt",
            "Active",
            "Deleted",
            "InOutDocumentNumber",
            "SkuId.ProductId",
            "SkuId.AttributeSetInstanceId",
            "InOutLineId.InOutDocumentNumber",
            "InOutLineId.SkuIdProductId",
            "InOutLineId.SkuIdAttributeSetInstanceId",
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

