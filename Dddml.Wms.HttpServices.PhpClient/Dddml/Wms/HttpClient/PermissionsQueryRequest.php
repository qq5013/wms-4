<?php

namespace Dddml\Wms\HttpClient;

use Dddml\Serializer\Type\Long;
use Dddml\Executor\Http\QueryCountRequestInterface;

class PermissionsQueryRequest extends AbstractQueryRequest implements QueryCountRequestInterface
{
    use PermissionFilteringFieldsTrait;

    protected $routePath = 'Permissions';

    public function getReturnType()
    {
        return 'array<Dddml\Wms\Domain\Permission>';
    }
}

