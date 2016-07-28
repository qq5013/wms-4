<?php

namespace Wms\HttpClient;

use Dddml\Serializer\Type\Long;
use Dddml\Executor\Http\QueryCountRequestInterface;

class OrganizationStructureTypeQueryRequest extends AbstractQueryRequest implements QueryCountRequestInterface
{
    use OrganizationStructureTypeFilteringFieldsTrait;

    protected $routePath = 'OrganizationStructureTypes/{id}';

    public function getReturnType()
    {
        return 'Wms\Domain\OrganizationStructureType';
    }
}

