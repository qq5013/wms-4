<?php

namespace Dddml\Wms\HttpClient;

use Dddml\Serializer\Type\Long;

class AttributeValueMvoQueryRequest extends AbstractQueryRequest
{
    use AttributeValueMvoFilteringFieldsTrait;

    protected $routePath = 'AttributeValueMvos/{id}';

    public function getReturnType()
    {
        return 'Dddml\Wms\Domain\AttributeValueMvo';
    }
}

