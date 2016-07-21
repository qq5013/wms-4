<?php

namespace Wms\HttpClient;


class AttributeSetsQueryRequest extends AbstractQueryRequest
{
    use AttributeSetFilteringFieldsTrait;

    protected $routePath = 'AttributeSets';

    public function getReturnType()
    {
        return 'array<Wms\Domain\AttributeSet>';
    }
}

