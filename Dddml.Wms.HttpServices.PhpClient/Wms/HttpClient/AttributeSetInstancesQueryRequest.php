<?php

namespace Wms\HttpClient;

use Dddml\Serializer\Type\Long;
use Dddml\Serializer\Type\Decimal;

class AttributeSetInstancesQueryRequest extends AbstractQueryRequest
{
    use AttributeSetInstanceFilteringFieldsTrait;

    protected $routePath = 'AttributeSetInstances';

    public function getReturnType()
    {
        return 'array<Wms\Domain\AttributeSetInstance>';
    }
}

