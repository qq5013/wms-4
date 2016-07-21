<?php

namespace Wms\HttpClient;

use Dddml\Executor\Http\CommandExecutor;
use Dddml\Executor\Http\CommandRequestInterface;
use Dddml\Routing\RouteTrait;
use Symfony\Component\Routing\Route;
use Dddml\Serializer\Type\Long;
use Wms\Domain\DeleteAttributeSetInstanceExtensionFieldGroup;


class DeleteAttributeSetInstanceExtensionFieldGroupRequest implements CommandRequestInterface
{
    use RouteTrait;

    /**
     * @var DeleteAttributeSetInstanceExtensionFieldGroup
     */
    private $command;

    public function __construct()
    {
        $this->route = new Route('AttributeSetInstanceExtensionFieldGroups/{id}');
    }

    public function getMethod()
    {
        return CommandExecutor::METHOD_DELETE;
    }

    /**
     * @return DeleteAttributeSetInstanceExtensionFieldGroup
     */
    public function getCommand()
    {
        if (!$this->command) {
            $this->command = new DeleteAttributeSetInstanceExtensionFieldGroup();
        }

        return $this->command;
    }

}

