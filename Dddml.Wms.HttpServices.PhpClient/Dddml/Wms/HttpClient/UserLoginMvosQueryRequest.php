<?php

namespace Dddml\Wms\HttpClient;

use Dddml\Serializer\Type\Long;
use Dddml\Executor\Http\QueryCountRequestInterface;

class UserLoginMvosQueryRequest extends AbstractQueryRequest implements QueryCountRequestInterface
{
    use UserLoginMvoFilteringFieldsTrait;

    protected $routePath = 'UserLoginMvos';

    public function getReturnType()
    {
        return 'array<Dddml\Wms\Domain\UserLoginMvo>';
    }
}

