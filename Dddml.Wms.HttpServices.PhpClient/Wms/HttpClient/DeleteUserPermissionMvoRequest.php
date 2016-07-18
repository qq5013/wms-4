<?php

namespace Wms\HttpClient;

use Dddml\Command\CommandExecutor;
use Dddml\Executor\Http\CommandRequestInterface;
use Dddml\Routing\RouteTrait;
use Symfony\Component\Routing\Route;
use Wms\Domain\UserPermissionId;
use Wms\Domain\UserRole;
use Wms\Domain\UserClaim;
use Wms\Domain\UserPermission;
use Wms\Domain\UserLogin;
use Wms\Domain\DeleteUserPermissionMvo;


class DeleteUserPermissionMvoRequest implements CommandRequestInterface
{
    use RouteTrait;

    /**
     * @var DeleteUserPermissionMvo
     */
    private $command;

    public function __construct()
    {
        $this->route = new Route('UserPermissionMvos/{id}');
    }

    public function getMethod()
    {
        return CommandExecutor::METHOD_DELETE;
    }

    /**
     * @return DeleteUserPermissionMvo
     */
    public function getCommand()
    {
        if (!$this->command) {
            $this->command = new DeleteUserPermissionMvo();
        }

        return $this->command;
    }

}

