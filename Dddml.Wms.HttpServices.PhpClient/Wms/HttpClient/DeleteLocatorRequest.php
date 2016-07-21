<?php

namespace Wms\HttpClient;

use Dddml\Executor\Http\CommandExecutor;
use Dddml\Executor\Http\CommandRequestInterface;
use Dddml\Routing\RouteTrait;
use Symfony\Component\Routing\Route;
use Wms\Domain\DeleteLocator;


class DeleteLocatorRequest implements CommandRequestInterface
{
    use RouteTrait;

    /**
     * @var DeleteLocator
     */
    private $command;

    public function __construct()
    {
        $this->route = new Route('Locators/{id}');
    }

    public function getMethod()
    {
        return CommandExecutor::METHOD_DELETE;
    }

    /**
     * @return DeleteLocator
     */
    public function getCommand()
    {
        if (!$this->command) {
            $this->command = new DeleteLocator();
        }

        return $this->command;
    }

}

