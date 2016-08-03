<?php
/**
 * User: dongww
 * Date: 2016/8/3
 * Time: 13:40
 */
namespace Dddml\Filter\Criterion;

class HasOtherPropertyCriterion extends HasPropertyCriterion
{
    public function __construct($property, $otherProperty)
    {
        parent::__construct($property);
        $this->setOtherProperty($otherProperty);
    }

    public function setOtherProperty($property)
    {
        $this->set('OtherProperty', $property);
    }
}
