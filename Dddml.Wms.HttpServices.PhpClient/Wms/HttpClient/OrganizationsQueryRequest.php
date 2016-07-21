<?php

namespace Wms\HttpClient;

use Dddml\Serializer\Type\Long;

class OrganizationsQueryRequest extends AbstractQueryRequest
{
    use OrganizationFilteringFieldsTrait;

    protected $routePath = 'Organizations';

    public function getReturnType()
    {
        return 'array<Wms\Domain\Organization>';
    }
}

