<?php

namespace Wms\Domain;


trait RoleFilteringFieldsTrait
{
    public function getFilteringFields()
    {
        return [
            'RoleId' => 'string',
            'Name' => 'string',
            'Description' => 'string',
            'Version' => 'long',
            'CreatedBy' => 'string',
            'CreatedAt' => '\DateTime',
            'UpdatedBy' => 'string',
            'UpdatedAt' => '\DateTime',
            'Active' => 'boolean',
            'Deleted' => 'boolean',
        ];
    }

}

