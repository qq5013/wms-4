<?php

namespace Wms\HttpClient;


class WarehousesQueryRequest extends AbstractQueryRequest
{
    use WarehouseFilteringFieldsTrait;

    protected $routePath = 'Warehouses';

    public function getReturnType()
    {
        return 'array<Wms\Domain\Warehouse>';
    }
}

