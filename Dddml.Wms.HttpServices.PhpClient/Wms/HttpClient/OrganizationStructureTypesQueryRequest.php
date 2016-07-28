<?php

namespace Wms\HttpClient;

use Dddml\Serializer\Type\Long;
use Dddml\Executor\Http\QueryCountRequestInterface;

class OrganizationStructureTypesQueryRequest extends AbstractQueryRequest implements QueryCountRequestInterface
{
    use OrganizationStructureTypeFilteringFieldsTrait;

    protected $routePath = 'OrganizationStructureTypes';

    public function getReturnType()
    {
        return 'array<Wms\Domain\OrganizationStructureType>';
    }
}

