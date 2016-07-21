<?php

namespace Wms\Domain;

use JMS\Serializer\Annotation\Type;
use Wms\Domain\CommandTrait;

class RemoveAttributeUse extends CreateOrMergePatchAttributeUse
{

    /**
     * @return string
     */
    public function getCommandType()
    {
        return 'Remove';
    }


}

