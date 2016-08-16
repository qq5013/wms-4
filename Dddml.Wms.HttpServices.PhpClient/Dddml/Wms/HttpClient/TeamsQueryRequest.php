<?php

namespace Dddml\Wms\HttpClient;

use Dddml\Serializer\Type\Long;
use Dddml\Executor\Http\QueryCountRequestInterface;

class TeamsQueryRequest extends AbstractQueryRequest implements QueryCountRequestInterface
{
    use TeamFilteringFieldsTrait;

    protected $routePath = 'Teams';

    public function getReturnType()
    {
        return 'array<Dddml\Wms\Domain\Team>';
    }
}

