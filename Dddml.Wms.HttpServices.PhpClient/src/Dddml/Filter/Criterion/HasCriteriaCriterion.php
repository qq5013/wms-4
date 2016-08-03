<?php
/**
 * User: dongww
 * Date: 2016/8/3
 * Time: 11:23
 */
namespace Dddml\Filter\Criterion;

use Dddml\Filter\AbstractCriterion;

class HasCriteriaCriterion extends AbstractCriterion
{
    public function __construct(array $criteria)
    {
        $this->setCriteria($criteria);
    }

    public function setCriteria($criteria)
    {
        $this->set('Criteria', $criteria);
    }

    public function addCriterion(AbstractCriterion $criterion)
    {
        if (!isset($this->fields['Criteria'])) {
            $this->fields['Criteria'] = [];
        }

        $this->fields['Criteria'][] = $criterion;
    }
}
