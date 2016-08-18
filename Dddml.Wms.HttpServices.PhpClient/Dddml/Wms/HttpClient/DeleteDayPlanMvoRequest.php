<?php

namespace Dddml\Wms\HttpClient;

use Dddml\Executor\Http\CommandExecutor;
use Dddml\Executor\Http\AbstractCommandRequest;
use Dddml\Routing\RouteTrait;
use Symfony\Component\Routing\Route;
use Dddml\Serializer\Type\Long;
use Dddml\Wms\Domain\DeleteDayPlanMvo;


class DeleteDayPlanMvoRequest extends AbstractCommandRequest
{
    use RouteTrait;

    public static $commandType = 'Dddml\Wms\Domain\DeleteDayPlanMvo';

    public function __construct(CommandExecutor $executor)
    {
        parent::__construct($executor);
        $this->route = new Route('DayPlanMvos/{id}');
    }

    public function getMethod()
    {
        return CommandExecutor::METHOD_DELETE;
    }

    /**
     * @return DeleteDayPlanMvo
     */
    public function getCommand()
    {
        if (!$this->command) {
            $this->command = new DeleteDayPlanMvo();
        }

        return $this->command;
    }

}

