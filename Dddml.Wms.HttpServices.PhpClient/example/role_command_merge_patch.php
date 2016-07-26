<?php
use Dddml\Executor\Http\CommandExecutor;
use Dddml\Serializer\Type\Long;
use Wms\HttpClient\MergePatchRoleRequest;

/** @var CommandExecutor $executor */
$executor = require_once __DIR__ . '/wms_command_bootstrap.php';

$roleId = 'testManager2';

$version = new Long();
$version->setValue('4');

$roleRequest = new MergePatchRoleRequest();
$roleCommand = $roleRequest->getCommand();
$roleCommand->setVersion($version);
$roleCommand->setCommandId('commandId002');
$roleCommand->setRequesterId('requesterId001');
$roleCommand->setRoleId($roleId);
$roleCommand->setName('测试角色3');
$roleCommand->setDescription('测试说明4');
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
var_dump($response->getBody()->getContents());
