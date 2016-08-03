<?php

namespace Dddml\Wms\HttpClient;

use Dddml\Serializer\Type\Long;
use Dddml\Serializer\Type\Decimal;
use Dddml\Executor\Http\QueryCountRequestInterface;

class AttributeSetInstancesQueryRequest extends AbstractQueryRequest implements QueryCountRequestInterface
{
    use AttributeSetInstanceFilteringFieldsTrait;

    protected $routePath = 'AttributeSetInstances';

    public function getReturnType()
    {
        return 'array<Dddml\Wms\Domain\AttributeSetInstance>';
    }
}

