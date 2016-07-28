<?php

namespace Wms\HttpClient;

use Dddml\Serializer\Type\Long;

class UserPermissionMvoQueryRequest extends AbstractQueryRequest
{
    use UserPermissionMvoFilteringFieldsTrait;

    protected $routePath = 'UserPermissionMvos/{id}';

    public function getReturnType()
    {
        return 'Wms\Domain\UserPermissionMvo';
    }
}

