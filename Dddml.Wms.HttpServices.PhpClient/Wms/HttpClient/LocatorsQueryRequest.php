<?php

namespace Wms\HttpClient;

use Dddml\Serializer\Type\Long;
use Dddml\Executor\Http\QueryCountRequestInterface;

class LocatorsQueryRequest extends AbstractQueryRequest implements QueryCountRequestInterface
{
    use LocatorFilteringFieldsTrait;

    protected $routePath = 'Locators';

    public function getReturnType()
    {
        return 'array<Wms\Domain\Locator>';
    }
}

