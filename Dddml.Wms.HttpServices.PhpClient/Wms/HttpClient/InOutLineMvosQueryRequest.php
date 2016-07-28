<?php

namespace Wms\HttpClient;

use Dddml\Serializer\Type\Long;
use Dddml\Serializer\Type\Decimal;
use NodaMoney\Money;
use Dddml\Serializer\Type\Money;
use Dddml\Executor\Http\QueryCountRequestInterface;

class InOutLineMvosQueryRequest extends AbstractQueryRequest implements QueryCountRequestInterface
{
    use InOutLineMvoFilteringFieldsTrait;

    protected $routePath = 'InOutLineMvos';

    public function getReturnType()
    {
        return 'array<Wms\Domain\InOutLineMvo>';
    }
}

