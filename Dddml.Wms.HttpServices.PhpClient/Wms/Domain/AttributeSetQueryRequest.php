<?php

namespace Wms\Domain;

use Wms\Domain\AbstractQueryRequest;
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

