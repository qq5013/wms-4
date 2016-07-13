<?php

namespace Wms\HttpClient;


class OrganizationStructureTypeQueryRequest extends AbstractQueryRequest
{
    use OrganizationStructureTypeFilteringFieldsTrait;

    protected $routePath = 'OrganizationStructureTypes/{id}';

    public function getReturnType()
    {
        return 'Wms\Domain\OrganizationStructureType';
    }
}

