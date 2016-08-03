<?php

namespace Dddml\Wms\HttpClient;

use Dddml\Executor\Http\CommandExecutor;
use Dddml\Executor\Http\AbstractCommandRequest;
use Dddml\Routing\RouteTrait;
use Symfony\Component\Routing\Route;
use Dddml\Serializer\Type\Long;
use Dddml\Wms\Domain\DeleteRole;


class DeleteRoleRequest extends AbstractCommandRequest
{
    use RouteTrait;

    /**
     * @var DeleteRole
     */
    private $command;

    public static $commandType = 'Dddml\Wms\Domain\DeleteRole';

    public function __construct(CommandExecutor $executor)
    {
        parent::__construct($executor);
        $this->route = new Route('Roles/{id}');
    }

    public function getMethod()
    {
        return CommandExecutor::METHOD_DELETE;
    }

    /**
     * @return DeleteRole
     */
    public function getCommand()
    {
        if (!$this->command) {
            $this->command = new DeleteRole();
        }

        return $this->command;
    }

}

