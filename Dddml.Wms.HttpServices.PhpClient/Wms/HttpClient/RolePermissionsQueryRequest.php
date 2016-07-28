<?php

namespace Wms\HttpClient;

use Dddml\Serializer\Type\Long;
use Dddml\Executor\Http\QueryCountRequestInterface;

class RolePermissionsQueryRequest extends AbstractQueryRequest implements QueryCountRequestInterface
{
    use RolePermissionFilteringFieldsTrait;

    protected $routePath = 'RolePermissions';

    public function getReturnType()
    {
        return 'array<Wms\Domain\RolePermission>';
    }
}

