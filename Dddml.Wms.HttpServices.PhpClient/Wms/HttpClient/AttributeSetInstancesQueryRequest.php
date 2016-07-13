<?php

namespace Wms\HttpClient;


class AttributeSetInstancesQueryRequest extends AbstractQueryRequest
{
    use AttributeSetInstanceFilteringFieldsTrait;

    protected $routePath = 'AttributeSetInstances';

    public function getReturnType()
    {
        return 'array<Wms\Domain\AttributeSetInstance>';
    }
}

