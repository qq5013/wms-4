<?php

namespace Wms\Domain;

use Wms\Domain\AbstractQueryRequest;

class LocatorQueryRequest extends AbstractQueryRequest
{
    use LocatorFilteringFieldsTrait;

    protected $routePath = 'Locators/{id}';

    public function getReturnType()
    {
        return 'Wms\Domain\Locator';
    }
}

