<?php

// configure your app for the production environment

$app['twig.path']    = [__DIR__ . '/../templates'];
$app['twig.options'] = [
    'cache'            => __DIR__ . '/../var/cache/twig',
    'strict_variables' => false,
];

$app['api.baseUri']       = 'http://testtenant1.wms.dddml.org:63078/api';
$app['api.auth.url']      = 'http://testtenant1.wms.dddml.org:58760/oauth2/token';
$app['api.auth.username'] = 'test@dddml.org';
$app['api.auth.password'] = '123456Abc!';
$app['api.auth.clientId'] = '54fa1208384f4762a3ace231dbdbe88d';
$app['serializer.src']    = __DIR__ . "/../vendor/jms/serializer/src";