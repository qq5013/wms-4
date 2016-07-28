<?php

namespace Wms\HttpClient;

use Dddml\Serializer\Type\Long;
use Dddml\Executor\Http\QueryCountRequestInterface;

class UserClaimMvoQueryRequest extends AbstractQueryRequest implements QueryCountRequestInterface
{
    use UserClaimMvoFilteringFieldsTrait;

    protected $routePath = 'UserClaimMvos/{id}';

    public function getReturnType()
    {
        return 'Wms\Domain\UserClaimMvo';
    }
}

