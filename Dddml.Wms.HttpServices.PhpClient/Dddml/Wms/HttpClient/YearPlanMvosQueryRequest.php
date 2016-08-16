<?php

namespace Dddml\Wms\HttpClient;

use Dddml\Serializer\Type\Long;
use Dddml\Executor\Http\QueryCountRequestInterface;

class YearPlanMvosQueryRequest extends AbstractQueryRequest implements QueryCountRequestInterface
{
    use YearPlanMvoFilteringFieldsTrait;

    protected $routePath = 'YearPlanMvos';

    public function getReturnType()
    {
        return 'array<Dddml\Wms\Domain\YearPlanMvo>';
    }
}

