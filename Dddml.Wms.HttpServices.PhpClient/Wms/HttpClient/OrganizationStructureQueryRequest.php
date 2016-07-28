<?php

namespace Wms\HttpClient;

use Dddml\Serializer\Type\Long;

class OrganizationStructureQueryRequest extends AbstractQueryRequest
{
    use OrganizationStructureFilteringFieldsTrait;

    protected $routePath = 'OrganizationStructures/{id}';

    public function getReturnType()
    {
        return 'Wms\Domain\OrganizationStructure';
    }
}

