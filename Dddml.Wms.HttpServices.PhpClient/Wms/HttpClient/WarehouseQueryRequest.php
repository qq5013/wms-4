<?php

namespace Wms\HttpClient;

use Dddml\Serializer\Type\Long;
use Dddml\Executor\Http\QueryCountRequestInterface;

class WarehouseQueryRequest extends AbstractQueryRequest implements QueryCountRequestInterface
{
    use WarehouseFilteringFieldsTrait;

    protected $routePath = 'Warehouses/{id}';

    public function getReturnType()
    {
        return 'Wms\Domain\Warehouse';
    }
}

