<?php

namespace Wms\HttpClient;


class UserClaimMvoQueryRequest extends AbstractQueryRequest
{
    use UserClaimMvoFilteringFieldsTrait;

    protected $routePath = 'UserClaimMvos/{id}';

    public function getReturnType()
    {
        return 'Wms\Domain\UserClaimMvo';
    }
}

