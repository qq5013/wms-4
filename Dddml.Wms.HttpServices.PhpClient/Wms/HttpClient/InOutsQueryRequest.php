<?php

namespace Wms\HttpClient;

use NodaMoney\Money;
use Dddml\Serializer\Type\Money;
use Dddml\Serializer\Type\Decimal;
use Dddml\Serializer\Type\Long;

class InOutsQueryRequest extends AbstractQueryRequest
{
    use InOutFilteringFieldsTrait;

    protected $routePath = 'InOuts';

    public function getReturnType()
    {
        return 'array<Wms\Domain\InOut>';
    }
}

