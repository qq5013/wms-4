<?php

use Dddml\Executor\Http\CommandExecutor;
use Wms\HttpClient\CreateRoleRequest;

/** @var CommandExecutor $executor */
$executor = require_once __DIR__ . '/wms_command_bootstrap.php';

$roleId = 'testManager1';

$roleRequest = new CreateRoleRequest();
$roleCommand = $roleRequest->getCommand();
$roleCommand->setCommandId('commandId001');
$roleCommand->setRequesterId('requesterId001');
$roleCommand->setRoleId($roleId);
$roleCommand->setName('测试角色1');
$roleCommand->setDescription('测试说明');
$roleCommand->setActive(true);
$roleCommand->setIsPropertyActiveRemoved(true);
$roleCommand->setIsPropertyNameRemoved(true);
$roleCommand->setIsPropertyDescriptionRemoved(true);

$response = $executor->execute($roleRequest, [
    'parameters' => [
        'id' => $roleId,
    ],
]);

var_dump($response->getStatusCode());