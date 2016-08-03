<?php
/**
 * User: dongww
 * Date: 2016/8/3
 * Time: 10:48
 */
namespace Dddml\Filter\Criterion;

use Dddml\Filter\AbstractCriterion;

class OrCriterion extends LhsRhsCriterion
{
    public function __construct(AbstractCriterion $lhs, AbstractCriterion $rhs)
    {
        $this->setType(self::TYPE_OR);
        parent::__construct($lhs, $rhs);
    }
}
