<?php
/**
 * User: dongww
 * Date: 2016/7/29
 * Time: 14:16
 */
namespace Dddml\Silex\ControllerProvider;

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

        $controllers->get('/', [$this, 'index']);

        return $controllers;
    }

    public function index(Application $app, Request $request)
    {
        return $app->render('index.twig', array());
    }
}
