<?php

namespace Wms\HttpClient;

use Dddml\Command\CommandExecutor;
use Dddml\Executor\Http\CommandRequestInterface;
use Dddml\Routing\RouteTrait;
use Symfony\Component\Routing\Route;
use Wms\Domain\DeleteOrganizationStructureType;


class DeleteOrganizationStructureTypeRequest implements CommandRequestInterface
{
    use RouteTrait;

    /**
     * @var DeleteOrganizationStructureType
     */
    private $command;

    public function __construct()
    {
        $this->route = new Route('OrganizationStructureTypes/{id}');
    }

    public function getMethod()
    {
        return CommandExecutor::METHOD_DELETE;
    }

    /**
     * @return DeleteOrganizationStructureType
     */
    public function getCommand()
    {
        if (!$this->command) {
            $this->command = new DeleteOrganizationStructureType();
        }

        return $this->command;
    }

}

