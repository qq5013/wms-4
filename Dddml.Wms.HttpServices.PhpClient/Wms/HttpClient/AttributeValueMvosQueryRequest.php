<?php

namespace Wms\HttpClient;

use Dddml\Serializer\Type\Long;

class AttributeValueMvosQueryRequest extends AbstractQueryRequest
{
    use AttributeValueMvoFilteringFieldsTrait;

    protected $routePath = 'AttributeValueMvos';

    public function getReturnType()
    {
        return 'array<Wms\Domain\AttributeValueMvo>';
    }
}

