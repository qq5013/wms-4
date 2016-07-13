<?php

namespace Wms\Domain;


trait RolePermissionFilteringFieldsTrait
{
    public function getFilteringFields()
    {
        return [
            'Version' => 'long',
            'CreatedBy' => 'string',
            'CreatedAt' => '\DateTime',
            'UpdatedBy' => 'string',
            'UpdatedAt' => '\DateTime',
            'Active' => 'boolean',
            'Deleted' => 'boolean',
            'Id.RoleId' => 'string',
            'Id.PermissionId' => 'string',
        ];
    }

}

