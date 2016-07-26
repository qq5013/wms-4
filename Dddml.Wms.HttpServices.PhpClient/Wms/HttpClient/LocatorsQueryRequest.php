<?php

namespace Wms\HttpClient;

use Dddml\Serializer\Type\Long;

class LocatorsQueryRequest extends AbstractQueryRequest
{
    use LocatorFilteringFieldsTrait;

    protected $routePath = 'Locators';

    public function getReturnType()
    {
        return 'array<Wms\Domain\Locator>';
    }
}

