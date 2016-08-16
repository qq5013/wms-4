<?php

namespace Dddml\Wms\HttpClient;

use Dddml\Serializer\Type\Long;
use Dddml\Executor\Http\QueryCountRequestInterface;

class PeopleQueryRequest extends AbstractQueryRequest implements QueryCountRequestInterface
{
    use PersonFilteringFieldsTrait;

    protected $routePath = 'People';

    public function getReturnType()
    {
        return 'array<Dddml\Wms\Domain\Person>';
    }
}

