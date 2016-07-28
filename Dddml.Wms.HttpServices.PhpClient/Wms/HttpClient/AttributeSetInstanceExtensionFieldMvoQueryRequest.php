<?php

namespace Wms\HttpClient;

use Dddml\Serializer\Type\Long;
use Dddml\Executor\Http\QueryCountRequestInterface;

class AttributeSetInstanceExtensionFieldMvoQueryRequest extends AbstractQueryRequest implements QueryCountRequestInterface
{
    use AttributeSetInstanceExtensionFieldMvoFilteringFieldsTrait;

    protected $routePath = 'AttributeSetInstanceExtensionFieldMvos/{id}';

    public function getReturnType()
    {
        return 'Wms\Domain\AttributeSetInstanceExtensionFieldMvo';
    }
}

