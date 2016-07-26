<?php

namespace Wms\HttpClient;

use Dddml\Serializer\Type\Long;

class WarehousesQueryRequest extends AbstractQueryRequest
{
    use WarehouseFilteringFieldsTrait;

    protected $routePath = 'Warehouses';

    public function getReturnType()
    {
        return 'array<Wms\Domain\Warehouse>';
    }
}

