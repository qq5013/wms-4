<?php

namespace Wms\HttpClient;

use Dddml\Serializer\Type\Long;
use Dddml\Executor\Http\QueryCountRequestInterface;

class AttributeUseMvosQueryRequest extends AbstractQueryRequest implements QueryCountRequestInterface
{
    use AttributeUseMvoFilteringFieldsTrait;

    protected $routePath = 'AttributeUseMvos';

    public function getReturnType()
    {
        return 'array<Wms\Domain\AttributeUseMvo>';
    }
}

