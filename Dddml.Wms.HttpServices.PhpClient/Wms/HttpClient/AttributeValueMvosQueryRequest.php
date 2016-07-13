<?php

namespace Wms\HttpClient;

use Wms\Domain\AttributeValueId;
use Wms\Domain\AttributeValue;

class AttributeValueMvosQueryRequest extends AbstractQueryRequest
{
    use AttributeValueMvoFilteringFieldsTrait;

    protected $routePath = 'AttributeValueMvos';

    public function getReturnType()
    {
        return 'array<Wms\Domain\AttributeValueMvo>';
    }
}

