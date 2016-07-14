<?php

namespace Wms\HttpClient;

use Dddml\Command\CommandExecutor;
use Dddml\Executor\Http\CommandRequestInterface;
use Dddml\Routing\RouteTrait;
use Symfony\Component\Routing\Route;
use NodaMoney\Money;
use Wms\Domain\InOutLine;
use Wms\Domain\SkuId;
use Wms\Domain\DeleteInOut;


class DeleteInOutRequest implements CommandRequestInterface
{
    use RouteTrait;

    /**
     * @var  DeleteInOut
     */
    private $command;
// ///////////////////// TODO //////////////////////////

    public function __construct()
    {
        $this->route = new Route('InOuts/{id}');
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

