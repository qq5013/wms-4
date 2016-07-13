<?php

namespace Wms\HttpClient;


class OrganizationQueryRequest extends AbstractQueryRequest
{
    use OrganizationFilteringFieldsTrait;

    protected $routePath = 'Organizations/{id}';

    public function getReturnType()
    {
        return 'Wms\Domain\Organization';
    }
}

