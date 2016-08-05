<?php
use Application\ControllerProvider\RoleControllerProvider;
use Dddml\Silex\ApiControllerProvider;

$app->mount('/api', new ApiControllerProvider());
$app->mount('/roles', new RoleControllerProvider());