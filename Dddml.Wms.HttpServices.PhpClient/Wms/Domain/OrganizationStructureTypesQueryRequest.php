<?php

namespace Wms\Domain;

use Wms\Domain\AbstractQueryRequest;

class OrganizationStructureTypesQueryRequest extends AbstractQueryRequest
{
    use OrganizationStructureTypeFilteringFieldsTrait;

    protected $routePath = 'OrganizationStructureTypes';

    public function getReturnType()
    {
        return 'array<Wms\Domain\OrganizationStructureType>';
    }
}

