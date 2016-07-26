<?php

namespace Wms\HttpClient;

use Dddml\Executor\Http\CommandExecutor;
use Dddml\Executor\Http\CommandRequestInterface;
use Dddml\Routing\RouteTrait;
use Symfony\Component\Routing\Route;
use Dddml\Serializer\Type\Long;
use Wms\Domain\DeletePermission;


class DeletePermissionRequest implements CommandRequestInterface
{
    use RouteTrait;

    /**
     * @var DeletePermission
     */
    private $command;

    public function __construct()
    {
        $this->route = new Route('Permissions/{id}');
    }

    public function getMethod()
    {
        return CommandExecutor::METHOD_DELETE;
    }

    /**
     * @return DeletePermission
     */
    public function getCommand()
    {
        if (!$this->command) {
            $this->command = new DeletePermission();
        }

        return $this->command;
    }

}

