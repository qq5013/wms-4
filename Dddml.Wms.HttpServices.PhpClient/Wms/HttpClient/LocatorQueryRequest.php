<?php

namespace Wms\HttpClient;


class LocatorQueryRequest extends AbstractQueryRequest
{
    use LocatorFilteringFieldsTrait;

    protected $routePath = 'Locators/{id}';

    public function getReturnType()
    {
        return 'Wms\Domain\Locator';
    }
}

