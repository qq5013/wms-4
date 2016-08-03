<?php

namespace Dddml\Wms\HttpClient;

use Dddml\Serializer\Type\Long;

class UserClaimMvoQueryRequest extends AbstractQueryRequest
{
    use UserClaimMvoFilteringFieldsTrait;

    protected $routePath = 'UserClaimMvos/{id}';

    public function getReturnType()
    {
        return 'Dddml\Wms\Domain\UserClaimMvo';
    }
}

