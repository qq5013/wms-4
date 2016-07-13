<?php

namespace Wms\HttpClient;

use Wms\Domain\AttributeUse;

class AttributeSetQueryRequest extends AbstractQueryRequest
{
    use AttributeSetFilteringFieldsTrait;

    protected $routePath = 'AttributeSets/{id}';

    public function getReturnType()
    {
        return 'Wms\Domain\AttributeSet';
    }
}

