<?php

namespace Wms\HttpClient;

use Wms\Domain\UserRoleId;
use Wms\Domain\UserRole;
use Wms\Domain\UserClaim;
use Wms\Domain\UserPermission;
use Wms\Domain\UserLogin;

class UserRoleMvosQueryRequest extends AbstractQueryRequest
{
    use UserRoleMvoFilteringFieldsTrait;

    protected $routePath = 'UserRoleMvos';

    public function getReturnType()
    {
        return 'array<Wms\Domain\UserRoleMvo>';
    }
}

