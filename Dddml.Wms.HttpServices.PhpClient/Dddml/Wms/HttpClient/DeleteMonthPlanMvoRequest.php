<?php

namespace Dddml\Wms\HttpClient;

use Dddml\Executor\Http\CommandExecutor;
use Dddml\Executor\Http\AbstractCommandRequest;
use Dddml\Routing\RouteTrait;
use Symfony\Component\Routing\Route;
use Dddml\Serializer\Type\Long;
use Dddml\Wms\Domain\DeleteMonthPlanMvo;


class DeleteMonthPlanMvoRequest extends AbstractCommandRequest
{
    use RouteTrait;

    /**
     * @var DeleteMonthPlanMvo
     */
    private $command;

    public static $commandType = 'Dddml\Wms\Domain\DeleteMonthPlanMvo';

    public function __construct(CommandExecutor $executor)
    {
        parent::__construct($executor);
        $this->route = new Route('MonthPlanMvos/{id}');
    }

    public function getMethod()
    {
        return CommandExecutor::METHOD_DELETE;
    }

    /**
     * @return DeleteMonthPlanMvo
     */
    public function getCommand()
    {
        if (!$this->command) {
            $this->command = new DeleteMonthPlanMvo();
        }

        return $this->command;
    }

}

