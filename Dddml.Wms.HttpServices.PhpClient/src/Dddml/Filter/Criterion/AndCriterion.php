<?php
/**
 * User: dongww
 * Date: 2016/8/3
 * Time: 9:39
 */
namespace Dddml\Filter\Criterion;

use Dddml\Filter\AbstractCriterion;

class AndCriterion extends LhsRhsCriterion
{
    public function __construct(AbstractCriterion $lhs, AbstractCriterion $rhs)
    {
        $this->setType(self::TYPE_AND);
        parent::__construct($lhs, $rhs);
    }
}
