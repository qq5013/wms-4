<?php

namespace Dddml\Wms\HttpClient;

use Dddml\Serializer\Type\Long;

class DayPlanMvoQueryRequest extends AbstractQueryRequest
{
    use DayPlanMvoFilteringFieldsTrait;

    protected $routePath = 'DayPlanMvos/{id}';

    public function getReturnType()
    {
        return 'Dddml\Wms\Domain\DayPlanMvo';
    }
}

