<?php
/**
 * User: dongww
 * Date: 2016/8/3
 * Time: 11:24
 */
namespace Dddml\Filter\Criterion;

class ConjunctionCriterion extends HasCriteriaCriterion
{
    public function __construct(array $criteria)
    {
        $this->setType(self::TYPE_CONJUNCTION);
        parent::__construct($criteria);
    }
}
