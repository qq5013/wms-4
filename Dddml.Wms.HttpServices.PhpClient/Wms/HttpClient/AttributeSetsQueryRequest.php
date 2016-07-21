<?php

namespace Wms\HttpClient;

use Dddml\Serializer\Type\Long;

class AttributeSetsQueryRequest extends AbstractQueryRequest
{
    use AttributeSetFilteringFieldsTrait;

    protected $routePath = 'AttributeSets';

    public function getReturnType()
    {
        return 'array<Wms\Domain\AttributeSet>';
    }
}

