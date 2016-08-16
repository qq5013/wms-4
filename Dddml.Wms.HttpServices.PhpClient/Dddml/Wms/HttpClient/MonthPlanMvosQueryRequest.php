<?php

namespace Dddml\Wms\HttpClient;

use Dddml\Serializer\Type\Long;
use Dddml\Executor\Http\QueryCountRequestInterface;

class MonthPlanMvosQueryRequest extends AbstractQueryRequest implements QueryCountRequestInterface
{
    use MonthPlanMvoFilteringFieldsTrait;

    protected $routePath = 'MonthPlanMvos';

    public function getReturnType()
    {
        return 'array<Dddml\Wms\Domain\MonthPlanMvo>';
    }
}

