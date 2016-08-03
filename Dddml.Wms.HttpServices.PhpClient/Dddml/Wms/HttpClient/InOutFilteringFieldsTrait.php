<?php

namespace Dddml\Wms\HttpClient;


trait InOutFilteringFieldsTrait
{
    public function getFilteringFields()
    {
        return [
            'DocumentNumber' => 'string',
            'IsSOTransaction' => 'boolean',
            'DocumentStatus' => 'string',
            'Posted' => 'boolean',
            'Processing' => 'boolean',
            'Processed' => 'boolean',
            'DocumentType' => 'integer',
            'Description' => 'string',
            'OrderNumber' => 'string',
            'DateOrdered' => '\DateTime',
            'IsPrinted' => 'boolean',
            'MovementType' => 'string',
            'MovementDate' => '\DateTime',
            'BusinessPartnerId' => 'string',
            'WarehouseId' => 'string',
            'POReference' => 'string',
            'FreightAmount' => 'Money',
            'ShipperId' => 'string',
            'ChargeAmount' => 'Money',
            'DatePrinted' => '\DateTime',
            'SalesRepresentative' => 'string',
            'NumberOfPackages' => 'integer',
            'PickDate' => '\DateTime',
            'ShipDate' => '\DateTime',
            'TrackingNumber' => 'string',
            'DateReceived' => '\DateTime',
            'IsInTransit' => 'boolean',
            'IsApproved' => 'boolean',
            'IsInDispute' => 'boolean',
            'Volume' => 'Decimal',
            'Weight' => 'Decimal',
            'RmaNumber' => 'string',
            'ReversalNumber' => 'string',
            'IsDropShip' => 'boolean',
            'DropShipBusinessPartnerId' => 'string',
            'Version' => 'Long',
            'CreatedBy' => 'string',
            'CreatedAt' => '\DateTime',
            'UpdatedBy' => 'string',
            'UpdatedAt' => '\DateTime',
            'Active' => 'boolean',
            'Deleted' => 'boolean',
        ];
    }

}

