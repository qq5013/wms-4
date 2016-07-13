<?php

namespace Wms\HttpClient;

use Wms\Domain\UserPermissionId;
use Wms\Domain\UserRole;
use Wms\Domain\UserClaim;
use Wms\Domain\UserPermission;
use Wms\Domain\UserLogin;

class UserPermissionMvoQueryRequest extends AbstractQueryRequest
{
    use UserPermissionMvoFilteringFieldsTrait;

    protected $routePath = 'UserPermissionMvos/{id}';

    public function getReturnType()
    {
        return 'Wms\Domain\UserPermissionMvo';
    }
}

