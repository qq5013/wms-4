<?php

namespace Wms\HttpClient;

use Dddml\Serializer\Type\Long;
use Dddml\Serializer\Type\Decimal;
use NodaMoney\Money;
use Dddml\Serializer\Type\Money;

class InOutLineMvosQueryRequest extends AbstractQueryRequest
{
    use InOutLineMvoFilteringFieldsTrait;

    protected $routePath = 'InOutLineMvos';

    public function getReturnType()
    {
        return 'array<Wms\Domain\InOutLineMvo>';
    }
}

