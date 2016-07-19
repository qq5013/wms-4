<?php

namespace Wms\HttpClient;

use Dddml\Command\CommandExecutor;
use Dddml\Executor\Http\CommandRequestInterface;
use Dddml\Routing\RouteTrait;
use Symfony\Component\Routing\Route;
use Wms\Domain\DeleteAttribute;


class DeleteAttributeRequest implements CommandRequestInterface
{
    use RouteTrait;

    /**
     * @var DeleteAttribute
     */
    private $command;

    public function __construct()
    {
        $this->route = new Route('Attributes/{id}');
    }

    public function getMethod()
    {
        return CommandExecutor::METHOD_DELETE;
    }

    /**
     * @return DeleteAttribute
     */
    public function getCommand()
    {
        if (!$this->command) {
            $this->command = new DeleteAttribute();
        }

        return $this->command;
    }

}

