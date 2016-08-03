<?php
/**
 * User: dongww
 * Date: 2016/8/3
 * Time: 11:07
 */
namespace Dddml\Filter\Criterion;

class DisjunctionCriterion extends HasCriteriaCriterion
{
    public function __construct(array $criteria)
    {
        $this->setType(self::TYPE_DISJUNCTION);
        parent::__construct($criteria);
    }
}
