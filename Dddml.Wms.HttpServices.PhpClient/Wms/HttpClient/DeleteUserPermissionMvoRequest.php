<?php

namespace Wms\HttpClient;

use Dddml\Executor\Http\CommandExecutor;
use Dddml\Executor\Http\CommandRequestInterface;
use Dddml\Routing\RouteTrait;
use Symfony\Component\Routing\Route;
use Dddml\Serializer\Type\Long;
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

