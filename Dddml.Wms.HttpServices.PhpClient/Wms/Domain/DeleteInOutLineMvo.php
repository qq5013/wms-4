<?php

namespace Wms\Domain;

use JMS\Serializer\Annotation\Type;
use Dddml\Serializer\Type\Long;
use Dddml\Serializer\Type\Decimal;
use NodaMoney\Money;
use Dddml\Serializer\Type\Money;
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

