<?php

namespace Wms\Domain;

use Wms\Domain\AbstractQueryRequest;
use Wms\Domain\AttributeSetInstanceExtensionFieldId;
use Wms\Domain\AttributeSetInstanceExtensionField;

class AttributeSetInstanceExtensionFieldMvosQueryRequest extends AbstractQueryRequest
{
    use AttributeSetInstanceExtensionFieldMvoFilteringFieldsTrait;

    protected $routePath = 'AttributeSetInstanceExtensionFieldMvos';

    public function getReturnType()
    {
        return 'array<Wms\Domain\AttributeSetInstanceExtensionFieldMvo>';
    }
}

