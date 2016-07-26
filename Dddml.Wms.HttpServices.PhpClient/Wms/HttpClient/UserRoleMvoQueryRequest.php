<?php

namespace Wms\HttpClient;

use Dddml\Serializer\Type\Long;

class UserRoleMvoQueryRequest extends AbstractQueryRequest
{
    use UserRoleMvoFilteringFieldsTrait;

    protected $routePath = 'UserRoleMvos/{id}';

    public function getReturnType()
    {
        return 'Wms\Domain\UserRoleMvo';
    }
}

