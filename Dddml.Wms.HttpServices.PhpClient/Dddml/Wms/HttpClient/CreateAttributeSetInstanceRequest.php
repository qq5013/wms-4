<?php

namespace Dddml\Wms\HttpClient;

use Dddml\Executor\Http\CommandExecutor;
use Dddml\Executor\Http\AbstractCommandRequest;
use Dddml\Routing\RouteTrait;
use JMS\Serializer\Annotation\Type;
use Symfony\Component\Routing\Route;
use Dddml\Serializer\Type\Long;
use Dddml\Serializer\Type\Decimal;
use Dddml\Wms\Domain\CreateOrMergePatchAttributeSetInstance;


class CreateAttributeSetInstanceRequest extends AbstractCommandRequest
{
    use RouteTrait;

    public static $commandType = 'Dddml\Wms\Domain\CreateOrMergePatchAttributeSetInstance';

    public function __construct(CommandExecutor $executor)
    {
        parent::__construct($executor);
        $command = $this->getCommand();
        $command->setCommandType(static::COMMAND_CREATE);

        $this->route = new Route('AttributeSetInstances/{id}');
    }

    public function getMethod()
    {
        return CommandExecutor::METHOD_PUT;
    }

    /**
     * @return  CreateOrMergePatchAttributeSetInstance
     */
    public function getCommand()
    {
        if (!$this->command) {
            $this->command = new CreateOrMergePatchAttributeSetInstance();
        }

        return $this->command;
    }
}

