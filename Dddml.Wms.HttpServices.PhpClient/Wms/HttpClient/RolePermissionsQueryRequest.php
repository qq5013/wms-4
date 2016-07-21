<?php

namespace Wms\HttpClient;

use Dddml\Serializer\Type\Long;

class RolePermissionsQueryRequest extends AbstractQueryRequest
{
    use RolePermissionFilteringFieldsTrait;

    protected $routePath = 'RolePermissions';

    public function getReturnType()
    {
        return 'array<Wms\Domain\RolePermission>';
    }
}

