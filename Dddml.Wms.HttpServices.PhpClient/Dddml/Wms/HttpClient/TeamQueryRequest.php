<?php

namespace Dddml\Wms\HttpClient;

use Dddml\Serializer\Type\Long;

class TeamQueryRequest extends AbstractQueryRequest
{
    use TeamFilteringFieldsTrait;

    protected $routePath = 'Teams/{id}';

    public function getReturnType()
    {
        return 'Dddml\Wms\Domain\Team';
    }
}

