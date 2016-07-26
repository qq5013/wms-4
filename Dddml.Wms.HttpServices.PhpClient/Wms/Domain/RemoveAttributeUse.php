<?php

namespace Wms\Domain;

use JMS\Serializer\Annotation\Type;
use Dddml\Serializer\Type\Long;
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

