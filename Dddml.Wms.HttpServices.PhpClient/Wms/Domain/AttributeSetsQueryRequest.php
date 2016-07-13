<?php

namespace Wms\Domain;

use Wms\Domain\AbstractQueryRequest;
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

