<?php

namespace Wms\HttpClient;

use Dddml\Executor\Http\CommandExecutor;
use Dddml\Executor\Http\AbstractCommandRequest;
use Dddml\Routing\RouteTrait;
use Symfony\Component\Routing\Route;
use Dddml\Serializer\Type\Long;
use Wms\Domain\DeleteOrganizationStructureType;


class DeleteOrganizationStructureTypeRequest extends AbstractCommandRequest
{
    use RouteTrait;

    /**
     * @var DeleteOrganizationStructureType
     */
    private $command;

    public static $commandType = 'Wms\Domain\DeleteOrganizationStructureType';

    public function __construct(CommandExecutor $executor)
    {
        parent::__construct($executor);
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

