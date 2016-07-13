<?php

namespace Wms\HttpClient;


class PermissionsQueryRequest extends AbstractQueryRequest
{
    use PermissionFilteringFieldsTrait;

    protected $routePath = 'Permissions';

    public function getReturnType()
    {
        return 'array<Wms\Domain\Permission>';
    }
}

