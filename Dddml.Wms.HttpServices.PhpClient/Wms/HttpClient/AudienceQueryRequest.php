<?php

namespace Wms\HttpClient;

use Dddml\Serializer\Type\Long;
use Dddml\Executor\Http\QueryCountRequestInterface;

class AudienceQueryRequest extends AbstractQueryRequest implements QueryCountRequestInterface
{
    use AudienceFilteringFieldsTrait;

    protected $routePath = 'Audiences/{id}';

    public function getReturnType()
    {
        return 'Wms\Domain\Audience';
    }
}

