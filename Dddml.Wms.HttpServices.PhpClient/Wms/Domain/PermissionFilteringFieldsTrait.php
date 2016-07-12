<?php

namespace Wms\Domain;


trait PermissionFilteringFieldsTrait
{
    public function getFilteringFields()
    {
        return [
            'PermissionId' => 'string',
            'Name' => 'string',
            'ParentPermissionId' => 'string',
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

