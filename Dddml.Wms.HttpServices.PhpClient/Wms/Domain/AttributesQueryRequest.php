<?php

namespace Wms\Domain;

use Wms\Domain\AbstractQueryRequest;
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

