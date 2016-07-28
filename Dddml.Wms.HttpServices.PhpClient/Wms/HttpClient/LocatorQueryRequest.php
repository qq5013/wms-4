<?php

namespace Wms\HttpClient;

use Dddml\Serializer\Type\Long;
use Dddml\Executor\Http\QueryCountRequestInterface;

class LocatorQueryRequest extends AbstractQueryRequest implements QueryCountRequestInterface
{
    use LocatorFilteringFieldsTrait;

    protected $routePath = 'Locators/{id}';

    public function getReturnType()
    {
        return 'Wms\Domain\Locator';
    }
}

