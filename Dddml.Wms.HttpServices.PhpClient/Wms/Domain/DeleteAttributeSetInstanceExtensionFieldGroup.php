<?php

namespace Wms\Domain;

use JMS\Serializer\Annotation\Type;
use Wms\Domain\AttributeSetInstanceExtensionField;
use Wms\Domain\CommandTrait;

class DeleteAttributeSetInstanceExtensionFieldGroup extends AbstractAttributeSetInstanceExtensionFieldGroupCommand
{

    /**
     * @return string
     */
    public function getCommandType()
    {
        return 'Delete';
    }


}

