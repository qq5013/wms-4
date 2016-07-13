<?php

namespace Wms\Domain;

use Wms\Domain\AbstractQueryRequest;
use Wms\Domain\UserLoginId;
use Wms\Domain\UserRole;
use Wms\Domain\UserClaim;
use Wms\Domain\UserPermission;
use Wms\Domain\UserLogin;

class UserLoginMvoQueryRequest extends AbstractQueryRequest
{
    use UserLoginMvoFilteringFieldsTrait;

    protected $routePath = 'UserLoginMvos/{id}';

    public function getReturnType()
    {
        return 'Wms\Domain\UserLoginMvo';
    }
}

