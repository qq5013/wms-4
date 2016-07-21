<?php

namespace Wms\HttpClient;

use NodaMoney\Money;

class InOutsQueryRequest extends AbstractQueryRequest
{
    use InOutFilteringFieldsTrait;

    protected $routePath = 'InOuts';

    public function getReturnType()
    {
        return 'array<Wms\Domain\InOut>';
    }
}

