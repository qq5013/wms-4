<?php

namespace Dddml\Wms\HttpClient;

use Dddml\Serializer\Type\Long;
use Dddml\Executor\Http\QueryCountRequestInterface;

class DayPlanMvosQueryRequest extends AbstractQueryRequest implements QueryCountRequestInterface
{
    use DayPlanMvoFilteringFieldsTrait;

    protected $routePath = 'DayPlanMvos';

    public function getReturnType()
    {
        return 'array<Dddml\Wms\Domain\DayPlanMvo>';
    }
}

