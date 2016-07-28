<?php

namespace Wms\HttpClient;

use Dddml\Serializer\Type\Long;
use Dddml\Executor\Http\QueryCountRequestInterface;

class AttributeSetInstanceExtensionFieldGroupQueryRequest extends AbstractQueryRequest implements QueryCountRequestInterface
{
    use AttributeSetInstanceExtensionFieldGroupFilteringFieldsTrait;

    protected $routePath = 'AttributeSetInstanceExtensionFieldGroups/{id}';

    public function getReturnType()
    {
        return 'Wms\Domain\AttributeSetInstanceExtensionFieldGroup';
    }
}

