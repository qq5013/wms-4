<?php
/**
 * User: dongww
 * Date: 2016/7/27
 * Time: 16:33
 */
namespace Application\ServiceProvider;

use Dddml\Auth;
use Dddml\EntityManager;
use Dddml\Executor\Http\CommandExecutor;
use Dddml\Executor\Http\QueryExecutor;
use Dddml\Silex\ApiProxy;
use Doctrine\Common\Annotations\AnnotationRegistry;
use Pimple\Container;
use Pimple\ServiceProviderInterface;
use Silex\Api\BootableProviderInterface;
use Silex\Application;

class DddmlServiceProvider implements ServiceProviderInterface, BootableProviderInterface
{
    public function register(Container $app)
    {
        $app['api.rememberAuth'] = true;
    }

    public function boot(Application $app)
    {
        AnnotationRegistry::registerAutoloadNamespace(
            'JMS\Serializer\Annotation',
            $app['serializer.src']);

        $app['api.command.executor'] = function ($app) {
            $executor = new CommandExecutor($app['api.baseUri']);
            if ($app['api.rememberAuth']) {
                $executor->setAuth($app['api.auth']);
            }

            return $executor;
        };

        $app['api.query.executor'] = function ($app) {
            $executor = new QueryExecutor($app['api.baseUri']);
            if ($app['api.rememberAuth']) {
                $executor->setAuth($app['api.auth']);
            }

            return $executor;
        };

        $app['api.auth.factory'] = $app->factory(function ($app) {
            return Auth::create(
                $app['api.auth.url'],
                $app['api.auth.username'],
                $app['api.auth.password'],
                $app['api.auth.clientId']
            );
        });

        $app['api.auth'] = function ($app) {
            return Auth::create(
                $app['api.auth.url'],
                $app['api.auth.username'],
                $app['api.auth.password'],
                $app['api.auth.clientId']
            );
        };

        $app['api.proxy'] = function ($app) {
            return new ApiProxy($app);
        };

        $app['api.entity.manager'] = function ($app) {
            return new EntityManager(
                $app['api.query.executor'],
                $app['api.command.executor']
            );
        };
    }
}