<?php
/**
 * User: dongww
 * Date: 2016/8/2
 * Time: 20:14
 */
namespace Dddml\Filter\Criterion;

class GeCriterion extends HasValueCriterion
{
    public function __construct($property, $value)
    {
        $this->setType(self::TYPE_GE);
        parent::__construct($property, $value);
    }
}
