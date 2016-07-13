<?php

namespace Wms\Domain;

use Wms\Domain\AbstractQueryRequest;
use Wms\Domain\UserRoleId;
use Wms\Domain\UserRole;
use Wms\Domain\UserClaim;
use Wms\Domain\UserPermission;
use Wms\Domain\UserLogin;

class UserRoleMvoQueryRequest extends AbstractQueryRequest
{
    use UserRoleMvoFilteringFieldsTrait;

    protected $routePath = 'UserRoleMvos/{id}';

    public function getReturnType()
    {
        return 'Wms\Domain\UserRoleMvo';
    }
}

