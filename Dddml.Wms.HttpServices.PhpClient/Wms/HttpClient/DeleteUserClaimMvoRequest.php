<?php

namespace Wms\HttpClient;

use Dddml\Executor\Http\CommandExecutor;
use Dddml\Executor\Http\CommandRequestInterface;
use Dddml\Routing\RouteTrait;
use Symfony\Component\Routing\Route;
use Dddml\Serializer\Type\Long;
use Wms\Domain\DeleteUserClaimMvo;


class DeleteUserClaimMvoRequest implements CommandRequestInterface
{
    use RouteTrait;

    /**
     * @var DeleteUserClaimMvo
     */
    private $command;

    public function __construct()
    {
        $this->route = new Route('UserClaimMvos/{id}');
    }

    public function getMethod()
    {
        return CommandExecutor::METHOD_DELETE;
    }

    /**
     * @return DeleteUserClaimMvo
     */
    public function getCommand()
    {
        if (!$this->command) {
            $this->command = new DeleteUserClaimMvo();
        }

        return $this->command;
    }

}

