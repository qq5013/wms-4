<?php
/**
 * User: dongww
 * Date: 2016/8/3
 * Time: 13:39
 */
namespace Dddml\Filter\Criterion;

class LtPropertyCriterion extends HasOtherPropertyCriterion
{
    public function __construct($property, $otherProperty)
    {
        $this->setType(self::TYPE_LT_PROPERTY);
        parent::__construct($property, $otherProperty);
    }
}