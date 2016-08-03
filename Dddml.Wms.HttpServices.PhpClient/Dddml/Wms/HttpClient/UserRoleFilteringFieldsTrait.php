<?php

namespace Dddml\Wms\HttpClient;


trait UserRoleFilteringFieldsTrait
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
            'UserId' => 'string',
            'UserRoleId.UserId' => 'string',
            'UserRoleId.RoleId' => 'string',
        ];
    }

}

