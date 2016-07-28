<?php

namespace Wms\HttpClient;

use Dddml\Serializer\Type\Long;
use Dddml\Executor\Http\QueryCountRequestInterface;

class UserLoginMvoQueryRequest extends AbstractQueryRequest implements QueryCountRequestInterface
{
    use UserLoginMvoFilteringFieldsTrait;

    protected $routePath = 'UserLoginMvos/{id}';

    public function getReturnType()
    {
        return 'Wms\Domain\UserLoginMvo';
    }
}

