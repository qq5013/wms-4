<?php

namespace Wms\Domain;

use JMS\Serializer\Annotation\Type;
use Wms\Domain\CommandTrait;

class DeleteWarehouse extends AbstractWarehouseCommand
{

    /**
     * @return string
     */
    public function getCommandType()
    {
        return 'Delete';
    }


}

