<?php
use Application\ControllerProvider\RoleApiControllerProvider;
use Application\ControllerProvider\RoleControllerProvider;

$app->mount('/api', new RoleApiControllerProvider());
$app->mount('/roles', new RoleControllerProvider());