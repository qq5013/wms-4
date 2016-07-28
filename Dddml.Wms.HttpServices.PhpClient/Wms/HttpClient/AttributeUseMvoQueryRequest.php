<?php

namespace Wms\HttpClient;

use Dddml\Serializer\Type\Long;

class AttributeUseMvoQueryRequest extends AbstractQueryRequest
{
    use AttributeUseMvoFilteringFieldsTrait;

    protected $routePath = 'AttributeUseMvos/{id}';

    public function getReturnType()
    {
        return 'Wms\Domain\AttributeUseMvo';
    }
}

