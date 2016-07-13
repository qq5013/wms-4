<?php

namespace Wms\HttpClient;

use Wms\Domain\AttributeValue;

class AttributesQueryRequest extends AbstractQueryRequest
{
    use AttributeFilteringFieldsTrait;

    protected $routePath = 'Attributes';

    public function getReturnType()
    {
        return 'array<Wms\Domain\Attribute>';
    }
}

