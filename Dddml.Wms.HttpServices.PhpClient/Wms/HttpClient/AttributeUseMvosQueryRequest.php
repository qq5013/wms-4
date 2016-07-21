<?php

namespace Wms\HttpClient;

use Dddml\Serializer\Type\Long;

class AttributeUseMvosQueryRequest extends AbstractQueryRequest
{
    use AttributeUseMvoFilteringFieldsTrait;

    protected $routePath = 'AttributeUseMvos';

    public function getReturnType()
    {
        return 'array<Wms\Domain\AttributeUseMvo>';
    }
}

