<?php

namespace Wms\HttpClient;

use Dddml\Executor\Http\CommandExecutor;
use Dddml\Executor\Http\CommandRequestInterface;
use Dddml\Routing\RouteTrait;
use Symfony\Component\Routing\Route;
use Wms\Domain\DeleteUser;


class DeleteUserRequest implements CommandRequestInterface
{
    use RouteTrait;

    /**
     * @var DeleteUser
     */
    private $command;

    public function __construct()
    {
        $this->route = new Route('Users/{id}');
    }

    public function getMethod()
    {
        return CommandExecutor::METHOD_DELETE;
    }

    /**
     * @return DeleteUser
     */
    public function getCommand()
    {
        if (!$this->command) {
            $this->command = new DeleteUser();
        }

        return $this->command;
    }

}

