<?php
use Dddml\Silex\ControllerProvider\RoleControllerProvider;
use Dddml\Silex\JsonControllerProvider\RoleApiControllerProvider;

$app->mount('/api', new RoleApiControllerProvider());
$app->mount('/roles', new RoleControllerProvider());