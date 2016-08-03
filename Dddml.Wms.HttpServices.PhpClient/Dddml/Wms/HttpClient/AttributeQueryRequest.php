<?php

namespace Dddml\Wms\HttpClient;

use Dddml\Serializer\Type\Long;

class AttributeQueryRequest extends AbstractQueryRequest
{
    use AttributeFilteringFieldsTrait;

    protected $routePath = 'Attributes/{id}';

    public function getReturnType()
    {
        return 'Dddml\Wms\Domain\Attribute';
    }
}

