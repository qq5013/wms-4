<?php

namespace Wms\HttpClient;

use Dddml\Serializer\Type\Long;
use Dddml\Executor\Http\QueryCountRequestInterface;

class OrganizationQueryRequest extends AbstractQueryRequest implements QueryCountRequestInterface
{
    use OrganizationFilteringFieldsTrait;

    protected $routePath = 'Organizations/{id}';

    public function getReturnType()
    {
        return 'Wms\Domain\Organization';
    }
}

