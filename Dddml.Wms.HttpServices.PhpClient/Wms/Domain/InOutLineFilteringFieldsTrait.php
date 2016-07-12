<?php

namespace Wms\Domain;


trait InOutLineFilteringFieldsTrait
{
    public function getFilteringFields()
    {
        return [
            'LineNumber' => 'long',
            'Description' => 'string',
            'LocatorId' => 'string',
            'Product' => 'string',
            'UomId' => 'string',
            'MovementQuantity' => 'decimal',
            'ConfirmedQuantity' => 'decimal',
            'ScrappedQuantity' => 'decimal',
            'TargetQuantity' => 'decimal',
            'PickedQuantity' => 'decimal',
            'IsInvoiced' => 'boolean',
            'AttributeSetInstanceId' => 'string',
            'IsDescription' => 'boolean',
            'Processed' => 'boolean',
            'QuantityEntered' => 'decimal',
            'RmaLineNumber' => 'long',
            'ReversalLineNumber' => 'long',
            'Version' => 'long',
            'CreatedBy' => 'string',
            'CreatedAt' => '\DateTime',
            'UpdatedBy' => 'string',
            'UpdatedAt' => '\DateTime',
            'Active' => 'boolean',
            'Deleted' => 'boolean',
            'InOutDocumentNumber' => 'string',
            'SkuId.ProductId' => 'string',
            'SkuId.AttributeSetInstanceId' => 'string',
            'InOutLineId.InOutDocumentNumber' => 'string',
            'InOutLineId.SkuIdProductId' => 'string',
            'InOutLineId.SkuIdAttributeSetInstanceId' => 'string',
        ];
    }

}

