<?php

namespace Wms\HttpClient;


class PermissionQueryRequest extends AbstractQueryRequest
{
    use PermissionFilteringFieldsTrait;

    protected $routePath = 'Permissions/{id}';

    public function getReturnType()
    {
        return 'Wms\Domain\Permission';
    }
}

