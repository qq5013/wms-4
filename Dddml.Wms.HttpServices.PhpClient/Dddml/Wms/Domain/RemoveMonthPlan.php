<?php

namespace Dddml\Wms\Domain;

use JMS\Serializer\Annotation\Type;
use Dddml\Serializer\Type\Long;
use Dddml\Wms\Domain\CommandTrait;

class RemoveMonthPlan extends CreateOrMergePatchMonthPlan
{

    /**
     * @return string
     */
    public function getCommandType()
    {
        return 'Remove';
    }


}

