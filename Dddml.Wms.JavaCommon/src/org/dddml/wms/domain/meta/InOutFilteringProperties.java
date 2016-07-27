package org.dddml.wms.domain.meta;

import java.util.HashMap;
import java.util.Map;

public final class InOutFilteringProperties
{

    private InOutFilteringProperties()
    {
    }

    public static final String[] propertyNames = new String[] {
            "documentNumber",
            "isSOTransaction",
            "documentStatus",
            "posted",
            "processing",
            "processed",
            "documentType",
            "description",
            "orderNumber",
            "dateOrdered",
            "isPrinted",
            "movementType",
            "movementDate",
            "businessPartnerId",
            "warehouseId",
            "POReference",
            "freightAmount",
            "shipperId",
            "chargeAmount",
            "datePrinted",
            "salesRepresentative",
            "numberOfPackages",
            "pickDate",
            "shipDate",
            "trackingNumber",
            "dateReceived",
            "isInTransit",
            "isApproved",
            "isInDispute",
            "volume",
            "weight",
            "rmaNumber",
            "reversalNumber",
            "isDropShip",
            "dropShipBusinessPartnerId",
            "version",
            "createdBy",
            "createdAt",
            "updatedBy",
            "updatedAt",
            "active",
            "deleted",
            "freightAmount.amount",
            "freightAmount.currency",
            "chargeAmount.amount",
            "chargeAmount.currency",
    };

    public static final String[] propertyTypes = new String[] {
            "String",
            "Boolean",
            "String",
            "Boolean",
            "Boolean",
            "Boolean",
            "Integer",
            "String",
            "String",
            "Date",
            "Boolean",
            "String",
            "Date",
            "String",
            "String",
            "String",
            "Money",
            "String",
            "Money",
            "Date",
            "String",
            "Integer",
            "Date",
            "Date",
            "String",
            "Date",
            "Boolean",
            "Boolean",
            "Boolean",
            "BigDecimal",
            "BigDecimal",
            "String",
            "String",
            "Boolean",
            "String",
            "Long",
            "String",
            "Date",
            "String",
            "Date",
            "Boolean",
            "Boolean",
            "BigDecimal",
            "String",
            "BigDecimal",
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

