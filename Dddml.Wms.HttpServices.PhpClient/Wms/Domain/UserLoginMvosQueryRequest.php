<?php

namespace Wms\Domain;

use Wms\Domain\AbstractQueryRequest;
use Wms\Domain\UserLoginId;
use Wms\Domain\UserRole;
use Wms\Domain\UserClaim;
use Wms\Domain\UserPermission;
use Wms\Domain\UserLogin;

class UserLoginMvosQueryRequest extends AbstractQueryRequest
{
    use UserLoginMvoFilteringFieldsTrait;

    protected $routePath = 'UserLoginMvos';

    public function getReturnType()
    {
        return 'array<Wms\Domain\UserLoginMvo>';
    }
}

