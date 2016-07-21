<?php

namespace Wms\HttpClient;


class UserQueryRequest extends AbstractQueryRequest
{
    use UserFilteringFieldsTrait;

    protected $routePath = 'Users/{id}';

    public function getReturnType()
    {
        return 'Wms\Domain\User';
    }
}

