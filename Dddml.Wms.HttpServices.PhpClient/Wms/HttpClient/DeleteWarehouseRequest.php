<?php

namespace Wms\HttpClient;

use Dddml\Executor\Http\CommandExecutor;
use Dddml\Executor\Http\AbstractCommandRequest;
use Dddml\Routing\RouteTrait;
use Symfony\Component\Routing\Route;
use Dddml\Serializer\Type\Long;
use Wms\Domain\DeleteWarehouse;


class DeleteWarehouseRequest extends AbstractCommandRequest
{
    use RouteTrait;

    /**
     * @var DeleteWarehouse
     */
    private $command;

    public static $commandType = 'Wms\Domain\DeleteWarehouse';

    public function __construct(CommandExecutor $executor)
    {
        parent::__construct($executor);
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

