<?php

namespace Wms\HttpClient;


class RoleQueryRequest extends AbstractQueryRequest
{
    use RoleFilteringFieldsTrait;

    protected $routePath = 'Roles/{id}';

    public function getReturnType()
    {
        return 'Wms\Domain\Role';
    }
}

