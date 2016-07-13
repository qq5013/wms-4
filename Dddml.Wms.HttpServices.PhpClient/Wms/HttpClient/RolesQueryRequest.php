<?php

namespace Wms\HttpClient;


class RolesQueryRequest extends AbstractQueryRequest
{
    use RoleFilteringFieldsTrait;

    protected $routePath = 'Roles';

    public function getReturnType()
    {
        return 'array<Wms\Domain\Role>';
    }
}

