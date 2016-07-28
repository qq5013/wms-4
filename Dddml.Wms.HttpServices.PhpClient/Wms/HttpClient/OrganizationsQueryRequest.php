<?php

namespace Wms\HttpClient;

use Dddml\Serializer\Type\Long;
use Dddml\Executor\Http\QueryCountRequestInterface;

class OrganizationsQueryRequest extends AbstractQueryRequest implements QueryCountRequestInterface
{
    use OrganizationFilteringFieldsTrait;

    protected $routePath = 'Organizations';

    public function getReturnType()
    {
        return 'array<Wms\Domain\Organization>';
    }
}

