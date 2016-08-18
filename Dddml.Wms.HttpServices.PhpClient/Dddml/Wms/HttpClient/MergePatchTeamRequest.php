<?php

namespace Dddml\Wms\HttpClient;

use Dddml\Executor\Http\CommandExecutor;
use Dddml\Executor\Http\AbstractCommandRequest;
use Dddml\Routing\RouteTrait;
use JMS\Serializer\Annotation\Type;
use Symfony\Component\Routing\Route;
use Dddml\Serializer\Type\Long;
use Dddml\Wms\Domain\CreateOrMergePatchTeam;

class MergePatchTeamRequest extends AbstractCommandRequest
{
    use RouteTrait;

    public static $commandType = 'Dddml\Wms\Domain\CreateOrMergePatchTeam';

    public function __construct(CommandExecutor $executor)
    {
        parent::__construct($executor);
        $command = $this->getCommand();
        $command->setCommandType(static::COMMAND_MERGE_PATCH);

        $this->route = new Route('Teams/{id}');
    }

    public function getMethod()
    {
        return CommandExecutor::METHOD_PATCH;
    }

    /**
     * @return  CreateOrMergePatchTeam
     */
    public function getCommand()
    {
        if (!$this->command) {
            $this->command = new CreateOrMergePatchTeam();
        }

        return $this->command;
    }
}

