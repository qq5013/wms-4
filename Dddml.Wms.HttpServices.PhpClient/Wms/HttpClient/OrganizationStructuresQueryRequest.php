<?php

namespace Wms\HttpClient;

use Dddml\Serializer\Type\Long;

class OrganizationStructuresQueryRequest extends AbstractQueryRequest
{
    use OrganizationStructureFilteringFieldsTrait;

    protected $routePath = 'OrganizationStructures';

    public function getReturnType()
    {
        return 'array<Wms\Domain\OrganizationStructure>';
    }
}

