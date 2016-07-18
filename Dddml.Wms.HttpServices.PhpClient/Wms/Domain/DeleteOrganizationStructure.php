<?php

namespace Wms\Domain;

use JMS\Serializer\Annotation\Type;
use Wms\Domain\OrganizationStructureId;
use Wms\Domain\CommandTrait;

class DeleteOrganizationStructure extends AbstractOrganizationStructureCommand
{

    /**
     * @return string
     */
    public function getCommandType()
    {
        return 'Delete';
    }


}

