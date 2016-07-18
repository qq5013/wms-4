<?php

namespace Wms\Domain;

use JMS\Serializer\Annotation\Type;
use Wms\Domain\InOutLineId;
use NodaMoney\Money;
use Wms\Domain\InOutLine;
use Wms\Domain\CommandTrait;

class DeleteInOutLineMvo extends AbstractInOutLineMvoCommand
{

    /**
     * @return string
     */
    public function getCommandType()
    {
        return 'Delete';
    }


}

