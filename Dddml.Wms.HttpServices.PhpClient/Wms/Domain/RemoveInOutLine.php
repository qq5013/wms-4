<?php

namespace Wms\Domain;

use JMS\Serializer\Annotation\Type;
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

