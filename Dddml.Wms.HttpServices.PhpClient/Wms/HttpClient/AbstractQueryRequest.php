<?php

namespace Wms\HttpClient;

use Dddml\Routing\RouteTrait;
use Dddml\Executor\Http\QueryRequestInterface;
use Symfony\Component\Routing\Route;

abstract class AbstractQueryRequest implements QueryRequestInterface
{
    use RouteTrait;

    protected $routePath = null;

    public function __construct()
    {
        if (!$this->routePath) {
            throw new \Exception('Route Path is Null.');
        }

        $this->route = new Route($this->routePath);
    }
}

