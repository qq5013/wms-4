<?php

namespace Wms\HttpClient;

use Dddml\Executor\Http\CommandExecutor;
use Dddml\Executor\Http\CommandRequestInterface;
use Dddml\Routing\RouteTrait;
use Symfony\Component\Routing\Route;
use Dddml\Serializer\Type\Long;
use Wms\Domain\DeleteUserRoleMvo;


class DeleteUserRoleMvoRequest implements CommandRequestInterface
{
    use RouteTrait;

    /**
     * @var DeleteUserRoleMvo
     */
    private $command;

    public function __construct()
    {
        $this->route = new Route('UserRoleMvos/{id}');
    }

    public function getMethod()
    {
        return CommandExecutor::METHOD_DELETE;
    }

    /**
     * @return DeleteUserRoleMvo
     */
    public function getCommand()
    {
        if (!$this->command) {
            $this->command = new DeleteUserRoleMvo();
        }

        return $this->command;
    }

}

