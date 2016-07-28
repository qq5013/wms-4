<?php

namespace Wms\HttpClient;

use Dddml\Serializer\Type\Long;

class AttributeQueryRequest extends AbstractQueryRequest
{
    use AttributeFilteringFieldsTrait;

    protected $routePath = 'Attributes/{id}';

    public function getReturnType()
    {
        return 'Wms\Domain\Attribute';
    }
}

