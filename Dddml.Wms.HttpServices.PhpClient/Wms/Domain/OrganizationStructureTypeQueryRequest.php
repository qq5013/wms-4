<?php

namespace Wms\Domain;

use Wms\Domain\AbstractQueryRequest;

class OrganizationStructureTypeQueryRequest extends AbstractQueryRequest
{
    use OrganizationStructureTypeFilteringFieldsTrait;

    protected $routePath = 'OrganizationStructureTypes/{id}';

    public function getReturnType()
    {
        return 'Wms\Domain\OrganizationStructureType';
    }
}

