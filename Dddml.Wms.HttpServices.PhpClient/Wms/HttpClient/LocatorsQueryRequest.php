<?php

namespace Wms\HttpClient;


class LocatorsQueryRequest extends AbstractQueryRequest
{
    use LocatorFilteringFieldsTrait;

    protected $routePath = 'Locators';

    public function getReturnType()
    {
        return 'array<Wms\Domain\Locator>';
    }
}

