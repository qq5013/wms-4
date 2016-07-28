<?php

namespace Wms\HttpClient;

use Dddml\Executor\Http\CommandExecutor;
use Dddml\Executor\Http\AbstractCommandRequest;
use Dddml\Routing\RouteTrait;
use Symfony\Component\Routing\Route;
use Dddml\Serializer\Type\Long;
use Wms\Domain\DeleteRolePermission;


class DeleteRolePermissionRequest extends AbstractCommandRequest
{
    use RouteTrait;

    /**
     * @var DeleteRolePermission
     */
    private $command;

    public static $commandType = 'Wms\Domain\DeleteRolePermission';

    public function __construct(CommandExecutor $executor)
    {
        parent::__construct($executor);
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

