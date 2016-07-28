<?php

namespace Wms\HttpClient;

use Dddml\Serializer\Type\Long;
use Dddml\Executor\Http\QueryCountRequestInterface;

class UserRoleMvoQueryRequest extends AbstractQueryRequest implements QueryCountRequestInterface
{
    use UserRoleMvoFilteringFieldsTrait;

    protected $routePath = 'UserRoleMvos/{id}';

    public function getReturnType()
    {
        return 'Wms\Domain\UserRoleMvo';
    }
}

