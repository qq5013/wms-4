<?php

namespace Wms\HttpClient;

use Dddml\Serializer\Type\Long;

class PermissionsQueryRequest extends AbstractQueryRequest
{
    use PermissionFilteringFieldsTrait;

    protected $routePath = 'Permissions';

    public function getReturnType()
    {
        return 'array<Wms\Domain\Permission>';
    }
}

