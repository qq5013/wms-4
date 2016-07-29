<?php
/**
 * User: dongww
 * Date: 2016/7/27
 * Time: 15:21
 */
namespace Dddml\Silex\JsonControllerProvider;

use Dddml\Executor\Http\QueryExecutor;
use Silex\Api\ControllerProviderInterface;
use Silex\Application;
use Silex\ControllerCollection;
use Symfony\Component\HttpFoundation\JsonResponse;
use Symfony\Component\HttpFoundation\Request;
use Wms\HttpClient\CreateRoleRequest;
use Wms\HttpClient\RoleQueryRequest;
use Wms\HttpClient\RolesQueryRequest;

class RoleApiControllerProvider implements ControllerProviderInterface
{
    public function connect(Application $app)
    {
        /** @var ControllerCollection $controllers */
        $controllers = $app['controllers_factory'];

        $controllers->get('roles/_count', [$this, 'getCount']);
        $controllers->get('roles/{id}', [$this, 'getRole']);
        $controllers->get('roles', [$this, 'getRoles']);
        $controllers->put('roles/{id}', [$this, 'createRole']);

        return $controllers;
    }

    public function getRole(Application $app, Request $request, $id)
    {
        /** @var QueryExecutor $executor */
        $executor = $app['api.query.executor'];

        $query = new RoleQueryRequest();

        $json = $executor->executeJson($query, [
            'parameters' => [
                'id' => $id,
            ],
        ]);

        return $json;
    }

    public function getRoles(Application $app, Request $request)
    {
        /** @var QueryExecutor $executor */
        $executor = $app['api.query.executor'];

        $query = new RolesQueryRequest();

        $json = $executor->executeJson($query);

        return new JsonResponse($json, 200, [], true);
    }

    public function getCount(Application $app, Request $request)
    {
        /** @var QueryExecutor $executor */
        $executor = $app['api.query.executor'];

        $query = new RolesQueryRequest();

        $json = trim($executor->count($query), "\"");

        return new JsonResponse($json, 200, [], true);
    }

    public function createRole(Application $app, Request $request, $id)
    {
        $json = $request->getContent();

        $createRequest = new CreateRoleRequest(
            $app['api.command.executor']
        );
        $command       = $createRequest->getCommandFromJson($json);

        var_dump($command);
        exit;
    }

    public function mergePatchRole()
    {

    }

    public function deleteRole()
    {

    }
}