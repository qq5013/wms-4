<?php

namespace Dddml\Wms\HttpClient;

use Dddml\Serializer\Type\Long;

class UserQueryRequest extends AbstractQueryRequest
{
    use UserFilteringFieldsTrait;

    protected $routePath = 'Users/{id}';

    public function getReturnType()
    {
        return 'Dddml\Wms\Domain\User';
    }
}

