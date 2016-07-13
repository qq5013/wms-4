<?php

namespace Wms\HttpClient;


trait RolePermissionFilteringFieldsTrait
{
    public function getFilteringFields()
    {
        return [
            'Version' => 'Long',
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

