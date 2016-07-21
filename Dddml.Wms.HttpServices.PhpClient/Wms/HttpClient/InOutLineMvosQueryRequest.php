<?php

namespace Wms\HttpClient;

use NodaMoney\Money;

class InOutLineMvosQueryRequest extends AbstractQueryRequest
{
    use InOutLineMvoFilteringFieldsTrait;

    protected $routePath = 'InOutLineMvos';

    public function getReturnType()
    {
        return 'array<Wms\Domain\InOutLineMvo>';
    }
}

