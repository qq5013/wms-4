<?php

namespace Dddml\Wms\HttpClient;


trait InOutLineFilteringFieldsTrait
{
    public function getFilteringFields()
    {
        return [
            'LineNumber' => 'Long',
            'Description' => 'string',
            'LocatorId' => 'string',
            'Product' => 'string',
            'UomId' => 'string',
            'MovementQuantity' => 'Decimal',
            'ConfirmedQuantity' => 'Decimal',
            'ScrappedQuantity' => 'Decimal',
            'TargetQuantity' => 'Decimal',
            'PickedQuantity' => 'Decimal',
            'IsInvoiced' => 'boolean',
            'AttributeSetInstanceId' => 'string',
            'IsDescription' => 'boolean',
            'Processed' => 'boolean',
            'QuantityEntered' => 'Decimal',
            'RmaLineNumber' => 'Long',
            'ReversalLineNumber' => 'Long',
            'Version' => 'Long',
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

