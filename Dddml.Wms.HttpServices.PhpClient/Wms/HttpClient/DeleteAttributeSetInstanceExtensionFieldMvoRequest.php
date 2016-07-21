<?php

namespace Wms\HttpClient;

use Dddml\Executor\Http\CommandExecutor;
use Dddml\Executor\Http\CommandRequestInterface;
use Dddml\Routing\RouteTrait;
use Symfony\Component\Routing\Route;
use Wms\Domain\DeleteAttributeSetInstanceExtensionFieldMvo;


class DeleteAttributeSetInstanceExtensionFieldMvoRequest implements CommandRequestInterface
{
    use RouteTrait;

    /**
     * @var DeleteAttributeSetInstanceExtensionFieldMvo
     */
    private $command;

    public function __construct()
    {
        $this->route = new Route('AttributeSetInstanceExtensionFieldMvos/{id}');
    }

    public function getMethod()
    {
        return CommandExecutor::METHOD_DELETE;
    }

    /**
     * @return DeleteAttributeSetInstanceExtensionFieldMvo
     */
    public function getCommand()
    {
        if (!$this->command) {
            $this->command = new DeleteAttributeSetInstanceExtensionFieldMvo();
        }

        return $this->command;
    }

}

