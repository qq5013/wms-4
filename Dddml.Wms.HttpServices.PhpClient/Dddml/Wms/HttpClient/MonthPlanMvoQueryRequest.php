<?php

namespace Dddml\Wms\HttpClient;

use Dddml\Serializer\Type\Long;

class MonthPlanMvoQueryRequest extends AbstractQueryRequest
{
    use MonthPlanMvoFilteringFieldsTrait;

    protected $routePath = 'MonthPlanMvos/{id}';

    public function getReturnType()
    {
        return 'Dddml\Wms\Domain\MonthPlanMvo';
    }
}

