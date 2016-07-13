<?php

namespace Wms\HttpClient;


trait LocatorFilteringFieldsTrait
{
    public function getFilteringFields()
    {
        return [
            'LocatorId' => 'string',
            'WarehouseId' => 'string',
            'ParentLocatorId' => 'string',
            'LocatorType' => 'string',
            'PriorityNumber' => 'string',
            'IsDefault' => 'boolean',
            'X' => 'string',
            'Y' => 'string',
            'Z' => 'string',
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

