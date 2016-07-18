package org.dddml.wms.domain.meta;

import java.util.HashMap;
import java.util.Map;

public final class InOutFilteringProperties
{

    private InOutFilteringProperties()
    {
    }

    public static final String[] propertyNames = new String[] {
            "DocumentNumber",
            "IsSOTransaction",
            "DocumentStatus",
            "Posted",
            "Processing",
            "Processed",
            "DocumentType",
            "Description",
            "OrderNumber",
            "DateOrdered",
            "IsPrinted",
            "MovementType",
            "MovementDate",
            "BusinessPartnerId",
            "WarehouseId",
            "POReference",
            "FreightAmount",
            "ShipperId",
            "ChargeAmount",
            "DatePrinted",
            "SalesRepresentative",
            "NumberOfPackages",
            "PickDate",
            "ShipDate",
            "TrackingNumber",
            "DateReceived",
            "IsInTransit",
            "IsApproved",
            "IsInDispute",
            "Volume",
            "Weight",
            "RmaNumber",
            "ReversalNumber",
            "IsDropShip",
            "DropShipBusinessPartnerId",
            "Version",
            "CreatedBy",
            "CreatedAt",
            "UpdatedBy",
            "UpdatedAt",
            "Active",
            "Deleted",
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
    };

    public static final Map<String, String> propertyTypeMap;

    static {
        propertyTypeMap = new HashMap<String, String>();
        for (int i = 0; i < propertyNames.length; i++ ) {
            propertyTypeMap.put(propertyNames[i], propertyTypes[i]);
        }
    }

}

