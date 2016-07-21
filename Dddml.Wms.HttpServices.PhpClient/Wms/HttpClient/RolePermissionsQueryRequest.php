<?php

namespace Wms\HttpClient;


class RolePermissionsQueryRequest extends AbstractQueryRequest
{
    use RolePermissionFilteringFieldsTrait;

    protected $routePath = 'RolePermissions';

    public function getReturnType()
    {
        return 'array<Wms\Domain\RolePermission>';
    }
}

