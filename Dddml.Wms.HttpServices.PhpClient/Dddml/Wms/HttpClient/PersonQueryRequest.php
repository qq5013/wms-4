<?php

namespace Dddml\Wms\HttpClient;

use Dddml\Serializer\Type\Long;

class PersonQueryRequest extends AbstractQueryRequest
{
    use PersonFilteringFieldsTrait;

    protected $routePath = 'People/{id}';

    public function getReturnType()
    {
        return 'Dddml\Wms\Domain\Person';
    }
}

