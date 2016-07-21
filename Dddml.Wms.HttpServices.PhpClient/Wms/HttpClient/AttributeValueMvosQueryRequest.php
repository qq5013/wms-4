<?php

namespace Wms\HttpClient;


class AttributeValueMvosQueryRequest extends AbstractQueryRequest
{
    use AttributeValueMvoFilteringFieldsTrait;

    protected $routePath = 'AttributeValueMvos';

    public function getReturnType()
    {
        return 'array<Wms\Domain\AttributeValueMvo>';
    }
}

