<?php

namespace Dddml\Wms\HttpClient;

use Dddml\Executor\Http\CommandExecutor;
use Dddml\Executor\Http\AbstractCommandRequest;
use Dddml\Routing\RouteTrait;
use Symfony\Component\Routing\Route;
use NodaMoney\Money;
use Dddml\Serializer\Type\Money;
use Dddml\Serializer\Type\Decimal;
use Dddml\Serializer\Type\Long;
use Dddml\Wms\Domain\DeleteInOut;


class DeleteInOutRequest extends AbstractCommandRequest
{
    use RouteTrait;

    /**
     * @var DeleteInOut
     */
    private $command;

    public static $commandType = 'Dddml\Wms\Domain\DeleteInOut';

    public function __construct(CommandExecutor $executor)
    {
        parent::__construct($executor);
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

