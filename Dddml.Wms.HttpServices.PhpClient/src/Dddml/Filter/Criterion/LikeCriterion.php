<?php
/**
 * User: dongww
 * Date: 2016/8/2
 * Time: 20:14
 */
namespace Dddml\Filter\Criterion;

class LikeCriterion extends HasValueCriterion
{
    public function __construct($property, $value)
    {
        $this->setType(self::TYPE_LIKE);
        parent::__construct($property, $value);
    }
}
