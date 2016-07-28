<?php

namespace Wms\HttpClient;

use Dddml\Executor\Http\CommandExecutor;
use Dddml\Executor\Http\AbstractCommandRequest;
use Dddml\Routing\RouteTrait;
use Symfony\Component\Routing\Route;
use Dddml\Serializer\Type\Long;
use Wms\Domain\DeleteOrganizationStructure;


class DeleteOrganizationStructureRequest extends AbstractCommandRequest
{
    use RouteTrait;

    /**
     * @var DeleteOrganizationStructure
     */
    private $command;

    public static $commandType = 'Wms\Domain\DeleteOrganizationStructure';

    public function __construct(CommandExecutor $executor)
    {
        parent::__construct($executor);
        $this->route = new Route('OrganizationStructures/{id}');
    }

    public function getMethod()
    {
        return CommandExecutor::METHOD_DELETE;
    }

    /**
     * @return DeleteOrganizationStructure
     */
    public function getCommand()
    {
        if (!$this->command) {
            $this->command = new DeleteOrganizationStructure();
        }

        return $this->command;
    }

}

