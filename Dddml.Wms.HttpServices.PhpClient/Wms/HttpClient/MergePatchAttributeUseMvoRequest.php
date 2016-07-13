<?php

namespace Wms\HttpClient;

use Dddml\Command\CommandExecutor;
use Dddml\Command\CommandRequestInterface;
use Dddml\Routing\RouteTrait;
use JMS\Serializer\Annotation\Type;
use Symfony\Component\Routing\Route;
use Wms\Domain\AttributeSetAttributeUseId;
use Wms\Domain\AttributeUse;
use Wms\Domain\CreateOrMergePatchAttributeUseMvo;

class MergePatchAttributeUseMvoRequest implements CommandRequestInterface
{
    use RouteTrait;

    /**
     * @var  CreateOrMergePatchAttributeUseMvo
     */
    private $command;

    public function __construct()
    {
        $command = $this->getCommand();
        $command->setCommandType(static::COMMAND_MERGE_PATCH);

        $this->route = new Route('AttributeUseMvos/{id}');
    }

    public function getMethod()
    {
        return CommandExecutor::METHOD_PATCH;
    }

    /**
     * @return  CreateOrMergePatchAttributeUseMvo
     */
    public function getCommand()
    {
        if (!$this->command) {
            $this->command = new CreateOrMergePatchAttributeUseMvo();
        }

        return $this->command;
    }
}

