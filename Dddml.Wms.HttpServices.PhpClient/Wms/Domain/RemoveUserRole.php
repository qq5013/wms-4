<?php

namespace Wms\Domain;

use JMS\Serializer\Annotation\Type;
use Wms\Domain\CommandTrait;

class RemoveUserRole extends CreateOrMergePatchUserRole
{

    /**
     * @return string
     */
    public function getCommandType()
    {
        return 'Remove';
    }


}

