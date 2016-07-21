<?php

namespace Wms\HttpClient;


class AttributeUseMvoQueryRequest extends AbstractQueryRequest
{
    use AttributeUseMvoFilteringFieldsTrait;

    protected $routePath = 'AttributeUseMvos/{id}';

    public function getReturnType()
    {
        return 'Wms\Domain\AttributeUseMvo';
    }
}

