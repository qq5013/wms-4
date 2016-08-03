<?php

namespace Dddml\Wms\Domain;

use JMS\Serializer\Annotation\Type;
use Dddml\Serializer\Type\Long;
use Dddml\Wms\Domain\CommandTrait;

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

