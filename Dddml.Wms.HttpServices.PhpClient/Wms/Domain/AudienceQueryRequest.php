<?php

namespace Wms\Domain;

use Wms\Domain\AbstractQueryRequest;

class AudienceQueryRequest extends AbstractQueryRequest
{
    use AudienceFilteringFieldsTrait;

    protected $routePath = 'Audiences/{id}';

    public function getReturnType()
    {
        return 'Wms\Domain\Audience';
    }
}

