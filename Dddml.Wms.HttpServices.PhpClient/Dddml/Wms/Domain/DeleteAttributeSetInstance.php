<?php

namespace Dddml\Wms\Domain;

use JMS\Serializer\Annotation\Type;
use Dddml\Serializer\Type\Long;
use Dddml\Serializer\Type\Decimal;
use Dddml\Wms\Domain\CommandTrait;

class DeleteAttributeSetInstance extends AbstractAttributeSetInstanceCommand
{

    /**
     * @return string
     */
    public function getCommandType()
    {
        return 'Delete';
    }


}

