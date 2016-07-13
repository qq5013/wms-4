<?php

namespace Wms\Domain;

use Wms\Domain\AbstractQueryRequest;

class PermissionsQueryRequest extends AbstractQueryRequest
{
    use PermissionFilteringFieldsTrait;

    protected $routePath = 'Permissions';

    public function getReturnType()
    {
        return 'array<Wms\Domain\Permission>';
    }
}

