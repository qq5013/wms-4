<?php

namespace Wms\Domain;

use Wms\Domain\AbstractQueryRequest;
use Wms\Domain\InOutLineId;
use NodaMoney\Money;
use Wms\Domain\InOutLine;

class InOutLineMvoQueryRequest extends AbstractQueryRequest
{
    use InOutLineMvoFilteringFieldsTrait;

    protected $routePath = 'InOutLineMvos/{id}';

    public function getReturnType()
    {
        return 'Wms\Domain\InOutLineMvo';
    }
}

