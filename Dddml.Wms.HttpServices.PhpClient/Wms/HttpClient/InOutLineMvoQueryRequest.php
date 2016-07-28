<?php

namespace Wms\HttpClient;

use Dddml\Serializer\Type\Long;
use Dddml\Serializer\Type\Decimal;
use NodaMoney\Money;
use Dddml\Serializer\Type\Money;
use Dddml\Executor\Http\QueryCountRequestInterface;

class InOutLineMvoQueryRequest extends AbstractQueryRequest implements QueryCountRequestInterface
{
    use InOutLineMvoFilteringFieldsTrait;

    protected $routePath = 'InOutLineMvos/{id}';

    public function getReturnType()
    {
        return 'Wms\Domain\InOutLineMvo';
    }
}

