<?php

namespace Wms\Domain;

use Wms\Domain\AbstractQueryRequest;
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

