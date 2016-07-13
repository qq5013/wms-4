<?php

namespace Wms\Domain;

use Wms\Domain\AbstractQueryRequest;

class AudiencesQueryRequest extends AbstractQueryRequest
{
    use AudienceFilteringFieldsTrait;

    protected $routePath = 'Audiences';

    public function getReturnType()
    {
        return 'array<Wms\Domain\Audience>';
    }
}

