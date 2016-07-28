<?php

namespace Wms\HttpClient;

use Dddml\Serializer\Type\Long;
use Dddml\Executor\Http\QueryCountRequestInterface;

class AttributeValueMvoQueryRequest extends AbstractQueryRequest implements QueryCountRequestInterface
{
    use AttributeValueMvoFilteringFieldsTrait;

    protected $routePath = 'AttributeValueMvos/{id}';

    public function getReturnType()
    {
        return 'Wms\Domain\AttributeValueMvo';
    }
}

