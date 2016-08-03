<?php

namespace Dddml\Wms\HttpClient;

use Dddml\Executor\Http\CommandExecutor;
use Dddml\Executor\Http\AbstractCommandRequest;
use Dddml\Routing\RouteTrait;
use JMS\Serializer\Annotation\Type;
use Symfony\Component\Routing\Route;
use Dddml\Serializer\Type\Long;
use Dddml\Wms\Domain\CreateOrMergePatchAttributeValueMvo;

class MergePatchAttributeValueMvoRequest extends AbstractCommandRequest
{
    use RouteTrait;

    /**
     * @var  CreateOrMergePatchAttributeValueMvo
     */
    private $command;

    public static $commandType = 'Dddml\Wms\Domain\CreateOrMergePatchAttributeValueMvo';

    public function __construct(CommandExecutor $executor)
    {
        parent::__construct($executor);
        $command = $this->getCommand();
        $command->setCommandType(static::COMMAND_MERGE_PATCH);

        $this->route = new Route('AttributeValueMvos/{id}');
    }

    public function getMethod()
    {
        return CommandExecutor::METHOD_PATCH;
    }

    /**
     * @return  CreateOrMergePatchAttributeValueMvo
     */
    public function getCommand()
    {
        if (!$this->command) {
            $this->command = new CreateOrMergePatchAttributeValueMvo();
        }

        return $this->command;
    }
}

