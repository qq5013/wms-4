<?php

namespace Dddml\Wms\HttpClient;

use Dddml\Serializer\Type\Long;

class AttributeSetInstanceExtensionFieldMvoQueryRequest extends AbstractQueryRequest
{
    use AttributeSetInstanceExtensionFieldMvoFilteringFieldsTrait;

    protected $routePath = 'AttributeSetInstanceExtensionFieldMvos/{id}';

    public function getReturnType()
    {
        return 'Dddml\Wms\Domain\AttributeSetInstanceExtensionFieldMvo';
    }
}

