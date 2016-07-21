<?php

namespace Wms\HttpClient;

use Dddml\Executor\Http\CommandExecutor;
use Dddml\Executor\Http\CommandRequestInterface;
use Dddml\Routing\RouteTrait;
use Symfony\Component\Routing\Route;
use NodaMoney\Money;
use Wms\Domain\DeleteInOut;


class DeleteInOutRequest implements CommandRequestInterface
{
    use RouteTrait;

    /**
     * @var DeleteInOut
     */
    private $command;

    public function __construct()
    {
        $this->route = new Route('InOuts/{id}');
    }

    public function getMethod()
    {
        return CommandExecutor::METHOD_DELETE;
    }

    /**
     * @return DeleteInOut
     */
    public function getCommand()
    {
        if (!$this->command) {
            $this->command = new DeleteInOut();
        }

        return $this->command;
    }

}

