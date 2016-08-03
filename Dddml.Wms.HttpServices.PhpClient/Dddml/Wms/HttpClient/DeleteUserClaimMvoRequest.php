<?php

namespace Dddml\Wms\HttpClient;

use Dddml\Executor\Http\CommandExecutor;
use Dddml\Executor\Http\AbstractCommandRequest;
use Dddml\Routing\RouteTrait;
use Symfony\Component\Routing\Route;
use Dddml\Serializer\Type\Long;
use Dddml\Wms\Domain\DeleteUserClaimMvo;


class DeleteUserClaimMvoRequest extends AbstractCommandRequest
{
    use RouteTrait;

    /**
     * @var DeleteUserClaimMvo
     */
    private $command;

    public static $commandType = 'Dddml\Wms\Domain\DeleteUserClaimMvo';

    public function __construct(CommandExecutor $executor)
    {
        parent::__construct($executor);
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

