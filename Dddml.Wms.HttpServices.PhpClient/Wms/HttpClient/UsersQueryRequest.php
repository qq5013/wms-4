<?php

namespace Wms\HttpClient;


class UsersQueryRequest extends AbstractQueryRequest
{
    use UserFilteringFieldsTrait;

    protected $routePath = 'Users';

    public function getReturnType()
    {
        return 'array<Wms\Domain\User>';
    }
}

