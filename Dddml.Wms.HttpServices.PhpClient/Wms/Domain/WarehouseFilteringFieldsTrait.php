<?php

namespace Wms\Domain;


trait WarehouseFilteringFieldsTrait
{
    public function getFilteringFields()
    {
        return [
            'WarehouseId' => 'string',
            'Name' => 'string',
            'Description' => 'string',
            'IsInTransit' => 'boolean',
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

