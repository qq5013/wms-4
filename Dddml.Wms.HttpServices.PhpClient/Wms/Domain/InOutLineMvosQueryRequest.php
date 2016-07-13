<?php

namespace Wms\Domain;

use Wms\Domain\AbstractQueryRequest;
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

