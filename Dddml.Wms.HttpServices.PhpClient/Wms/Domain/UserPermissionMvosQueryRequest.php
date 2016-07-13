<?php

namespace Wms\Domain;

use Wms\Domain\AbstractQueryRequest;
use Wms\Domain\UserPermissionId;
use Wms\Domain\UserRole;
use Wms\Domain\UserClaim;
use Wms\Domain\UserPermission;
use Wms\Domain\UserLogin;

class UserPermissionMvosQueryRequest extends AbstractQueryRequest
{
    use UserPermissionMvoFilteringFieldsTrait;

    protected $routePath = 'UserPermissionMvos';

    public function getReturnType()
    {
        return 'array<Wms\Domain\UserPermissionMvo>';
    }
}

