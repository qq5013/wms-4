<?php

namespace Wms\HttpClient;

use Dddml\Serializer\Type\Long;
use Dddml\Executor\Http\QueryCountRequestInterface;

class UserPermissionMvoQueryRequest extends AbstractQueryRequest implements QueryCountRequestInterface
{
    use UserPermissionMvoFilteringFieldsTrait;

    protected $routePath = 'UserPermissionMvos/{id}';

    public function getReturnType()
    {
        return 'Wms\Domain\UserPermissionMvo';
    }
}

