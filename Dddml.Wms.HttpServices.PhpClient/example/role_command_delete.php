<?php
use Dddml\Executor\Http\CommandExecutor;
use Wms\HttpClient\DeleteRoleRequest;

/** @var CommandExecutor $executor */
$executor = require_once __DIR__ . '/wms_command_bootstrap.php';

$roleId = 'testManager2';

$roleRequest = new DeleteRoleRequest();

$response = $executor->execute($roleRequest, [
    'parameters' => [
        'id' => $roleId,
    ],
    'query'      => [
        'commandId'   => 'commandId001',
        'version'     => '5',
        'requesterId' => 'requesterId001',
    ],
]);

var_dump($response->getStatusCode());
