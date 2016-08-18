<?php

namespace Dddml\Wms\HttpClient;

use Dddml\Executor\Http\CommandExecutor;
use Dddml\Executor\Http\AbstractCommandRequest;
use Dddml\Routing\RouteTrait;
use JMS\Serializer\Annotation\Type;
use Symfony\Component\Routing\Route;
use Dddml\Serializer\Type\Long;
use Dddml\Wms\Domain\CreateOrMergePatchWarehouse;


class CreateWarehouseRequest extends AbstractCommandRequest
{
    use RouteTrait;

    public static $commandType = 'Dddml\Wms\Domain\CreateOrMergePatchWarehouse';

    public function __construct(CommandExecutor $executor)
    {
        parent::__construct($executor);
        $command = $this->getCommand();
        $command->setCommandType(static::COMMAND_CREATE);

        $this->route = new Route('Warehouses/{id}');
    }

    public function getMethod()
    {
        return CommandExecutor::METHOD_PUT;
    }

    /**
     * @return  CreateOrMergePatchWarehouse
     */
    public function getCommand()
    {
        if (!$this->command) {
            $this->command = new CreateOrMergePatchWarehouse();
        }

        return $this->command;
    }
}

