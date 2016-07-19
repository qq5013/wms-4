<?php

namespace Wms\HttpClient;


class UserPermissionMvosQueryRequest extends AbstractQueryRequest
{
    use UserPermissionMvoFilteringFieldsTrait;

    protected $routePath = 'UserPermissionMvos';

    public function getReturnType()
    {
        return 'array<Wms\Domain\UserPermissionMvo>';
    }
}

