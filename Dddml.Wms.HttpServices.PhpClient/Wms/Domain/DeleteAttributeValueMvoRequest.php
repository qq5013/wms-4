﻿<?php

namespace Wms\Domain;

use Dddml\Command\CommandExecutor;
use Dddml\Command\CommandRequestInterface;
use Dddml\Routing\RouteTrait;
use Symfony\Component\Routing\Route;
use Wms\Domain\AttributeValueId;
use Wms\Domain\AttributeValue;

class DeleteAttributeValueMvoRequest implements CommandRequestInterface
{
    use RouteTrait;

    public function __construct()
    {
        $this->route = new Route('AttributeValueMvos/{id}');
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

