<?php
use Silex\Api\ControllerProviderInterface;
use Silex\Application;

/**
 * User: dongww
 * Date: 2016/7/27
 * Time: 15:21
 */
class RoleControllerProvider implements ControllerProviderInterface
{
    public function connect(\Silex\Application $app)
    {
        $controllers = $app['controllers_factory'];

        $controllers->get('/', function (Application $app) {
            return $app->redirect('/hello');
        });

        return $controllers;
    }

    public function getRole()
    {

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