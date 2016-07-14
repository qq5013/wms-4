<?php

namespace Wms\HttpClient;

use Dddml\Command\CommandExecutor;
use Dddml\Executor\Http\CommandRequestInterface;
use Dddml\Routing\RouteTrait;
use Symfony\Component\Routing\Route;
use Wms\Domain\AttributeSetInstanceExtensionField;
use Wms\Domain\DeleteAttributeSetInstanceExtensionFieldGroup;


class DeleteAttributeSetInstanceExtensionFieldGroupRequest implements CommandRequestInterface
{
    use RouteTrait;

    /**
     * @var  DeleteAttributeSetInstanceExtensionFieldGroup
     */
    private $command;
// ///////////////////// TODO //////////////////////////

    public function __construct()
    {
        $this->route = new Route('AttributeSetInstanceExtensionFieldGroups/{id}');
    }

    public function getMethod()
    {
        return CommandExecutor::METHOD_DELETE;
    }

    /**
     * @return null
     */
    public function getBody()
    {
        return null;
    }

}

