<?php

namespace Wms\HttpClient;

use Dddml\Executor\Http\CommandExecutor;
use Dddml\Executor\Http\AbstractCommandRequest;
use Dddml\Routing\RouteTrait;
use Symfony\Component\Routing\Route;
use Dddml\Serializer\Type\Long;
use Wms\Domain\DeleteUserLoginMvo;


class DeleteUserLoginMvoRequest extends AbstractCommandRequest
{
    use RouteTrait;

    /**
     * @var DeleteUserLoginMvo
     */
    private $command;

    public static $commandType = 'Wms\Domain\DeleteUserLoginMvo';

    public function __construct(CommandExecutor $executor)
    {
        parent::__construct($executor);
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

