<?php

namespace Wms\Domain;

use Wms\Domain\AbstractQueryRequest;

class OrganizationsQueryRequest extends AbstractQueryRequest
{
    use OrganizationFilteringFieldsTrait;

    protected $routePath = 'Organizations';

    public function getReturnType()
    {
        return 'array<Wms\Domain\Organization>';
    }
}

