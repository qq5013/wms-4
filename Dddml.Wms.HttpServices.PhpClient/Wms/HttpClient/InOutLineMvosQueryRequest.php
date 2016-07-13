<?php

namespace Wms\HttpClient;

use Wms\Domain\InOutLineId;
use NodaMoney\Money;
use Wms\Domain\InOutLine;

class InOutLineMvosQueryRequest extends AbstractQueryRequest
{
    use InOutLineMvoFilteringFieldsTrait;

    protected $routePath = 'InOutLineMvos';

    public function getReturnType()
    {
        return 'array<Wms\Domain\InOutLineMvo>';
    }
}

