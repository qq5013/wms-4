<?php

namespace Wms\Domain;

use Wms\Domain\AbstractQueryRequest;

class RolesQueryRequest extends AbstractQueryRequest
{
    use RoleFilteringFieldsTrait;

    protected $routePath = 'Roles';

    public function getReturnType()
    {
        return 'array<Wms\Domain\Role>';
    }
}

