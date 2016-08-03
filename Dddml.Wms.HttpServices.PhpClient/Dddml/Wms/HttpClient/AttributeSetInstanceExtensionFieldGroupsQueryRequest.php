<?php

namespace Dddml\Wms\HttpClient;

use Dddml\Serializer\Type\Long;
use Dddml\Executor\Http\QueryCountRequestInterface;

class AttributeSetInstanceExtensionFieldGroupsQueryRequest extends AbstractQueryRequest implements QueryCountRequestInterface
{
    use AttributeSetInstanceExtensionFieldGroupFilteringFieldsTrait;

    protected $routePath = 'AttributeSetInstanceExtensionFieldGroups';

    public function getReturnType()
    {
        return 'array<Dddml\Wms\Domain\AttributeSetInstanceExtensionFieldGroup>';
    }
}

