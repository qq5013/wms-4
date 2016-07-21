<?php

namespace Wms\HttpClient;

use Dddml\Serializer\Type\Long;

class AttributeSetInstanceExtensionFieldMvosQueryRequest extends AbstractQueryRequest
{
    use AttributeSetInstanceExtensionFieldMvoFilteringFieldsTrait;

    protected $routePath = 'AttributeSetInstanceExtensionFieldMvos';

    public function getReturnType()
    {
        return 'array<Wms\Domain\AttributeSetInstanceExtensionFieldMvo>';
    }
}

