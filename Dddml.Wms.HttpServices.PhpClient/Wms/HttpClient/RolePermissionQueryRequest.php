<?php

namespace Wms\HttpClient;

use Wms\Domain\RolePermissionId;

class RolePermissionQueryRequest extends AbstractQueryRequest
{
    use RolePermissionFilteringFieldsTrait;

    protected $routePath = 'RolePermissions/{id}';

    public function getReturnType()
    {
        return 'Wms\Domain\RolePermission';
    }
}

