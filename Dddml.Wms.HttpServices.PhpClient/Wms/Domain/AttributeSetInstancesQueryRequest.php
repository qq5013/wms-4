<?php

namespace Wms\Domain;

use Wms\Domain\AbstractQueryRequest;

class AttributeSetInstancesQueryRequest extends AbstractQueryRequest
{
    use AttributeSetInstanceFilteringFieldsTrait;

    protected $routePath = 'AttributeSetInstances';

    public function getReturnType()
    {
        return 'array<Wms\Domain\AttributeSetInstance>';
    }
}

