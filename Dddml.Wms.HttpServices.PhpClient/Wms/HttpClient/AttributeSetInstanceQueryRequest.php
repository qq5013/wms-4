<?php

namespace Wms\HttpClient;

use Dddml\Serializer\Type\Long;
use Dddml\Serializer\Type\Decimal;
use Dddml\Executor\Http\QueryCountRequestInterface;

class AttributeSetInstanceQueryRequest extends AbstractQueryRequest implements QueryCountRequestInterface
{
    use AttributeSetInstanceFilteringFieldsTrait;

    protected $routePath = 'AttributeSetInstances/{id}';

    public function getReturnType()
    {
        return 'Wms\Domain\AttributeSetInstance';
    }
}

