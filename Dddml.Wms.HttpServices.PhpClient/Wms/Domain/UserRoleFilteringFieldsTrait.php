<?php

namespace Wms\Domain;


trait UserRoleFilteringFieldsTrait
{
    public function getFilteringFields()
    {
        return [
            'RoleId' => 'string',
            'Version' => 'long',
            'CreatedBy' => 'string',
            'CreatedAt' => '\DateTime',
            'UpdatedBy' => 'string',
            'UpdatedAt' => '\DateTime',
            'Active' => 'boolean',
            'Deleted' => 'boolean',
            'UserId' => 'string',
            'UserRoleId.UserId' => 'string',
            'UserRoleId.RoleId' => 'string',
        ];
    }

}

