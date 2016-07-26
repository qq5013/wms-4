<?php

namespace Wms\HttpClient;

use Dddml\Serializer\Type\Long;

class RolesQueryRequest extends AbstractQueryRequest
{
    use RoleFilteringFieldsTrait;

    protected $routePath = 'Roles';

    public function getReturnType()
    {
        return 'array<Wms\Domain\Role>';
    }
}

