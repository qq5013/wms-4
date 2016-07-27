<?php
/**
 * User: dongww
 * Date: 2016/7/27
 * Time: 16:33
 */
namespace ServiceProvider;

use Dddml\Auth;
use Dddml\Executor\Http\CommandExecutor;
use Dddml\Executor\Http\QueryExecutor;
use Doctrine\Common\Annotations\AnnotationRegistry;
use Pimple\Container;
use Pimple\ServiceProviderInterface;
use Silex\Api\BootableProviderInterface;
use Silex\Api\EventListenerProviderInterface;
use Silex\Application;
use Symfony\Component\EventDispatcher\EventDispatcherInterface;

class DddmlServiceProvider implements ServiceProviderInterface, BootableProviderInterface, EventListenerProviderInterface
{
    public function register(Container $app)
    {
    }

    public function boot(Application $app)
    {
        AnnotationRegistry::registerAutoloadNamespace(
            'JMS\Serializer\Annotation',
            $app['serializer.src']);

        $app['api.command.executor'] = function ($app) {
            $executor = new CommandExecutor($app['api.baseUri']);
            $executor->setAuth($app['api.auth']);

            return $executor;
        };

        $app['api.query.executor'] = function ($app) {
            $executor = new QueryExecutor($app['api.baseUri']);
            $executor->setAuth($app['api.auth']);

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
    }

    public function subscribe(Container $app, EventDispatcherInterface $dispatcher)
    {
        // TODO: Implement subscribe() method.
    }
}