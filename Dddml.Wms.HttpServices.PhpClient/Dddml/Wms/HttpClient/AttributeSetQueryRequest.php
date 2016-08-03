<?php

namespace Dddml\Wms\HttpClient;

use Dddml\Serializer\Type\Long;

class AttributeSetQueryRequest extends AbstractQueryRequest
{
    use AttributeSetFilteringFieldsTrait;

    protected $routePath = 'AttributeSets/{id}';

    public function getReturnType()
    {
        return 'Dddml\Wms\Domain\AttributeSet';
    }
}

