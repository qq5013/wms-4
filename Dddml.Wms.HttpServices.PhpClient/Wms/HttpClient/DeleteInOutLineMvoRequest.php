<?php

namespace Wms\HttpClient;

use Dddml\Executor\Http\CommandExecutor;
use Dddml\Executor\Http\AbstractCommandRequest;
use Dddml\Routing\RouteTrait;
use Symfony\Component\Routing\Route;
use Dddml\Serializer\Type\Long;
use Dddml\Serializer\Type\Decimal;
use NodaMoney\Money;
use Dddml\Serializer\Type\Money;
use Wms\Domain\DeleteInOutLineMvo;


class DeleteInOutLineMvoRequest extends AbstractCommandRequest
{
    use RouteTrait;

    /**
     * @var DeleteInOutLineMvo
     */
    private $command;

    public static $commandType = 'Wms\Domain\DeleteInOutLineMvo';

    public function __construct(CommandExecutor $executor)
    {
        parent::__construct($executor);
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

