<?php

namespace Wms\Domain;

use Wms\Domain\AbstractQueryRequest;

class LocatorsQueryRequest extends AbstractQueryRequest
{
    use LocatorFilteringFieldsTrait;

    protected $routePath = 'Locators';

    public function getReturnType()
    {
        return 'array<Wms\Domain\Locator>';
    }
}

