<?php
/**
 * User: dongww
 * Date: 2016/7/30
 * Time: 13:00
 */
namespace Application\EventListenerProvider;

use Application\Event\JsonProxySubscriber;
use Pimple\Container;
use Pimple\ServiceProviderInterface;
use Silex\Api\BootableProviderInterface;
use Silex\Api\EventListenerProviderInterface;
use Silex\Application;
use Symfony\Component\EventDispatcher\EventDispatcherInterface;

class JsonProxyListenerProvider  implements ServiceProviderInterface, BootableProviderInterface, EventListenerProviderInterface
{
    public function register(Container $pimple)
    {
    }

    public function boot(Application $app)
    {
    }

    public function subscribe(Container $app, EventDispatcherInterface $dispatcher)
    {
        $app['dispatcher']->addSubscriber(new JsonProxySubscriber());
    }
}