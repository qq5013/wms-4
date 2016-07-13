<?php

namespace Wms\Domain;

use Wms\Domain\AbstractQueryRequest;
use Wms\Domain\AttributeSetAttributeUseId;
use Wms\Domain\AttributeUse;

class AttributeUseMvoQueryRequest extends AbstractQueryRequest
{
    use AttributeUseMvoFilteringFieldsTrait;

    protected $routePath = 'AttributeUseMvos/{id}';

    public function getReturnType()
    {
        return 'Wms\Domain\AttributeUseMvo';
    }
}

