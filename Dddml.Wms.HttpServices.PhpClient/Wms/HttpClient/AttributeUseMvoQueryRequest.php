<?php

namespace Wms\HttpClient;

use Dddml\Serializer\Type\Long;
use Dddml\Executor\Http\QueryCountRequestInterface;

class AttributeUseMvoQueryRequest extends AbstractQueryRequest implements QueryCountRequestInterface
{
    use AttributeUseMvoFilteringFieldsTrait;

    protected $routePath = 'AttributeUseMvos/{id}';

    public function getReturnType()
    {
        return 'Wms\Domain\AttributeUseMvo';
    }
}

