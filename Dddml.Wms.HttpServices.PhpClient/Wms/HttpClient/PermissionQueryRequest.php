<?php

namespace Wms\HttpClient;

use Dddml\Serializer\Type\Long;

class PermissionQueryRequest extends AbstractQueryRequest
{
    use PermissionFilteringFieldsTrait;

    protected $routePath = 'Permissions/{id}';

    public function getReturnType()
    {
        return 'Wms\Domain\Permission';
    }
}

