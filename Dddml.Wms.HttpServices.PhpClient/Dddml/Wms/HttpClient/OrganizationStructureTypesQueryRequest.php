<?php

namespace Dddml\Wms\HttpClient;

use Dddml\Serializer\Type\Long;
use Dddml\Executor\Http\QueryCountRequestInterface;

class OrganizationStructureTypesQueryRequest extends AbstractQueryRequest implements QueryCountRequestInterface
{
    use OrganizationStructureTypeFilteringFieldsTrait;

    protected $routePath = 'OrganizationStructureTypes';

    public function getReturnType()
    {
        return 'array<Dddml\Wms\Domain\OrganizationStructureType>';
    }
}

