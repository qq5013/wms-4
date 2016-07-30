<?php
/**
 * User: dongww
 * Date: 2016/7/29
 * Time: 19:40
 */
namespace Dddml\Silex\Event;

use Psr\Http\Message\ResponseInterface;
use Symfony\Component\EventDispatcher\Event;

class JsonProxyEvent extends Event
{
    const JSON_PROXY_GET = 'json.proxy.get';

    /** @var  ResponseInterface */
    private $response;

    public function __construct(ResponseInterface $response)
    {
        $this->response = $response;
    }

    public function getResponse()
    {
        return $this->response;
    }
}
