<?php

namespace Dddml\Wms\HttpClient;

use Dddml\Serializer\Type\Long;
use Dddml\Executor\Http\QueryCountRequestInterface;

class AttributeSetInstanceExtensionFieldMvosQueryRequest extends AbstractQueryRequest implements QueryCountRequestInterface
{
    use AttributeSetInstanceExtensionFieldMvoFilteringFieldsTrait;

    protected $routePath = 'AttributeSetInstanceExtensionFieldMvos';

    public function getReturnType()
    {
        return 'array<Dddml\Wms\Domain\AttributeSetInstanceExtensionFieldMvo>';
    }
}

