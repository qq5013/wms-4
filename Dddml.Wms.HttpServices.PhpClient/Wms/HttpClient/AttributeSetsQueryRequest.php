<?php

namespace Wms\HttpClient;

use Wms\Domain\AttributeUse;

class AttributeSetsQueryRequest extends AbstractQueryRequest
{
    use AttributeSetFilteringFieldsTrait;

    protected $routePath = 'AttributeSets';

    public function getReturnType()
    {
        return 'array<Wms\Domain\AttributeSet>';
    }
}

