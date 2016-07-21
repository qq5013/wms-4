<?php

namespace Wms\HttpClient;


class UserLoginMvosQueryRequest extends AbstractQueryRequest
{
    use UserLoginMvoFilteringFieldsTrait;

    protected $routePath = 'UserLoginMvos';

    public function getReturnType()
    {
        return 'array<Wms\Domain\UserLoginMvo>';
    }
}

