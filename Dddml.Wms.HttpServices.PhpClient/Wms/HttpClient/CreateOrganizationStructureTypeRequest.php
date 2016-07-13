<?php

namespace Wms\HttpClient;

use Dddml\Command\CommandExecutor;
use Dddml\Command\CommandRequestInterface;
use Dddml\Routing\RouteTrait;
use JMS\Serializer\Annotation\Type;
use Symfony\Component\Routing\Route;
use Wms\Domain\CreateOrMergePatchOrganizationStructureType;


class CreateOrganizationStructureTypeRequest implements CommandRequestInterface
{
    use RouteTrait;

    /**
     * @var  CreateOrMergePatchOrganizationStructureType
     */
    private $command;

    public function __construct()
    {
        $command = $this->getCommand();
        $command->setCommandType(static::COMMAND_CREATE);

        $this->route = new Route('OrganizationStructureTypes/{id}');
    }

    public function getMethod()
    {
        return CommandExecutor::METHOD_PUT;
    }

    /**
     * @return  CreateOrMergePatchOrganizationStructureType
     */
    public function getCommand()
    {
        if (!$this->command) {
            $this->command = new CreateOrMergePatchOrganizationStructureType();
        }

        return $this->command;
    }
}

