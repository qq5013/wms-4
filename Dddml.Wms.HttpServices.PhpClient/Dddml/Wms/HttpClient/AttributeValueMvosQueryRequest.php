<?php

namespace Dddml\Wms\HttpClient;

use Dddml\Serializer\Type\Long;
use Dddml\Executor\Http\QueryCountRequestInterface;

class AttributeValueMvosQueryRequest extends AbstractQueryRequest implements QueryCountRequestInterface
{
    use AttributeValueMvoFilteringFieldsTrait;

    protected $routePath = 'AttributeValueMvos';

    public function getReturnType()
    {
        return 'array<Dddml\Wms\Domain\AttributeValueMvo>';
    }
}

