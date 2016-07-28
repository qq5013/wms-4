<?php

namespace Wms\HttpClient;

use Dddml\Serializer\Type\Long;
use Dddml\Executor\Http\QueryCountRequestInterface;

class PermissionQueryRequest extends AbstractQueryRequest implements QueryCountRequestInterface
{
    use PermissionFilteringFieldsTrait;

    protected $routePath = 'Permissions/{id}';

    public function getReturnType()
    {
        return 'Wms\Domain\Permission';
    }
}

