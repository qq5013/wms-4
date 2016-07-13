<?php

namespace Wms\HttpClient;

use Wms\Domain\UserClaimId;
use Wms\Domain\UserRole;
use Wms\Domain\UserClaim;
use Wms\Domain\UserPermission;
use Wms\Domain\UserLogin;

class UserClaimMvosQueryRequest extends AbstractQueryRequest
{
    use UserClaimMvoFilteringFieldsTrait;

    protected $routePath = 'UserClaimMvos';

    public function getReturnType()
    {
        return 'array<Wms\Domain\UserClaimMvo>';
    }
}

