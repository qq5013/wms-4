<?php

namespace Wms\HttpClient;

use Dddml\Command\CommandExecutor;
use Dddml\Executor\Http\CommandRequestInterface;
use Dddml\Routing\RouteTrait;
use Symfony\Component\Routing\Route;
use Wms\Domain\RolePermissionId;
use Wms\Domain\DeleteRolePermission;


class DeleteRolePermissionRequest implements CommandRequestInterface
{
    use RouteTrait;

    /**
     * @var DeleteRolePermission
     */
    private $command;

    public function __construct()
    {
        $this->route = new Route('RolePermissions/{id}');
    }

    public function getMethod()
    {
        return CommandExecutor::METHOD_DELETE;
    }

    /**
     * @return DeleteRolePermission
     */
    public function getCommand()
    {
        if (!$this->command) {
            $this->command = new DeleteRolePermission();
        }

        return $this->command;
    }

}

