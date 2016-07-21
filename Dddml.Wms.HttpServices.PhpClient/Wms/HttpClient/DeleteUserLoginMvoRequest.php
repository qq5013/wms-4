<?php

namespace Wms\HttpClient;

use Dddml\Executor\Http\CommandExecutor;
use Dddml\Executor\Http\CommandRequestInterface;
use Dddml\Routing\RouteTrait;
use Symfony\Component\Routing\Route;
use Wms\Domain\DeleteUserLoginMvo;


class DeleteUserLoginMvoRequest implements CommandRequestInterface
{
    use RouteTrait;

    /**
     * @var DeleteUserLoginMvo
     */
    private $command;

    public function __construct()
    {
        $this->route = new Route('UserLoginMvos/{id}');
    }

    public function getMethod()
    {
        return CommandExecutor::METHOD_DELETE;
    }

    /**
     * @return DeleteUserLoginMvo
     */
    public function getCommand()
    {
        if (!$this->command) {
            $this->command = new DeleteUserLoginMvo();
        }

        return $this->command;
    }

}

