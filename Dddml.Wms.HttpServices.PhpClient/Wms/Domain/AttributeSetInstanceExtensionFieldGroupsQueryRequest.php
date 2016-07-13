<?php

namespace Wms\Domain;

use Wms\Domain\AbstractQueryRequest;
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

