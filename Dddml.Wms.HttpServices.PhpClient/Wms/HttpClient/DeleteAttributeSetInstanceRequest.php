<?php

namespace Wms\HttpClient;

use Dddml\Executor\Http\CommandExecutor;
use Dddml\Executor\Http\CommandRequestInterface;
use Dddml\Routing\RouteTrait;
use Symfony\Component\Routing\Route;
use Wms\Domain\DeleteAttributeSetInstance;


class DeleteAttributeSetInstanceRequest implements CommandRequestInterface
{
    use RouteTrait;

    /**
     * @var DeleteAttributeSetInstance
     */
    private $command;

    public function __construct()
    {
        $this->route = new Route('AttributeSetInstances/{id}');
    }

    public function getMethod()
    {
        return CommandExecutor::METHOD_DELETE;
    }

    /**
     * @return DeleteAttributeSetInstance
     */
    public function getCommand()
    {
        if (!$this->command) {
            $this->command = new DeleteAttributeSetInstance();
        }

        return $this->command;
    }

}

