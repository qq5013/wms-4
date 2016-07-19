<?php

namespace Wms\HttpClient;


class AttributesQueryRequest extends AbstractQueryRequest
{
    use AttributeFilteringFieldsTrait;

    protected $routePath = 'Attributes';

    public function getReturnType()
    {
        return 'array<Wms\Domain\Attribute>';
    }
}

