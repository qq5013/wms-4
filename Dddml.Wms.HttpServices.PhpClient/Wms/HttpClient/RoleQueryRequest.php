<?php

namespace Wms\HttpClient;

use Dddml\Serializer\Type\Long;
use Dddml\Executor\Http\QueryCountRequestInterface;

class RoleQueryRequest extends AbstractQueryRequest implements QueryCountRequestInterface
{
    use RoleFilteringFieldsTrait;

    protected $routePath = 'Roles/{id}';

    public function getReturnType()
    {
        return 'Wms\Domain\Role';
    }
}

