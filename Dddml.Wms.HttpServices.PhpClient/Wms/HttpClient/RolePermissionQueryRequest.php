<?php

namespace Wms\HttpClient;

use Dddml\Serializer\Type\Long;

class RolePermissionQueryRequest extends AbstractQueryRequest
{
    use RolePermissionFilteringFieldsTrait;

    protected $routePath = 'RolePermissions/{id}';

    public function getReturnType()
    {
        return 'Wms\Domain\RolePermission';
    }
}

