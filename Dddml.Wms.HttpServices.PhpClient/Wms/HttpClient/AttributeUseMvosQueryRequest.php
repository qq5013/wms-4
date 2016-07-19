<?php

namespace Wms\HttpClient;


class AttributeUseMvosQueryRequest extends AbstractQueryRequest
{
    use AttributeUseMvoFilteringFieldsTrait;

    protected $routePath = 'AttributeUseMvos';

    public function getReturnType()
    {
        return 'array<Wms\Domain\AttributeUseMvo>';
    }
}

