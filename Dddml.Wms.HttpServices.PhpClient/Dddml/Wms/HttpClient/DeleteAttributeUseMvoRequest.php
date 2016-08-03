<?php

namespace Dddml\Wms\HttpClient;

use Dddml\Executor\Http\CommandExecutor;
use Dddml\Executor\Http\AbstractCommandRequest;
use Dddml\Routing\RouteTrait;
use Symfony\Component\Routing\Route;
use Dddml\Serializer\Type\Long;
use Dddml\Wms\Domain\DeleteAttributeUseMvo;


class DeleteAttributeUseMvoRequest extends AbstractCommandRequest
{
    use RouteTrait;

    /**
     * @var DeleteAttributeUseMvo
     */
    private $command;

    public static $commandType = 'Dddml\Wms\Domain\DeleteAttributeUseMvo';

    public function __construct(CommandExecutor $executor)
    {
        parent::__construct($executor);
        $this->route = new Route('AttributeUseMvos/{id}');
    }

    public function getMethod()
    {
        return CommandExecutor::METHOD_DELETE;
    }

    /**
     * @return DeleteAttributeUseMvo
     */
    public function getCommand()
    {
        if (!$this->command) {
            $this->command = new DeleteAttributeUseMvo();
        }

        return $this->command;
    }

}

