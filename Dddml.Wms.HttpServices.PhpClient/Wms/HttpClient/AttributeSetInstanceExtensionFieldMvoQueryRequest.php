<?php

namespace Wms\HttpClient;

use Dddml\Serializer\Type\Long;

class AttributeSetInstanceExtensionFieldMvoQueryRequest extends AbstractQueryRequest
{
    use AttributeSetInstanceExtensionFieldMvoFilteringFieldsTrait;

    protected $routePath = 'AttributeSetInstanceExtensionFieldMvos/{id}';

    public function getReturnType()
    {
        return 'Wms\Domain\AttributeSetInstanceExtensionFieldMvo';
    }
}

