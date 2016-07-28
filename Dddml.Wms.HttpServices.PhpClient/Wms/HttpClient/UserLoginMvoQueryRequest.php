<?php

namespace Wms\HttpClient;

use Dddml\Serializer\Type\Long;

class UserLoginMvoQueryRequest extends AbstractQueryRequest
{
    use UserLoginMvoFilteringFieldsTrait;

    protected $routePath = 'UserLoginMvos/{id}';

    public function getReturnType()
    {
        return 'Wms\Domain\UserLoginMvo';
    }
}

