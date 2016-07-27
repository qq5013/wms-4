<?php

ini_set('display_errors', 0);

require_once __DIR__.'/../vendor/autoload.php';

$app = require __DIR__.'/../include/app.php';
require __DIR__.'/../config/prod.php';
require __DIR__.'/../include/controllers.php';
$app->run();
