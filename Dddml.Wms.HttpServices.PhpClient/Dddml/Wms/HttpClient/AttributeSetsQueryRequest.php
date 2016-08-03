<?php

namespace Dddml\Wms\HttpClient;

use Dddml\Serializer\Type\Long;
use Dddml\Executor\Http\QueryCountRequestInterface;

class AttributeSetsQueryRequest extends AbstractQueryRequest implements QueryCountRequestInterface
{
    use AttributeSetFilteringFieldsTrait;

    protected $routePath = 'AttributeSets';

    public function getReturnType()
    {
        return 'array<Dddml\Wms\Domain\AttributeSet>';
    }
}

