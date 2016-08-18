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
use Ramsey\Uuid\Uuid;
use Silex\Application;
use Symfony\Component\EventDispatcher\EventDispatcher;
use Symfony\Component\HttpFoundation\JsonResponse;
use Symfony\Component\HttpFoundation\Request;

class ApiProxy
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
            'headers'    => $this->getHeaders($httpRequest),
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

    public function create($entityName, $id, Request $httpRequest)
    {
        $className = 'Dddml\Wms\HttpClient\\Create' . $entityName . 'Request';

        /** @var AbstractCommandRequest $createRequest */
        $createRequest = new $className(
            $this->app['api.command.executor']
        );

        $json = $httpRequest->getContent();

        $command = $createRequest->getCommandFromJson($json);

        $uuid = Uuid::uuid4();
        $command->setCommandId($uuid->toString());

        $response = $this->app['api.command.executor']
            ->execute($createRequest, [
                'parameters' => ['id' => $id,],
                'headers'    => $this->getHeaders($httpRequest),
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

    /**
     * @param Request $request
     *
     * @return array
     */
    protected function getHeaders(Request $request)
    {
        $headers = [];
        if ($request->headers->get('Authorization')) {
            $headers = [
                'Authorization' => $request->headers->get('Authorization'),
            ];
        }

        return $headers;
    }
}