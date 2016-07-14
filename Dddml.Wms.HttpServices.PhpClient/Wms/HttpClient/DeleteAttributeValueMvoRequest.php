<?php

namespace Wms\HttpClient;

use Dddml\Command\CommandExecutor;
use Dddml\Executor\Http\CommandRequestInterface;
use Dddml\Routing\RouteTrait;
use Symfony\Component\Routing\Route;
use Wms\Domain\AttributeValueId;
use Wms\Domain\AttributeValue;
use Wms\Domain\DeleteAttributeValueMvo;


class DeleteAttributeValueMvoRequest implements CommandRequestInterface
{
    use RouteTrait;

    /**
     * @var  DeleteAttributeValueMvo
     */
    private $command;
// ///////////////////// TODO //////////////////////////

    public function __construct()
    {
        $this->route = new Route('AttributeValueMvos/{id}');
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

