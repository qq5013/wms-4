<?php

namespace Wms\HttpClient;


class WarehouseQueryRequest extends AbstractQueryRequest
{
    use WarehouseFilteringFieldsTrait;

    protected $routePath = 'Warehouses/{id}';

    public function getReturnType()
    {
        return 'Wms\Domain\Warehouse';
    }
}

