<?php

namespace Dddml\Wms\HttpClient;

use Dddml\Executor\Http\CommandExecutor;
use Dddml\Executor\Http\AbstractCommandRequest;
use Dddml\Routing\RouteTrait;
use Symfony\Component\Routing\Route;
use Dddml\Serializer\Type\Long;
use Dddml\Wms\Domain\DeletePerson;


class DeletePersonRequest extends AbstractCommandRequest
{
    use RouteTrait;

    /**
     * @var DeletePerson
     */
    private $command;

    public static $commandType = 'Dddml\Wms\Domain\DeletePerson';

    public function __construct(CommandExecutor $executor)
    {
        parent::__construct($executor);
        $this->route = new Route('People/{id}');
    }

    public function getMethod()
    {
        return CommandExecutor::METHOD_DELETE;
    }

    /**
     * @return DeletePerson
     */
    public function getCommand()
    {
        if (!$this->command) {
            $this->command = new DeletePerson();
        }

        return $this->command;
    }

}

