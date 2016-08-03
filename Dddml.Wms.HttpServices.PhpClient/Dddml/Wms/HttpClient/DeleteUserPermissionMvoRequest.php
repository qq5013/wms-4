<?php

namespace Dddml\Wms\HttpClient;

use Dddml\Executor\Http\CommandExecutor;
use Dddml\Executor\Http\AbstractCommandRequest;
use Dddml\Routing\RouteTrait;
use Symfony\Component\Routing\Route;
use Dddml\Serializer\Type\Long;
use Dddml\Wms\Domain\DeleteUserPermissionMvo;


class DeleteUserPermissionMvoRequest extends AbstractCommandRequest
{
    use RouteTrait;

    /**
     * @var DeleteUserPermissionMvo
     */
    private $command;

    public static $commandType = 'Dddml\Wms\Domain\DeleteUserPermissionMvo';

    public function __construct(CommandExecutor $executor)
    {
        parent::__construct($executor);
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

