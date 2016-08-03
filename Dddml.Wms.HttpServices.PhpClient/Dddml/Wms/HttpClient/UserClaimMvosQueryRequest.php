<?php

namespace Dddml\Wms\HttpClient;

use Dddml\Serializer\Type\Long;
use Dddml\Executor\Http\QueryCountRequestInterface;

class UserClaimMvosQueryRequest extends AbstractQueryRequest implements QueryCountRequestInterface
{
    use UserClaimMvoFilteringFieldsTrait;

    protected $routePath = 'UserClaimMvos';

    public function getReturnType()
    {
        return 'array<Dddml\Wms\Domain\UserClaimMvo>';
    }
}

