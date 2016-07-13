<?php

namespace Wms\Domain;

use Wms\Domain\AbstractQueryRequest;
use Wms\Domain\OrganizationStructureId;

class OrganizationStructuresQueryRequest extends AbstractQueryRequest
{
    use OrganizationStructureFilteringFieldsTrait;

    protected $routePath = 'OrganizationStructures';

    public function getReturnType()
    {
        return 'array<Wms\Domain\OrganizationStructure>';
    }
}

