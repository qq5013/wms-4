<?php

namespace Wms\HttpClient;

use Dddml\Serializer\Type\Long;
use Dddml\Executor\Http\QueryCountRequestInterface;

class AttributeQueryRequest extends AbstractQueryRequest implements QueryCountRequestInterface
{
    use AttributeFilteringFieldsTrait;

    protected $routePath = 'Attributes/{id}';

    public function getReturnType()
    {
        return 'Wms\Domain\Attribute';
    }
}

