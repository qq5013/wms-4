<?php

namespace Wms\HttpClient;

use Dddml\Serializer\Type\Long;

class OrganizationStructureTypeQueryRequest extends AbstractQueryRequest
{
    use OrganizationStructureTypeFilteringFieldsTrait;

    protected $routePath = 'OrganizationStructureTypes/{id}';

    public function getReturnType()
    {
        return 'Wms\Domain\OrganizationStructureType';
    }
}

