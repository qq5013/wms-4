<?php

namespace Wms\HttpClient;

use Dddml\Serializer\Type\Long;

class AttributesQueryRequest extends AbstractQueryRequest
{
    use AttributeFilteringFieldsTrait;

    protected $routePath = 'Attributes';

    public function getReturnType()
    {
        return 'array<Wms\Domain\Attribute>';
    }
}

