<?php

namespace Dddml\Wms\HttpClient;

use Dddml\Serializer\Type\Long;
use Dddml\Executor\Http\QueryCountRequestInterface;

class RolesQueryRequest extends AbstractQueryRequest implements QueryCountRequestInterface
{
    use RoleFilteringFieldsTrait;

    protected $routePath = 'Roles';

    public function getReturnType()
    {
        return 'array<Dddml\Wms\Domain\Role>';
    }
}

