﻿<?php

namespace Wms\Domain;

use Dddml\Command\CommandExecutor;
use Dddml\Command\CommandRequestInterface;
use Dddml\Routing\RouteTrait;
use Symfony\Component\Routing\Route;
use Wms\Domain\AttributeSetAttributeUseId;
use Wms\Domain\AttributeUse;

class DeleteAttributeUseMvoRequest implements CommandRequestInterface
{
    use RouteTrait;

    public function __construct()
    {
        $this->route = new Route('AttributeUseMvos/{id}');
    }

    public function getMethod()
    {
        return CommandExecutor::METHOD_DELETE;
    }

    /**
     * @return null
     */
    public function getBody()
    {
        return null;
    }

}

