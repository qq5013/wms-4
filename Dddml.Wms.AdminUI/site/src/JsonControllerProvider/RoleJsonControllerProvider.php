<?php
/**
 * User: dongww
 * Date: 2016/7/27
 * Time: 15:21
 */
namespace JsonControllerProvider;

use Dddml\Executor\Http\QueryExecutor;
use Silex\Api\ControllerProviderInterface;
use Silex\Application;
use Silex\ControllerCollection;
use Symfony\Component\HttpFoundation\JsonResponse;
use Symfony\Component\HttpFoundation\Request;
use Wms\HttpClient\RoleQueryRequest;

class RoleJsonControllerProvider implements ControllerProviderInterface
{
    public function connect(Application $app)
    {
        /** @var ControllerCollection $controllers */
        $controllers = $app['controllers_factory'];

        $controllers->get('roles/{id}', [$this, 'getRole']);

        return $controllers;
    }

    public function getRole(Application $app, Request $request, $id)
    {
        /** @var QueryExecutor $executor */
        $executor = $app['api.query.executor'];

        $singleQuery = new RoleQueryRequest();


        $json = $executor->executeJson($singleQuery, [
            'parameters' => [
                'id' => $id,
            ],
        ]);

        return new JsonResponse($json, 200, [], true);
    }

    public function getRoles()
    {

    }

    public function createRole()
    {

    }

    public function mergePatchRole()
    {

    }

    public function deleteRole()
    {

    }
}