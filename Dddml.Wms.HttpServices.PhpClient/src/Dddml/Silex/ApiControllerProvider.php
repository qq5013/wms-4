<?php
/**
 * User: dongww
 * Date: 2016/7/27
 * Time: 15:21
 */
namespace Dddml\Silex;

use Doctrine\Common\Inflector\Inflector;
use Silex\Api\ControllerProviderInterface;
use Silex\Application;
use Silex\ControllerCollection;
use Symfony\Component\HttpFoundation\Request;

class ApiControllerProvider implements ControllerProviderInterface
{
    public function connect(Application $app)
    {
        /** @var ControllerCollection $controllers */
        $controllers = $app['controllers_factory'];

        $controllers->get('{entities}/_count', [$this, 'getCount'])->bind('api_get_entities_count');
        $controllers->get('{entities}/{id}', [$this, 'getEntity'])->bind('api_get_entity');
        $controllers->get('{entities}', [$this, 'getEntities'])->bind('api_get_entities');
        $controllers->put('{entities}/{id}', [$this, 'createEntity'])->bind('api_create_entity');
        $controllers->patch('{entities}/{id}', [$this, 'mergePatchEntity'])->bind('api_merge_patch_entity');

        return $controllers;
    }

    public function getEntity(Application $app, Request $request, $entities, $id)
    {
        $entity    = Inflector::singularize($entities);
        $className = 'Dddml\Wms\HttpClient\\' . $entity . 'QueryRequest';

        $response = $app['api.proxy']->get(new $className(), $request, ['id' => $id,]);

        return $response;
    }

    public function getEntities(Application $app, Request $request, $entities)
    {
        $className = 'Dddml\Wms\HttpClient\\' . $entities . 'QueryRequest';

        $response = $app['api.proxy']->get(new $className(), $request);

        return $response;
    }

    public function getCount(Application $app, Request $request, $entities)
    {
        $className = 'Dddml\Wms\HttpClient\\' . $entities . 'QueryRequest';

        $response = $app['api.proxy']->count(new $className(), $request);

        return $response;
    }

    public function createEntity(Application $app, Request $request, $entities, $id)
    {
        $entityName = Inflector::singularize($entities);

        $response = $app['api.proxy']->create($entityName, $id, $request);

        return $response;
    }

    public function mergePatchEntity(Application $app, Request $request, $entities, $id)
    {
    }

    public function deleteRole(Application $app, Request $request, $entities, $id)
    {

    }
}