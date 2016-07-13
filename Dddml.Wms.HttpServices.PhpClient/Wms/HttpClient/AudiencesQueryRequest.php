<?php

namespace Wms\HttpClient;


class AudiencesQueryRequest extends AbstractQueryRequest
{
    use AudienceFilteringFieldsTrait;

    protected $routePath = 'Audiences';

    public function getReturnType()
    {
        return 'array<Wms\Domain\Audience>';
    }
}

