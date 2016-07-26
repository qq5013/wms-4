<?php

namespace Wms\HttpClient;

use Dddml\Serializer\Type\Long;

class OrganizationStructureTypesQueryRequest extends AbstractQueryRequest
{
    use OrganizationStructureTypeFilteringFieldsTrait;

    protected $routePath = 'OrganizationStructureTypes';

    public function getReturnType()
    {
        return 'array<Wms\Domain\OrganizationStructureType>';
    }
}

