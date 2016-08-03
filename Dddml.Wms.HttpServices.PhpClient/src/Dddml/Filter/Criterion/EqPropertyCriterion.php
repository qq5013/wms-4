<?php
/**
 * User: dongww
 * Date: 2016/8/3
 * Time: 13:16
 */
namespace Dddml\Filter\Criterion;

class EqPropertyCriterion extends HasOtherPropertyCriterion
{
    public function __construct($property, $otherProperty)
    {
        $this->setType(self::TYPE_EQ_PROPERTY);
        parent::__construct($property, $otherProperty);
    }
}