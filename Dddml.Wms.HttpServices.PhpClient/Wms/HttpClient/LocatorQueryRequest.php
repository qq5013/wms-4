<?php

namespace Wms\HttpClient;

use Dddml\Serializer\Type\Long;

class LocatorQueryRequest extends AbstractQueryRequest
{
    use LocatorFilteringFieldsTrait;

    protected $routePath = 'Locators/{id}';

    public function getReturnType()
    {
        return 'Wms\Domain\Locator';
    }
}

