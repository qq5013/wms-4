<?php

namespace Wms\HttpClient;

use NodaMoney\Money;

class InOutQueryRequest extends AbstractQueryRequest
{
    use InOutFilteringFieldsTrait;

    protected $routePath = 'InOuts/{id}';

    public function getReturnType()
    {
        return 'Wms\Domain\InOut';
    }
}

