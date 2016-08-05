<?php

namespace Dddml\Wms\HttpClient;

use Dddml\Serializer\Type\Long;
use Dddml\Serializer\Type\Decimal;
use Dddml\Serializer\Type\Money;
use Dddml\Executor\Http\QueryCountRequestInterface;

class InOutLineMvosQueryRequest extends AbstractQueryRequest implements QueryCountRequestInterface
{
    use InOutLineMvoFilteringFieldsTrait;

    protected $routePath = 'InOutLineMvos';

    public function getReturnType()
    {
        return 'array<Dddml\Wms\Domain\InOutLineMvo>';
    }
}

