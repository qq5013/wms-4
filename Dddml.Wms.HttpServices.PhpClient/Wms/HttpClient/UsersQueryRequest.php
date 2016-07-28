<?php

namespace Wms\HttpClient;

use Dddml\Serializer\Type\Long;
use Dddml\Executor\Http\QueryCountRequestInterface;

class UsersQueryRequest extends AbstractQueryRequest implements QueryCountRequestInterface
{
    use UserFilteringFieldsTrait;

    protected $routePath = 'Users';

    public function getReturnType()
    {
        return 'array<Wms\Domain\User>';
    }
}

