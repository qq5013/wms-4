<?php

namespace Wms\Domain;

use Wms\Domain\AbstractQueryRequest;

class RoleQueryRequest extends AbstractQueryRequest
{
    use RoleFilteringFieldsTrait;

    protected $routePath = 'Roles/{id}';

    public function getReturnType()
    {
        return 'Wms\Domain\Role';
    }
}

