<?php

namespace Wms\HttpClient;

use Dddml\Command\CommandExecutor;
use Dddml\Command\CommandRequestInterface;
use Dddml\Routing\RouteTrait;
use JMS\Serializer\Annotation\Type;
use Symfony\Component\Routing\Route;
use Wms\Domain\CreateOrMergePatchAttributeSetInstance;

class MergePatchAttributeSetInstanceRequest implements CommandRequestInterface
{
    use RouteTrait;

    /**
     * @var  CreateOrMergePatchAttributeSetInstance
     */
    private $command;

    public function __construct()
    {
        $command = $this->getCommand();
        $command->setCommandType(static::COMMAND_MERGE_PATCH);

        $this->route = new Route('AttributeSetInstances/{id}');
    }

    public function getMethod()
    {
        return CommandExecutor::METHOD_PATCH;
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

