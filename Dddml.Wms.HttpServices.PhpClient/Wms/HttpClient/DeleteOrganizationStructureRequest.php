<?php

namespace Wms\HttpClient;

use Dddml\Command\CommandExecutor;
use Dddml\Executor\Http\CommandRequestInterface;
use Dddml\Routing\RouteTrait;
use Symfony\Component\Routing\Route;
use Wms\Domain\OrganizationStructureId;
use Wms\Domain\DeleteOrganizationStructure;


class DeleteOrganizationStructureRequest implements CommandRequestInterface
{
    use RouteTrait;

    /**
     * @var DeleteOrganizationStructure
     */
    private $command;

    public function __construct()
    {
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

