<?php

namespace Wms\Domain;


trait OrganizationStructureTypeFilteringFieldsTrait
{
    public function getFilteringFields()
    {
        return [
            'Id' => 'string',
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

