<?php

namespace Wms\HttpClient;

use Dddml\Serializer\Type\Long;

class AudiencesQueryRequest extends AbstractQueryRequest
{
    use AudienceFilteringFieldsTrait;

    protected $routePath = 'Audiences';

    public function getReturnType()
    {
        return 'array<Wms\Domain\Audience>';
    }
}

