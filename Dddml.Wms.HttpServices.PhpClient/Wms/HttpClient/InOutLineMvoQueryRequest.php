<?php

namespace Wms\HttpClient;

use NodaMoney\Money;

class InOutLineMvoQueryRequest extends AbstractQueryRequest
{
    use InOutLineMvoFilteringFieldsTrait;

    protected $routePath = 'InOutLineMvos/{id}';

    public function getReturnType()
    {
        return 'Wms\Domain\InOutLineMvo';
    }
}

