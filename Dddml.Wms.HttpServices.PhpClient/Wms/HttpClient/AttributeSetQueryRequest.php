<?php

namespace Wms\HttpClient;

use Dddml\Serializer\Type\Long;

class AttributeSetQueryRequest extends AbstractQueryRequest
{
    use AttributeSetFilteringFieldsTrait;

    protected $routePath = 'AttributeSets/{id}';

    public function getReturnType()
    {
        return 'Wms\Domain\AttributeSet';
    }
}

