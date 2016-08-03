<?php
/**
 * User: dongww
 * Date: 2016/8/3
 * Time: 13:11
 */

namespace Dddml\Filter\Criterion;

use Dddml\Filter\AbstractCriterion;

class NotCriterion extends AbstractCriterion
{
    public function __construct(AbstractCriterion $criterion)
    {
        $this->setType(self::TYPE_NOT);
        $this->setCriterion($criterion);
    }
    public function setCriterion(AbstractCriterion $criterion)
    {
        $this->set('Criterion', $criterion);
    }
}