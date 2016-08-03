<?php

namespace Dddml\Wms\HttpClient;

use Dddml\Serializer\Type\Long;
use Dddml\Executor\Http\QueryCountRequestInterface;

class OrganizationStructuresQueryRequest extends AbstractQueryRequest implements QueryCountRequestInterface
{
    use OrganizationStructureFilteringFieldsTrait;

    protected $routePath = 'OrganizationStructures';

    public function getReturnType()
    {
        return 'array<Dddml\Wms\Domain\OrganizationStructure>';
    }
}

