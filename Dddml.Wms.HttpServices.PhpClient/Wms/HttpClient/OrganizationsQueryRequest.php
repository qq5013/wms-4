<?php

namespace Wms\HttpClient;


class OrganizationsQueryRequest extends AbstractQueryRequest
{
    use OrganizationFilteringFieldsTrait;

    protected $routePath = 'Organizations';

    public function getReturnType()
    {
        return 'array<Wms\Domain\Organization>';
    }
}

