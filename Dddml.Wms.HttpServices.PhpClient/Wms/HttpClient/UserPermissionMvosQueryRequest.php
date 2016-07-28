<?php

namespace Wms\HttpClient;

use Dddml\Serializer\Type\Long;
use Dddml\Executor\Http\QueryCountRequestInterface;

class UserPermissionMvosQueryRequest extends AbstractQueryRequest implements QueryCountRequestInterface
{
    use UserPermissionMvoFilteringFieldsTrait;

    protected $routePath = 'UserPermissionMvos';

    public function getReturnType()
    {
        return 'array<Wms\Domain\UserPermissionMvo>';
    }
}

