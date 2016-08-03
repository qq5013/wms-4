<?php
/**
 * User: dongww
 * Date: 2016/8/2
 * Time: 20:14
 */
namespace Dddml\Filter\Criterion;

use Dddml\Filter\AbstractCriterion;

class EqCriterion extends HasValueCriterion
{
    public function __construct($property, $value)
    {
        $this->setType(self::TYPE_EQ);
        parent::__construct($property, $value);
    }
}
