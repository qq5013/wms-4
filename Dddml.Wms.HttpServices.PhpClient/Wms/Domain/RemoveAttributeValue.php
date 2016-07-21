<?php

namespace Wms\Domain;

use JMS\Serializer\Annotation\Type;
use Wms\Domain\CommandTrait;

class RemoveAttributeValue extends CreateOrMergePatchAttributeValue
{

    /**
     * @return string
     */
    public function getCommandType()
    {
        return 'Remove';
    }


}

