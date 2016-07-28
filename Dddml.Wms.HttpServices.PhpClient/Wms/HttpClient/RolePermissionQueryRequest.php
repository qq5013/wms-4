<?php

namespace Wms\HttpClient;

use Dddml\Serializer\Type\Long;
use Dddml\Executor\Http\QueryCountRequestInterface;

class RolePermissionQueryRequest extends AbstractQueryRequest implements QueryCountRequestInterface
{
    use RolePermissionFilteringFieldsTrait;

    protected $routePath = 'RolePermissions/{id}';

    public function getReturnType()
    {
        return 'Wms\Domain\RolePermission';
    }
}

