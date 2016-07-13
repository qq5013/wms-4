<?php

namespace Wms\Domain;

use Wms\Domain\AbstractQueryRequest;
use Wms\Domain\OrganizationStructureId;

class OrganizationStructureQueryRequest extends AbstractQueryRequest
{
    use OrganizationStructureFilteringFieldsTrait;

    protected $routePath = 'OrganizationStructures/{id}';

    public function getReturnType()
    {
        return 'Wms\Domain\OrganizationStructure';
    }
}

