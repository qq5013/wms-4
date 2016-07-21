<?php

namespace Wms\HttpClient;

use Dddml\Serializer\Type\Long;
use Dddml\Serializer\Type\Decimal;
use NodaMoney\Money;
use Dddml\Serializer\Type\Money;

class InOutLineMvoQueryRequest extends AbstractQueryRequest
{
    use InOutLineMvoFilteringFieldsTrait;

    protected $routePath = 'InOutLineMvos/{id}';

    public function getReturnType()
    {
        return 'Wms\Domain\InOutLineMvo';
    }
}

