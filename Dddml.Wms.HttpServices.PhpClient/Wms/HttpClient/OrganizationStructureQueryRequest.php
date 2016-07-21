<?php

namespace Wms\HttpClient;


class OrganizationStructureQueryRequest extends AbstractQueryRequest
{
    use OrganizationStructureFilteringFieldsTrait;

    protected $routePath = 'OrganizationStructures/{id}';

    public function getReturnType()
    {
        return 'Wms\Domain\OrganizationStructure';
    }
}

