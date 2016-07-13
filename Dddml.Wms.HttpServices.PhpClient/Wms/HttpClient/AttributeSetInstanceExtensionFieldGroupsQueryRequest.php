<?php

namespace Wms\HttpClient;

use Wms\Domain\AttributeSetInstanceExtensionField;

class AttributeSetInstanceExtensionFieldGroupsQueryRequest extends AbstractQueryRequest
{
    use AttributeSetInstanceExtensionFieldGroupFilteringFieldsTrait;

    protected $routePath = 'AttributeSetInstanceExtensionFieldGroups';

    public function getReturnType()
    {
        return 'array<Wms\Domain\AttributeSetInstanceExtensionFieldGroup>';
    }
}

