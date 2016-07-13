<?php

namespace Wms\HttpClient;

use Wms\Domain\UserRole;
use Wms\Domain\UserClaim;
use Wms\Domain\UserPermission;
use Wms\Domain\UserLogin;
use Wms\Domain\LoginKey;

class UsersQueryRequest extends AbstractQueryRequest
{
    use UserFilteringFieldsTrait;

    protected $routePath = 'Users';

    public function getReturnType()
    {
        return 'array<Wms\Domain\User>';
    }
}

