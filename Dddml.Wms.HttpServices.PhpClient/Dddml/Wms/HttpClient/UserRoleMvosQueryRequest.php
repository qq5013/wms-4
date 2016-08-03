<?php

namespace Dddml\Wms\HttpClient;

use Dddml\Serializer\Type\Long;
use Dddml\Executor\Http\QueryCountRequestInterface;

class UserRoleMvosQueryRequest extends AbstractQueryRequest implements QueryCountRequestInterface
{
    use UserRoleMvoFilteringFieldsTrait;

    protected $routePath = 'UserRoleMvos';

    public function getReturnType()
    {
        return 'array<Dddml\Wms\Domain\UserRoleMvo>';
    }
}

