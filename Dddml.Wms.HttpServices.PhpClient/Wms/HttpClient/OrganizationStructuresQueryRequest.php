<?php

namespace Wms\HttpClient;


class OrganizationStructuresQueryRequest extends AbstractQueryRequest
{
    use OrganizationStructureFilteringFieldsTrait;

    protected $routePath = 'OrganizationStructures';

    public function getReturnType()
    {
        return 'array<Wms\Domain\OrganizationStructure>';
    }
}

