<?php

namespace Wms\HttpClient;


class UserRoleMvosQueryRequest extends AbstractQueryRequest
{
    use UserRoleMvoFilteringFieldsTrait;

    protected $routePath = 'UserRoleMvos';

    public function getReturnType()
    {
        return 'array<Wms\Domain\UserRoleMvo>';
    }
}

