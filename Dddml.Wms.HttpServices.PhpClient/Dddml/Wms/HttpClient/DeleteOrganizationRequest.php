<?php

namespace Dddml\Wms\HttpClient;

use Dddml\Executor\Http\CommandExecutor;
use Dddml\Executor\Http\AbstractCommandRequest;
use Dddml\Routing\RouteTrait;
use Symfony\Component\Routing\Route;
use Dddml\Serializer\Type\Long;
use Dddml\Wms\Domain\DeleteOrganization;


class DeleteOrganizationRequest extends AbstractCommandRequest
{
    use RouteTrait;

    /**
     * @var DeleteOrganization
     */
    private $command;

    public static $commandType = 'Dddml\Wms\Domain\DeleteOrganization';

    public function __construct(CommandExecutor $executor)
    {
        parent::__construct($executor);
        $this->route = new Route('Organizations/{id}');
    }

    public function getMethod()
    {
        return CommandExecutor::METHOD_DELETE;
    }

    /**
     * @return DeleteOrganization
     */
    public function getCommand()
    {
        if (!$this->command) {
            $this->command = new DeleteOrganization();
        }

        return $this->command;
    }

}

