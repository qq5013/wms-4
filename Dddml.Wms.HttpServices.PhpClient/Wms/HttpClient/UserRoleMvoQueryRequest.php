<?php

namespace Wms\HttpClient;


class UserRoleMvoQueryRequest extends AbstractQueryRequest
{
    use UserRoleMvoFilteringFieldsTrait;

    protected $routePath = 'UserRoleMvos/{id}';

    public function getReturnType()
    {
        return 'Wms\Domain\UserRoleMvo';
    }
}

