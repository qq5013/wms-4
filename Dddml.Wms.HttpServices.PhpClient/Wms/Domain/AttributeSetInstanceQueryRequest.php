<?php

namespace Wms\Domain;

use Wms\Domain\AbstractQueryRequest;

class AttributeSetInstanceQueryRequest extends AbstractQueryRequest
{
    use AttributeSetInstanceFilteringFieldsTrait;

    protected $routePath = 'AttributeSetInstances/{id}';

    public function getReturnType()
    {
        return 'Wms\Domain\AttributeSetInstance';
    }
}

