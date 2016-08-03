<?php

namespace Dddml\Wms\HttpClient;

use Dddml\Serializer\Type\Long;

class AudienceQueryRequest extends AbstractQueryRequest
{
    use AudienceFilteringFieldsTrait;

    protected $routePath = 'Audiences/{id}';

    public function getReturnType()
    {
        return 'Dddml\Wms\Domain\Audience';
    }
}

