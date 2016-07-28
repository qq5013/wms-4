<?php

namespace Wms\HttpClient;

use Dddml\Serializer\Type\Long;
use Dddml\Executor\Http\QueryCountRequestInterface;

class AttributesQueryRequest extends AbstractQueryRequest implements QueryCountRequestInterface
{
    use AttributeFilteringFieldsTrait;

    protected $routePath = 'Attributes';

    public function getReturnType()
    {
        return 'array<Wms\Domain\Attribute>';
    }
}

