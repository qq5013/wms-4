<?php

namespace Wms\HttpClient;

use Dddml\Command\CommandExecutor;
use Dddml\Command\CommandRequestInterface;
use Dddml\Routing\RouteTrait;
use JMS\Serializer\Annotation\Type;
use Symfony\Component\Routing\Route;
use Wms\Domain\AttributeSetInstanceExtensionField;
use Wms\Domain\CreateOrMergePatchAttributeSetInstanceExtensionFieldGroup;

class MergePatchAttributeSetInstanceExtensionFieldGroupRequest implements CommandRequestInterface
{
    use RouteTrait;

    /**
     * @var  CreateOrMergePatchAttributeSetInstanceExtensionFieldGroup
     */
    private $command;

    public function __construct()
    {
        $command = $this->getCommand();
        $command->setCommandType(static::COMMAND_MERGE_PATCH);

        $this->route = new Route('AttributeSetInstanceExtensionFieldGroups/{id}');
    }

    public function getMethod()
    {
        return CommandExecutor::METHOD_PATCH;
    }

    /**
     * @return  CreateOrMergePatchAttributeSetInstanceExtensionFieldGroup
     */
    public function getCommand()
    {
        if (!$this->command) {
            $this->command = new CreateOrMergePatchAttributeSetInstanceExtensionFieldGroup();
        }

        return $this->command;
    }
}

