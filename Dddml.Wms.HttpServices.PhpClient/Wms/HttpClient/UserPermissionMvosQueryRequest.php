<?php

namespace Wms\HttpClient;

use Dddml\Serializer\Type\Long;

class UserPermissionMvosQueryRequest extends AbstractQueryRequest
{
    use UserPermissionMvoFilteringFieldsTrait;

    protected $routePath = 'UserPermissionMvos';

    public function getReturnType()
    {
        return 'array<Wms\Domain\UserPermissionMvo>';
    }
}

