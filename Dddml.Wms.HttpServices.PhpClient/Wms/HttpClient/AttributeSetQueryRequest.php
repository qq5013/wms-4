<?php

namespace Wms\HttpClient;


class AttributeSetQueryRequest extends AbstractQueryRequest
{
    use AttributeSetFilteringFieldsTrait;

    protected $routePath = 'AttributeSets/{id}';

    public function getReturnType()
    {
        return 'Wms\Domain\AttributeSet';
    }
}

