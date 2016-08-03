<?php

namespace Dddml\Wms\HttpClient;

use Dddml\Executor\Http\CommandExecutor;
use Dddml\Executor\Http\AbstractCommandRequest;
use Dddml\Routing\RouteTrait;
use JMS\Serializer\Annotation\Type;
use Symfony\Component\Routing\Route;
use Dddml\Serializer\Type\Long;
use Dddml\Wms\Domain\CreateOrMergePatchAttribute;

class MergePatchAttributeRequest extends AbstractCommandRequest
{
    use RouteTrait;

    /**
     * @var  CreateOrMergePatchAttribute
     */
    private $command;

    public static $commandType = 'Dddml\Wms\Domain\CreateOrMergePatchAttribute';

    public function __construct(CommandExecutor $executor)
    {
        parent::__construct($executor);
        $command = $this->getCommand();
        $command->setCommandType(static::COMMAND_MERGE_PATCH);

        $this->route = new Route('Attributes/{id}');
    }

    public function getMethod()
    {
        return CommandExecutor::METHOD_PATCH;
    }

    /**
     * @return  CreateOrMergePatchAttribute
     */
    public function getCommand()
    {
        if (!$this->command) {
            $this->command = new CreateOrMergePatchAttribute();
        }

        return $this->command;
    }
}

