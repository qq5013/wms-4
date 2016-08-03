<?php
/**
 * User: dongww
 * Date: 2016/8/2
 * Time: 20:14
 */
namespace Dddml\Filter\Criterion;

class HasValueCriterion extends HasPropertyCriterion
{
    public function __construct($property, $value)
    {
        parent::__construct($property);
        $this->setValue($value);
    }

    public function setValue($value)
    {
        $this->set('Value', $value);
    }
}
