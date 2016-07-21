<?php

namespace Wms\HttpClient;

use Dddml\Serializer\Type\Long;

class UserRoleMvosQueryRequest extends AbstractQueryRequest
{
    use UserRoleMvoFilteringFieldsTrait;

    protected $routePath = 'UserRoleMvos';

    public function getReturnType()
    {
        return 'array<Wms\Domain\UserRoleMvo>';
    }
}

