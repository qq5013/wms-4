<?php

namespace Wms\HttpClient;


class AttributeQueryRequest extends AbstractQueryRequest
{
    use AttributeFilteringFieldsTrait;

    protected $routePath = 'Attributes/{id}';

    public function getReturnType()
    {
        return 'Wms\Domain\Attribute';
    }
}

