<?php
/**
 * User: dongww
 * Date: 2016/7/29
 * Time: 17:44
 */
namespace Dddml\Silex;

use Dddml\Executor\Http\AbstractCommandRequest;
use Dddml\Executor\Http\CommandExecutor;
use Dddml\Executor\Http\QueryCountRequestInterface;
use Dddml\Executor\Http\QueryExecutor;
use Dddml\Executor\Http\QueryRequestInterface;
use Dddml\Silex\Event\JsonProxyEvent;
use Silex\Application;
use Symfony\Component\EventDispatcher\EventDispatcher;
use Symfony\Component\HttpFoundation\JsonResponse;
use Symfony\Component\HttpFoundation\Request;

class JsonProxy
{
    private $app;
    private $dispatcher;

    public function __construct(Application $app)
    {
        $this->app = $app;

        $this->dispatcher = new EventDispatcher();
    }

    public function get(QueryRequestInterface $queryRequest, Request $httpRequest, array $params = [])
    {
        /** @var QueryExecutor $executor */
        $executor = $this->app['api.query.executor'];

        $json = $executor->executeJson($queryRequest, [
            'parameters' => $params,
            'query'      => $httpRequest->query->all(),
            'headers'    => [
                'Authorization' => $httpRequest->headers->get('Authorization'),
            ],
        ]);

        $response = $executor->getLastResponse();

        $event = new JsonProxyEvent($response);
        $this->app['dispatcher']->dispatch(JsonProxyEvent::JSON_PROXY_GET, $event);

        return new JsonResponse(
            $json,
            $response->getStatusCode(),
            $response->getHeaders(),
            true
        );
    }

    public function count(QueryCountRequestInterface $queryRequest, Request $httpRequest)
    {
        /** @var QueryExecutor $executor */
        $executor = $this->app['api.query.executor'];

        $json = trim($executor->count($queryRequest, [
            'query'   => $httpRequest->query->all(),
            'headers' => [
                'Authorization' => $httpRequest->headers->get('Authorization'),
            ],
        ]), "\"");

        $response = $executor->getLastResponse();

        $event = new JsonProxyEvent($response);
        $this->app['dispatcher']->dispatch(JsonProxyEvent::JSON_PROXY_COUNT, $event);

        return $json;
    }

    public function create(AbstractCommandRequest $commandRequest, Request $httpRequest, $id)
    {
        /** @var CommandExecutor $executor */
        $executor = $this->app['api.command.executor'];

        $json = $httpRequest->getContent();

        $command = $commandRequest->getCommandFromJson($json);

        $response = $executor->execute($commandRequest, [
            'parameters' => [
                'id' => $id,
            ],
            'headers'    => [
                'Authorization' => $httpRequest->headers->get('Authorization'),
            ],
        ]);

        return new JsonResponse(
            '',
            $response->getStatusCode(),
            $response->getHeaders()
        );
    }

    public function mergePatch(AbstractCommandRequest $commandRequest, Request $httpRequest, $id)
    {
        /** @var CommandExecutor $executor */
        $executor = $this->app['api.command.executor'];
    }
}