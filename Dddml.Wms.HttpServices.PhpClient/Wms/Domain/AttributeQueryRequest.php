<?php

namespace Wms\Domain;

use Wms\Domain\AbstractQueryRequest;
use Wms\Domain\AttributeValue;

class AttributeQueryRequest extends AbstractQueryRequest
{
    use AttributeFilteringFieldsTrait;

    protected $routePath = 'Attributes/{id}';

    public function getReturnType()
    {
        return 'Wms\Domain\Attribute';
    }
}

