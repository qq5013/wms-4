<?php
/**
 * User: dongww
 * Date: 2016/8/2
 * Time: 20:24
 */
namespace Dddml\Filter\Criterion;

use Dddml\Filter\AbstractCriterion;

class BetweenCriterion extends HasPropertyCriterion
{
    public function __construct($property, $hi, $lo)
    {
        $this->setType(self::TYPE_BETWEEN);
        parent::__construct($property);
        $this->setHi($hi);
        $this->setLo($lo);
    }

    public function setHi($value)
    {
        $this->set('Hi', $value);
    }

    public function setLo($value)
    {
        $this->set('Lo', $value);
    }
}
