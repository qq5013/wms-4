<?php

namespace Wms\HttpClient;


class AudienceQueryRequest extends AbstractQueryRequest
{
    use AudienceFilteringFieldsTrait;

    protected $routePath = 'Audiences/{id}';

    public function getReturnType()
    {
        return 'Wms\Domain\Audience';
    }
}

