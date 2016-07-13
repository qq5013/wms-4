<?php

namespace Wms\HttpClient;

use Wms\Domain\AttributeSetAttributeUseId;
use Wms\Domain\AttributeUse;

class AttributeUseMvosQueryRequest extends AbstractQueryRequest
{
    use AttributeUseMvoFilteringFieldsTrait;

    protected $routePath = 'AttributeUseMvos';

    public function getReturnType()
    {
        return 'array<Wms\Domain\AttributeUseMvo>';
    }
}

