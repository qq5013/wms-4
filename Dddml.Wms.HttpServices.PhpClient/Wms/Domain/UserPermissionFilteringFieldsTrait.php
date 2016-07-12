<?php

namespace Wms\Domain;


trait UserPermissionFilteringFieldsTrait
{
    public function getFilteringFields()
    {
        return [
            'PermissionId' => 'string',
            'Version' => 'long',
            'CreatedBy' => 'string',
            'CreatedAt' => '\DateTime',
            'UpdatedBy' => 'string',
            'UpdatedAt' => '\DateTime',
            'Active' => 'boolean',
            'Deleted' => 'boolean',
            'UserId' => 'string',
            'UserPermissionId.UserId' => 'string',
            'UserPermissionId.PermissionId' => 'string',
        ];
    }

}

