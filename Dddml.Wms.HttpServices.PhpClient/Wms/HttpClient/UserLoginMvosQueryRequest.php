<?php

namespace Wms\HttpClient;

use Dddml\Serializer\Type\Long;

class UserLoginMvosQueryRequest extends AbstractQueryRequest
{
    use UserLoginMvoFilteringFieldsTrait;

    protected $routePath = 'UserLoginMvos';

    public function getReturnType()
    {
        return 'array<Wms\Domain\UserLoginMvo>';
    }
}

