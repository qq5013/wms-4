<?php

namespace Wms\HttpClient;

use NodaMoney\Money;
use Wms\Domain\InOutLine;
use Wms\Domain\SkuId;

class InOutQueryRequest extends AbstractQueryRequest
{
    use InOutFilteringFieldsTrait;

    protected $routePath = 'InOuts/{id}';

    public function getReturnType()
    {
        return 'Wms\Domain\InOut';
    }
}

