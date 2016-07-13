<?php

namespace Wms\HttpClient;

use Wms\Domain\RolePermissionId;

class RolePermissionsQueryRequest extends AbstractQueryRequest
{
    use RolePermissionFilteringFieldsTrait;

    protected $routePath = 'RolePermissions';

    public function getReturnType()
    {
        return 'array<Wms\Domain\RolePermission>';
    }
}

