<?php
/**
 * User: dongww
 * Date: 2016/8/2
 * Time: 20:06
 */
namespace Dddml\Filter\Criterion;

class IsNotNullCriterion extends HasPropertyCriterion
{
    public function __construct($property)
    {
        $this->setType(self::TYPE_IS_NOT_NULL);
        parent::__construct($property);
    }
}
