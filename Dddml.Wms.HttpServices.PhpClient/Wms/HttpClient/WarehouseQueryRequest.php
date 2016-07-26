<?php

namespace Wms\HttpClient;

use Dddml\Serializer\Type\Long;

class WarehouseQueryRequest extends AbstractQueryRequest
{
    use WarehouseFilteringFieldsTrait;

    protected $routePath = 'Warehouses/{id}';

    public function getReturnType()
    {
        return 'Wms\Domain\Warehouse';
    }
}

