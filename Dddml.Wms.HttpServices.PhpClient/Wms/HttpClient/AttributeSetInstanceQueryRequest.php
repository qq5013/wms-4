<?php

namespace Wms\HttpClient;

use Dddml\Serializer\Type\Long;
use Dddml\Serializer\Type\Decimal;

class AttributeSetInstanceQueryRequest extends AbstractQueryRequest
{
    use AttributeSetInstanceFilteringFieldsTrait;

    protected $routePath = 'AttributeSetInstances/{id}';

    public function getReturnType()
    {
        return 'Wms\Domain\AttributeSetInstance';
    }
}

