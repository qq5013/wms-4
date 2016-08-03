<?php

namespace Dddml\Wms\HttpClient;

use Dddml\Serializer\Type\Long;

class AttributeSetInstanceExtensionFieldGroupQueryRequest extends AbstractQueryRequest
{
    use AttributeSetInstanceExtensionFieldGroupFilteringFieldsTrait;

    protected $routePath = 'AttributeSetInstanceExtensionFieldGroups/{id}';

    public function getReturnType()
    {
        return 'Dddml\Wms\Domain\AttributeSetInstanceExtensionFieldGroup';
    }
}

