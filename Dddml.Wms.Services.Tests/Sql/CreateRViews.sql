CREATE VIEW `AttributeValue_RV` AS
    SELECT 

        `AttributeValues`.`AttributeValueIdAttributeId`,

        `AttributeValues`.`AttributeValueIdValue`,

        `AttributeValues`.`Name`,

        `AttributeValues`.`Description`,

        `AttributeValues`.`ReferenceId`,

        `AttributeValues`.`Version`,

        `AttributeValues`.`CreatedBy`,

        `AttributeValues`.`CreatedAt`,

        `AttributeValues`.`UpdatedBy`,

        `AttributeValues`.`UpdatedAt`,

        `AttributeValues`.`Active`,

        `AttributeValues`.`Deleted`,

        `Attributes`.`Name` AS `AttributeName`,

        `Attributes`.`OrganizationId` AS `AttributeOrganizationId`,

        `Attributes`.`Description` AS `AttributeDescription`,

        `Attributes`.`IsMandatory` AS `AttributeIsMandatory`,

        `Attributes`.`IsInstanceAttribute` AS `AttributeIsInstanceAttribute`,

        `Attributes`.`AttributeValueType` AS `AttributeAttributeValueType`,

        `Attributes`.`AttributeValueLength` AS `AttributeAttributeValueLength`,

        `Attributes`.`IsList` AS `AttributeIsList`,

        `Attributes`.`FieldName` AS `AttributeFieldName`,

        `Attributes`.`ReferenceId` AS `AttributeReferenceId`,

        `Attributes`.`Version` AS `AttributeVersion`,

        `Attributes`.`CreatedBy` AS `AttributeCreatedBy`,

        `Attributes`.`CreatedAt` AS `AttributeCreatedAt`,

        `Attributes`.`UpdatedBy` AS `AttributeUpdatedBy`,

        `Attributes`.`UpdatedAt` AS `AttributeUpdatedAt`,

        `Attributes`.`Active` AS `AttributeActive`,

        `Attributes`.`Deleted` AS `AttributeDeleted`

    FROM
        (`AttributeValues`

            JOIN `Attributes` ON ( 1=1 

                and (`AttributeValues`.`AttributeValueIdAttributeId` = `Attributes`.`AttributeId`)
            )
        );


CREATE VIEW `AttributeUse_RV` AS
    SELECT 

        `AttributeUses`.`AttributeSetAttributeUseIdAttributeSetId`,

        `AttributeUses`.`AttributeSetAttributeUseIdAttributeId`,

        `AttributeUses`.`SequenceNumber`,

        `AttributeUses`.`Version`,

        `AttributeUses`.`CreatedBy`,

        `AttributeUses`.`CreatedAt`,

        `AttributeUses`.`UpdatedBy`,

        `AttributeUses`.`UpdatedAt`,

        `AttributeUses`.`Active`,

        `AttributeUses`.`Deleted`,

        `AttributeSets`.`Name` AS `AttributeSetName`,

        `AttributeSets`.`OrganizationId` AS `AttributeSetOrganizationId`,

        `AttributeSets`.`Description` AS `AttributeSetDescription`,

        `AttributeSets`.`SerialNumberAttributeId` AS `AttributeSetSerialNumberAttributeId`,

        `AttributeSets`.`LotAttributeId` AS `AttributeSetLotAttributeId`,

        `AttributeSets`.`ReferenceId` AS `AttributeSetReferenceId`,

        `AttributeSets`.`Version` AS `AttributeSetVersion`,

        `AttributeSets`.`CreatedBy` AS `AttributeSetCreatedBy`,

        `AttributeSets`.`CreatedAt` AS `AttributeSetCreatedAt`,

        `AttributeSets`.`UpdatedBy` AS `AttributeSetUpdatedBy`,

        `AttributeSets`.`UpdatedAt` AS `AttributeSetUpdatedAt`,

        `AttributeSets`.`Active` AS `AttributeSetActive`,

        `AttributeSets`.`Deleted` AS `AttributeSetDeleted`

    FROM
        (`AttributeUses`

            JOIN `AttributeSets` ON ( 1=1 

                and (`AttributeUses`.`AttributeSetAttributeUseIdAttributeSetId` = `AttributeSets`.`AttributeSetId`)
            )
        );


CREATE VIEW `AttributeSetInstanceExtensionField_RV` AS
    SELECT 

        `AttributeSetInstanceExtensionFields`.`AttributeSetInstanceExtensionFieldIdGroupId`,

        `AttributeSetInstanceExtensionFields`.`AttributeSetInstanceExtensionFieldIdIndex`,

        `AttributeSetInstanceExtensionFields`.`Name`,

        `AttributeSetInstanceExtensionFields`.`Type`,

        `AttributeSetInstanceExtensionFields`.`Length`,

        `AttributeSetInstanceExtensionFields`.`Alias`,

        `AttributeSetInstanceExtensionFields`.`Description`,

        `AttributeSetInstanceExtensionFields`.`Version`,

        `AttributeSetInstanceExtensionFields`.`CreatedBy`,

        `AttributeSetInstanceExtensionFields`.`CreatedAt`,

        `AttributeSetInstanceExtensionFields`.`UpdatedBy`,

        `AttributeSetInstanceExtensionFields`.`UpdatedAt`,

        `AttributeSetInstanceExtensionFields`.`Active`,

        `AttributeSetInstanceExtensionFields`.`Deleted`,

        `AttributeSetInstanceExtensionFieldGroups`.`FieldType` AS `AttrSetInstEFGroupFieldType`,

        `AttributeSetInstanceExtensionFieldGroups`.`FieldLength` AS `AttrSetInstEFGroupFieldLength`,

        `AttributeSetInstanceExtensionFieldGroups`.`FieldCount` AS `AttrSetInstEFGroupFieldCount`,

        `AttributeSetInstanceExtensionFieldGroups`.`NameFormat` AS `AttrSetInstEFGroupNameFormat`,

        `AttributeSetInstanceExtensionFieldGroups`.`Description` AS `AttrSetInstEFGroupDescription`,

        `AttributeSetInstanceExtensionFieldGroups`.`Version` AS `AttrSetInstEFGroupVersion`,

        `AttributeSetInstanceExtensionFieldGroups`.`CreatedBy` AS `AttrSetInstEFGroupCreatedBy`,

        `AttributeSetInstanceExtensionFieldGroups`.`CreatedAt` AS `AttrSetInstEFGroupCreatedAt`,

        `AttributeSetInstanceExtensionFieldGroups`.`UpdatedBy` AS `AttrSetInstEFGroupUpdatedBy`,

        `AttributeSetInstanceExtensionFieldGroups`.`UpdatedAt` AS `AttrSetInstEFGroupUpdatedAt`,

        `AttributeSetInstanceExtensionFieldGroups`.`Active` AS `AttrSetInstEFGroupActive`,

        `AttributeSetInstanceExtensionFieldGroups`.`Deleted` AS `AttrSetInstEFGroupDeleted`

    FROM
        (`AttributeSetInstanceExtensionFields`

            JOIN `AttributeSetInstanceExtensionFieldGroups` ON ( 1=1 

                and (`AttributeSetInstanceExtensionFields`.`AttributeSetInstanceExtensionFieldIdGroupId` = `AttributeSetInstanceExtensionFieldGroups`.`Id`)
            )
        );


CREATE VIEW `InOutLine_RV` AS
    SELECT 

        `InOutLines`.`InOutLineIdInOutDocumentNumber`,

        `InOutLines`.`InOutLineIdSkuIdProductId`,

        `InOutLines`.`InOutLineIdSkuIdAttributeSetInstanceId`,

        `InOutLines`.`LineNumber`,

        `InOutLines`.`Description`,

        `InOutLines`.`LocatorId`,

        `InOutLines`.`Product`,

        `InOutLines`.`UomId`,

        `InOutLines`.`MovementQuantity`,

        `InOutLines`.`ConfirmedQuantity`,

        `InOutLines`.`ScrappedQuantity`,

        `InOutLines`.`TargetQuantity`,

        `InOutLines`.`PickedQuantity`,

        `InOutLines`.`IsInvoiced`,

        `InOutLines`.`AttributeSetInstanceId`,

        `InOutLines`.`IsDescription`,

        `InOutLines`.`Processed`,

        `InOutLines`.`QuantityEntered`,

        `InOutLines`.`RmaLineNumber`,

        `InOutLines`.`ReversalLineNumber`,

        `InOutLines`.`Version`,

        `InOutLines`.`CreatedBy`,

        `InOutLines`.`CreatedAt`,

        `InOutLines`.`UpdatedBy`,

        `InOutLines`.`UpdatedAt`,

        `InOutLines`.`Active`,

        `InOutLines`.`Deleted`,

        `InOuts`.`IsSOTransaction` AS `InOutIsSOTransaction`,

        `InOuts`.`DocumentStatus` AS `InOutDocumentStatus`,

        `InOuts`.`Posted` AS `InOutPosted`,

        `InOuts`.`Processing` AS `InOutProcessing`,

        `InOuts`.`Processed` AS `InOutProcessed`,

        `InOuts`.`DocumentType` AS `InOutDocumentType`,

        `InOuts`.`Description` AS `InOutDescription`,

        `InOuts`.`OrderNumber` AS `InOutOrderNumber`,

        `InOuts`.`DateOrdered` AS `InOutDateOrdered`,

        `InOuts`.`IsPrinted` AS `InOutIsPrinted`,

        `InOuts`.`MovementType` AS `InOutMovementType`,

        `InOuts`.`MovementDate` AS `InOutMovementDate`,

        `InOuts`.`BusinessPartnerId` AS `InOutBusinessPartnerId`,

        `InOuts`.`WarehouseId` AS `InOutWarehouseId`,

        `InOuts`.`POReference` AS `InOutPOReference`,

        `InOuts`.`FreightAmount` AS `InOutFreightAmount`,

        `InOuts`.`ShipperId` AS `InOutShipperId`,

        `InOuts`.`ChargeAmount` AS `InOutChargeAmount`,

        `InOuts`.`DatePrinted` AS `InOutDatePrinted`,

        `InOuts`.`SalesRepresentative` AS `InOutSalesRepresentative`,

        `InOuts`.`NumberOfPackages` AS `InOutNumberOfPackages`,

        `InOuts`.`PickDate` AS `InOutPickDate`,

        `InOuts`.`ShipDate` AS `InOutShipDate`,

        `InOuts`.`TrackingNumber` AS `InOutTrackingNumber`,

        `InOuts`.`DateReceived` AS `InOutDateReceived`,

        `InOuts`.`IsInTransit` AS `InOutIsInTransit`,

        `InOuts`.`IsApproved` AS `InOutIsApproved`,

        `InOuts`.`IsInDispute` AS `InOutIsInDispute`,

        `InOuts`.`Volume` AS `InOutVolume`,

        `InOuts`.`Weight` AS `InOutWeight`,

        `InOuts`.`RmaNumber` AS `InOutRmaNumber`,

        `InOuts`.`ReversalNumber` AS `InOutReversalNumber`,

        `InOuts`.`IsDropShip` AS `InOutIsDropShip`,

        `InOuts`.`DropShipBusinessPartnerId` AS `InOutDropShipBusinessPartnerId`,

        `InOuts`.`Version` AS `InOutVersion`,

        `InOuts`.`CreatedBy` AS `InOutCreatedBy`,

        `InOuts`.`CreatedAt` AS `InOutCreatedAt`,

        `InOuts`.`UpdatedBy` AS `InOutUpdatedBy`,

        `InOuts`.`UpdatedAt` AS `InOutUpdatedAt`,

        `InOuts`.`Active` AS `InOutActive`,

        `InOuts`.`Deleted` AS `InOutDeleted`

    FROM
        (`InOutLines`

            JOIN `InOuts` ON ( 1=1 

                and (`InOutLines`.`InOutLineIdInOutDocumentNumber` = `InOuts`.`DocumentNumber`)
            )
        );


