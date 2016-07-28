<?php

namespace Wms\HttpClient;

use Dddml\Executor\Http\CommandExecutor;
use Dddml\Executor\Http\AbstractCommandRequest;
use Dddml\Routing\RouteTrait;
use Symfony\Component\Routing\Route;
use Dddml\Serializer\Type\Long;
use Wms\Domain\DeleteAudience;


class DeleteAudienceRequest extends AbstractCommandRequest
{
    use RouteTrait;

    /**
     * @var DeleteAudience
     */
    private $command;

    public static $commandType = 'Wms\Domain\DeleteAudience';

    public function __construct(CommandExecutor $executor)
    {
        parent::__construct($executor);
        $this->route = new Route('Audiences/{id}');
    }

    public function getMethod()
    {
        return CommandExecutor::METHOD_DELETE;
    }

    /**
     * @return DeleteAudience
     */
    public function getCommand()
    {
        if (!$this->command) {
            $this->command = new DeleteAudience();
        }

        return $this->command;
    }

}

