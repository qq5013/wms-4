<?php
/**
 * User: dongww
 * Date: 2016/7/27
 * Time: 15:21
 */
namespace Application\ControllerProvider;

use Silex\Api\ControllerProviderInterface;
use Silex\Application;
use Silex\ControllerCollection;
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

        $controllers->get('roles/_count', [$this, 'getCount'])->bind('api_get_roles_count');
        $controllers->get('roles/{id}', [$this, 'getRole'])->bind('api_get_role');
        $controllers->get('roles', [$this, 'getRoles'])->bind('api_get_roles');
        $controllers->put('roles/{id}', [$this, 'createRole'])->bind('api_create_roles');
        $controllers->patch('roles/{id}', [$this, 'mergePatchRole'])->bind('api_merge_patch_role');

        return $controllers;
    }

    public function getRole(Application $app, Request $request, $id)
    {
        return $app['api.json.proxy']->get(new RoleQueryRequest(), $request, ['id' => $id,]);
    }

    public function getRoles(Application $app, Request $request)
    {
        return $app['api.json.proxy']->get(new RolesQueryRequest(), $request);
    }

    public function getCount(Application $app, Request $request)
    {
        return $app['api.json.proxy']->count(new RolesQueryRequest(), $request);
    }

    public function createRole(Application $app, Request $request, $id)
    {
        $json = $request->getContent();

        $createRequest = new CreateRoleRequest(
            $app['api.command.executor']
        );

        $command = $createRequest->getCommandFromJson($json);

        //设置 $command
        //...

        $response = $app['api.command.executor']->execute($createRequest, [
            'parameters' => [
                'id' => $id,
            ],
        ]);

        return $app->jsonProxy(
            $json,
            $response
        );
    }

    public function mergePatchRole(Application $app, Request $request, $id)
    {

    }

    public function deleteRole()
    {

    }
}