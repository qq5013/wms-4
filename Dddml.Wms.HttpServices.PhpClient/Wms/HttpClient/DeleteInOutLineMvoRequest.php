<?php

namespace Wms\HttpClient;

use Dddml\Executor\Http\CommandExecutor;
use Dddml\Executor\Http\CommandRequestInterface;
use Dddml\Routing\RouteTrait;
use Symfony\Component\Routing\Route;
use Dddml\Serializer\Type\Long;
use Dddml\Serializer\Type\Decimal;
use NodaMoney\Money;
use Dddml\Serializer\Type\Money;
use Wms\Domain\DeleteInOutLineMvo;


class DeleteInOutLineMvoRequest implements CommandRequestInterface
{
    use RouteTrait;

    /**
     * @var DeleteInOutLineMvo
     */
    private $command;

    public function __construct()
    {
        $this->route = new Route('InOutLineMvos/{id}');
    }

    public function getMethod()
    {
        return CommandExecutor::METHOD_DELETE;
    }

    /**
     * @return DeleteInOutLineMvo
     */
    public function getCommand()
    {
        if (!$this->command) {
            $this->command = new DeleteInOutLineMvo();
        }

        return $this->command;
    }

}

