<?php

namespace Wms\HttpClient;

use Dddml\Executor\Http\CommandExecutor;
use Dddml\Executor\Http\CommandRequestInterface;
use Dddml\Routing\RouteTrait;
use Symfony\Component\Routing\Route;
use Dddml\Serializer\Type\Long;
use Wms\Domain\DeleteRole;


class DeleteRoleRequest implements CommandRequestInterface
{
    use RouteTrait;

    /**
     * @var DeleteRole
     */
    private $command;

    public function __construct()
    {
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

