<?php
/**
 * User: dongww
 * Date: 2016/8/3
 * Time: 9:41
 */
namespace Dddml\Filter\Criterion;

use Dddml\Filter\AbstractCriterion;

abstract class HasPropertyCriterion extends AbstractCriterion
{
    public function __construct($property)
    {
        $this->setProperty($property);
    }

    public function setProperty($property)
    {
        $this->set('Property', $property);
    }
}
