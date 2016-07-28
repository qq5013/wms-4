<?php

namespace Wms\HttpClient;

use Dddml\Serializer\Type\Long;
use Dddml\Executor\Http\QueryCountRequestInterface;

class OrganizationStructureQueryRequest extends AbstractQueryRequest implements QueryCountRequestInterface
{
    use OrganizationStructureFilteringFieldsTrait;

    protected $routePath = 'OrganizationStructures/{id}';

    public function getReturnType()
    {
        return 'Wms\Domain\OrganizationStructure';
    }
}

