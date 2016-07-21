<?php

namespace Wms\HttpClient;

use Dddml\Serializer\Type\Long;

class AttributeSetInstanceExtensionFieldGroupsQueryRequest extends AbstractQueryRequest
{
    use AttributeSetInstanceExtensionFieldGroupFilteringFieldsTrait;

    protected $routePath = 'AttributeSetInstanceExtensionFieldGroups';

    public function getReturnType()
    {
        return 'array<Wms\Domain\AttributeSetInstanceExtensionFieldGroup>';
    }
}

