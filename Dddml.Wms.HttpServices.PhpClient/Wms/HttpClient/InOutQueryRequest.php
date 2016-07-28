<?php

namespace Wms\HttpClient;

use NodaMoney\Money;
use Dddml\Serializer\Type\Money;
use Dddml\Serializer\Type\Decimal;
use Dddml\Serializer\Type\Long;
use Dddml\Executor\Http\QueryCountRequestInterface;

class InOutQueryRequest extends AbstractQueryRequest implements QueryCountRequestInterface
{
    use InOutFilteringFieldsTrait;

    protected $routePath = 'InOuts/{id}';

    public function getReturnType()
    {
        return 'Wms\Domain\InOut';
    }
}

