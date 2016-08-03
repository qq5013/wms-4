<?php

namespace Dddml\Wms\HttpClient;


trait PermissionFilteringFieldsTrait
{
    public function getFilteringFields()
    {
        return [
            'PermissionId' => 'string',
            'Name' => 'string',
            'ParentPermissionId' => 'string',
            'Description' => 'string',
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

