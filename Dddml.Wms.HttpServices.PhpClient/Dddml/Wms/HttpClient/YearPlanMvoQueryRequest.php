<?php

namespace Dddml\Wms\HttpClient;

use Dddml\Serializer\Type\Long;

class YearPlanMvoQueryRequest extends AbstractQueryRequest
{
    use YearPlanMvoFilteringFieldsTrait;

    protected $routePath = 'YearPlanMvos/{id}';

    public function getReturnType()
    {
        return 'Dddml\Wms\Domain\YearPlanMvo';
    }
}

