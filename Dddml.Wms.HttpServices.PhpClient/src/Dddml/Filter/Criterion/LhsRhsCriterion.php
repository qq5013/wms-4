<?php
/**
 * User: dongww
 * Date: 2016/8/3
 * Time: 10:34
 */
namespace Dddml\Filter\Criterion;

use Dddml\Filter\AbstractCriterion;

class LhsRhsCriterion extends AbstractCriterion
{
    public function __construct(AbstractCriterion $lhs, AbstractCriterion $rhs)
    {
        $this->setLhs($lhs);
        $this->setRhs($rhs);
    }

    public function setLhs(AbstractCriterion $criterion)
    {
        $this->set('Lhs', $criterion);
    }

    public function setRhs(AbstractCriterion $criterion)
    {
        $this->set('Rhs', $criterion);
    }
}
