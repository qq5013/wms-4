<?php

namespace Wms\HttpClient;

use Dddml\Command\CommandExecutor;
use Dddml\Executor\Http\CommandRequestInterface;
use Dddml\Routing\RouteTrait;
use Symfony\Component\Routing\Route;
use Wms\Domain\DeleteAudience;


class DeleteAudienceRequest implements CommandRequestInterface
{
    use RouteTrait;

    /**
     * @var DeleteAudience
     */
    private $command;

    public function __construct()
    {
        $this->route = new Route('Audiences/{id}');
    }

    public function getMethod()
    {
        return CommandExecutor::METHOD_DELETE;
    }

    /**
     * @return DeleteAudience
     */
    public function getCommand()
    {
        if (!$this->command) {
            $this->command = new DeleteAudience();
        }

        return $this->command;
    }

}

