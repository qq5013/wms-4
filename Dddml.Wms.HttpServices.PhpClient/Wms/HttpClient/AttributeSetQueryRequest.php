<?php

namespace Wms\HttpClient;

use Dddml\Serializer\Type\Long;
use Dddml\Executor\Http\QueryCountRequestInterface;

class AttributeSetQueryRequest extends AbstractQueryRequest implements QueryCountRequestInterface
{
    use AttributeSetFilteringFieldsTrait;

    protected $routePath = 'AttributeSets/{id}';

    public function getReturnType()
    {
        return 'Wms\Domain\AttributeSet';
    }
}

