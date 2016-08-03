<?php

namespace Dddml\Wms\Domain;

use JMS\Serializer\Annotation\Type;
use Dddml\Serializer\Type\Long;
use Dddml\Wms\Domain\CommandTrait;

class DeleteLocator extends AbstractLocatorCommand
{

    /**
     * @return string
     */
    public function getCommandType()
    {
        return 'Delete';
    }


}

