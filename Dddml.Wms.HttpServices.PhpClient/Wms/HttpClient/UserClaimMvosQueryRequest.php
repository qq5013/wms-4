<?php

namespace Wms\HttpClient;


class UserClaimMvosQueryRequest extends AbstractQueryRequest
{
    use UserClaimMvoFilteringFieldsTrait;

    protected $routePath = 'UserClaimMvos';

    public function getReturnType()
    {
        return 'array<Wms\Domain\UserClaimMvo>';
    }
}

