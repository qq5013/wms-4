<?php

namespace Wms\HttpClient;

use Dddml\Serializer\Type\Long;

class UsersQueryRequest extends AbstractQueryRequest
{
    use UserFilteringFieldsTrait;

    protected $routePath = 'Users';

    public function getReturnType()
    {
        return 'array<Wms\Domain\User>';
    }
}

