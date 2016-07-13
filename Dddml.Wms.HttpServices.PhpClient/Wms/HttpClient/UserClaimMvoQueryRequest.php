<?php

namespace Wms\HttpClient;

use Wms\Domain\UserClaimId;
use Wms\Domain\UserRole;
use Wms\Domain\UserClaim;
use Wms\Domain\UserPermission;
use Wms\Domain\UserLogin;

class UserClaimMvoQueryRequest extends AbstractQueryRequest
{
    use UserClaimMvoFilteringFieldsTrait;

    protected $routePath = 'UserClaimMvos/{id}';

    public function getReturnType()
    {
        return 'Wms\Domain\UserClaimMvo';
    }
}

