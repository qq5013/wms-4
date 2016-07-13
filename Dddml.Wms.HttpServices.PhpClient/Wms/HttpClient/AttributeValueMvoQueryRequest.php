<?php

namespace Wms\HttpClient;

use Wms\Domain\AttributeValueId;
use Wms\Domain\AttributeValue;

class AttributeValueMvoQueryRequest extends AbstractQueryRequest
{
    use AttributeValueMvoFilteringFieldsTrait;

    protected $routePath = 'AttributeValueMvos/{id}';

    public function getReturnType()
    {
        return 'Wms\Domain\AttributeValueMvo';
    }
}

