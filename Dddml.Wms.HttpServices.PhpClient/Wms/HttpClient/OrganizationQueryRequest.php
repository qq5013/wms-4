<?php

namespace Wms\HttpClient;

use Dddml\Serializer\Type\Long;

class OrganizationQueryRequest extends AbstractQueryRequest
{
    use OrganizationFilteringFieldsTrait;

    protected $routePath = 'Organizations/{id}';

    public function getReturnType()
    {
        return 'Wms\Domain\Organization';
    }
}

