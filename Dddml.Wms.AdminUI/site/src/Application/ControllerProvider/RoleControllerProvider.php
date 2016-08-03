<?php
/**
 * User: dongww
 * Date: 2016/7/29
 * Time: 14:16
 */
namespace Application\ControllerProvider;

use Silex\Api\ControllerProviderInterface;
use Silex\Application;
use Silex\ControllerCollection;
use Symfony\Component\HttpFoundation\Request;

class RoleControllerProvider implements ControllerProviderInterface
{
    public function connect(Application $app)
    {
        /** @var ControllerCollection $controllers */
        $controllers = $app['controllers_factory'];

        $controllers->get('/', [$this, 'roles'])
            ->bind('roles');

        $controllers->match('/new', [$this, 'create'])
            ->method('GET|POST')
            ->bind('create_role');

        $controllers->get('/{id}', [$this, 'role'])
            ->bind('role');


        return $controllers;
    }

    public function roles(Application $app, Request $request)
    {
        $firstResult = $request->get('firstResult', 0);
        $maxResults  = $request->get('maxResults', 10);
        $sort        = $request->get('sort', null);

        $query = [
            'firstResult' => $firstResult,
            'maxResults'  => $maxResults,
        ];

        if ($sort) {
            $query['sort'] = $sort;
        }

        $entities = $app['api.entity.manager']('Role')->findBy($query);
        $count    = $app['api.entity.manager']('Role')->count();

        return $app->render('roles/roles.twig', [
            'entities'    => $entities,
            'count'       => $count,
            'firstResult' => $firstResult,
            'maxResults'  => $maxResults,
        ]);
    }

    public function role(Application $app, Request $request, $id)
    {
        $entity = $app['api.entity.manager']('Role')->findOne($id);

        return $app->render('roles/role.twig', [
            'entity' => $entity,
        ]);
    }

    public function create(Application $app, Request $request)
    {
        $form = require $app['form.path'] . '/role_form.php';

        return $app->render('roles/create.twig', [
            'form' => $form->createView(),
        ]);
    }
}
