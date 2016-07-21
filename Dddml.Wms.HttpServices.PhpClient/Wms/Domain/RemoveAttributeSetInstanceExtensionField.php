<?php

namespace Wms\Domain;

use JMS\Serializer\Annotation\Type;
use Wms\Domain\CommandTrait;

class RemoveAttributeSetInstanceExtensionField extends CreateOrMergePatchAttributeSetInstanceExtensionField
{

    /**
     * @return string
     */
    public function getCommandType()
    {
        return 'Remove';
    }


}

