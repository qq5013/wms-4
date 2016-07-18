<?php

namespace Wms\Domain;

use JMS\Serializer\Annotation\Type;
use Wms\Domain\RolePermissionId;
use Wms\Domain\CommandTrait;

class DeleteRolePermission extends AbstractRolePermissionCommand
{

    /**
     * @return string
     */
    public function getCommandType()
    {
        return 'Delete';
    }


}

