﻿<?php

namespace Wms\Domain;

use JMS\Serializer\Annotation\Type;
use Wms\Domain\CommandTrait;

class DeleteAttributeSetInstanceExtensionFieldMvo extends AbstractAttributeSetInstanceExtensionFieldMvoCommand
{

    /**
     * @return string
     */
    public function getCommandType()
    {
        return 'Delete';
    }


}

