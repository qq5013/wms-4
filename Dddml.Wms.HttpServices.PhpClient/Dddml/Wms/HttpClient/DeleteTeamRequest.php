<?php

namespace Dddml\Wms\HttpClient;

use Dddml\Executor\Http\CommandExecutor;
use Dddml\Executor\Http\AbstractCommandRequest;
use Dddml\Routing\RouteTrait;
use Symfony\Component\Routing\Route;
use Dddml\Serializer\Type\Long;
use Dddml\Wms\Domain\DeleteTeam;


class DeleteTeamRequest extends AbstractCommandRequest
{
    use RouteTrait;

    /**
     * @var DeleteTeam
     */
    private $command;

    public static $commandType = 'Dddml\Wms\Domain\DeleteTeam';

    public function __construct(CommandExecutor $executor)
    {
        parent::__construct($executor);
        $this->route = new Route('Teams/{id}');
    }

    public function getMethod()
    {
        return CommandExecutor::METHOD_DELETE;
    }

    /**
     * @return DeleteTeam
     */
    public function getCommand()
    {
        if (!$this->command) {
            $this->command = new DeleteTeam();
        }

        return $this->command;
    }

}

