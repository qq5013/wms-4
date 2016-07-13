<?php

namespace Wms\HttpClient;

use Wms\Domain\AttributeSetInstanceExtensionFieldId;
use Wms\Domain\AttributeSetInstanceExtensionField;

class AttributeSetInstanceExtensionFieldMvoQueryRequest extends AbstractQueryRequest
{
    use AttributeSetInstanceExtensionFieldMvoFilteringFieldsTrait;

    protected $routePath = 'AttributeSetInstanceExtensionFieldMvos/{id}';

    public function getReturnType()
    {
        return 'Wms\Domain\AttributeSetInstanceExtensionFieldMvo';
    }
}

