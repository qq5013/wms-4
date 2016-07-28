<?php

namespace Wms\HttpClient;

use Dddml\Serializer\Type\Long;
use Dddml\Executor\Http\QueryCountRequestInterface;

class UserQueryRequest extends AbstractQueryRequest implements QueryCountRequestInterface
{
    use UserFilteringFieldsTrait;

    protected $routePath = 'Users/{id}';

    public function getReturnType()
    {
        return 'Wms\Domain\User';
    }
}

