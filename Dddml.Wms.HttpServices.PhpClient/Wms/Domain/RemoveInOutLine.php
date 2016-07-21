<?php

namespace Wms\Domain;

use JMS\Serializer\Annotation\Type;
use Dddml\Serializer\Type\Long;
use Dddml\Serializer\Type\Decimal;
use Wms\Domain\CommandTrait;

class RemoveInOutLine extends CreateOrMergePatchInOutLine
{

    /**
     * @return string
     */
    public function getCommandType()
    {
        return 'Remove';
    }


}

