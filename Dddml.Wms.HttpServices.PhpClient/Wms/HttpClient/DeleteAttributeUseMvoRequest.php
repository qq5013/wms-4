<?php

namespace Wms\HttpClient;

use Dddml\Command\CommandExecutor;
use Dddml\Executor\Http\CommandRequestInterface;
use Dddml\Routing\RouteTrait;
use Symfony\Component\Routing\Route;
use Wms\Domain\AttributeSetAttributeUseId;
use Wms\Domain\AttributeUse;
use Wms\Domain\DeleteAttributeUseMvo;


class DeleteAttributeUseMvoRequest implements CommandRequestInterface
{
    use RouteTrait;

    /**
     * @var  DeleteAttributeUseMvo
     */
    private $command;
// ///////////////////// TODO //////////////////////////

    public function __construct()
    {
        $this->route = new Route('AttributeUseMvos/{id}');
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

