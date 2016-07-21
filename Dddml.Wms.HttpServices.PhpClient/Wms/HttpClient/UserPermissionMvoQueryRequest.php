<?php

namespace Wms\HttpClient;


class UserPermissionMvoQueryRequest extends AbstractQueryRequest
{
    use UserPermissionMvoFilteringFieldsTrait;

    protected $routePath = 'UserPermissionMvos/{id}';

    public function getReturnType()
    {
        return 'Wms\Domain\UserPermissionMvo';
    }
}

