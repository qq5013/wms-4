<?php
use Dddml\Filter\Criterion\AndCriterion;
use Dddml\Filter\Criterion\BetweenCriterion;
use Dddml\Filter\Criterion\ConjunctionCriterion;
use Dddml\Filter\Criterion\DisjunctionCriterion;
use Dddml\Filter\Criterion\EqCriterion;
use Dddml\Filter\Criterion\EqPropertyCriterion;
use Dddml\Filter\Criterion\GeCriterion;
use Dddml\Filter\Criterion\InCriterion;
use Dddml\Filter\Criterion\IsNotNullCriterion;
use Dddml\Filter\Criterion\IsNullCriterion;
use Dddml\Filter\Criterion\LeCriterion;
use Dddml\Filter\Criterion\LikeCriterion;
use Dddml\Filter\Criterion\LtPropertyCriterion;
use Dddml\Filter\Criterion\NotCriterion;
use Dddml\Filter\Criterion\OrCriterion;

require_once __DIR__ . '/../../Dddml.Wms.AdminUI/site/vendor/autoload.php';

$conjunction = new ConjunctionCriterion([
    new IsNullCriterion('Address'),
    new EqCriterion('City', 'Shanghai'),
    new BetweenCriterion(
        'CreatedAt',
        '2016-06-29T16:51:33.3824763+08:00',
        '2016-06-28T00:00:00+08:00'
    ),
    new DisjunctionCriterion([
        new GeCriterion('CreatedAt', '2016-06-28T00:00:00+08:00'),
        new LeCriterion('CreatedAt', '2016-06-29T16:51:33.383478+08:00'),
        new AndCriterion(
            new GeCriterion('CreatedAt', '2016-06-28T00:00:00+08:00'),
            new LeCriterion('CreatedAt', '2016-06-29T16:51:33.383478+08:00')
        ),
    ]),
    new NotCriterion(
        new EqPropertyCriterion('Address', 'City')
    ),
    new LikeCriterion('City', '%Shanghai%'),
    new OrCriterion(
        new IsNullCriterion('CreatedAt'),
        new AndCriterion(
            new IsNotNullCriterion('CreatedAt'),
            new LtPropertyCriterion('CreatedAt', 'UpdatedAt')
        )
    ),
    new InCriterion('City', [
        "Beijing",
        "Shanghai",
        "Shenzhen",
        "Guangzhou",
    ]),
]);

echo $conjunction->toJson();
//var_dump($conjunction->toArray());