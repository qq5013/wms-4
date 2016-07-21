<?php

namespace Wms\HttpClient;

use Dddml\Executor\Http\CommandExecutor;
use Dddml\Executor\Http\CommandRequestInterface;
use Dddml\Routing\RouteTrait;
use Symfony\Component\Routing\Route;
use Dddml\Serializer\Type\Long;
use Wms\Domain\DeleteWarehouse;


class DeleteWarehouseRequest implements CommandRequestInterface
{
    use RouteTrait;

    /**
     * @var DeleteWarehouse
     */
    private $command;

    public function __construct()
    {
        $this->route = new Route('Warehouses/{id}');
    }

    public function getMethod()
    {
        return CommandExecutor::METHOD_DELETE;
    }

    /**
     * @return DeleteWarehouse
     */
    public function getCommand()
    {
        if (!$this->command) {
            $this->command = new DeleteWarehouse();
        }

        return $this->command;
    }

}

