<?php
/**
 * User: dongww
 * Date: 2016/7/29
 * Time: 19:54
 */
namespace Application\Event;

use Dddml\Silex\Event\JsonProxyEvent;
use Symfony\Component\EventDispatcher\EventSubscriberInterface;

class JsonProxySubscriber implements EventSubscriberInterface
{
    public static function getSubscribedEvents()
    {
        return array(
            JsonProxyEvent::JSON_PROXY_GET => 'onJsonProxyGet',
        );
    }

    public function onJsonProxyGet(JsonProxyEvent $event)
    {
        echo 1;

//        $event->getResponse();
        return $event;
    }
}
