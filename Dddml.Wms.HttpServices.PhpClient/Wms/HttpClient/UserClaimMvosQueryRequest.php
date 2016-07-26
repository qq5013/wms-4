<?php

namespace Wms\HttpClient;

use Dddml\Serializer\Type\Long;

class UserClaimMvosQueryRequest extends AbstractQueryRequest
{
    use UserClaimMvoFilteringFieldsTrait;

    protected $routePath = 'UserClaimMvos';

    public function getReturnType()
    {
        return 'array<Wms\Domain\UserClaimMvo>';
    }
}

