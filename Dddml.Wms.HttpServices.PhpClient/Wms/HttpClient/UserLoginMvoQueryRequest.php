<?php

namespace Wms\HttpClient;


class UserLoginMvoQueryRequest extends AbstractQueryRequest
{
    use UserLoginMvoFilteringFieldsTrait;

    protected $routePath = 'UserLoginMvos/{id}';

    public function getReturnType()
    {
        return 'Wms\Domain\UserLoginMvo';
    }
}

