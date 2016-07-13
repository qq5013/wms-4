<?php

namespace Wms\HttpClient;

use NodaMoney\Money;
use Wms\Domain\InOutLine;
use Wms\Domain\SkuId;

class InOutsQueryRequest extends AbstractQueryRequest
{
    use InOutFilteringFieldsTrait;

    protected $routePath = 'InOuts';

    public function getReturnType()
    {
        return 'array<Wms\Domain\InOut>';
    }
}

