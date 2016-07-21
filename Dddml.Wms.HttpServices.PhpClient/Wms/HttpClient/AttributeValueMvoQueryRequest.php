<?php

namespace Wms\HttpClient;


class AttributeValueMvoQueryRequest extends AbstractQueryRequest
{
    use AttributeValueMvoFilteringFieldsTrait;

    protected $routePath = 'AttributeValueMvos/{id}';

    public function getReturnType()
    {
        return 'Wms\Domain\AttributeValueMvo';
    }
}

