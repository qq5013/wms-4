<?php
use Dddml\Executor\Http\QueryExecutor;
use Wms\HttpClient\RoleQueryRequest;

/** @var QueryExecutor $executor */
$executor = require_once __DIR__ . '/wms_query_bootstrap.php';

$singleQuery = new RoleQueryRequest();

$response = $executor->execute($singleQuery, [
    'parameters' => [
        'id' => 'WarehouseManager',
    ],
]);

var_dump($response);
